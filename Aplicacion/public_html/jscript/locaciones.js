function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.cod.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.locacion.value ))
    Mensaje = Mensaje + 'Verifique la Locacion \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
