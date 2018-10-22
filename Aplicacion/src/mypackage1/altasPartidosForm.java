package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasPartidosForm extends ActionForm 
{
  String id;
  String locacion;
  String participante1;
  String participante2;
  String arbitro;
  String modalidad;
  String grandslam;

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

  public String getLocacion()
  {
    return locacion;
  }

  public void setLocacion(String newLocacion)
  {
    locacion = newLocacion;
  }

  public String getParticipante1()
  {
    return participante1;
  }

  public void setParticipante1(String newParticipante1)
  {
    participante1 = newParticipante1;
  }

  public String getParticipante2()
  {
    return participante2;
  }

  public void setParticipante2(String newParticipante2)
  {
    participante2 = newParticipante2;
  }

  public String getArbitro()
  {
    return arbitro;
  }

  public void setArbitro(String newArbitro)
  {
    arbitro = newArbitro;
  }

  public String getModalidad()
  {
    return modalidad;
  }

  public void setModalidad(String newModalidad)
  {
    modalidad = newModalidad;
  }

  public String getGrandslam()
  {
    return grandslam;
  }

  public void setGrandslam(String newGrandslam)
  {
    grandslam = newGrandslam;
  }
}