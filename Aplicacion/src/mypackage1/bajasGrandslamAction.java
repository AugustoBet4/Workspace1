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

public class bajasGrandslamAction extends Action 
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
    bajasGrandslamForm cc = (bajasGrandslamForm) form;
    String codigo = cc.getCod();
    
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

    try
       {
         cn = conn.conexion;
         String cadena = "delete from GRANDSLAM where idgrandslam = "+ codigo +"";
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
         System.out.println(a);
         if(a == 1) {
          return mapping.findForward("inicio");
         }
         else{
          return mapping.findForward("nook");
         }
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