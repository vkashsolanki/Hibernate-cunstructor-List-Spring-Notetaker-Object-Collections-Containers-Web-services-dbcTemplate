package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class deleteServlet extends HttpServlet {

    public deleteServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// (request.getParameter("note_id") value nikal dega and trim() space remove kar dega Integer.parseInt integer value me convert kar dega
			int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			
			// session open karunga for hibernate 
			Session session = FactoryProvider.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			 Note note = (Note)session.get(Note.class, noteId);
			 session.delete(note);
			 transaction.commit();
			 session.close();
			 response.sendRedirect("all_addNotes.jsp");
			
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// delete noted
		
		try {
			
		} catch (Exception e) {
		}
		

	}

}
