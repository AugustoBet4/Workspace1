<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script><title>
Pagina de altas_partidos
</title>
</head>
<body>
idpartido, idlocaciones, idparticpantes1, idparticipantes2, idarbitros, id modalidades, idgrandslam
<div class="container">
      <div class="card mt-3">
        <h1 class="card-header">
          Grand Slam - Agregar Partidos
        </h1>
        <div class="card-body">
          <html:form action="/bajasPremios" styleClass="form-group">
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>ID</h6>
                    <html:text property="id" styleClass="form-control" />
                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Locación</h6>
                      <html:select property="locacion" styleClass="form-control">
                        <html:options collection="ayuda" labelProperty="desc" property="codigo" />
                      </html:select>
                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Jugador 1</h6>
                      <html:select property="participante1" styleClass="form-control">
                        <html:options collection="ayuda1" labelProperty="desc" property="codigo" />
                      </html:select>
                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Jugador 2</h6>
                      <html:select property="participante2" styleClass="form-control">
                        <html:options collection="ayuda1" labelProperty="desc" property="codigo" />
                      </html:select>

                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Arbitro</h6>
                    <html:select property="arbitro" styleClass="form-control">
                      <html:options collection="ayuda2" labelProperty="desc" property="codigo" />
                    </html:select>
                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Modalidad</h6>
                    <html:select property="modalidad" styleClass="form-control">
                      <html:options collection="ayuda3" labelProperty="desc" property="codigo" />
                    </html:select>
                  </div>
                </div>
              </div>
              <div class="row justify-content-md-center">
                <div class="col-md">
                  <div class="form-group">
                    <h6>Grand Slam</h6>
                    <html:select property="grandslam" styleClass="form-control">
                      <html:options collection="ayuda4" labelProperty="desc" property="codigo" />
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
