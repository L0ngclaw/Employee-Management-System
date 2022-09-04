package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>USER ADD page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Sofia\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("            * {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("            .input-container {\n");
      out.write("                display: -ms-flexbox; /* IE10 */\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icon {\n");
      out.write("                padding: 10px;\n");
      out.write("                background: dodgerblue;\n");
      out.write("                color: white;\n");
      out.write("                min-width: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .iconmain {\n");
      out.write("                padding: 10px;\n");
      out.write("                color: #0000ff;\n");
      out.write("                min-width: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-field {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-field:focus {\n");
      out.write("                border: 2px solid dodgerblue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for the submit button */\n");
      out.write("            .btn {\n");
      out.write("                background-color: dodgerblue;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 20px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 70%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("                border-radius: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .blink {\n");
      out.write("                animation: blinker 0.6s linear infinite;\n");
      out.write("                color: #cc0000;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            @keyframes blinker {\n");
      out.write("                50% {\n");
      out.write("                    opacity: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: radial-gradient(#e66465, #9198e5);\">\n");
      out.write("        <form action=\"useradd\" method=\"POST\" style=\"max-width:500px;margin:auto\"><br/>\n");
      out.write("            ");

                String msg = request.getParameter("msg");
                if ("ok".equals(msg)) {
                    
      out.write("<center><h3 class=\"blink\">Staff Member Added</h3></center>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if ("error".equals(msg)) {
            
      out.write("\n");
      out.write("            <h3 class=\"blink\">Some thing Went Wrong! Try Again...</h3>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <center><h1 style=\"font-family: 'Sofia'; font-size: 40px; sans-serif\"><i class=\"fa fa-group iconmain\"></i>Add New Staff Member</h1></center>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-id-badge icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"text\" placeholder=\"Please Add 'STF' prefix, Enter StaffID\" name=\"staffid\"  required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-user icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"text\" placeholder=\"Full Name\" name=\"name\" onkeypress=\"return ((event.charCode >= 65 && event.charCode <= 90) || (event.charCode >= 97 && event.charCode <= 122) || (event.charCode === 32))\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-home icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"text\" placeholder=\"Address\" name=\"address\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-envelope icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"email\" placeholder=\"Email\" name=\"email\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-phone-square icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"number\" placeholder=\"Telephone\" name=\"telephone\" required>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"color: #33ff33\">Select Department</span>\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-sitemap icon\"></i>\n");
      out.write("                <select class=\"input-field\" name=\"department\" required>\n");
      out.write("                    <option>select</option>\n");
      out.write("                    <option value=\"Finance Department\">Finance Department</option>\n");
      out.write("                    <option value=\"HR department\">HR department</option>\n");
      out.write("                    <option value=\"Administration Department\">Administration Department</option>\n");
      out.write("                    <option value=\"Management Department\">Management Department</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"color: #33ff33\">Select Position</span>\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-street-view icon\"></i>\n");
      out.write("                <select class=\"input-field\" name=\"position\" required>\n");
      out.write("                    <option>select</option>\n");
      out.write("                    <option value=\"Administrator\">Administrator</option>\n");
      out.write("                    <option value=\"Finance manager\">Finance manager</option>\n");
      out.write("                    <option value=\"HR manager\">HR manager</option>\n");
      out.write("                    <option value=\"Assistant Administrative Manager\">Assistant Administrative Manager</option>\n");
      out.write("                    <option value=\"Assistant Finance Manager\">Assistant Finance Manager</option>\n");
      out.write("                    <option value=\"Assistant HR Manager\">Assistant HR Manager</option>\n");
      out.write("                    <option value=\"Executive assistants\">Executive assistants</option>\n");
      out.write("                    <option value=\"Accountant\">Accountant</option>\n");
      out.write("                    <option value=\"Staff Member\">Staff Member</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"color: #33ff33\">Select Employee Type</span>\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-suitcase icon\"></i>\n");
      out.write("                <select class=\"input-field\" name=\"type\" required>\n");
      out.write("                    <option>select</option>\n");
      out.write("                    <option value=\"Permanent Employee\">Permanent Employee</option>\n");
      out.write("                    <option value=\"Contract Employee\">Contract Employee</option>\n");
      out.write("                    <option value=\"Trainee\">Trainee</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-dollar icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"number\" placeholder=\"Basic Salary\" name=\"salary\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-key icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"password\" placeholder=\"Password\" name=\"password\" id=\"passwordinput\" required>\n");
      out.write("            </div>\n");
      out.write("            <center><input type=\"checkbox\" onclick=\"showpsw()\">Show Password</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center><button type=\"submit\" class=\"btn\">Register</button></center>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function showpsw() {\n");
      out.write("                var x = document.getElementById(\"passwordinput\");\n");
      out.write("                if (x.type === \"password\") {\n");
      out.write("                    x.type = \"text\";\n");
      out.write("                } else {\n");
      out.write("                    x.type = \"password\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
