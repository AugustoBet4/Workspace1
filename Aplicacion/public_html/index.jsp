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
      BlaBla
    </title>
  </head>
  <body>
    <div class="container">
      <div class="card mt-3">
        <h1 class="card-header">
          Grand Slam
        </h1>
        <div class="card-body">
          <div class="row justify-content-center">
            <div class="col-3">
              <h2>Agregar</h2>
              <div class="btn-group-vertical">
                <html:form action="/altas" styleClass="form-group">
                  <html:submit value="Arbitros" styleClass="btn btn-outline-success" property="boton" />
                  <html:submit value="Entrenadores" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Grandslam" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Locaciones" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Nacionalidad" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Pais" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Participantes" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Partido" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Premios" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Resultados" styleClass="btn btn-outline-success mt-1" property="boton" />
                  <html:submit value="Participantes-Entrenadores" styleClass="btn btn-outline-success mt-1" property="boton" />
                </html:form>
              </div>
            </div>
            <div class="col-3">
              <h2 class="justify-content-md-center">Listar</h2>
              <div class="btn-group-vertical">
                <html:form action="/listado" styleClass="form-group">
                  <html:submit value="Arbitros" styleClass="btn btn-outline-warning" property="boton" />
                  <html:submit value="Entrenadores" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Grandslam" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Locaciones" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Nacionalidad" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Pais" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Participantes" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Partido" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Premios" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Resultados" styleClass="btn btn-outline-warning mt-1" property="boton" />
                  <html:submit value="Participantes/Entrenadores" styleClass="btn btn-outline-warning mt-1" property="boton" />
                </html:form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
