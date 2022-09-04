package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.DBConnection;

public final class ViewAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Attendance</title>\n");
      out.write("        <style>\n");
      out.write("            input{\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            table,td,th{\n");
      out.write("                border: 1px solid;\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'\"><center>\n");
      out.write("        <form action=\"ViewAttendance.jsp\" style=\"background: linear-gradient(to right, #33ccff 0%, #ff99cc 100%); width: 90%; height: 100px; font-size: 25px; font-family: 'Century Gothic'\">\n");
      out.write("\n");
      out.write("            <label for=\"date\">Search Attendance Records By Date</label>\n");
      out.write("            <input type=\"date\" id=\"date\" name=\"date\"><br/><br/>\n");
      out.write("\n");
      out.write("            <label for=\"date\">Search Attendance Records By Staff ID</label>\n");
      out.write("            <input type=\"text\" id=\"sid\" name=\"sid\" placeholder=\"Enter Staff ID\">\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form></center><br/><br/>\n");
      out.write("\n");
      out.write("    ");

        try {
            String date = request.getParameter("date");
            String sid = request.getParameter("sid");
            DBConnection d = new DBConnection();
            Connection c = d.getconnection();

            Statement st = c.createStatement();
            ResultSet rs = rs = st.executeQuery("select * from attendance where date='" + date + "';");
            if (date.isEmpty()) {
                rs = st.executeQuery("select * from attendance where sid='" + sid + "';");
            } else if (sid.isEmpty()) {
                rs = st.executeQuery("select * from attendance where date='" + date + "';");
            }
    
      out.write("<table align=center style=\"text-align:center; font-size: 25px; border-collapse: collapse;\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Staff ID</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>IN Time</th>\n");
      out.write("                <th>OUT Time</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("sid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("in_time"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("out_time"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table><br>\n");
      out.write("    ");
} catch (Exception e) {
            out.print(e.getMessage());
        }
      out.write("\n");
      out.write("    <center><button onclick=\"printFunction()\" class=\"button\">Print Attendance Records</button>​</center>\n");
      out.write("    <script>\n");
      out.write("        function printFunction() {\n");
      out.write("            window.print();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
