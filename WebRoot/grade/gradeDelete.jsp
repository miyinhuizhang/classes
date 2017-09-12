<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>选课信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
<center>
  	<br><br>删除成绩信息......<br>
    <form name="f1" id="f1" action="gradeEdit.action" method="post">
    <input name="param" type="hidden" value="1">
    <input type="hidden" name="g.GGrade" value="">
    <input type="hidden" name="g.id.student.SId " value="${g.id.student.SId  }">
    <input type="hidden" name="g.id.course.coId"  value="${g.id.course.coId }">
    </form>
</center>   
  </body>
</html>
