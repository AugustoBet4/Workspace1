  /*@lineinfo:filename=/bajas_Grandslam.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _bajas__Grandslam extends com.orionserver.http.OrionHttpJspPage {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _bajas__Grandslam page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      __ojsp_s_out.write(__jsp_StaticText.text[2]);
      __ojsp_s_out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:27^13*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/bajasGrandslam");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:36^17*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_2=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setId("tabla");
              __jsp_taghandler_2.setIndexId("index");
              __jsp_taghandler_2.setName("nn");
              __jsp_taghandler_2.setProperty("tabla");
              java.lang.Object tabla = null;
              java.lang.Integer index = null;
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                  tabla = (java.lang.Object) pageContext.findAttribute("tabla");
                  index = (java.lang.Integer) pageContext.findAttribute("index");
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[5]);
                  /*@lineinfo:translated-code*//*@lineinfo:39^23*/                  {
                    org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setProperty("cod");
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                      __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                      do {
                        /*@lineinfo:generated-code*/
                        __ojsp_s_out.write(__jsp_StaticText.text[6]);
                        /*@lineinfo:translated-code*//*@lineinfo:40^25*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                          __jsp_taghandler_4.setName("tabla");
                          __jsp_taghandler_4.setProperty("idgrandslam");
                          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
                        }
                        /*@lineinfo:generated-code*/
                        __ojsp_s_out.write(__jsp_StaticText.text[7]);
                      /*@lineinfo:translated-code*//*@lineinfo:40^75*/                      } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                    }
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:44^23*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_5.setName("tabla");
                    __jsp_taghandler_5.setProperty("nombre");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[9]);
                  /*@lineinfo:translated-code*//*@lineinfo:47^23*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_6.setName("tabla");
                    __jsp_taghandler_6.setProperty("anio");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[10]);
                /*@lineinfo:translated-code*//*@lineinfo:47^66*/                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[11]);
          /*@lineinfo:translated-code*//*@lineinfo:50^33*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[12]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final byte text[][]=new byte[13][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n".getBytes("Cp1252");
      text[2] = 
      "\r\n".getBytes("Cp1252");
      text[3] = 
      "\r\n<html>\r\n  <head>\r\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n    <link rel=\"stylesheet\" href=\"css/estilos.css\" type=\"text/css\">\r\n    <title>\r\n      Grandslam - Eliminar GrandSlam\r\n    </title>\r\n    <script language=\"JavaScript\" src=\"jscript/jquery.js\"></script>\r\n    <script language=\"JavaScript\" src=\"jscript/lbajas.js\"></script>\r\n  </head>\r\n  <body>\r\n    <div class=\"container\">\r\n      <div class=\"card mt-3\">\r\n        <h1 class=\"card-header\">\r\n          Grand Slam - Eliminando Grandslam\r\n        </h1>\r\n        <div class=\"card-body\">\r\n          <div class=\"row justify-content-md-center\">\r\n            ".getBytes("Cp1252");
      text[4] = 
      "\r\n              <table class=\"table table-striped\">\r\n                <thead class=\"thead-dark\">\r\n                  <tr>\r\n                    <th scope=\"col\">Codigo</th>\r\n                    <th scope=\"col\">Nombre</th>\r\n                    <th scope=\"col\">A�o</th>\r\n                  </tr>\r\n                </thead>\r\n                ".getBytes("Cp1252");
      text[5] = 
      "\r\n                  <tr>\r\n                    <td>\r\n                      ".getBytes("Cp1252");
      text[6] = 
      "\r\n                        ".getBytes("Cp1252");
      text[7] = 
      "\r\n                      ".getBytes("Cp1252");
      text[8] = 
      "\r\n                    </td>\r\n                    <td>\r\n                      ".getBytes("Cp1252");
      text[9] = 
      "\r\n                    </td>\r\n                    <td>\r\n                      ".getBytes("Cp1252");
      text[10] = 
      "\r\n                    </td>\r\n                  </tr>\r\n                ".getBytes("Cp1252");
      text[11] = 
      "\r\n              </table>\r\n            ".getBytes("Cp1252");
      text[12] = 
      "\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </body>\r\n</html>\r\n\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
