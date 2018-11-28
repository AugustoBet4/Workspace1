  /*@lineinfo:filename=/altasArbitros.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _altasArbitros extends com.orionserver.http.OrionHttpJspPage {

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
    _altasArbitros page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:25^13*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit styleClass");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/altasArbitros");
        __jsp_taghandler_1.setOnsubmit("return fParams( )");
        __jsp_taghandler_1.setStyleClass("form-group");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[2]);
            /*@lineinfo:translated-code*//*@lineinfo:31^21*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_2=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag onkeypress property styleClass");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setOnkeypress("EvaluateText('%d',this)");
              __jsp_taghandler_2.setProperty("id");
              __jsp_taghandler_2.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:39^21*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_3=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("nombre");
              __jsp_taghandler_3.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:47^21*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_4=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag onkeypress property styleClass");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setOnkeypress("EvaluateText('%d',this)");
              __jsp_taghandler_4.setProperty("telefono");
              __jsp_taghandler_4.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:55^21*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_5=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("email");
              __jsp_taghandler_5.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:63^21*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setProperty("nacionalidad");
              __jsp_taghandler_6.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[7]);
                  /*@lineinfo:translated-code*//*@lineinfo:64^23*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_7=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_7.setCollection("ayuda");
                    __jsp_taghandler_7.setLabelProperty("desc");
                    __jsp_taghandler_7.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[8]);
                /*@lineinfo:translated-code*//*@lineinfo:64^97*/                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:71^17*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setStyleClass("btn btn-success");
              __jsp_taghandler_8.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[10]);
          /*@lineinfo:translated-code*//*@lineinfo:71^79*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[11]);


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
    private static final byte text[][]=new byte[12][];
    static {
      try {
      text[0] = 
      "\n".getBytes("Cp1252");
      text[1] = 
      "\n<html>\n<head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n    <title>\n      Grandslam - Alta Arbitro\n    </title>\n  </head>\n  \n<script language=\"JavaScript\" src=\"jscript/valida.js\"></script>\n<script language=\"JavaScript\" src=\"jscript/arbitro.js\"></script>\n  <body>\n\n   <div class=\"container\">\n        <div class=\"card mt-3\">\n          <h1 class=\"card-header\">\n            Grand Slam - Agregar Arbitro\n          </h1>\n          <div class=\"card-body\">\n            ".getBytes("Cp1252");
      text[2] = 
      "\n\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>ID</h6>\n                    ".getBytes("Cp1252");
      text[3] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Nombre</h6>\n                    ".getBytes("Cp1252");
      text[4] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Telefono</h6>\n                    ".getBytes("Cp1252");
      text[5] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Email</h6>\n                    ".getBytes("Cp1252");
      text[6] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Nacionalidad</h6>\n                    ".getBytes("Cp1252");
      text[7] = 
      "\n                      ".getBytes("Cp1252");
      text[8] = 
      "\n                    ".getBytes("Cp1252");
      text[9] = 
      "\n                  </div>\n                </div>\n              </div>\n           \n              <div class=\"form-group\">\n                ".getBytes("Cp1252");
      text[10] = 
      "\n              </div>\n            \n            ".getBytes("Cp1252");
      text[11] = 
      "\n          </div>\n        </div>\n      </div>\n\n  </body>\n</html>\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
