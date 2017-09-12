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
    <title>学生信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script>
	function check()
	{
		var a = document.getElementByName("user.SSex").value;
		if(a.equlse("男"))
			document.getElementById("user.SSex1").checked="checked";
		else
			document.getElementById("user.SSex2").checked="checked";
	}
	</script>
  </head>
  
  <body>
<center>
  	<br><br>编辑学生信息<br>
    <form name="f1" id="f1" action="userEdit.action" method="post">
    <input name="param" type="hidden" value="1">
      <table border="0">
        <tr>
          <td>学号:</td>
          <td><input type="text" readonly="readonly" name="user.SId" value="${user.SId }"> 学号不允许编辑</td>
        </tr>
        <tr>
        <td>姓名:</td>
        <td><input type="text" name="user.SName"  value="${user.SName }"> 
        </td>
        </tr>
        <tr>
        <td>
    	性别:</td>
        <td>
        <input type="text" name="user.SSex" value="${user.SSex}">
    	</td>
        </tr>
        <tr>
        <td>
        出生日期:</td>
        <td><input type="text" name="user.SBrithday" value="${user.SBrithday }"> <br><br>
    	</td>
        </tr>
    	<tr>
        <td>密码:</td>
        <td><input type="password" name="user.SPassword" value="${user.SPassword}">
    	</td>
        </tr>
    	<tr>
        <td>联系电话:</td>
        <td><input type="text" name="user.STelphone" value="${user.STelphone }">
    	</td>
    	</tr>
    	<tr>
        <td>家庭住址:</td>
        <td><input type="text" name="user.SAddress " value="${user.SAddress }">   
    	</td>
    	</tr>
    	<tr>
        <td>班级编号:</td>
        <td><input type="text" name="user.tbClass.CId "value="${user.tbClass.CId }"> 
        </td>
    	</tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value=" 确定 " ></td>
        </tr>
      </table>
    </form>
</center>   
  </body>
</html>
