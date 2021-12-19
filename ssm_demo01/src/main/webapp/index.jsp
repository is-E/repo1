<%--
  Created by IntelliJ IDEA.
  User: hxs
  Date: 2021/12/12
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form id="from_login" method="post" action="${pageContext.request.contextPath}/user/login">
    <label>账号: </label>
    <input type="text" name="username" placeholder="请输入账号"/><br>
    <label>密码: </label>
    <input type="password" name="password" placeholder="请输入密码"/><br>
    <input type="button" value="登入" id="btn_login"/>
    <input type="reset" value="重置"/>
</form>
</body>
<script>
    $("#btn_login").click(function () {
        $("#from_login").submit();
    })
</script>
</html>
