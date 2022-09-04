package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            .footer {\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #333333;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                box-sizing: initial;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }.fa {\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 5px 2px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .fa:hover {\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("            .fa-facebook {\n");
      out.write("                background: #3B5998;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-twitter {\n");
      out.write("                background: #55ACEE;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-google {\n");
      out.write("                background: #dd4b39;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-linkedin {\n");
      out.write("                background: #007bb5;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-instagram {\n");
      out.write("                background: #125688;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-snapchat-ghost {\n");
      out.write("                background: #fffc00;\n");
      out.write("                color: white;\n");
      out.write("                text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <a href=\"https://www.facebook.com/\" class=\"fa fa-facebook\"></a>\n");
      out.write("            <a href=\"https://www.twitter.com\" class=\"fa fa-twitter\"></a>\n");
      out.write("            <a href=\"https://www.google.com\" class=\"fa fa-google\"></a>\n");
      out.write("            <a href=\"https://www.linkedin.com\" class=\"fa fa-linkedin\"></a>\n");
      out.write("            <a href=\"https://www.instagram.com\" class=\"fa fa-instagram\"></a>\n");
      out.write("            <a href=\"https://www.snapchat.com\" class=\"fa fa-snapchat-ghost\"></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
