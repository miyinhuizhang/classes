<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>成绩统计</title>
    
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
  <form name="f11" id="f11" action="selectfs.action" method="post"> 
  <br>
  课程名称： 
  <select name="kecheng">
  <c:forEach var="co" items="${course }">
  	<option value="${co.coId }">${co.c0Name }</option>
  	</c:forEach> 
  </select>
  <br>
  <br> 
  <button class="layui-btn" id="edit" value=" 查询 ">查询</button>
  </form>      
    <br>
    <br>
    按课程统计成绩列表
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
    <th>最高分</th><th>最低分</th><th>平均分</th>
    </tr>
    <tr>
    <th><%= request.getAttribute("max") %></th>
    <th><%= request.getAttribute("min") %></th>
    <th><%= request.getAttribute("pro") %></th>
    </tr>   
    </thead>  
    </table>
    </center>
    </body>
 </html>