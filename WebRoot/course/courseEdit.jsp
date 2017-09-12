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
    <title>课程信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">

  </head>
  
  <body>
<a href="course/courseList.jsp"><button class="layui-btn" id="add" >返回</button></a>
<center>
  	<br><br>编辑课程信息<br>
    <form name="f1" id="f1" action="courseEdit.action" method="post">
    <input name="param" type="hidden" value="1">
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
          <td>课程编号:</td>
          <td><input type="text" readonly="readonly" name="co.coId" value="${co.coId }"> 课程编号不允许编辑</td>
        </tr>
        <tr>
        <td>课程名称:</td>
        <td><input type="text" name="co.c0Name"  value="${co.c0Name }"> 
        </td>
        </tr>
        <tr>
        <td>课程性质:</td>
        <td><select name="co.coNature">
        <option>必修</option> 
        <option>选修</option>
        <option>学位课</option>
        </select>
        </td>
        </tr>
        <tr>
        <td>课程学分:</td>
        <td><input type="text" name="co.coCredit"  value="${co.coCredit }"> 学分
        </td>
        </tr>
        </thead>
      </table>
      <button class="layui-btn" id="edit" value=" 确定 ">确定</button>
    </form>
</center>   
  </body>
</html>
