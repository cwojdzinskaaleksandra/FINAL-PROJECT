<%@page pageEncoding="UTF-8" %>

<jsp:include page="header.jsp"/>

<div id="content-wrapper">

        <div class="container-fluid">

            <!-- Breadcrumbs-->
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="index.html">Dashboard</a>
                </li>
                <li class="breadcrumb-item active">404 Error</li>
            </ol>

            <!-- Page Content -->
            <h1 class="display-1">404</h1>
            <p class="lead">Nie znaleziono strony, możesz
                <a href="javascript:history.back()">wrócić</a>
                do poprzedniej strony, lub przejść do
                <a href="/">strony głównej</a>.</p>

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
