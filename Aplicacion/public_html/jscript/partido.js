function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.locacion.value ))
    Mensaje = Mensaje + 'Verifique la locacion \n';
  if(EsVacio( f.participante1.value ))
    Mensaje = Mensaje + 'Verifique el primer participante \n';
  if(EsVacio( f.participante1.value ))
    Mensaje = Mensaje + 'Verifique el segundo participante \n';
  if(EsVacio( f.arbitro.value ))
    Mensaje = Mensaje + 'Verifique el arbitro \n';
  if(EsVacio( f.grandslam.value ))
    Mensaje = Mensaje + 'Verifique el GrandSlam \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
