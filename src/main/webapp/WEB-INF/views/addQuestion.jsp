<%--
  Created by IntelliJ IDEA.
  User: ola
  Date: 22/07/2021
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div id="content-wrapper">

    <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.html">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Dodawanie pytania</li>
        </ol>

        <p class="lead">

        <h1 class="display-6">Wpisz pytanie które chcesz dodać</h1>

        </p>
        <form:form method="post" modelAttribute="question" action="/addQuestion">


            <form:input path="description" id="description" type="text" size="110" name="description" placeholder="Treść pytania" required="required"/> <br>

            <input type="submit" value="Dodaj pytanie">

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

