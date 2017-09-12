<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
    <base href="<%=basePath%>">
    
    <title>班级信息管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
   <link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
   <link rel="stylesheet" href="css/login.css" />

</head>

 <body class="beg-login-bg">
		<div class="beg-login-box">
			<header>
				<h1>用户登录</h1>
			</header>
			<div class="beg-login-main">
				<form action="action/Login.action" name="loginform" class="layui-form" method="post">
					<div class="layui-form-item">
                    学号：
						<input type="text" name="user.SId"  autocomplete="off" placeholder="请输入学号" class="layui-input">
					</div>
					<div class="layui-form-item">
					密码：
						<input type="password" name="user.SPassword"  autocomplete="off" placeholder="请输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
                             登录
                        </button>
						</div>
						<div class="beg-clear"></div>
					</div>
				</form>
			</div>
			<footer>
				<p>忘记密码请联系管理员</p>
			</footer>
		</div>
	</body>
</html>