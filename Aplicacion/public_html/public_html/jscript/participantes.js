function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.nombre.value ))
    Mensaje = Mensaje + 'Verifique el nombre \n';
  if(EsVacio( f.edad.value ))
    Mensaje = Mensaje + 'Verifique la edad \n';
  if(EsVacio( f.genero.value ))
    Mensaje = Mensaje + 'Verifique el genero \n';
  if(EsVacio( f.nacionalidad.value ))
    Mensaje = Mensaje + 'Verifique la nacionalidad \n';
    
  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
