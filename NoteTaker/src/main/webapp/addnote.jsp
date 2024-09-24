<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>add noted</title>


 <%@ include file="allcss.jsp" %> 
</head>
<body>

   <div class="container">
   <%@ include file="navbar.jsp" %>
   
   <br>
   <h2>Please fill up your notes details </h2>
   <br>
   <!-- this is add form   -->
   
   <form action="SaveServlet" method="post">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input type="text" 
    class="form-control" 
    id="title" 
    aria-describedby="titlehelp" 
    placeholder="Enter here"
    required="required"
    name="title">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea required="required" id="content" placeholder="Enter your content" class="form-control" style="height:250px" name="content">
    </textarea>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
  
</form>
   
   
   </div>

</body>
</html>