package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasParticipantesForm extends ActionForm 
{
  String id;
  String nombre;
  String edad;
  String genero;
  String nacionalidad;

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

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getEdad()
  {
    return edad;
  }

  public void setEdad(String newEdad)
  {
    edad = newEdad;
  }

  public String getGenero()
  {
    return genero;
  }

  public void setGenero(String newGenero)
  {
    genero = newGenero;
  }

  public String getNacionalidad()
  {
    return nacionalidad;
  }

  public void setNacionalidad(String newNacionalidad)
  {
    nacionalidad = newNacionalidad;
  }
}