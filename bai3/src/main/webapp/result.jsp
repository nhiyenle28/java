<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Kết quả đăng nhập</title>
</head>
<body>
    <c:choose>
        <c:when test="${requestScope.message == 'success'}">
            <h2 style="color:green;">Đăng nhập thành công!</h2>
        </c:when>
        <c:otherwise>
            <h2 style="color:red;">Đăng nhập thất bại. Sai tài khoản hoặc mật khẩu.</h2>
        </c:otherwise>
    </c:choose>
</body>
</html>
