/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-05-18 10:18:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tiles.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class defaultLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("/WEB-INF/lib/tiles-jsp-3.0.5.jar", Long.valueOf(1492818443000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/tiles-jsp-3.0.5.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1411317130000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1492500452000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1492818450000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar", Long.valueOf(1493435923000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/Users/kjzth/Documents/workspace-sts-3.8.4.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SPA-Assignment3/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1492500452000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"UTF-8\">\n");
      out.write("\t<title>");
      if (_jspx_meth_tiles_005fgetAsString_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\t<!-- Latest compiled and minified CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("    <header id=\"header\">\n");
      out.write("        ");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </header>\n");
      out.write(" \n");
      out.write("    <section id=\"sidemenu\">\n");
      out.write("        ");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </section>\n");
      out.write("         \n");
      out.write("    <section id=\"site-content\">\n");
      out.write("        ");
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </section>\n");
      out.write("     \n");
      out.write("    <footer id=\"footer\">\n");
      out.write("        ");
      if (_jspx_meth_tiles_005finsertAttribute_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_tiles_005fgetAsString_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_005fgetAsString_005f0 = new org.apache.tiles.jsp.taglib.GetAsStringTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005fgetAsString_005f0);
    try {
      _jspx_th_tiles_005fgetAsString_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/tiles/layouts/defaultLayout.jsp(15,8) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005fgetAsString_005f0.setName("title");
      _jspx_th_tiles_005fgetAsString_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005fgetAsString_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    try {
      _jspx_th_tiles_005finsertAttribute_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/tiles/layouts/defaultLayout.jsp(23,8) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f0.setName("header");
      _jspx_th_tiles_005finsertAttribute_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    try {
      _jspx_th_tiles_005finsertAttribute_005f1.setJspContext(_jspx_page_context);
      // /WEB-INF/views/tiles/layouts/defaultLayout.jsp(27,8) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f1.setName("menu");
      _jspx_th_tiles_005finsertAttribute_005f1.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    try {
      _jspx_th_tiles_005finsertAttribute_005f2.setJspContext(_jspx_page_context);
      // /WEB-INF/views/tiles/layouts/defaultLayout.jsp(31,8) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f2.setName("body");
      _jspx_th_tiles_005finsertAttribute_005f2.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f3 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    try {
      _jspx_th_tiles_005finsertAttribute_005f3.setJspContext(_jspx_page_context);
      // /WEB-INF/views/tiles/layouts/defaultLayout.jsp(35,8) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f3.setName("footer");
      _jspx_th_tiles_005finsertAttribute_005f3.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    }
    return false;
  }
}
