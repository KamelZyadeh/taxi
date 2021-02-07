<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="">
    <title>adminPage</title>
    <link rel="stylesheet" href="<c:url value="/styles/administrator.css"/>">
</head>
<body>
<section>
    <div>
        <c:if test="${sessionScope.account.type == 'ADMIN'}">
            <c:forEach var="account" items="${sessionScope.accountList}">
                <ul>
                    <li>${account.id}</li>
                    <li>${account.userName}</li>
                </ul>
            </c:forEach>
        </c:if>
        <c:if test="${sessionScope.account.type == 'CLIENT'}">
        </c:if>
        <c:if test="${sessionScope.account.type == 'TAXI'}">
            
        </c:if>
    </div>
</section>
</body>
</html>
