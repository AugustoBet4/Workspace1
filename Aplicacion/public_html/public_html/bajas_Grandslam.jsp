<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/estilos.css" type="text/css">
    <title>
      Grandslam - Eliminar GrandSlam
    </title>
    <script language="JavaScript" src="jscript/jquery.js"></script>
    <script language="JavaScript" src="jscript/lbajas.js"></script>
  </head>
  <body>
    <div class="container">
      <div class="card mt-3">
        <h1 class="card-header">
          Grand Slam - Eliminando Grandslam
        </h1>
        <div class="card-body">
          <div class="row justify-content-md-center">
            <html:form action="/bajasGrandslam">
              <table class="table table-striped">
                <thead class="thead-dark">
                  <tr>
                    <th scope="col">Codigo</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">A�o</th>
                  </tr>
                </thead>
                <logic:iterate id="tabla" indexId="index" name="nn" property="tabla">
                  <tr>
                    <td>
                      <html:submit property="cod" >
                        <bean:write name="tabla" property="idgrandslam" />
                      </html:submit>
                    </td>
                    <td>
                      <bean:write name="tabla" property="nombre" />
                    </td>
                    <td>
                      <bean:write name="tabla" property="anio" />
                    </td>
                  </tr>
                </logic:iterate>
              </table>
            </html:form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>

