<%--
  Created by IntelliJ IDEA.
  User: ola
  Date: 20/07/2021
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>

<div id="content-wrapper">

    <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.html">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Dodawanie obiektu</li>
        </ol>

        <p class="lead">

        <h1 class="display-6">Dodaj obiekt, miejsce lub instytucję</h1>

        </p>

<form:form method="post" modelAttribute="institution" action="/addInstitution">

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

        <p class="lead">
            <a href="javascript:history.back()">Powrót</a>
        </p>

        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>

        <p><a href="/logout">Wyloguj się</a></p>

    </div>
    <!-- /.container-fluid -->

    <!-- Sticky Footer -->
    <footer class="sticky-footer">
        <div class="container my-auto">
            <div class="copyright text-center my-auto">
                <span>Copyright © 2021 A.Cwojdzińska</span>
            </div>
        </div>
    </footer>

</div>
<!-- /.content-wrapper -->

<jsp:include page="footer.jsp"/>