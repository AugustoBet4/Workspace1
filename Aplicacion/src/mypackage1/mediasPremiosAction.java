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

public class mediasPremiosAction extends Action 
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
    MediasForm cc = (MediasForm) form;
    String cod = cc.getCod();
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from premios where idpremios="+cod+"";
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next()){
          request.getSession().setAttribute("idpremios", rsConsulta.getString("idpremios"));
          request.getSession().setAttribute("cantidad", rsConsulta.getString("cantidad"));
          request.getSession().setAttribute("categoria", rsConsulta.getString("categoria"));
          request.getSession().setAttribute("idparticipante", rsConsulta.getString("idparticipante"));
          request.getSession().setAttribute("idpartido", rsConsulta.getString("idpartido"));
      }
      return mapping.findForward("edit");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("mal"));
      }finally{
        conn.closeConnection();	
      }
  }
}