
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
            <li class="breadcrumb-item active">Odpowiedzi na pytania</li>
        </ol>

        <p class="lead">

        <h1 class="display-6">Strona w budowie :)</h1>

<%--        </p>--%>
<%--        <form:form method="post" modelAttribute="answer" action="/addAnswers">--%>

<%--            <label for="answer"></label>--%>

<%--            Tak <form:radiobutton path="answer" id="answer" value="tak"/> <br>--%>
<%--            Nie <form:radiobutton path="answer" id="answer" value="nie"/> <br>--%>

<%--            <input type="submit" value="Wyślij odpowiedzi">--%>

<%--        </form:form>--%>



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

