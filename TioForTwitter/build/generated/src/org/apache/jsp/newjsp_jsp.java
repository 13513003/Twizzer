package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\n");
      out.write("\n");
      out.write("            <form id=\"searchForm\" method=\"get\" action=\"SearchResult.jsp\" target=\"features\">\n");
      out.write("            <fieldset>\n");
      out.write("                Topik : <input id=\"s\" type=\"text\" value=\"#Gaming\" name=\"keyword\" />\n");
      out.write("                    \n");
      out.write("                    <div style=\"position:relative;left:130px;\">\n");
      out.write("                        <input type=\"text\" name=\"K0\" value=\"Fighting\" /> : <input type=\"text\" name=\"ValK0\" value=\"mortal kombat\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"position:relative;left:130px;\">\n");
      out.write("                        <input type=\"text\" name=\"K1\" value=\"RPG\" /> : <input type=\"text\" name=\"ValK1\" value=\"witcher\" />\n");
      out.write("                    </div>\n");
      out.write("                    <!-- radio button untuk mode KMP atau BoyerMoore -->\n");
      out.write("                    <div style=\"position:relative;display:inline\">\n");
      out.write("                      <input type=\"radio\" id=\"searchKMP\" name=\"mode\" value=\"KMP\" checked /> \n");
      out.write("                    </div> \n");
      out.write("                    <div style=\"position:relative;display:inline\">\n");
      out.write("                      <label for=\"searchKMP\" id=\"siteNameLabel\">KMP</label>\n");
      out.write("                    </div>\n");
      out.write("                      <input type=\"radio\" id = \"searchBM\" name=\"mode\" value=\"BM\" /> <label for=\"searchBM\">BoyerMoore</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Submit\" id=\"submitButton\" />\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
