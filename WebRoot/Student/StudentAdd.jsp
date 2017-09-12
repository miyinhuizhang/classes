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
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
  <br><br>添加学生信息<br>
  <form id="form1" name="form1" method="post" action="StudentAdd.action">
   <input name="param" type="hidden" value="1">
      <table border="0">
        <tr>
          <td>学号:</td>
          <td><input type="text"  name="user.SId">
          </td>
        </tr>
        <tr>
        <td>姓名:</td>
        <td><input type="text" name="user.SName"> 
        </td>
        </tr>
        <tr>
        <td>
    	性别:</td>
        <td>
        <input type="radio" name="user.SSex" value="男" checked="checked">男 &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" name="user.SSex" value="女">女 
    	</td>
        </tr>
        <tr>
        <td>
        出生日期:</td>
        <td><input type="text" name="user.SBrithday" > 
    	</td>
        </tr>
    	<tr>
        <td>密码:</td>
        <td><input type="password" name="user.SPassword"  >
    	</td>
        </tr>
    	<tr>
        <td>联系电话:</td>
        <td><input type="text" name="user.STelphone" >
    	</td>
    	</tr>
    	<tr>
        <td>家庭住址:</td>
        <td><input type="text" name="user.SAddress " >   
    	</td>
    	</tr>
    	<tr>
        <td>班级编号:</td>
        <td>
        
        <%-- <form id="form2" name="form2" method="post" action="courseQuery.action">
        
        <select name="user.tbClass.CId " >
        <option>--请选择--</option> 
        <c:forEach var="c" items="${classes }">
        <option>${c.CId }</option> 
        </c:forEach>
        </select>
        </form> --%>
        <input type="text" name="user.tbClass.CId " >
        </td>
    	</tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value=" 确定 " ></td>
        </tr>
      </table>
    </form> 
  </body>
</html>