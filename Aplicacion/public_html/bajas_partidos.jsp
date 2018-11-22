<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Baja
</title>
</head>
<body>
      <html:form action="/bajaPartidos" styleClass="form-group">
        <div align="center">
        <table>
      <thead>
      <tr>
      <td><b>Codigo</b></td>
            <td><b>Descripcion</b></td>
      </tr>
      </thead>
      <logic:iterate id="tabla" indexId="index" name="nn" property="tabla">
         <tr>
            <td>             
              <html:submit property="cod">
                <bean:write name="tabla" property="codigo" />
              </html:submit>
            </td><td>
            <bean:write name="tabla" property="desc" />
             </td>
             </tr>
        
        </logic:iterate>
        </table>
        </div>
        </html:form>


</body>
</html>
