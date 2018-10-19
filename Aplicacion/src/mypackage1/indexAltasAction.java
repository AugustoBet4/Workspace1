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
    if(boton=="Arbitros"){
      to = "arbitros";
    }
    if(boton=="Entrenadores"){
      to="entrenadores";
    }
    if(boton=="Grandslam"){
      to="grandslam";
    }
    if(boton=="Locaciones"){
      to="locaciones";
    }
    if(boton=="Nacionalidad"){
      to="nacionalidad";
    }
    if(boton=="Pais"){
      to="pais";
    }
    if(boton=="Participantes"){
      to="participantes";
    }
    if(boton=="Partido"){
      to="partido";
    }
    if(boton=="Premios"){
      to="premios";
    }
    if(boton=="Resultados"){
      to="resultados";
    }
    if(boton=="Participantes-Entrenadores"){
      to="participantes-entrenadores";
    }
    return mapping.findForward(to);
  }
}