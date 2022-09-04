package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.DBConnection;

public final class manageTask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>task Management</title>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>\n");
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
      out.write("                font-size: 22px;\n");
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
      out.write("            \n");
      out.write("            td{\n");
      out.write("                padding-right: 40px;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 15px 25px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                outline: none;\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                box-shadow: 0 9px #999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover {background-color: #3e8e41}\n");
      out.write("\n");
      out.write("            .button:active {\n");
      out.write("                background-color: #3e8e41;\n");
      out.write("                box-shadow: 0 5px #666;\n");
      out.write("                transform: translateY(4px);\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'\">\n");
      out.write("        ");

                String id=request.getParameter("pid");
            
      out.write("\n");
      out.write("        ");

                String msg = request.getParameter("msg");
                if ("ok".equals(msg)) {
                    
      out.write("<center><h3 class=\"blink\">Task Assigned</h3></center>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if ("error".equals(msg)) {
            
      out.write("\n");
      out.write("            <center><h3 class=\"blink\">Some thing Went Wrong! Try Again...</h3></center>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"addtask\" method=\"POST\" style=\"max-width:500px;margin:auto\"><br/>\n");
      out.write("            <center><h1 style=\"font-family: 'Sofia'; font-size: 40px; sans-serif\"><i class=\"fa fa-group iconmain\"></i>Assign Task</h1></center>\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"assignedby\"/>\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-id-badge icon\"></i>\n");
      out.write("                <textarea class=\"input-field\" placeholder=\"Enter Task\" name=\"task\"  required></textarea>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-user icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"date\" name=\"date\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-container\">\n");
      out.write("                <i class=\"fa fa-home icon\"></i>\n");
      out.write("                <input class=\"input-field\" type=\"text\" placeholder=\"Enter Staff ID\" name=\"sid\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <center><button type=\"submit\" class=\"btn\">Assign</button></center>\n");
      out.write("        </form>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"manageTask.jsp\" style=\"font-size: 25px; font-family: 'Century Gothic'\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" name=\"pid\"/>\n");
      out.write("            <label for=\"date\">Search Assigned Tasks By Date</label>\n");
      out.write("            <input type=\"date\" id=\"date\" name=\"date\" style=\"font-size: 24px\"><br/><br/>\n");
      out.write("            <label for=\"sid\">Search Assigned Tasks By Staff ID</label>\n");
      out.write("            <input type=\"text\" id=\"sid\" name=\"sid\" style=\"font-size: 24px\">\n");
      out.write("            <input type=\"submit\" value=\"Search\" style=\"font-size: 24px\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

                try {
                    String pid=request.getParameter("pid");
                    String date=request.getParameter("date");
                    String sid=request.getParameter("sid");
                    DBConnection d = new DBConnection();
                    Connection c = d.getconnection();
                    
                    Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("select * from tasks where todo_date='"+date+"' AND assigned_by='"+pid+"';");
                    if(date.isEmpty()){
                        rs = st.executeQuery("select * from tasks where assigned_to='"+sid+"' AND assigned_by='"+pid+"';");
                    }else if(sid.isEmpty()){
                        rs = st.executeQuery("select * from tasks where todo_date='"+date+"' AND assigned_by='"+pid+"';");
                    }
            
      out.write("<table border=\"1\" align=center style=\"text-align:center; font-size: 22px; font-family: 'Century Gothic'\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Staff ID</th>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th>Assigned To</th>\n");
      out.write("                        <th>Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString("task"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("todo_date"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("assigned_to"));
      out.write("</td>\n");
      out.write("                        <td><button><a href=\"taskdelete?tid=");
      out.print( rs.getString("taskID"));
      out.write("&pid=");
      out.print(id);
      out.write("\">Remove Task</a></button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table><br>\n");
      out.write("            ");
} catch (Exception e) {
                    out.print(e.getMessage());
            }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <center><button onclick=\"printFunction()\" class=\"button\">Print Attendance Records</button>​</center>\n");
      out.write(" \n");
      out.write("    <script>\n");
      out.write("      function printFunction() { \n");
      out.write("        window.print(); \n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            </center>\n");
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
