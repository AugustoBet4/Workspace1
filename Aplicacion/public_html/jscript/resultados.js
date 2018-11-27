function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.resultados.value ))
    Mensaje = Mensaje + 'Verifique los Resultados \n';
  if(EsVacio( f.idpartido.value ))
    Mensaje = Mensaje + 'Verifique el Partido \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
