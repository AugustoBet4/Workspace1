function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.locacion.value ))
    Mensaje = Mensaje + 'Verifique la Locacion \n';
    if(EsVacio( f.pais.value ))
    Mensaje = Mensaje + 'Verifique el Pais \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
