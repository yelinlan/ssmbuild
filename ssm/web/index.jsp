<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h3>
    ${pageContext.request.getAttribute("msg")}
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/book/login">注册</a>
</h3>
<h3>
    <a href="${pageContext.request.contextPath}/book/queryAllBook">进入书籍展示页面</a>
</h3>
</body>
</html>
