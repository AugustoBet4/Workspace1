<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <title>
      Grandslam - Alta Participante
    </title>
      <script language="JavaScript" src="jscript/valida.js"></script>
      <script language="JavaScript" src="jscript/participantes.js"></script>
  </head>
  <body>
    <div class="container">
      <div class="card mt-3">
        <h1 class="card-header">
          Grand Slam - Agregar Participante
        </h1>
        <div class="card-body">
          <html:form action="/altaParti" styleClass="form-group" onsubmit="return fParams( )" >

            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>ID</h6>
                  <html:text property="id" styleClass="form-control" onkeypress="EvaluateText('%d',this)" />
                </div>
              </div>
            </div>
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Nombre</h6>
                  <html:text property="nombre" styleClass="form-control" />
                </div>
              </div>
            </div>
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Edad</h6>
                  <html:text property="edad" styleClass="form-control" />
                </div>
              </div>
            </div>
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Genero</h6>
                  <html:select property="genero" styleClass="form-control" >
                    <html:option value="Masculino" />
                    <html:option value="Femenino" />
                  </html:select>
                </div>
              </div>
            </div>
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Nacionalidad</h6>
                  <html:select property="nacionalidad" styleClass="form-control" >
                    <html:options collection="ayuda" labelProperty="desc" property="codigo" />
                  </html:select>
                </div>
              </div>
            </div>
           
            <div class="form-group">
              <html:submit styleClass="btn btn-success" value="Registrar" />
            </div>
            
          </html:form>
        </div>
      </div>
    </div>
  </body>
</html>

