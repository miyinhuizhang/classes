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
    
    <title>学生信息管理</title>
    
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
        学生列表
    <br>
    <br>
    <a href="Student/StudentAdd.jsp"><button class="layui-btn" id="add" >增加</button></a>
    <br>
    <br>
    
    <table class="layui-table" lay-even lay-skin="nob">
    <colgroup>
     <col width="150">
    <col width="150">
    <col width="150">
    <col width="150">
    <col width="150">
    <col width="150">
    <col>
  </colgroup> 
  <thead>
    <tr>
    <th>学号</th><th>姓名</th><th>性别</th><th>出生日期</th>
    <th>联系电话</th><th>家庭住址</th><th>班级</th><th>操作</th>
    </tr>
    </thead>
    <c:forEach var="user" items="${users }">
    <tbody>
    <tr>
    <th>${user.SId }</th><th>${user.SName }</th><th>${user.SSex }</th><th>${user.SBrithday }</th>
    <th>${user.STelphone }</th><th>${user.SAddress }</th><th>${user.tbClass.CId }</th>
    <th><a href="userQuery2.action?param=0&ssid=${user.SId}"><button class="layui-btn" id="edit" >编辑</button></a>
    <a href="userDelete.action?param=0&ssid=${user.SId}"><button class="layui-btn" id="delete" >删除</button></a></th>    
    </tr>
    </tbody>
    </c:forEach>   
    </table>
    </center>  
  </body>
</html>
