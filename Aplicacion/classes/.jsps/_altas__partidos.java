  /*@lineinfo:filename=/altas_partidos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _altas__partidos extends oracle.jsp.runtime.HttpJsp {

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
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _altas__partidos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:20^11*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action styleClass");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/altasPartidos");
        __jsp_taghandler_1.setStyleClass("form-group");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[2]);
            /*@lineinfo:translated-code*//*@lineinfo:25^21*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_2=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("id");
              __jsp_taghandler_2.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:33^23*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("locacion");
              __jsp_taghandler_3.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[4]);
                  /*@lineinfo:translated-code*//*@lineinfo:34^25*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_4=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setCollection("ayuda");
                    __jsp_taghandler_4.setLabelProperty("desc");
                    __jsp_taghandler_4.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[5]);
                /*@lineinfo:translated-code*//*@lineinfo:34^99*/                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:43^23*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_5=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("participante1");
              __jsp_taghandler_5.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[7]);
                  /*@lineinfo:translated-code*//*@lineinfo:44^25*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_6=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_6.setCollection("ayuda1");
                    __jsp_taghandler_6.setLabelProperty("desc");
                    __jsp_taghandler_6.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[8]);
                /*@lineinfo:translated-code*//*@lineinfo:44^100*/                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:53^23*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_7=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("participante2");
              __jsp_taghandler_7.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[10]);
                  /*@lineinfo:translated-code*//*@lineinfo:54^25*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_8=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                    __jsp_taghandler_8.setCollection("ayuda1");
                    __jsp_taghandler_8.setLabelProperty("desc");
                    __jsp_taghandler_8.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[11]);
                /*@lineinfo:translated-code*//*@lineinfo:54^100*/                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:64^21*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("arbitro");
              __jsp_taghandler_9.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[13]);
                  /*@lineinfo:translated-code*//*@lineinfo:65^23*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_10=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_10.setCollection("ayuda2");
                    __jsp_taghandler_10.setLabelProperty("nombre");
                    __jsp_taghandler_10.setProperty("cod");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[14]);
                /*@lineinfo:translated-code*//*@lineinfo:65^97*/                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:translated-code*//*@lineinfo:74^21*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("modalidad");
              __jsp_taghandler_11.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[16]);
                  /*@lineinfo:translated-code*//*@lineinfo:75^23*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_12=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                    __jsp_taghandler_12.setCollection("ayuda3");
                    __jsp_taghandler_12.setLabelProperty("desc");
                    __jsp_taghandler_12.setProperty("codigo");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[17]);
                /*@lineinfo:translated-code*//*@lineinfo:75^98*/                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[18]);
            /*@lineinfo:translated-code*//*@lineinfo:84^21*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property styleClass");
              __jsp_taghandler_13.setParent(__jsp_taghandler_1);
              __jsp_taghandler_13.setProperty("grandslam");
              __jsp_taghandler_13.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[19]);
                  /*@lineinfo:translated-code*//*@lineinfo:85^23*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_14=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                    __jsp_taghandler_14.setCollection("ayuda4");
                    __jsp_taghandler_14.setLabelProperty("anio");
                    __jsp_taghandler_14.setProperty("nombre");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[20]);
                /*@lineinfo:translated-code*//*@lineinfo:85^98*/                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[21]);
            /*@lineinfo:translated-code*//*@lineinfo:91^17*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_15=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_15.setParent(__jsp_taghandler_1);
              __jsp_taghandler_15.setStyleClass("btn btn-success");
              __jsp_taghandler_15.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[22]);
          /*@lineinfo:translated-code*//*@lineinfo:91^79*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[23]);


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
    private static final char text[][]=new char[24][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n<html>\n<head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script><title>\nPagina de altas_partidos\n</title>\n</head>\n<body>\n<div class=\"container\">\n      <div class=\"card mt-3\">\n        <h1 class=\"card-header\">\n          Grand Slam - Agregar Partidos\n        </h1>\n        <div class=\"card-body\">\n          ".toCharArray();
      text[2] = 
      "\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>ID</h6>\n                    ".toCharArray();
      text[3] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Locación</h6>\n                      ".toCharArray();
      text[4] = 
      "\n                        ".toCharArray();
      text[5] = 
      "\n                      ".toCharArray();
      text[6] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Jugador 1</h6>\n                      ".toCharArray();
      text[7] = 
      "\n                        ".toCharArray();
      text[8] = 
      "\n                      ".toCharArray();
      text[9] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Jugador 2</h6>\n                      ".toCharArray();
      text[10] = 
      "\n                        ".toCharArray();
      text[11] = 
      "\n                      ".toCharArray();
      text[12] = 
      "\n\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Arbitro</h6>\n                    ".toCharArray();
      text[13] = 
      "\n                      ".toCharArray();
      text[14] = 
      "\n                    ".toCharArray();
      text[15] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Modalidad</h6>\n                    ".toCharArray();
      text[16] = 
      "\n                      ".toCharArray();
      text[17] = 
      "\n                    ".toCharArray();
      text[18] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"row justify-content-md-center\">\n                <div class=\"col-md\">\n                  <div class=\"form-group\">\n                    <h6>Grand Slam</h6>\n                    ".toCharArray();
      text[19] = 
      "\n                      ".toCharArray();
      text[20] = 
      "\n                    ".toCharArray();
      text[21] = 
      "\n                  </div>\n                </div>\n              </div>\n              <div class=\"form-group\">\n                ".toCharArray();
      text[22] = 
      "\n              </div>\n          ".toCharArray();
      text[23] = 
      "\n        </div>\n      </div>\n    </div>\n\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
