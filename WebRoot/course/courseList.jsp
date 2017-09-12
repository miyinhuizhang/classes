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
    
    <title>课程信息管理</title>
    
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
  <h4>课程列表</h4>           
    <br>
    <br>
    <a href="course/courseAdd.jsp"><button class="layui-btn" id="add" >添加</button></a>
    <br>
    <br>
    
    <table class="layui-table" lay-even lay-skin="nob">
     <colgroup>
     <col width="200">
    <col width="200">
    <col width="200">
    <col width="200">
    <col width="200">
    <col>
  </colgroup> 
  <thead>
    <tr>
    <th>课程编号</th><th>课程名称</th><th>课程性质</th><th>课程学分</th><th>操作</th>
    </tr>
    <c:forEach var="co" items="${course }">
    <tr>
    <th>${co.coId }</th><th>${co.c0Name }</th><th>${co.coNature }</th><th>${co.coCredit }</th>
    <th><a href="courseQuery2.action?param=0&ccid=${co.coId}"><button class="layui-btn" id="edit" >编辑</button></a>
    <a href="courseDelete.action?param=0&ccid=${co.coId}"><button class="layui-btn" id="delete">删除</button></a></th>    
    </tr>
    </c:forEach> 
    </thead> 
    </table>
    </center>
    </body>
 </html>