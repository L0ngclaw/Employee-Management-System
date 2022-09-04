package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class LeaveView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Sofia\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Leaves page</title>\n");
      out.write("        <style>\n");
      out.write("            table,td,th{\n");
      out.write("                border: 1px solid;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'\">\n");
      out.write("    <center><h1 style=\"font-family: 'Sofia'; font-size: 40px; sans-serif\"><i class=\"fa fa-sign-out\" style=\"font-size:60px;\"></i>&nbsp;&nbsp;View Applied Leaves</h1></center>\n");
      out.write("        ");

                try {
                    String person=request.getParameter("pid");
                    DBConnection d = new DBConnection();
                    Connection c = d.getconnection();

                    Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("select * from leaves where status='pending';");
            
      out.write("<table align=center style=\"text-align:center; font-size: 25px; border-collapse: collapse;\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Leave ID</th>\n");
      out.write("                        <th>Staff ID</th>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th>Reason</th>\n");
      out.write("                        <th colspan=\"2\" style=\"text-align: center\">Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString("leaveID"));
      out.write("&nbsp;&nbsp;</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("sid"));
      out.write("&nbsp;&nbsp;</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("date"));
      out.write("&nbsp;&nbsp;</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("leave_reason"));
      out.write("&nbsp;&nbsp;</td>\n");
      out.write("                        <td><button style=\"background-color: #dd4b39\"><a href=\"UpdateLeaveStatus?id=");
      out.print( rs.getString("leaveID"));
      out.write("&msg='Rejected'&person=");
      out.print(person);
      out.write("\" style=\"font-size: 16px;\">Reject</a></button></td>\n");
      out.write("                        <td><button style=\"background-color: #33ff33\"><a href=\"UpdateLeaveStatus?id=");
      out.print( rs.getString("leaveID"));
      out.write("&msg='Approved'&person=");
      out.print(person);
      out.write("\" style=\"font-size: 16px;\">Confirm</a></button></td>\n");
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
