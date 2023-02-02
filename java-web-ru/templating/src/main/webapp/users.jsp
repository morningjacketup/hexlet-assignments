<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<c:forEach var="user" items="${users}">
    <ul>
        <li>${user.get("id")}</li>
        <li>${user.get("firstName")}</li>
        <li>${user.get("lastName")}</li>
        <li>${user.get("email")}</li>
    </ul>
</c:forEach>
</body>
</html>

<!-- END -->
