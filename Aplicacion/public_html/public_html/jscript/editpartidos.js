function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.idlocaciones.value ))
    Mensaje = Mensaje + 'Verifique la locacion \n';
  if(EsVacio( f.idparticipantes1.value ))
    Mensaje = Mensaje + 'Verifique el primer participante \n';
  if(EsVacio( f.idparticipantes2.value ))
    Mensaje = Mensaje + 'Verifique el segundo participante \n';
  if(EsVacio( f.idarbitros.value ))
    Mensaje = Mensaje + 'Verifique el arbitro \n';
  if(EsVacio( f.idgrandslam.value ))
    Mensaje = Mensaje + 'Verifique el GrandSlam \n';
  if(EsVacio( f.idmodalidades.value ))
    Mensaje = Mensaje + 'Verifique la Modalidad \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
