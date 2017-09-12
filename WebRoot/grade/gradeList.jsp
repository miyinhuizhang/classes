<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>成绩信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="css/login.css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  <center>    
        课程成绩列表
    <br>
    <br>
    
    <br>
    <br>
    <table class="layui-table" lay-even lay-skin="nob">
     <colgroup>
     <col width="200">
    <col width="200">
    <col width="200">
    <col width="200">
    <col>
  </colgroup> 
  <thead>
    <tr>
    <th>学号</th><th>课程编号</th><th>成绩</th><th>操作</th>
    </tr>
    <c:forEach var="g" items="${grade }">
    <tr>
    <th>${g.id.student.SId  }</th><th>${g.id.course.coId }</th><th>${g.GGrade }</th>
    <th><a href="gradeQuery2.action?param=0&gsid=${g.id.student.SId }&gcid=${g.id.course.coId }"><button class="layui-btn" id="edit" >录入/修改成绩</button></a>
    <a href="gradeQuery21.action?param=0&gsid=${g.id.student.SId }&gcid=${g.id.course.coId }"><button class="layui-btn" id="edit" >删除成绩</button></a></th>    
    </tr>
    </c:forEach> 
    </thead>  
    </table>
    </center>
    </body>
 </html>