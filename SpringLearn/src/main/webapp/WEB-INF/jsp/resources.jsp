<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.page import="org.springframework.web.context.support.ServletContextResource"/>
<jsp:directive.page import="org.springframework.core.io.Resource"/>
<jsp:directive.page import="org.springframework.web.util.WebUtils"/>
<%
	Resource res = new ServletContextResource(application,"/files/file1.txt");
	out.print(res.getFilename() + "<br/>");
	out.print(WebUtils.getTempDir(application).getAbsolutePath());
%>
