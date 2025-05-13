<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kết quả đăng nhập</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="alert alert-info text-center">
        <c:choose>
            <c:when test="${not empty requestScope.message}">
                <strong>${requestScope.message}</strong>
            </c:when>
            <c:otherwise>
                <strong>Không có thông báo.</strong>
            </c:otherwise>
        </c:choose>
    </div>
    <div class="text-center mt-3">
        <a href="login.jsp" class="btn btn-secondary">Quay lại</a>
    </div>
</div>

</body>
</html>
