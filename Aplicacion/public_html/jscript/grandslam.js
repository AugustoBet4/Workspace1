function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.nombre.value ))
    Mensaje = Mensaje + 'Verifique el Nombre \n';
  if(EsVacio( f.anio.value ))
    Mensaje = Mensaje + 'Verifique el A�o \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
