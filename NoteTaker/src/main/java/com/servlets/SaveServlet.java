package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class SaveServlet extends HttpServlet {

    public SaveServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			// title and content fetch
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			
			System.out.println(note.getId()+" "+note.getContent()+""+note.getTitle()+""+note.getAddDate());
			
			// hibernate save here
			Session session = FactoryProvider.getSessionFactory().openSession();
			Transaction  transaction = session.beginTransaction();
			
			session.save(note);
			
			transaction.commit();
			session.close();
			// To print on web page message 
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.println("<h1 style = 'text-align:center;'> Note is added Successfully ! ...</h1>");
			out.println("<h1 style = 'text-align:center;'><a href = 'all_addNotes.jsp'> View All notes</a></h1>");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
