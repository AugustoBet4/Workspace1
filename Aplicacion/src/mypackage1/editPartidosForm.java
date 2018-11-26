package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class editPartidosForm extends ActionForm 
{
  String id;
  String idlocaciones;
  String idparticipantes1;
  String idparticipantes2;
  String idarbitros;
  String idmodalidades;
  String idgrandslam;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getId()
  {
    return id;
  }

  public void setId(String newId)
  {
    id = newId;
  }

  public String getIdlocaciones()
  {
    return idlocaciones;
  }

  public void setIdlocaciones(String newIdlocaciones)
  {
    idlocaciones = newIdlocaciones;
  }

  public String getIdparticipantes1()
  {
    return idparticipantes1;
  }

  public void setIdparticipantes1(String newIdparticipantes1)
  {
    idparticipantes1 = newIdparticipantes1;
  }

  public String getIdparticipantes2()
  {
    return idparticipantes2;
  }

  public void setIdparticipantes2(String newIdparticipantes2)
  {
    idparticipantes2 = newIdparticipantes2;
  }

  public String getIdarbitros()
  {
    return idarbitros;
  }

  public void setIdarbitros(String newIdarbitros)
  {
    idarbitros = newIdarbitros;
  }

  public String getIdmodalidades()
  {
    return idmodalidades;
  }

  public void setIdmodalidades(String newIdmodalidades)
  {
    idmodalidades = newIdmodalidades;
  }

  public String getIdgrandslam()
  {
    return idgrandslam;
  }

  public void setIdgrandslam(String newIdgrandslam)
  {
    idgrandslam = newIdgrandslam;
  }
}