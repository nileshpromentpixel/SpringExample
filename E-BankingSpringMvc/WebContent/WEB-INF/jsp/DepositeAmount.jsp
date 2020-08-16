<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>E-BANKING</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<h1>CREATE NEW ACCOUNT</h1>
<hr>
<hr>
<form:form class="form-horizontal" role="form"  method="post" action="DepositeAmount" modelAttribute="Deposite">
<div class="form-group">
    <label for="email">AccountNo</label>
    <form:input path="accountno" type="text" class="form-control" placeholder="Enter email" id="email" />
    </div>
 
  <div class="form-group">
    <label for="email">NAME</label>
    <form:input path="username" type="text" class="form-control" placeholder="Enter email" id="email" />
    </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <form:input path="password"    class="form-control" placeholder="Enter password" id="pwd" />
   
  </div>
  
  <div class="form-group">
    <label for="pwd">AMOUNT</label>
    <form:input path="amount" class="form-control" placeholder="Enter AMOUNT" id="pwd" />
   
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
       </form:form>
 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>