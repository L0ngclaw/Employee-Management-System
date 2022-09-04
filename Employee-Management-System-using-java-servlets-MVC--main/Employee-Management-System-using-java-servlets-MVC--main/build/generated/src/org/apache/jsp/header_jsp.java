package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("                max-height: 60px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a.active {\n");
      out.write("                background-color: #04AA6D;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav .icon {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav a:not(:first-child) {display: none;}\n");
      out.write("                .topnav a.icon {\n");
      out.write("                    float: right;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav.responsive {position: relative;}\n");
      out.write("                .topnav.responsive .icon {\n");
      out.write("                    position: absolute;\n");
      out.write("                    right: 0;\n");
      out.write("                    top: 0;\n");
      out.write("                }\n");
      out.write("                .topnav.responsive a {\n");
      out.write("                    float: none;\n");
      out.write("                    display: block;\n");
      out.write("                    text-align: left;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("            <a><img src=\"./images/pngwing.com.png\"/></a>\n");
      out.write("            <a class=\"active\">Online Staff Management System</a>\n");
      out.write("            <a href=\"index.jsp\"><i class=\"fa fa-fw fa-home\"></i> Home</a> \n");
      out.write("            <a href=\"aboutus.jsp\"><i class=\"fa fa-fw fa-search\"></i> About</a>\n");
      out.write("            <button onclick=\"document.getElementById('id01').style.display = 'block'\" class=\"w3-button w3-green w3-large\" style=\"margin-top:5px; margin-left: 50%\"><i class=\"fa fa-fw fa-user\"></i>Login Here!</button>\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"id01\" class=\"w3-modal\">\n");
      out.write("            <div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-center\"><br>\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"w3-button w3-xlarge w3-transparent w3-display-topright\" title=\"Close Modal\">×</span>\n");
      out.write("                    <img src=\"./images/icons8_person_127px.png\" alt=\"Avatar\" style=\"width:30%\" class=\"w3-circle w3-margin-top\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form class=\"w3-container\" method=\"POST\" action=\"login\">\n");
      out.write("                    <div class=\"w3-section\">\n");
      out.write("                        <label><b>Username</b></label>\n");
      out.write("                        <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\" placeholder=\"Enter Staff ID\" name=\"username\" required>\n");
      out.write("                        <label><b>Password</b></label>\n");
      out.write("                        <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("                        <button class=\"w3-button w3-block w3-green w3-section w3-padding\" type=\"submit\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div class=\"w3-container w3-border-top w3-padding-16 w3-light-grey\">\n");
      out.write("                    <button onclick=\"document.getElementById('id01').style.display = 'none'\" type=\"button\" class=\"w3-button w3-red\">Cancel</button>\n");
      out.write("                    <span class=\"w3-right w3-padding w3-hide-small\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"myTopnav\");\n");
      out.write("                if (x.className === \"topnav\") {\n");
      out.write("                    x.className += \" responsive\";\n");
      out.write("                } else {\n");
      out.write("                    x.className = \"topnav\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
