<%--
  Created by IntelliJ IDEA.
  User: ola
  Date: 21/07/2021
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>
<%@page pageEncoding="UTF-8" %>


<div id="content-wrapper">

    <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.html">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Sukces</li>
        </ol>

        <!-- Page Content -->
        <h1 class="display-4">Pomyślnie dodano!</h1>

        <p class="lead">
            Teraz odpowiedz na pytania dotyczące dostępności
            <a href="/addAnswers">kliknij tutaj</a>
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
