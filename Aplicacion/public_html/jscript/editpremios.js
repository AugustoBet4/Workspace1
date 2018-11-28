function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.cantidad.value ))
    Mensaje = Mensaje + 'Verifique la Cantidad \n';
  if(EsVacio( f.categoria.value ))
    Mensaje = Mensaje + 'Verifique la Categoria \n';
  if(EsVacio( f.idparticipante.value ))
    Mensaje = Mensaje + 'Verifique el Participante \n';
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
