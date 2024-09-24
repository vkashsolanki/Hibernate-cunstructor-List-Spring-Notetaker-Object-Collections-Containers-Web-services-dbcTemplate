<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
 <%@ include file="allcss.jsp" %> 
</head>
<body>
<div class="container">
<%@ include file="navbar.jsp" %>
<br>
<h1 class="text-upparcase">All Notes </h1>

<div class="row">
<div class="col-12">
<%
/* how to show data on web page all noted be careful createQuery always need entity/class name not Table name becouse using HQL*/
Session sessions = FactoryProvider.getSessionFactory().openSession();
 Query query = sessions.createQuery("from Note");
List<Note> list = query.list();
for(Note note:list){
	%>
	
	<!-- boostrap4 card paste here  -->
	
	<div class="card mt-3" >
  <img class="card-img-top m-2 mx-auto" style ="max-width:100px" src="img/notepad.png" alt="Card image cap">
  <div class="card-body px-5">
    <h5 class="card-title"><%= note.getTitle() %></h5>
    <p class="card-text"><%= note.getContent() %></p>
    <p><b class="text-primary"><%= note.getAddDate() %></b></p>
    <div class="container text-center mt-2">
    <a href="deleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a> 
    <a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
    </div>
  </div>
</div>
	

<%	
}
sessions.close();
%>



</div>

</div>


</div>

</body>
</html>