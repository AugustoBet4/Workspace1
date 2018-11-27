<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>
      Edit
    </title>
  </head>
  <script language="JavaScript" src="jscript/valida.js"></script>
<script language="JavaScript" src="jscript/locaciones.js"></script>
  <body>
    <div class="container" style="margin-top: 3rem; margin-bottom: 3rem;">
      <div class="card">
        <h2 class="card-header">Edit Locacion
        </h2>
        <div class="card-body">
        <html:form action="/editLocaciones" styleClass="form-group" onsubmit="return fParams( )">
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Codigo</h6>
                  <html:text property="cod" value='<%= session.getAttribute("id") %>' styleClass="form-control-sm" onkeypress="EvaluateText('%d',this)" readonly="true" disabled="true"/>
                </div>
              </div>
            </div>

            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Locacion</h6>
                  <html:text property="locacion" value='<%= session.getAttribute("locacion") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>

            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Pais</h6>
                  <html:text property="pais" value='<%= session.getAttribute("pais") %>' styleClass="form-control-sm" onkeypress="EvaluateText('%d',this)"/>
                </div>
              </div>
            </div>

            <div class="form-group">
              <html:submit styleClass="btn btn-success" value="Actualizar" />
            </div> 
          </html:form>
          
        </div>
      </div>
    </div>
  </body>
</html>