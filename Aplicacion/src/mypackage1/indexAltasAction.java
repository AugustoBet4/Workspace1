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
    
      try
      {
      cn = conn.conexion;
      //------------------------------------------------------------------------------
      //COMBO BOX LOCACIONES
      String cadena = "select * from LOCACIONES order by 1";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
          ClaseLocacion item = new ClaseLocacion();
          item.setCodigo(rsConsulta.getString("IDLOCACIONES"));
          item.setDesc(rsConsulta.getString("LOCACION"));
          items.add(item);
          System.out.println("Paso ..");
      }
      request.getSession().setAttribute("ayuda",items);
      //------------------------------------------------------------------------------
      //COMBO BOX PARTICIPANTES
      String cadena1 = "select * from PARTICIPANTES order by 1";
      rsConsulta = conn.getData(cadena1);
      ArrayList items1 = new ArrayList();
      while (rsConsulta.next())
      {
          ClaseParticipantes item = new ClaseParticipantes();
          item.setCodigo(rsConsulta.getString("IDPARTICIPANTES"));
          item.setDesc(rsConsulta.getString("NOMBRE"));
          items1.add(item);
          System.out.println("Paso ..");
      }
      request.getSession().setAttribute("ayuda1",items1);
      //------------------------------------------------------------------------------
      //COMBO BOX ARBITRO
      String cadena2 = "select * from ARBITROS order by 1";
      rsConsulta = conn.getData(cadena2);
      ArrayList items2 = new ArrayList();
      while (rsConsulta.next())
      {
          ClaseArbitro item = new ClaseArbitro();
          item.setCodigo(rsConsulta.getString("IDARBITRO"));
          item.setDesc(rsConsulta.getString("NOMBRE"));
          items2.add(item);
          System.out.println("Paso ..");
      }
      request.getSession().setAttribute("ayuda2",items2);

      //------------------------------------------------------------------------------
      //COMBO BOX MODALIDADES
      String cadena3 = "select * from MODALIDADES order by 1";
      rsConsulta = conn.getData(cadena3);
      ArrayList items3 = new ArrayList();
      while (rsConsulta.next())
      {
          ClaseModalidades item = new ClaseModalidades();
          item.setCodigo(rsConsulta.getString("IDMODALIDADES"));
          item.setDesc(rsConsulta.getString("MODALIDAD"));
          items3.add(item);
          System.out.println("Paso ..");
      }
      request.getSession().setAttribute("ayuda3",items3);

       //------------------------------------------------------------------------------
      //COMBO BOX GRAND SLAMS
      String cadena4 = "select * from GRANDSLAM order by 1";
      rsConsulta = conn.getData(cadena4);
      ArrayList items4 = new ArrayList();
      while (rsConsulta.next())
      {
          ClaseGrandslam item = new ClaseGrandslam();
          item.setCodigo(rsConsulta.getString("IDGRANDSLAM"));
          item.setDesc(rsConsulta.getString("NOMBRE"));
          items4.add(item);
          System.out.println("Paso ..");
      }
      request.getSession().setAttribute("ayuda4",items4);
      
      to="partido";
      }
      catch(Exception e)
      {
      e.printStackTrace();
      return (mapping.findForward("nook"));
      }
      finally
      {
      conn.closeConnection();
      }
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