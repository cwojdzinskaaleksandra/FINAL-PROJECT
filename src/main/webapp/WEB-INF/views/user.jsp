<jsp:include page="header.jsp"/>
<%@page pageEncoding="UTF-8" %>


<div id="content-wrapper">

  <div class="container-fluid">

    <!-- Breadcrumbs-->
    <ol class="breadcrumb">
      <li class="breadcrumb-item">
        <a href="index.html">Dashboard</a>
      </li>
      <li class="breadcrumb-item active">Witaj użytkowniku</li>
    </ol>

    <!-- Page Content -->
    <h1 class="display-4">Witaj użytkowniku!</h1>

    <p class="lead">
      Jeśli chcesz dodać obiekt, miejsce lub instytuję
      <a href="/addInstitution">kliknij tutaj</a>
    </p>

    <p class="lead">
      Jeśli jesteś adminem, przejdź
      <a href="/admin">tutaj</a>
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
