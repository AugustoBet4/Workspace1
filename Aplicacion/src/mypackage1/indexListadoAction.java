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

public class indexListadoAction extends Action 
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
          cn = conn.conexion;
          String cadena = "select * from NACIONALIDAD order by 1";
          rsConsulta = conn.getData(cadena);
          ArrayList items = new ArrayList();
          while (rsConsulta.next()){
            ClaseNacion item = new ClaseNacion();
            item.setCodigo(rsConsulta.getString("IDNACIONALIDAD"));
            item.setDesc(rsConsulta.getString("NACIONALIDAD"));
            items.add(item);
            System.out.println("Paso ..");
          }  
          request.getSession().setAttribute("ayuda",items);
          to="arbitros";
          }catch(Exception e){
            e.printStackTrace();
          }finally{
            conn.closeConnection();	
          }
    }
    if(boton.equals("Entrenadores")){
      to="entrenadores";
    }
    if(boton.equals("Grandslam")){
      to="grandslam";
    }
    if(boton.equals("Locaciones")){
      try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select * from LOCACIONES order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoLocaciones item = new ClaseListadoLocaciones();
          item.setId(rsConsulta.getString("idlocaciones"));
          item.setLocacion(rsConsulta.getString("locacion"));
          item.setPais(rsConsulta.getString("idpais"));
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
      to="nacionalidad";
    }
    if(boton.equals("Pais")){
      to="pais";
    }
    if(boton.equals("Participantes")){
      try{
        cn = conn.conexion;
        System.out.println("Conexion lista");
        String cadena = "select * from participantes order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseListadoParticipantes item = new ClaseListadoParticipantes();
          item.setId(rsConsulta.getString("idparticipantes"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setEdad(rsConsulta.getString("edad"));
          item.setGenero(rsConsulta.getString("genero"));
          item.setNacionalidad(rsConsulta.getString("nacionalidad_idnacionalidad"));
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
      to="partido";
    }
    if(boton.equals("Premios")){
      to="premios";
    }
    if(boton.equals("Resultados")){
      to="resultados";
    }
    if(boton.equals("Participantes-Entrenadores")){
      to="participantes-entrenadores";
    }
    return mapping.findForward(to);
  }
}