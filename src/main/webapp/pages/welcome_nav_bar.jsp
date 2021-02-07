<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="u" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="">
    <title>Welcome</title>
    <link rel="stylesheet" href="<c:url value="../styles/welcome_nav_bar.css"/>">
</head>
<body>
<header>
    <div class="nav_divider">

        <div class="nav_span">
            <a class="item" href="${pageContext.request.contextPath}/pages/register.jsp">Register</a>
        </div>

        <div class="nav_span">
            <a class="item" href="${pageContext.request.contextPath}/pages/login.jsp">Login</a>
        </div>
    </div>
</header>
</body>
</html>
