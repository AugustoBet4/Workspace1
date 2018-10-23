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

public class altasGrandslamAction extends Action 
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
    altasGrandslamForm ent = (altasGrandslamForm) form;
    String id = ent.getId();
    String nombre = ent.getNombre();
    String anio = ent.getAnio();

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

    try
    {
      cn = conn.conexion;
      String cadena = "insert into grandslam values ("+id+",'"+nombre+"',"+anio+")";
      System.out.println(cadena);
      int a = conn.InsertaDatos(cadena);
      return mapping.findForward("index");
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
}