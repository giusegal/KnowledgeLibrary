/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2020-05-23 10:00:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/register/../common/head.jsp", Long.valueOf(1590227770744L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("jar:file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("file:/C:/Users/galgi/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1590227870110L));
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

      out.write("\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
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
      out.write("\r\n<title>用户注册</title>\r\n<style type=\"text/css\">\r\n.header {\r\n\ttext-align: center;\r\n}\r\n\r\n.header h1 {\r\n\tfont-size: 200%;\r\n\tcolor: #333;\r\n\tmargin-top: 30px;\r\n}\r\n\r\n.header p {\r\n\tfont-size: 14px;\r\n}\r\n</style>\r\n<script type=\"text/javascript\">\r\n\t$(function() {\r\n\t\t$(\"#login-button\").click(function(){\r\n\t\t\tvar input = $(\":input[name='email']\").val();\r\n\t\t\tvar password = $(\":input[name='password']\").val();\r\n\t\t\tvar repassword = $(\":input[name='repassword']\").val();\r\n\t\t\tvar userName = $(\":input[name='userName']\").val();\r\n\t\t\tif(input!=\"\"&&password!=\"\"&&repassword!=\"\"&&userName!=\"\"){\r\n\t\t\t\t$(this).attr(\"data-am-modal\",\"{target: '#my-modal-loading'}\");\r\n\t\t\t}else{\r\n\t\t\t}\r\n\t\t});\r\n\t\t\r\n\t\t$(\":input[name='email']\").change(function() {\r\n\t\t\tvar val = $(this).val();\r\n\t\t\tval = $.trim(val);\r\n\r\n\t\t\tif (val != null) {\r\n\t\t\t\tvar url = \"check\";\r\n\t\t\t\tvar args = {\r\n\t\t\t\t\t\"userEmail\" : val,\r\n\t\t\t\t\t\"time\" : new Date()\r\n\t\t\t\t};\r\n\t\t\t\t$.post(url, args, function(data) {\r\n\t\t\t\t\t$(\"#emailMsg\").html(data);\r\n\t\t\t\t});\r\n\t\t\t}\r\n\t\t});\r\n\t\t$(\":input[name='password']\").change(function() {\r\n");
      out.write("\t\t\tvar val = $(this).val();\r\n\t\t\tval = $.trim(val);\r\n\r\n\t\t\tif (val != null) {\r\n\t\t\t\tvar url = \"check\";\r\n\t\t\t\tvar args = {\r\n\t\t\t\t\t\"userPassword\" : val,\r\n\t\t\t\t\t\"time\" : new Date()\r\n\t\t\t\t};\r\n\t\t\t\t$.post(url, args, function(data) {\r\n\t\t\t\t\t$(\"#pwdMsg\").html(data);\r\n\t\t\t\t});\r\n\t\t\t}\r\n\t\t});\r\n\t\t$(\":input[name='repassword']\").change(function() {\r\n\t\t\tvar val = $(this).val();\r\n\t\t\tval = $.trim(val);\r\n\t\t\tvar val2 = $(\":input[name='password']\").val();\r\n\t\t\tval2 = $.trim(val2);\r\n\t\t\tif (val != null) {\r\n\t\t\t\tvar url = \"check\";\r\n\t\t\t\tvar args = {\r\n\t\t\t\t\t\"repassword\" : val,\r\n\t\t\t\t\t\"userPassword\" : val2,\r\n\t\t\t\t\t\"time\" : new Date()\r\n\t\t\t\t};\r\n\t\t\t\t$.post(url, args, function(data) {\r\n\t\t\t\t\t$(\"#repwdMsg\").html(data);\r\n\t\t\t\t});\r\n\t\t\t}\r\n\t\t});\r\n\t})\r\n</script>\r\n</head>\r\n<body>\r\n\r\n\t<div class=\"header\">\r\n\t\t<div class=\"am-g\">\r\n\t\t\t<h2>知识库管理系统注册</h2>\r\n\t\t\t<p>知识库管理系统软件将来自工作中、生活中、培训中、组织内的各类资料和领域知识进行管理维护并提供关联分析和综合查询服务。</p>\r\n\t\t</div>\r\n\t\t<hr />\r\n\t</div>\r\n\t<div class=\"am-g\" style=\"background: white\">\r\n\t\t<div class=\"am-u-lg-4 am-u-md-8 am-u-sm-centered\">\r\n\t\t\t<form method=\"post\" class=\"am-form\" id=\"login-form\"\r\n");
      out.write("\t\t\t\taction=\"register?action=register\">\r\n\t\t\t\t<label for=\"email\">邮箱:</label> <input type=\"email\" id=\"email\"\r\n\t\t\t\t\tname=\"email\" value=\"\" required> <label id=\"emailMsg\"></label><br>\r\n\t\t\t\t<label for=\"password\">密码:</label> <input type=\"password\"\r\n\t\t\t\t\tid=\"password\" name=\"password\" value=\"\" required><label\r\n\t\t\t\t\tid=\"pwdMsg\"></label><br> <label for=\"password\">确认密码:</label> <input\r\n\t\t\t\t\ttype=\"password\" id=\"repassword\" name=\"repassword\" value=\"\" required><label\r\n\t\t\t\t\tid=\"repwdMsg\"></label><br> <label for=\"userName\">用户名:</label>\r\n\t\t\t\t<br /> <input type=\"text\" id=\"userName\" name=\"userName\" value=\"\"\r\n\t\t\t\t\trequired><label id=\"nameMsg\"></label> <br>\r\n\t\t\t\t<div class=\"am-cf\">\r\n\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"立即注册\" id=\"login-button\"\r\n\t\t\t\t\t\tclass=\"am-btn am-btn-primary am-btn-sm am-fl\" \tdata-am-modal=\"\"> <a\r\n\t\t\t\t\t\tclass=\"am-btn am-btn-default am-btn-sm am-fl\"\r\n\t\t\t\t\t\thref=\"javascript:history.go(-1)\">返回</a>\r\n\t\t\t\t\t<div class=\"am-modal am-modal-loading am-modal-no-btn\"\r\n\t\t\t\t\t\ttabindex=\"-1\" id=\"my-modal-loading\">\r\n\t\t\t\t\t\t<div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"emailMsg\" class=\"am-modal-hd\" \r\n\t\t\t\t\t\t\t>发送邮箱中...</div>\r\n\t\t\t\t\t\t\t<div class=\"am-modal-bd\">\r\n\t\t\t\t\t\t\t\t<span class=\"am-icon-spinner am-icon-spin\"></span>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</form>\r\n\t\t\t<hr>\r\n\t\t\t<p>© 2016 中国软件杯 知识库管理系统 启航队</p>\r\n\t\t</div>\r\n\t</div>\r\n\r\n</body>\r\n</html>");
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
