package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet {

    public UpdateServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// fetching data three
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int noteId = Integer.parseInt(request.getParameter("noteId"));
			
			Session session = FactoryProvider.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			Note note = session.get(Note.class, noteId);
			note.setTitle(title);
			note.setContent(content);
			note.setAddDate(new Date());
			
			
			transaction.commit();
			session.close();
			
			response.sendRedirect("all_addNotes.jsp");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
