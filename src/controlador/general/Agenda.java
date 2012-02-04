package controlador.general;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import modelo.Actividad;
import modelo.Categoria;
import modelo.CategoriaCompetencia;
import modelo.Competencia;
import modelo.EquipoJuego;
import modelo.Juego;
import modelo.PlanificacionActividad;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.event.CalendarsEvent;
import org.zkoss.calendar.impl.SimpleCalendarEvent;
import org.zkoss.calendar.impl.SimpleCalendarModel;
import org.zkoss.util.Locales;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Caption;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Popup;
import org.zkoss.zul.Span;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Timer;
import org.zkoss.zul.Window;

import servicio.implementacion.ServicioCompetencia;
import servicio.implementacion.ServicioEquipoJuego;
import servicio.implementacion.ServicioPlanificacionActividad;


public class Agenda extends GenericForwardComposer {

	Popup updateMsg;
	Label popupLabel, rangoCalendario;
	Caption titulo;
	Timer timer;
	Button hoy;

	Calendars calendars;
	Span FDOW;
	String form;
	Listbox lsbxFiltro;
	Listitem item;

	// Competencias
	Component formulario;
	Competencia competencia;
	Button btnVer;
	ServicioCompetencia servicioCompetencia;
	ServicioEquipoJuego servicioEquipoJuego;	
	

	/*
	 * 0->Evento no registrado, 1->Evento pendiente, 2->Evento cancelado,
	 * 3->Evento Finalizado
	 */
	String[] color = { "#EE5C42", "#32CD32", "#FDD017", "#FFA500" };

	@Override
	public void doAfterCompose(Component component) throws Exception {
		super.doAfterCompose(component);
		formulario = component;
		actualizarRangoCalendario();
//		lsbxFiltro.setSelectedIndex(0);		
//		lsbxFiltro.focus();
		
		calendars.setReadonly(false);
		calendars.setMold("default");
//		Messagebox.show("Haga click sobre una fecha para planificar una actividad", "Mensaje",Messagebox.OK, Messagebox.INFORMATION);
//		calendars.setTooltiptext("Haga click sobre una fecha para planificar una actividad");
		cargarComplementarias();
	}
	
	public void onClick$calendars() throws InterruptedException{
		if(lsbxFiltro.getSelectedIndex() == 0){
			Messagebox.show("Seleccione una actividad", "Mensaje",Messagebox.OK, Messagebox.INFORMATION);
			lsbxFiltro.focus();
		}
	}

	public void onSelect$lsbxFiltro() throws InterruptedException {

		calendars.setModel(null);
		
		switch (lsbxFiltro.getSelectedIndex()) {

		case 1: { // Entrenamiento
			calendars.setReadonly(false);
			btnVer.setVisible(false);
			form = "Entrenamiento/Vistas/Auxiliar_Agenda.zul";
			calendars.setTooltiptext("");
			break;
		}
		case 2: { // Competencia
		    calendars.setMold("default");
			calendars.setDays(7);
			calendars.setReadonly(false);
			btnVer.setVisible(true);
			calendars.setTooltiptext("");
			break;
		}
		case 3: {// mantenimiento
			calendars.setReadonly(false);
			btnVer.setVisible(false);
			calendars.setMold("default");
			Messagebox.show("Haga click sobre una fecha para planificar un mantenimiento", "Mensaje",Messagebox.OK, Messagebox.INFORMATION);
			calendars.setTooltiptext("Haga click sobre una fecha para planificar un mantenimiento");
			cargarMantenimientos();
			break;
		}
		case 4: {// Actividad Complementaria
			calendars.setReadonly(false);
			btnVer.setVisible(false);
			calendars.setMold("default");
			Messagebox.show("Haga click sobre una fecha para planificar una actividad", "Mensaje",Messagebox.OK, Messagebox.INFORMATION);
			calendars.setTooltiptext("Haga click sobre una fecha para planificar una actividad");
			cargarComplementarias();
			break;
		}
		
		default:
			btnVer.setVisible(false);
			break;
		}
	}
	

	public void onClick$btnVer() {

		Component catalogo = Executions.createComponents("/Competencias/Vistas/FrmSelectorCompetencia.zul", null, null);
		catalogo.setVariable("formulario", formulario, false);
		formulario.addEventListener("onCatalogoCerrado", new EventListener() {
			@Override
			public void onEvent(Event arg0) throws Exception {
				competencia = (Competencia) formulario.getVariable("competencia", false);
				cargarJuegos();
			}
		});
	}
	
	public void cargarComplementarias(){

		ServicioPlanificacionActividad servicioPlanificacionActividad = (ServicioPlanificacionActividad)new ClassPathXmlApplicationContext("ApplicationContext.xml").getBean("servicioPlanificacionActividad");
		List<PlanificacionActividad> complementarias = servicioPlanificacionActividad.listarComplementarias();
		System.out.println("Lista de complementarias: "+complementarias);
		System.out.println("tamaño de lista complementarias= "+complementarias.size());
		
		SimpleCalendarEvent evento;
		
		EventosCalendario ec = new EventosCalendario();
		
		for(PlanificacionActividad comp: complementarias){
			 Set<Actividad> fechas = comp.getActividads();
			 for(Actividad fecha: fechas){
				 Date fi = new Date(fecha.getFechaInicio().getTime() + fecha.getHoraInicio().getTime());
				 Date ff = new Date(fecha.getFechaCulminacion().getTime() + fecha.getHoraFin().getTime());
				 String color = obtenerColor(fecha);
				 evento = crearEvento(fi,ff, comp.getDescripcion(), color, color, comp);
				 ec.cargarEvento(evento);
			 }
		}
		calendars.setModel(ec.getModel());
		
	}
	
	public void cargarMantenimientos(){
		
		ServicioPlanificacionActividad servicioPlanificacionActividad = (ServicioPlanificacionActividad)new ClassPathXmlApplicationContext("ApplicationContext.xml").getBean("servicioPlanificacionActividad");
		List<PlanificacionActividad> mantenimientos = servicioPlanificacionActividad.listarMantenimientos();
		System.out.println("Lista de mantenimientos: "+mantenimientos);
		System.out.println("tamaño de lista mantenimientos= "+mantenimientos.size());
		
		SimpleCalendarEvent evento;
		
		EventosCalendario ec = new EventosCalendario();
		
		for(PlanificacionActividad mantenimiento: mantenimientos){
			 Set<Actividad> fechas = mantenimiento.getActividads();
			 for(Actividad fecha: fechas){
				 Date fi = new Date(fecha.getFechaInicio().getTime() + fecha.getHoraInicio().getTime());
				 Date ff = new Date(fecha.getFechaCulminacion().getTime() + fecha.getHoraFin().getTime());
				 String color = obtenerColor(fecha);
				 evento = crearEvento(fi,ff, mantenimiento.getDescripcion(), color, color, mantenimiento);
				 ec.cargarEvento(evento);
			 }
		}
		calendars.setModel(ec.getModel());
		
	}
	
	public String obtenerColor(Actividad a){
		 if (a.getEstatus()=='A'){
			 //System.out.println("programada");
			 return color[1];
		 }else if((a.getEstatus()=='C')||(a.getFechaInicio().before(new Date()))){
			 //System.out.println("culminada");
			 return color[3];
		 }else{
			 //System.out.println("suspendido");
			 return color[0];
		 }
	}

	public void cargarJuegos() {
		Set<Juego> juegos = competencia.getJuegos();
		EventosCalendario eventosCalendario = new EventosCalendario();
		System.out.println(competencia.getCodigoCompetencia());
		System.out.println(juegos.size());
		for (Iterator i = juegos.iterator(); i.hasNext();) {
			Juego j = (Juego) i.next();
			Date fecha = j.getFecha();
			Date hora = j.getHoraInicio();
			List<EquipoJuego> equipos = ConvertirConjuntoALista(j.getEquipoJuegos());
			System.out.println(equipos.size());
			//Categoria cat = equipos.get(0).getEquipoCompetencia().getEquipo().getCategoria();

		    //Date duracion = obtenerDuracion(j,cat);	 
      
            //System.out.println("Equipo 1: "+equipos.get(0).getEquipoCompetencia().getEquipo().getCodigoEquipo());
            //System.out.println("Equipo 2: "+equipos.get(1).getEquipoCompetencia().getEquipo().getCodigoEquipo());
		 	Date fechaI = new Date(fecha.getYear(), fecha.getMonth(),
					fecha.getDate(), hora.getHours(), hora.getMinutes());
			
		 	Date fechaF = new Date(fecha.getYear(), fecha.getMonth(),
					fecha.getDate(), hora.getHours() + 2, hora.getMinutes());
		 	System.out.println(fechaI);
		 	System.out.println(fechaF);
		 	String equipo1 = equipos.get(0).getEquipoCompetencia().getEquipo().getNombre();
		    String divisa1 = equipos.get(0).getEquipoCompetencia().getEquipo().getDivisa().getNombre();
		    String equipo2 = equipos.get(1).getEquipoCompetencia().getEquipo().getNombre();
		    String divisa2 = equipos.get(1).getEquipoCompetencia().getEquipo().getDivisa().getNombre();
		    String cadena = equipo1 + "(" + divisa1 + ")" + " vs " + equipo2 + "(" + divisa2 + ")";
		    System.out.println(cadena);
			SimpleCalendarEvent e = crearEvento(fechaI, fechaF,cadena, obtenerColor(j),obtenerColor(j), j);
			eventosCalendario.cargarEvento(e);
		}
		calendars.setModel(eventosCalendario.getModel());
	}
	
	public String obtenerColor(Juego j){
		 if (j.getDatoBasico().getNombre().equals("POR REALIZAR")){
			 //System.out.println("ejecutada");
			 return color[1];
		 }else if(j.getDatoBasico().getNombre().equals("CULMINADO")){
			 //System.out.println("culminada");
			 return color[3];
		 }else{
			 //System.out.println("suspendido");
			 return color[0];
		 }
	}
	
	public Date obtenerDuracion(Juego j,Categoria c){
	
		List<CategoriaCompetencia> ccs  = ConvertirConjuntoALista(j.getCompetencia().getCategoriaCompetencias());
		for (Iterator i = ccs.iterator();i.hasNext();){
			CategoriaCompetencia cc = (CategoriaCompetencia) i.next();
			if (cc.getCategoria().getNombre().equals(c.getNombre()))
				return cc.getDuracionHora();
		}
		return null;
	}
	
	public List ConvertirConjuntoALista(Set conjunto) {
		List l = new ArrayList();
		for (Iterator i = conjunto.iterator(); i.hasNext();) {
			l.add(i.next());
		}
		return l;
	}

	public SimpleCalendarEvent crearEvento(Date fi, Date ff, 
			String contenido, String colorFondo, String colorEncabezado,
			Object valor) {
		EventoSimpleCalendario esc = new EventoSimpleCalendario();
		esc.setBeginDate(fi);
		esc.setEndDate(ff);
	
		esc.setContent(contenido);
		esc.setContentColor(colorFondo);
		esc.setHeaderColor(colorEncabezado);
		esc.setValue(valor);
		return esc;
	}

	/* Ejemplo como crear un evento */
	public void onCreate$wndCalendario() {

//		SimpleCalendarEvent ce = new SimpleCalendarEvent();
//		Date di = new Date(112, 0, 9, 0, 0);
//
//		Date df = new Date(112, 0, 9, 1, 0);
//		ce.setBeginDate(di);
//		ce.setEndDate(df);
//		ce.setContent("Leyner");
//		ce.setTitle("dasdsa dsadsad adsdasd asdsada saddasdas");
//		ce.setContentColor(color[0]);
//		ce.setHeaderColor(color[0]);
//
//		EventosCalendario calendarEvents = new EventosCalendario();
//		calendarEvents.cargarEvento(ce);
//		calendars.setModel(calendarEvents.getModel());

	}

	public void onEventCreate$calendars(CalendarsEvent event) {

	}

	// Se invoca cuando se da click en el calendario para crear un evento nuevo
	public void onEventCreate$calendars(ForwardEvent event) throws InterruptedException {

		planificarActividad(event);
		
//		switch (lsbxFiltro.getSelectedIndex()) {
//		
//		case 1: { // Entrenamiento
//			break;
//		}
//		case 2: { // Competencia
//			break;
//		}
//		case 3: {// Mantenimiento
//			planificarMantenimiento(event);			
//			break;
//		}
//		case 4: {// Actividad Complementaria
//			planificarActividad(event);
//			Component c = Executions.createComponents(
//					"Logistica/Vistas/frmPlanificarActividad.zul", null, null);
//			break;
//		}
//		}
	}

	public void planificarMantenimiento(ForwardEvent event){
		Window frmPlanificarMantenimiento;
		Datebox frmPlanificarMantenimiento$fechaInicio;
		Datebox frmPlanificarMantenimiento$fechaFin;
		Timebox frmPlanificarMantenimiento$horaInicio;
		Timebox frmPlanificarMantenimiento$horaFin;		
		
		frmPlanificarMantenimiento = (Window) Executions.createComponents(
				"/Logistica/Vistas/frmPlanificarMantenimiento.zul", null,
				null);
//		frmPlanificarMantenimiento.setAttribute("eventoCalendario", event.getOrigin());
		CalendarsEvent ce = (CalendarsEvent) event.getOrigin(); 
		
		frmPlanificarMantenimiento$fechaInicio = (Datebox)frmPlanificarMantenimiento.getFellow("fechaInicio");
		frmPlanificarMantenimiento$fechaFin = (Datebox)frmPlanificarMantenimiento.getFellow("fechaFin");
		frmPlanificarMantenimiento$horaInicio = (Timebox) frmPlanificarMantenimiento.getFellow("horaInicio");
		frmPlanificarMantenimiento$horaFin = (Timebox) frmPlanificarMantenimiento.getFellow("horaFin");
		
		Date fechaInicio = ce.getBeginDate();
		fechaInicio =  new Date(fechaInicio.getYear(), fechaInicio.getMonth(), fechaInicio.getDate());
		Date fechaFin = ce.getEndDate();
		fechaFin =  new Date(fechaFin.getYear(), fechaFin.getMonth(), fechaFin.getDate());
		
		frmPlanificarMantenimiento$fechaInicio.setValue(fechaInicio);
		frmPlanificarMantenimiento$fechaFin.setValue(fechaFin);
		frmPlanificarMantenimiento$horaInicio.setText(ce.getBeginDate().getHours()+5 +":"+ce.getBeginDate().getMinutes());
		frmPlanificarMantenimiento$horaFin.setText(ce.getEndDate().getHours()+5 +":"+ce.getEndDate().getMinutes());
	}
	
	
	public void planificarActividad(ForwardEvent event){
		Window frmPlanificarActividad;
		Datebox frmPlanificarActividad$fechaInicio;
		Datebox frmPlanificarActividad$fechaFin;
		Timebox frmPlanificarActividad$horaInicio;
		Timebox frmPlanificarActividad$horaFin;
		
		
		frmPlanificarActividad = (Window) Executions.createComponents(
				"Logistica/Vistas/frmPlanificarActividad.zul", null,
				null);
//		frmPlanificarActividad.setAttribute("eventoCalendario", event.getOrigin());
		CalendarsEvent ce = (CalendarsEvent) event.getOrigin(); 
		
		frmPlanificarActividad$fechaInicio = (Datebox)frmPlanificarActividad.getFellow("fechaInicio");
		frmPlanificarActividad$fechaFin = (Datebox)frmPlanificarActividad.getFellow("fechaFin");
		frmPlanificarActividad$horaInicio = (Timebox) frmPlanificarActividad.getFellow("horaInicio");
		frmPlanificarActividad$horaFin = (Timebox) frmPlanificarActividad.getFellow("horaFin");
		
		Date fechaInicio = ce.getBeginDate();
		fechaInicio =  new Date(fechaInicio.getYear(), fechaInicio.getMonth(), fechaInicio.getDate());
		Date fechaFin = ce.getEndDate();
		fechaFin =  new Date(fechaFin.getYear(), fechaFin.getMonth(), fechaFin.getDate());
		
		frmPlanificarActividad$fechaInicio.setValue(fechaInicio);
		frmPlanificarActividad$fechaFin.setValue(fechaFin);
		frmPlanificarActividad$horaInicio.setText(ce.getBeginDate().getHours()+5 +":"+ce.getBeginDate().getMinutes());
		frmPlanificarActividad$horaFin.setText(ce.getEndDate().getHours()+5 +":"+ce.getEndDate().getMinutes());
	}
	
	
	public void onEventEdit$calendars(CalendarsEvent e) {
//		EventoSimpleCalendario esc = (EventoSimpleCalendario) e.getCalendarEvent();		
		Window w = (Window) Executions.createComponents("Logistica/Vistas/frmResultadosActividadComplementaria.zul", null, null);
//        w.setPosition("center");
//        Juego j = (Juego) esc.getValue();
//        w.setVariable("juego",j,false);
	}

	/*
	 * Programacion del toolbar del calendario
	 */
	public void cambiarFormatoCalendario(String vista) {
		if (vista.compareTo("Semana") == 0) {
			calendars.setMold("default");
			calendars.setDays(7);
		} else if (vista.compareTo("Dia") == 0) {
			calendars.setMold("default");
			calendars.setDays(1);
		} else {
			calendars.setMold("month");
		}
		/* Esto todavia no se que es. Sino sirve, quitarse */
		FDOW.setVisible("month".equals(calendars.getMold())
				|| calendars.getDays() == 7);
	}

	public void onClickTabs(ForwardEvent event) {
		String view = String.valueOf(event.getData());
		cambiarFormatoCalendario(view);
		actualizarRangoCalendario();
	}

	public void actualizarRangoCalendario() {
		Date fechaIni = calendars.getBeginDate();
		Date fechaFin = calendars.getEndDate();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("MMMMM/yyyy",
				Locales.getCurrent());
		formatoFecha.setTimeZone(calendars.getDefaultTimeZone());
		rangoCalendario.setValue(formatoFecha.format(fechaIni) + " - "
				+ formatoFecha.format(fechaFin));
	}

	public void onClick$hoy() {
		calendars.setCurrentDate(Calendar.getInstance(
				calendars.getDefaultTimeZone()).getTime());
		actualizarRangoCalendario();
	}

	public void onCambiarMesSemana(ForwardEvent event) {
		if (event.getData().equals("arrow-left"))
			calendars.previousPage();
		else
			calendars.nextPage();
		actualizarRangoCalendario();
	}
}