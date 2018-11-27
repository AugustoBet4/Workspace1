<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>
      Edit
    </title>
    <script language="JavaScript" src="jscript/valida.js"></script>
    <script language="JavaScript" src="jscript/premios.js"></script>
  </head>
  <body>
    <div class="container" style="margin-top: 3rem; margin-bottom: 3rem;">
      <div class="card">
        <h2 class="card-header">Editar Premios
        </h2>
        <div class="card-body">
        <html:form action="/editPremios" styleClass="form-group" onsubmit="return fParams( )" >
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Codigo</h6>
                  <html:text property="id" value='<%= session.getAttribute("idpremios") %>' styleClass="form-control-sm" onkeypress="EvaluateText('%d',this)" readonly="true" />
                </div>
              </div>
            </div>

            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Cantidad</h6>
                  <html:text property="cantidad" value='<%= session.getAttribute("cantidad") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Categoria</h6>
                  <html:text property="categoria" value='<%= session.getAttribute("categoria") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Participante</h6>
                  <html:text property="idparticipante" value='<%= session.getAttribute("idparticipante") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Partido</h6>
                  <html:text property="idpartido" value='<%= session.getAttribute("idpartido") %>' styleClass="form-control-sm" />
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