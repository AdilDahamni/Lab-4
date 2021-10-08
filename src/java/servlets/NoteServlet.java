
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // this will have the servlet call upon a JSP to be loaded by the client's browser
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        // stop the code call
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

// to read files
BufferedReader br = new BufferedReader(new FileReader(new File(path)));

// to write to a file
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
