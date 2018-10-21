package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasPremiosForm extends ActionForm 
{
  String id;
  String cantidad;
  String categoria;
  String participante;
  String idpartido;

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

  public String getCantidad()
  {
    return cantidad;
  }

  public void setCantidad(String newCantidad)
  {
    cantidad = newCantidad;
  }

  public String getCategoria()
  {
    return categoria;
  }

  public void setCategoria(String newCategoria)
  {
    categoria = newCategoria;
  }

  public String getParticipante()
  {
    return participante;
  }

  public void setParticipante(String newParticipante)
  {
    participante = newParticipante;
  }

  public String getIdpartido()
  {
    return idpartido;
  }

  public void setIdpartido(String newIdpartido)
  {
    idpartido = newIdpartido;
  }
}