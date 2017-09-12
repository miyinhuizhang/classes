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
    <title>班级信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">

  </head>
  
  <body>
  <a href="class/classList.jsp"><button class="layui-btn" id="add" >返回</button></a>
<center>
  	<br><br>编辑班级信息<br>
    <form name="f1" id="f1" action="classEdit.action" method="post">
    <input name="param" type="hidden" value="1">
      <table class="layui-table" lay-even lay-skin="nob">
     <colgroup>
     <col width="200">
    <col width="200">
    <col width="200">
    <col>
  	</colgroup> 
  	<thead>
        <tr>
          <td>班级编号:</td>
          <td><input type="text" readonly="readonly" name="c.CId" value="${c.CId }"> 班级编号不允许编辑</td>
        </tr>
        <tr>
        <td>班级名称:</td>
        <td><input type="text" name="c.CName"  value="${c.CName }"> 
        </td>
        </tr>     
        </thead>
      </table>
      <button class="layui-btn" id="edit" value=" 确定 ">确定</button>
    </form>
</center>   
  </body>
</html>
