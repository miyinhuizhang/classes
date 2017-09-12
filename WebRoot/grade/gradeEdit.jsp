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
    <title>成绩信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">

  </head>
  
  <body>
  <a href="grade/gradeList.jsp"><button class="layui-btn" id="add" >返回</button></a>
<center>
  	<br><br>录入成绩信息<br>
    <form name="f1" id="f1" action="gradeEdit.action" method="post">
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
          <td>学号:</td>
          <td><input type="text" readonly="readonly" name="g.id.student.SId " value="${g.id.student.SId  }">学号不允许修改
          </td>
        </tr>
       <tr>
          <td>课程编号:</td>
          <td><input type="text" readonly="readonly" name="g.id.course.coId"  value="${g.id.course.coId }"> 课程编号不允许修改
        </td>
        </tr>
        <tr>
        <td>成绩:</td>
        <td><input type="text" name="g.GGrade" value="${g.GGrade}"> 
        </td>
        </thead>
      </table>
      <button class="layui-btn" id="edit" value=" 确定 ">确定</button>
    </form>
</center>   
  </body>
</html>
