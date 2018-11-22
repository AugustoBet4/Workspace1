  /*@lineinfo:filename=/index.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _index extends com.orionserver.http.OrionHttpJspPage {

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
    _index page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:26^17*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action styleClass");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/altas");
        __jsp_taghandler_1.setStyleClass("form-group");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[2]);
            /*@lineinfo:translated-code*//*@lineinfo:27^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_2=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("boton");
              __jsp_taghandler_2.setStyleClass("btn btn-outline-success");
              __jsp_taghandler_2.setValue("Arbitros");
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
            /*@lineinfo:translated-code*//*@lineinfo:28^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("boton");
              __jsp_taghandler_3.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_3.setValue("Entrenadores");
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
            /*@lineinfo:translated-code*//*@lineinfo:29^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setProperty("boton");
              __jsp_taghandler_4.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_4.setValue("Grandslam");
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
            /*@lineinfo:translated-code*//*@lineinfo:30^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_5=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("boton");
              __jsp_taghandler_5.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_5.setValue("Locaciones");
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
            /*@lineinfo:translated-code*//*@lineinfo:31^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setProperty("boton");
              __jsp_taghandler_6.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_6.setValue("Nacionalidad");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:32^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_7=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("boton");
              __jsp_taghandler_7.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_7.setValue("Pais");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:33^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setProperty("boton");
              __jsp_taghandler_8.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_8.setValue("Participantes");
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
            __ojsp_s_out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:34^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("boton");
              __jsp_taghandler_9.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_9.setValue("Partido");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:35^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_10=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setProperty("boton");
              __jsp_taghandler_10.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_10.setValue("Premios");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:36^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("boton");
              __jsp_taghandler_11.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_11.setValue("Resultados");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:37^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_12=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_12.setParent(__jsp_taghandler_1);
              __jsp_taghandler_12.setProperty("boton");
              __jsp_taghandler_12.setStyleClass("btn btn-outline-success mt-1");
              __jsp_taghandler_12.setValue("Participantes-Entrenadores");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[13]);
          /*@lineinfo:translated-code*//*@lineinfo:37^128*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:translated-code*//*@lineinfo:44^17*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_13=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action styleClass");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setAction("/listado");
        __jsp_taghandler_13.setStyleClass("form-group");
        __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:translated-code*//*@lineinfo:45^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_14=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_14.setParent(__jsp_taghandler_13);
              __jsp_taghandler_14.setProperty("boton");
              __jsp_taghandler_14.setStyleClass("btn btn-outline-warning");
              __jsp_taghandler_14.setValue("Arbitros");
              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[16]);
            /*@lineinfo:translated-code*//*@lineinfo:46^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_15=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_15.setParent(__jsp_taghandler_13);
              __jsp_taghandler_15.setProperty("boton");
              __jsp_taghandler_15.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_15.setValue("Entrenadores");
              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[17]);
            /*@lineinfo:translated-code*//*@lineinfo:47^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_16=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_16.setParent(__jsp_taghandler_13);
              __jsp_taghandler_16.setProperty("boton");
              __jsp_taghandler_16.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_16.setValue("Grandslam");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[18]);
            /*@lineinfo:translated-code*//*@lineinfo:48^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_17=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_17.setParent(__jsp_taghandler_13);
              __jsp_taghandler_17.setProperty("boton");
              __jsp_taghandler_17.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_17.setValue("Locaciones");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:49^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_18=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_18.setParent(__jsp_taghandler_13);
              __jsp_taghandler_18.setProperty("boton");
              __jsp_taghandler_18.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_18.setValue("Nacionalidad");
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[20]);
            /*@lineinfo:translated-code*//*@lineinfo:50^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_19=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_19.setParent(__jsp_taghandler_13);
              __jsp_taghandler_19.setProperty("boton");
              __jsp_taghandler_19.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_19.setValue("Pais");
              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[21]);
            /*@lineinfo:translated-code*//*@lineinfo:51^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_20=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_20.setParent(__jsp_taghandler_13);
              __jsp_taghandler_20.setProperty("boton");
              __jsp_taghandler_20.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_20.setValue("Participantes");
              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[22]);
            /*@lineinfo:translated-code*//*@lineinfo:52^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_21=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_21.setParent(__jsp_taghandler_13);
              __jsp_taghandler_21.setProperty("boton");
              __jsp_taghandler_21.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_21.setValue("Partido");
              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_21,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[23]);
            /*@lineinfo:translated-code*//*@lineinfo:53^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_22=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_22.setParent(__jsp_taghandler_13);
              __jsp_taghandler_22.setProperty("boton");
              __jsp_taghandler_22.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_22.setValue("Premios");
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_22,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[24]);
            /*@lineinfo:translated-code*//*@lineinfo:54^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_23=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_23.setParent(__jsp_taghandler_13);
              __jsp_taghandler_23.setProperty("boton");
              __jsp_taghandler_23.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_23.setValue("Resultados");
              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[25]);
            /*@lineinfo:translated-code*//*@lineinfo:55^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_24=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_24.setParent(__jsp_taghandler_13);
              __jsp_taghandler_24.setProperty("boton");
              __jsp_taghandler_24.setStyleClass("btn btn-outline-warning mt-1");
              __jsp_taghandler_24.setValue("Participantes/Entrenadores");
              __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[26]);
          /*@lineinfo:translated-code*//*@lineinfo:55^128*/          } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[27]);
      /*@lineinfo:translated-code*//*@lineinfo:62^17*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_25=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action styleClass");
        __jsp_taghandler_25.setParent(null);
        __jsp_taghandler_25.setAction("/bajas");
        __jsp_taghandler_25.setStyleClass("form-group");
        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[28]);
            /*@lineinfo:translated-code*//*@lineinfo:63^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_26=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_26.setParent(__jsp_taghandler_25);
              __jsp_taghandler_26.setProperty("boton");
              __jsp_taghandler_26.setStyleClass("btn btn-outline-danger");
              __jsp_taghandler_26.setValue("Arbitros");
              __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[29]);
            /*@lineinfo:translated-code*//*@lineinfo:64^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_27=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_27.setParent(__jsp_taghandler_25);
              __jsp_taghandler_27.setProperty("boton");
              __jsp_taghandler_27.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_27.setValue("Entrenadores");
              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[30]);
            /*@lineinfo:translated-code*//*@lineinfo:65^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_28=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_28.setParent(__jsp_taghandler_25);
              __jsp_taghandler_28.setProperty("boton");
              __jsp_taghandler_28.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_28.setValue("Grandslam");
              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[31]);
            /*@lineinfo:translated-code*//*@lineinfo:66^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_29=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_29.setParent(__jsp_taghandler_25);
              __jsp_taghandler_29.setProperty("boton");
              __jsp_taghandler_29.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_29.setValue("Locaciones");
              __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[32]);
            /*@lineinfo:translated-code*//*@lineinfo:67^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_30=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_30.setParent(__jsp_taghandler_25);
              __jsp_taghandler_30.setProperty("boton");
              __jsp_taghandler_30.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_30.setValue("Nacionalidad");
              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[33]);
            /*@lineinfo:translated-code*//*@lineinfo:68^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_31=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_31.setParent(__jsp_taghandler_25);
              __jsp_taghandler_31.setProperty("boton");
              __jsp_taghandler_31.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_31.setValue("Pais");
              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[34]);
            /*@lineinfo:translated-code*//*@lineinfo:69^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_32=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_32.setParent(__jsp_taghandler_25);
              __jsp_taghandler_32.setProperty("boton");
              __jsp_taghandler_32.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_32.setValue("Participantes");
              __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_32,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[35]);
            /*@lineinfo:translated-code*//*@lineinfo:70^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_33=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_33.setParent(__jsp_taghandler_25);
              __jsp_taghandler_33.setProperty("boton");
              __jsp_taghandler_33.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_33.setValue("Partido");
              __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[36]);
            /*@lineinfo:translated-code*//*@lineinfo:71^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_34=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_34.setParent(__jsp_taghandler_25);
              __jsp_taghandler_34.setProperty("boton");
              __jsp_taghandler_34.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_34.setValue("Premios");
              __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[37]);
            /*@lineinfo:translated-code*//*@lineinfo:72^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_35=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_35.setParent(__jsp_taghandler_25);
              __jsp_taghandler_35.setProperty("boton");
              __jsp_taghandler_35.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_35.setValue("Resultados");
              __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[38]);
            /*@lineinfo:translated-code*//*@lineinfo:73^19*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_36.setParent(__jsp_taghandler_25);
              __jsp_taghandler_36.setProperty("boton");
              __jsp_taghandler_36.setStyleClass("btn btn-outline-danger mt-1");
              __jsp_taghandler_36.setValue("Participantes/Entrenadores");
              __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[39]);
          /*@lineinfo:translated-code*//*@lineinfo:73^127*/          } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[40]);


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
    private static final byte text[][]=new byte[41][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n<html>\r\n  <head>\r\n  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n    <title>\r\n      Menu de la aplicación\r\n    </title>\r\n  </head>\r\n  <body>\r\n    <div class=\"container\">\r\n      <div class=\"card mt-3\">\r\n        <h1 class=\"card-header\">\r\n          Grand Slam\r\n        </h1>\r\n        <div class=\"card-body\">\r\n          <div class=\"row justify-content-center\">\r\n            <div class=\"col-3\">\r\n              <h2>Agregar</h2>\r\n              <div class=\"btn-group-vertical\">\r\n              \r\n                ".getBytes("Cp1252");
      text[2] = 
      "\r\n                  ".getBytes("Cp1252");
      text[3] = 
      "\r\n                  ".getBytes("Cp1252");
      text[4] = 
      "\r\n                  ".getBytes("Cp1252");
      text[5] = 
      "\r\n                  ".getBytes("Cp1252");
      text[6] = 
      "\r\n                  ".getBytes("Cp1252");
      text[7] = 
      "\r\n                  ".getBytes("Cp1252");
      text[8] = 
      "\r\n                  ".getBytes("Cp1252");
      text[9] = 
      "\r\n                  ".getBytes("Cp1252");
      text[10] = 
      "\r\n                  ".getBytes("Cp1252");
      text[11] = 
      "\r\n                  ".getBytes("Cp1252");
      text[12] = 
      "\r\n                  ".getBytes("Cp1252");
      text[13] = 
      "\r\n                ".getBytes("Cp1252");
      text[14] = 
      "\r\n              </div>\r\n            </div>\r\n            <div class=\"col-3\">\r\n              <h2 class=\"justify-content-md-center\">Listar</h2>\r\n              <div class=\"btn-group-vertical\">\r\n                ".getBytes("Cp1252");
      text[15] = 
      "\r\n                  ".getBytes("Cp1252");
      text[16] = 
      "\r\n                  ".getBytes("Cp1252");
      text[17] = 
      "\r\n                  ".getBytes("Cp1252");
      text[18] = 
      "\r\n                  ".getBytes("Cp1252");
      text[19] = 
      "\r\n                  ".getBytes("Cp1252");
      text[20] = 
      "\r\n                  ".getBytes("Cp1252");
      text[21] = 
      "\r\n                  ".getBytes("Cp1252");
      text[22] = 
      "\r\n                  ".getBytes("Cp1252");
      text[23] = 
      "\r\n                  ".getBytes("Cp1252");
      text[24] = 
      "\r\n                  ".getBytes("Cp1252");
      text[25] = 
      "\r\n                  ".getBytes("Cp1252");
      text[26] = 
      "\r\n                ".getBytes("Cp1252");
      text[27] = 
      "\r\n              </div>\r\n            </div>\r\n            <div class=\"col-3\">\r\n              <h2 class=\"justify-content-md-center\">Bajas</h2>\r\n              <div class=\"btn-group-vertical\">\r\n                ".getBytes("Cp1252");
      text[28] = 
      "\r\n                  ".getBytes("Cp1252");
      text[29] = 
      "\r\n                  ".getBytes("Cp1252");
      text[30] = 
      "\r\n                  ".getBytes("Cp1252");
      text[31] = 
      "\r\n                  ".getBytes("Cp1252");
      text[32] = 
      "\r\n                  ".getBytes("Cp1252");
      text[33] = 
      "\r\n                  ".getBytes("Cp1252");
      text[34] = 
      "\r\n                  ".getBytes("Cp1252");
      text[35] = 
      "\r\n                  ".getBytes("Cp1252");
      text[36] = 
      "\r\n                  ".getBytes("Cp1252");
      text[37] = 
      "\r\n                  ".getBytes("Cp1252");
      text[38] = 
      "\r\n                  ".getBytes("Cp1252");
      text[39] = 
      "\r\n                ".getBytes("Cp1252");
      text[40] = 
      "\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </body>\r\n</html>\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
