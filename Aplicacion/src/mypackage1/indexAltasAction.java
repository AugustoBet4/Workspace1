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

public class indexAltasAction extends Action 
{
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
          to="entrenadores";
          }catch(Exception e){
            e.printStackTrace();
          }finally{
            conn.closeConnection();	
          }
    }
    if(boton.equals("Grandslam")){
      to="grandslam";
    }
    if(boton.equals("Locaciones")){
      try{
        cn = conn.conexion;
        String cadena = "select * from pais order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          ClaseNacion item = new ClaseNacion();
          item.setCodigo(rsConsulta.getString("NUM_SEC_PAIS"));
          item.setDesc(rsConsulta.getString("NOMBRE"));
          items.add(item);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda",items);
        to="locaciones";
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
        to="participantes";
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