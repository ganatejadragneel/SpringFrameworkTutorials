package org.gta1;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gta1.model.Person;


@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("ganateja",21));
		staff.add(new Person("luffy",22));
		
		request.setAttribute("staff",staff);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

}
