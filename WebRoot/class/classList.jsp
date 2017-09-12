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
    
    <title>班级信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  
  <center>
        <h4>班级列表</h4>
    <br>
    <a href="class/classAdd.jsp"><button class="layui-btn" id="add" >增加</button></a>
    <br>
    
    <table class="layui-table" lay-even lay-skin="nob">
     <colgroup>
     <col width="200">
    <col width="200">
    <col width="200">
    <col>
  </colgroup> 
  <thead>
    <tr>
    <th>编号</th><th>名称</th><th>操作</th>
    </tr>
    </thead>
    <c:forEach var="c" items="${classes }">
    <tbody>
    <tr>
    <th>${c.CId }</th><th>${c.CName }</th>
    <th>
    <a href="classQuery2.action?param=0&ccid=${c.CId}"><button class="layui-btn" id="edit" >编辑</button></a>
    <a href="classDelete.action?param=0&ccid=${c.CId}"><button class="layui-btn" id="delete">删除</button></a> 
    </tr>
    </c:forEach>  
    </tbody> 
    </table>
    </center>
    </body>
 </html>