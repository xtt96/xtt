/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.v20161208
 * Generated at: 2017-08-14 09:28:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\r\n");
      out.write("<div style=\"padding:10px 10px 10px 10px\">\r\n");
      out.write("\t<form id=\"itemAddForm\" class=\"itemForm\" method=\"post\">\r\n");
      out.write("\t    <table cellpadding=\"5\">\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品类目:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton selectItemCat\">选择类目</a>\r\n");
      out.write("\t            \t<input type=\"hidden\" name=\"cid\" style=\"width: 280px;\"></input>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品标题:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-textbox\" type=\"text\" name=\"title\" data-options=\"required:true\" style=\"width: 280px;\"></input></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品卖点:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-textbox\" name=\"sellPoint\" data-options=\"multiline:true,validType:'length[0,150]'\" style=\"height:60px;width: 280px;\"></input></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品价格:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-numberbox\" type=\"text\" name=\"priceView\" data-options=\"min:1,max:99999999,precision:2,required:true\" />\r\n");
      out.write("\t            \t<input type=\"hidden\" name=\"price\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>库存数量:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-numberbox\" type=\"text\" name=\"num\" data-options=\"min:1,max:99999999,precision:0,required:true\" /></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>条形码:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t                <input class=\"easyui-textbox\" type=\"text\" name=\"barcode\" data-options=\"validType:'length[1,30]'\" />\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品图片:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t <a href=\"javascript:void(0)\" class=\"easyui-linkbutton picFileUpload\">上传图片</a>\r\n");
      out.write("\t                 <input type=\"hidden\" name=\"image\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品描述:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t                <textarea style=\"width:800px;height:300px;visibility:hidden;\" name=\"desc\"></textarea>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr class=\"params hide\">\r\n");
      out.write("\t        \t<td>商品规格:</td>\r\n");
      out.write("\t        \t<td>\r\n");
      out.write("\t        \t\t\r\n");
      out.write("\t        \t</td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("\t    <input type=\"hidden\" name=\"itemParams\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div style=\"padding:5px\">\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\">提交</a>\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\">重置</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar itemAddEditor ;\r\n");
      out.write("\t//页面初始化完毕后执行此方法\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//创建富文本编辑器\r\n");
      out.write("\t\titemAddEditor = TAOTAO.createEditor(\"#itemAddForm [name=desc]\");\r\n");
      out.write("\t\t//初始化类目选择和图片上传器\r\n");
      out.write("\t\tTAOTAO.init({fun:function(node){\r\n");
      out.write("\t\t\t//根据商品的分类id取商品 的规格模板，生成规格信息。第四天内容。\r\n");
      out.write("\t\t\tTAOTAO.changeItemParam(node, \"itemAddForm\");\r\n");
      out.write("\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\t//提交表单\r\n");
      out.write("\tfunction submitForm(){\r\n");
      out.write("\t\t//有效性验证\r\n");
      out.write("\t\tif(!$('#itemAddForm').form('validate')){\r\n");
      out.write("\t\t\t$.messager.alert('提示','表单还未填写完成!');\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//取商品价格，单位为“分”\r\n");
      out.write("\t\t$(\"#itemAddForm [name=price]\").val(eval($(\"#itemAddForm [name=priceView]\").val()) * 100);\r\n");
      out.write("\t\t//同步文本框中的商品描述\r\n");
      out.write("\t\titemAddEditor.sync();\r\n");
      out.write("\t\t//取商品的规格\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar paramJson = [];\r\n");
      out.write("\t\t$(\"#itemAddForm .params li\").each(function(i,e){\r\n");
      out.write("\t\t\tvar trs = $(e).find(\"tr\");\r\n");
      out.write("\t\t\tvar group = trs.eq(0).text();\r\n");
      out.write("\t\t\tvar ps = [];\r\n");
      out.write("\t\t\tfor(var i = 1;i<trs.length;i++){\r\n");
      out.write("\t\t\t\tvar tr = trs.eq(i);\r\n");
      out.write("\t\t\t\tps.push({\r\n");
      out.write("\t\t\t\t\t\"k\" : $.trim(tr.find(\"td\").eq(0).find(\"span\").text()),\r\n");
      out.write("\t\t\t\t\t\"v\" : $.trim(tr.find(\"input\").val())\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tparamJson.push({\r\n");
      out.write("\t\t\t\t\"group\" : group,\r\n");
      out.write("\t\t\t\t\"params\": ps\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//把json对象转换成字符串\r\n");
      out.write("\t\tparamJson = JSON.stringify(paramJson);\r\n");
      out.write("\t\t$(\"#itemAddForm [name=itemParams]\").val(paramJson);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//ajax的post方式提交表单\r\n");
      out.write("\t\t//$(\"#itemAddForm\").serialize()将表单序列号为key-value形式的字符串\r\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/item/save\",$(\"#itemAddForm\").serialize(), function(data){\r\n");
      out.write("\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示','新增商品成功!');\r\n");
      out.write("\t\t\t\t// 刷新 数据表格\r\n");
      out.write("\t\t\t\t$(\"#itemList\").datagrid('reload');\r\n");
      out.write("\t\t\t\t// 关闭窗口\r\n");
      out.write("\t\t\t\t//TT.closeCurrentWindow();\r\n");
      out.write("\t\t\t\t$(\".tree-title:contains('查询商品')\").parent().click();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearForm(){\r\n");
      out.write("\t\t$('#itemAddForm').form('reset');\r\n");
      out.write("\t\titemAddEditor.html('');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
