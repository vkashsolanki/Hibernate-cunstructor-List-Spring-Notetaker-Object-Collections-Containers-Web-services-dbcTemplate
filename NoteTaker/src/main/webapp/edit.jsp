<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
 <%@ include file="allcss.jsp" %> 
</head>
<body>
   <div class="container">
   <%@ include file="navbar.jsp" %> 
      <br>
   <h1>Edit your Note</h1>
   <br>
   
   
   
   
   <%
   int noteId = Integer.parseInt(request.getParameter("note_id").trim());
	Session session1 = FactoryProvider.getSessionFactory().openSession();
	 Note note = (Note)session1.get(Note.class, noteId);
	 
	 
   %>
      
   <form action="UpdateServlet" method="post">
   <input value="<%= note.getId()%>" name="noteId" type="hidden">
   
  <div class="form-group">
    <label for="title">Note Title</label>
    <input type="text" 
    class="form-control" 
    id="title" 
    aria-describedby="titlehelp" 
    placeholder="Enter here"
    required="required"
    name="title" value="<%= note.getTitle() %>">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea required="required" id="content" placeholder="Enter your content" class="form-control" style="height:250px" name="content">
    <%= note.getContent() %></textarea>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-success">Save</button>
  </div>
  
</form>
    
   </div>


</body>
</html>