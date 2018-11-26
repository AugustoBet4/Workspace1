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
  <body>
    <div class="container" style="margin-top: 3rem; margin-bottom: 3rem;">
      <div class="card">
        <h2 class="card-header">Editar Arbitros
        </h2>
        <div class="card-body">
        <html:form action="/editArbitros" styleClass="form-group">
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Codigo</h6>
                  <html:text property="id" value='<%= session.getAttribute("idarbitro") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>

            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Nombre</h6>
                  <html:text property="nombre" value='<%= session.getAttribute("nombre") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Telefono</h6>
                  <html:text property="telefono" value='<%= session.getAttribute("telefono") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Email</h6>
                  <html:text property="email" value='<%= session.getAttribute("email") %>' styleClass="form-control-sm" />
                </div>
              </div>
            </div>
            
            <div class="row justify-content-md-center">
              <div class="col-md">
                <div class="form-group">
                  <h6>Nacionalidad</h6>
                  <html:text property="idnacionalidad" value='<%= session.getAttribute("idnacionalidad") %>' styleClass="form-control-sm" />
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