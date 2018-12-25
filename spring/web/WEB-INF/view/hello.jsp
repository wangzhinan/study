<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wangzn
  Date: 2018/11/1
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page deferredSyntaxAllowedAsLiteral="true"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

Hello World
${message}
大小${users.get(0).password}
<c:forEach items="${users}" var="user">
        姓 名：${user.name}
        密 码：${user.password}
</c:forEach>

<c:forEach items="${list}" var="s">
    <tr>
        <td>测试：${s}</td>
    </tr>
</c:forEach>

<c:choose>
    <c:when test="${users.size() > 0}">
        大于0
    </c:when>
    <c:otherwise>
        小于0
    </c:otherwise>
</c:choose>
</body>
</html>
