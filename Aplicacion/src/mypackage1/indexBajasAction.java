package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class indexBajasAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    String to = "";
    indexForm indexRed = (indexForm) form;
    String boton = indexRed.getBoton();
    System.out.println("Presiono: "+boton);

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    
    if(boton.equals("Arbitros")){
      try{
        String cadena = "select a.idarbitro, a.nombre, a.telefono, a.email, b.nacionalidad from arbitros a, nacionalidad b where a.idnacionalidad = b.idnacionalidad order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoArbitros item = new ClaseListadoArbitros();
          item.setIdarbitro(rsConsulta.getString("idarbitro"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setTelefono(rsConsulta.getString("telefono"));
          item.setEmail(rsConsulta.getString("email"));
          item.setIdnacionalidad(rsConsulta.getString("nacionalidad"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "arbitros";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Entrenadores")){
       try{
        String cadena = "select a.identrenadores, a.nombre, a.edad, b.nacionalidad from entrenadores a, nacionalidad b where a.idnacionalidad = b.idnacionalidad order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoEntrenadores item = new ClaseListadoEntrenadores();
          item.setIdentrenadores(rsConsulta.getString("identrenadores"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setEdad(rsConsulta.getString("edad"));
          item.setIdnacionalidad(rsConsulta.getString("nacionalidad"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "entrenadores";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
      
    }
    if(boton.equals("Grandslam")){
      try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select * from GRANDSLAM order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseGrandslam item = new ClaseGrandslam();
          item.setIdgrandslam(rsConsulta.getString("idgrandslam"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setAnio(rsConsulta.getString("anio"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "grandslam";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Locaciones")){
      try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select a.idlocaciones, a.locacion, b.nombre from LOCACIONES a, pais b where a.idpais = b.idpais order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoLocaciones item = new ClaseListadoLocaciones();
          item.setId(rsConsulta.getString("idlocaciones"));
          item.setLocacion(rsConsulta.getString("locacion"));
          item.setPais(rsConsulta.getString("nombre"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "locaciones";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Nacionalidad")){
  try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select * from nacionalidad order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseNacionalidad item = new ClaseNacionalidad();
          item.setIdnacionalidad(rsConsulta.getString("idnacionalidad"));
          item.setNacionalidad(rsConsulta.getString("nacionalidad"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "nacionalidad";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Pais")){
     try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select * from pais order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClasePais item = new ClasePais();
          item.setIdpais(rsConsulta.getString("idpais"));
          item.setPais(rsConsulta.getString("nombre"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "pais";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Participantes")){
      try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select a.idparticipantes, a.nombre, a.edad, a.genero, b.nacionalidad from participantes a, nacionalidad b where a.nacionalidad_idnacionalidad = b.idnacionalidad order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoParticipantes item = new ClaseListadoParticipantes();
          item.setId(rsConsulta.getString("idparticipantes"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setEdad(rsConsulta.getString("edad"));
          item.setGenero(rsConsulta.getString("genero"));
          item.setNacionalidad(rsConsulta.getString("nacionalidad"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "participantes";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Partido")){
       try{
        String cadena = "select a.idpartido, b.locacion, c.nombre as participante1, d.nombre as participante2, e.nombre as arbitro, f.modalidad, g.nombre||' '||g.anio as grandslam from partido a, locaciones b, participantes c, participantes d, arbitros e, modalidades f, grandslam g where a.idlocaciones = b.idlocaciones and a.idparticipantes1 = c.idparticipantes and a.idparticipantes2 = d.idparticipantes and a.idarbitros = e.idarbitro and a.idmodalidades = f.idmodalidades and a.idgrandslam = g.idgrandslam order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(rsConsulta);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoPartidos item = new ClaseListadoPartidos();
          item.setIdpartido(rsConsulta.getString("idpartido"));
          item.setIdlocaciones(rsConsulta.getString("locacion"));
          item.setIdparticipantes1(rsConsulta.getString("participante1"));
          item.setIdparticipantes2(rsConsulta.getString("participante2"));
          item.setIdarbitros(rsConsulta.getString("arbitro"));
          item.setIdmodalidades(rsConsulta.getString("modalidad"));
          item.setIdgrandslam(rsConsulta.getString("grandslam"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "partido";
      }catch(Exception e){
        e.printStackTrace();
        return mapping.findForward("nook");
      }finally{
        conn.closeConnection();	
      }
      to="partido";
    }
    if(boton.equals("Premios")){
       try{
        String cadena = "select a.idpremios, a.cantidad, a.categoria, b.nombre, a.idpartido from PREMIOS a, participantes b where a.idparticipante=b.idparticipantes  order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoPremios item = new ClaseListadoPremios();
          item.setIdpremios(rsConsulta.getString("idpremios"));
          item.setCantidad(rsConsulta.getString("cantidad"));
          item.setCategoria(rsConsulta.getString("categoria"));
          item.setIdparticipante(rsConsulta.getString("nombre"));
          item.setIdpartido(rsConsulta.getString("idpartido"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "premios";
      }catch(Exception e){
        e.printStackTrace();
        return mapping.findForward("nook");
      }finally{
        conn.closeConnection();	
      }    
      }
    if(boton.equals("Resultados")){
        try{
        String cadena = "select * from RESULTADOS order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoResultados item = new ClaseListadoResultados();
          item.setIdresultados(rsConsulta.getString("idresultados"));
          item.setResultado(rsConsulta.getString("resultado"));
          item.setIdpartido(rsConsulta.getString("idpartido"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to = "resultados";
      }catch(Exception e){
        e.printStackTrace();
        return mapping.findForward("nook");
      }finally{
        conn.closeConnection();	
      }
    }
    if(boton.equals("Participantes/Entrenadores")){
      try{
        String cadena = "select	a.nombre as participante, b.nombre as entrenador from participantes a, entrenadores b, participantes_has_entrenadores c where c.idparticipante = a.idparticipantes and c.identrenadores = b.identrenadores ";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList(); 
        while (rsConsulta.next()){
          ClaseListadoParticipantesEntrenadores item = new ClaseListadoParticipantesEntrenadores();
          item.setIdparticipante(rsConsulta.getString("participante"));
          item.setIdentrenadores(rsConsulta.getString("entrenador"));
          items.add(item);
          System.out.println("Paso ..");
        }
        ListadoForm f = new ListadoForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
        to="participantes-entrenadores";
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        conn.closeConnection();	
      }
    }
    return mapping.findForward(to);
  }
}