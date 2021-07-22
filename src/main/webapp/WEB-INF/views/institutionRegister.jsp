<%--
  Created by IntelliJ IDEA.
  User: ola
  Date: 20/07/2021
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>

<html>
<head>
    <title>Institution form</title>
</head>
<body>
<form:form method="post" modelAttribute="institution">

<%--    <label for="institutionName">Nazwa miejsca</label>--%>
<%--    <input id="institutionName" type="text" name="institutionName" placeholder="Nazwa miejsca" required="required"/> <br>--%>

<%--    <label for="institutionAddress">Adres miejsca</label>--%>
<%--    <input id="institutionAddress" type="text" name="institutionAddress" placeholder="Adres miejsca" required="required"/> <br>--%>

<%--    <label for="institutionWebsite">Strona internetowa</label>--%>
<%--    <input id="institutionWebsite" type="text" name="institutionWebsite" placeholder="Strona internetowa"/> <br>--%>

<%--    <label for="institutionPhoneNumber">Numer telefonu</label>--%>
<%--    <input id="institutionPhoneNumber" type="text" name="institutionPhoneNumber" placeholder="Numer telefonu"/> <br>--%>


    <label for="name">Nazwa miejsca</label>
    <form:input path="name" id="inputName" type="text" name="name" placeholder="Nazwa miejsca" required="required"/> <br>

    <label for="address">Adres miejsca</label>
    <form:input path="address" id="inputAddress" type="text" name="address" placeholder="Adres miejsca" required="required"/> <br>

    <label for="website">Strona internetowa</label>
    <form:input path="website" id="inputWebsite" type="text" name="website" placeholder="Strona internetowa"/> <br>

    <label for="name">Numer telefonu</label>
    <form:input path="phoneNumber" id="inputPhoneNumber" type="text" name="phoneNumber" placeholder="Numer telefonu"/> <br>


    <input type="submit" value="Wyślij">
</form:form>

</body>
</html>

<jsp:include page="footer.jsp"/>
