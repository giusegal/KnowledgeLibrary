/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2020-05-23 10:00:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class model_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/jsp/admin/../common/admin-slidebar.jsp", Long.valueOf(1590227770743L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("/WEB-INF/jsp/admin/../common/admin-header.jsp", Long.valueOf(1590227770743L));
    _jspx_dependants.put("file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1590227870110L));
    _jspx_dependants.put("/WEB-INF/jsp/admin/../common/head.jsp", Long.valueOf(1590227770744L));
    _jspx_dependants.put("/WEB-INF/jsp/admin/../common/footer.jsp", Long.valueOf(1590227770743L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<title>SOKLIB后台管理</title>\r\n");
      out.write("\r\n\r\n\r\n\r\n<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.scheme}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(':');
      out.write('/');
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverPort }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n<meta charset=\"utf-8\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"description\" content=\"\">\r\n<meta name=\"keywords\" content=\"\">\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<!-- Set render engine for 360 browser -->\r\n<meta name=\"renderer\" content=\"webkit\">\r\n<title>知识库管理系统</title>\r\n<!-- No Baidu Siteapp-->\r\n<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n<link rel=\"icon\" type=\"image/png\" href=\"resource/image/bitbug_favicon_3.ico\">\r\n<!-- Add to homescreen for Chrome on Android -->\r\n<meta name=\"mobile-web-app-capable\" content=\"yes\">\r\n<!-- Add to homescreen for Safari on iOS -->\r\n<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n<meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\r\n<link rel=\"apple-touch-icon-precomposed\"\r\n\thref=\"resource/amazeui/i/app-icon72x72@2x.png\">\r\n\r\n<!-- Tile icon for Win8 (144x144 + tile color) -->\r\n");
      out.write("<meta name=\"msapplication-TileImage\"\r\n\tcontent=\"resource/amazeui/i/app-icon72x72@2x.png\">\r\n<meta name=\"msapplication-TileColor\" content=\"#0e90d2\">\r\n\r\n<!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->\r\n<!--\r\n  <link rel=\"canonical\" href=\"http://www.example.com/\">\r\n  -->\r\n\r\n<link rel=\"stylesheet\" href=\"resource/amazeui/css/amazeui.min.css\">\r\n<link rel=\"stylesheet\" href=\"resource/amazeui/css/admin.css\">\r\n\r\n<script type=\"text/javascript\" src=\"resource/amazeui/js/jquery.min.js\"></script>\r\n\r\n");
      out.write("\r\n<script src=\"resource/amazeui/js/jquery.cookie.min.js\"></script>\r\n\r\n<script src=\"resource/amazeui/js/amazeui.min.js\"></script>\n<script type=\"text/javascript\" src=\"resource/script/common.js\"></script>\r\n<script type=\"text/javascript\" src=\"resource/amazeui/js/app.js\"></script>\r\n");
      out.write("\r\n</head>\r\n<body>\r\n\t");
      out.write("\r\n<header class=\"am-topbar am-topbar-inverse admin-header\">\r\n\t<div class=\"am-topbar-brand\">\r\n\t\t<strong>SOKLIB</strong> <small>知识库管理系统</small>\r\n\t</div>\r\n\r\n\r\n\r\n\r\n\t<div class=\"am-collapse am-topbar-collapse am-topbar-right\"\r\n\t\tid=\"topbar-collapse\">\r\n\t\t<ul class=\"am-nav am-nav-pills am-topbar-nav  admin-header-list\">\r\n\t\t\t<li><a href=\"user/message/1\"><span\r\n\t\t\t\t\tclass=\"am-icon-envelope-o\"></span> 消息 <span id=\"msg\"\r\n\t\t\t\t\tclass=\"am-badge am-badge-warning\">5</span></a></li>\r\n\t\t\t<li class=\"am-dropdown\" data-am-dropdown><a\r\n\t\t\t\tclass=\"am-dropdown-toggle\" data-am-dropdown-toggle\r\n\t\t\t\thref=\"javascript:;\"> <img alt=\"\" class=\"am-radius\"\r\n\t\t\t\t\tsrc=\"user/photo/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_user.userPhoto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n\t\t\t\t\tstyle=\"width: 17px; height: 17px;\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n\t\t\t\t\t<span class=\"am-icon-caret-down\"></span>\r\n\t\t\t</a>\r\n\t\t\t\t<ul class=\"am-dropdown-content\">\r\n\t\t\t\t\t<li><a href=\"user/index\"><span class=\"am-icon-user\"></span>\r\n\t\t\t\t\t\t\t前台</a></li>\r\n\t\t\t\t\t<li><a href=\"user/userinfo\"><span class=\"am-icon-user\"></span>个人信息</a></li>\r\n\t\t\t\t\t<li><a href=\"logout\"><span class=\"am-icon-power-off\"></span>\r\n\t\t\t\t\t\t\t退出</a></li>\r\n\t\t\t\t</ul></li>\r\n\t\t\t<li class=\"am-hide-sm-only\"></li>\r\n\t\t</ul>\r\n\t</div>\r\n\r\n\t<form action=\"user/search/0/1\" method=\"post\"\r\n\t\tclass=\"am-topbar-form am-topbar-right am-form-inline\">\r\n\t\t<div class=\"am-form-group\">\r\n\r\n\t\t\t<input type=\"text\" name=\"fileName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n\t\t\t\tclass=\"am-form-field am-input-sm\" placeholder=\"搜索公共知识库\">\r\n\t\t\t<button type=\"submit\" class=\"am-form-field am-input-sm\">\r\n\t\t\t\t<i class=\"am-icon-search\"></i> 搜索\r\n\t\t\t</button>\r\n\t\t</div>\r\n\t</form>\r\n\t<script type=\"text/javascript\">\r\n\t\t$(function() {\r\n\t\t\t$.get(\"user/count-msg\", function(data) {\r\n\t\t\t\tvar msgNum = data.data;\r\n\t\t\t\t$(\"#msg\").text(msgNum);\r\n\t\t\t});\r\n\t\t});\r\n\t</script>\r\n</header>");
      out.write("\r\n\t<div class=\"am-cf admin-main\">\r\n\t\t<!-- sidebar start -->\r\n\t\t");
      out.write("\r\n<div class=\"admin-sidebar am-offcanvas\" id=\"admin-offcanvas\">\r\n\t<div class=\"am-offcanvas-bar admin-offcanvas-bar\">\r\n\t\t<ul class=\"am-list admin-sidebar-list\">\r\n\t\t\t<li><a href=\"admin/index\"><span class=\"am-icon-home\"></span>首页</a></li>\r\n\t\t\t<li class=\"admin-parent\"><a class=\"am-cf\"\r\n\t\t\t\tdata-am-collapse=\"{target: '#collapse-nav-person'}\"><span\r\n\t\t\t\t\tclass=\"am-icon-circle-o\"></span> 统计 <span\r\n\t\t\t\t\tclass=\"am-icon-angle-right am-fr am-margin-right\"></span></a>\r\n\t\t\t\t<ul class=\"am-list am-collapse admin-sidebar-sub am-in\"\r\n\t\t\t\t\tid=\"collapse-nav-person\">\r\n\t\t\t\t\t<li><a href=\"admin/count/index\" class=\"am-cf\"><span\r\n\t\t\t\t\t\t\tclass=\"am-icon-bar-chart\"></span> 图表</a></li>\r\n\t\t\t\t</ul></li>\r\n\t\t\t<li class=\"admin-parent\"><a class=\"am-cf\"\r\n\t\t\t\tdata-am-collapse=\"{target: '#collapse-nav-public'}\"><span\r\n\t\t\t\t\tclass=\"am-icon-magnet\"></span> 管理<span\r\n\t\t\t\t\tclass=\"am-icon-angle-right am-fr am-margin-right\"></span></a>\r\n\t\t\t\t<ul class=\"am-list am-collapse admin-sidebar-sub am-in\"\r\n\t\t\t\t\tid=\"collapse-nav-public\">\r\n\t\t\t\t\t<li><a href=\"admin/file-manage-ui/1\" class=\"am-cf\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"am-icon-file-text\"></span> 文件管理</a></li>\r\n\t\t\t\t\t<li><a href=\"admin/user-manage-ui/1\"><span\r\n\t\t\t\t\t\t\tclass=\"am-icon-users\"></span> 用户管理</a></li>\r\n\t\t\t\t\t<li><a href=\"admin/class-manage-ui\"><span\r\n\t\t\t\t\t\t\tclass=\"am-icon-sort\"></span> 分类管理</a></li>\r\n\t\t\t\t</ul></li>\r\n\t\t\t<li class=\"admin-parent\"><a class=\"am-cf\"\r\n\t\t\t\tdata-am-collapse=\"{target: '#collapse-nav-sys'}\"><span\r\n\t\t\t\t\tclass=\"am-icon-assistive-listening-systems\"></span> 系统<span\r\n\t\t\t\t\tclass=\"am-icon-angle-right am-fr am-margin-right\"></span></a>\r\n\t\t\t\t<ul class=\"am-list am-collapse admin-sidebar-sub am-in\"\r\n\t\t\t\t\tid=\"collapse-nav-sys\">\r\n\t\t\t\t\t<li><a href=\"admin/log\"><span class=\"am-icon-bug\"></span>系统日志\r\n\t\t\t\t\t</a></li>\r\n\t\t\t\t</ul></li>\r\n\t\t</ul>\r\n\r\n\t\t<div class=\"am-panel am-panel-default admin-sidebar-panel\">\r\n\t\t\t<div class=\"am-panel-bd\">\r\n\t\t\t\t<p>\r\n\t\t\t\t\t<span class=\"am-icon-bookmark\"></span> 公告\r\n\t\t\t\t</p>\r\n\t\t\t\t<p>知识就是力量 —— SOKLIB</p>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\r\n\t</div>\r\n</div>");
      out.write("\r\n\t\t<!-- sidebar end -->\r\n\t\t<!-- content start -->\r\n\t\t<div class=\"admin-content\">\r\n\t\t\t<div class=\"admin-content-body\"></div>\r\n\t\t</div>\r\n\t</div>\r\n\r\n\t");
      out.write("\r\n<!-- \r\n<footer class=\"admin-content-footer\">\r\n\t<hr>\r\n\t<p>© 2016 中国软件杯 知识库管理系统 启航队</p>\r\n</footer>\r\n -->");
      out.write("\r\n\r\n</body>\r\n</html>");
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
