/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-29 05:36:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Quallect.dto.OwnerRegister;

public final class fooditems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Quallect.dto.OwnerRegister");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("#container {\r\n");
      out.write("/* 	border: 2px solid;\r\n");
      out.write(" */	height: 80px;\r\n");
      out.write("/* 	background-color: rgb(11, 101, 161);\r\n");
      out.write(" */	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container h1 {\r\n");
      out.write("	padding-left: 40%;\r\n");
      out.write("	line-height: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container p {\r\n");
      out.write("	padding-left: 39%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logout {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 40px;\r\n");
      out.write("	left: 92%;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container1 {\r\n");
      out.write("	height: 40px;\r\n");
      out.write("/* 	border: 2px solid;\r\n");
      out.write(" */	line-height: 5px;\r\n");
      out.write("/* 	background-color: rgb(158, 208, 241);\r\n");
      out.write(" */	color: #fff;\r\n");
      out.write(" 	margin-left: 10%;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#add {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 40px;\r\n");
      out.write("	left: 80%;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("#owner{\r\n");
      out.write("	padding-left: 43%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" body{\r\n");
      out.write("    background-image: url(https://cdn.pixabay.com/photo/2017/02/15/10/38/background-2068215_1280.jpg);\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-attachment:fixed;\r\n");
      out.write("}\r\n");
      out.write("#food input{\r\n");
      out.write("position:relative;\r\n");
      out.write("left:40%;\r\n");
      out.write("	    width: 230px;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    border: 1px solid gainsboro;\r\n");
      out.write("    background-color: rgba(250, 244, 244, 0.7);;\r\n");
      out.write("    margin-left: 170px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    outline:none;\r\n");
      out.write("	border:none;\r\n");
      out.write("    	font-size:18px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("#description{\r\n");
      out.write("position:relative;\r\n");
      out.write("left:40%;\r\n");
      out.write("	    width: 230px;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    border: 1px solid gainsboro;\r\n");
      out.write("    background-color: rgba(250, 244, 244, 0.7);;\r\n");
      out.write("    margin-left: 170px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    outline:none;\r\n");
      out.write("	border:none;\r\n");
      out.write("	font-size:18px;\r\n");
      out.write("}\r\n");
      out.write("#food .submit{\r\n");
      out.write("	position:relative;\r\n");
      out.write("	left:50%;\r\n");
      out.write("	width: 100px;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    margin-left:110px;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("    font-style:italic;\r\n");
      out.write("background-image: linear-gradient(240deg, brown, rgb(119, 81, 88),\r\n");
      out.write("		rgb(65, 166, 225));    \r\n");
      out.write("}\r\n");
      out.write("#food div{\r\n");
      out.write("	position:relative;\r\n");
      out.write("	left:55%;\r\n");
      out.write("	width:150px;\r\n");
      out.write("	    color:#fff;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	 <div id=\"container\">\r\n");
      out.write("		<h1> <i>QUALLECT</i></h1>\r\n");
      out.write("		<p>Quality Selects at your doorstep!</p>\r\n");
      out.write("		<a href=\"RestaurantLog.jsp\" id=\"logout\"><i>Logout</i></a>\r\n");
      out.write("			\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");
 OwnerRegister owner=(OwnerRegister)request.getAttribute("owner"); 
      out.write("\r\n");
      out.write("	<h2 id=\"owner\" class=\"container1\">Restaurant:  ");
      out.print( owner.getRestaurantname() );
      out.write("</h2>\r\n");
      out.write("	<form action=\"fooditems\" method=\"post\" id=\"form\">\r\n");
      out.write("	<input type=\"number\" name=\"owner_id\" value=\"");
      out.print( owner.getId());
      out.write("\" style=visibility:hidden readonly=\"true\">\r\n");
      out.write("    <div id=\"food\">\r\n");
      out.write("     <div>\r\n");
      out.write("		<h3>Add food here.....</h3>\r\n");
      out.write("	</div> \r\n");
      out.write("    <input type=\"text\" name=\"name\" required placeholder=\"Enter Dish_name\"><br>\r\n");
      out.write("\r\n");
      out.write("    <textarea id=\"description\" name=\"description\" required placeholder=\"Enter Description\"></textarea><br>\r\n");
      out.write("\r\n");
      out.write("    <input  type=\"number\" name=\"price\" required placeholder=\"Enter price\"><br>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("    <input class=\"submit\"  type=\"submit\" value=\"Add\"></div>\r\n");
      out.write("</form>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
