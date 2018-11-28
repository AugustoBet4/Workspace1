function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.nombre.value ))
    Mensaje = Mensaje + 'Verifique el Nombre \n';
  if(EsVacio( f.telefono.value ))
    Mensaje = Mensaje + 'Verifique el Telefono \n';
  if(EsVacio( f.email.value ))
    Mensaje = Mensaje + 'Verifique el Email \n';
  if(EsVacio( f.idnacionalidad.value ))
    Mensaje = Mensaje + 'Verifique la Nacionalidad \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
