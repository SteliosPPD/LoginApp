
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CarsService;


public class CarsServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String qString = request.getQueryString();
//        CarsService carsServ = new CarsService();
//        
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            out.println(carsServ.getCars());
//            if(qString != null){
//                out.println(qString);
//                out.print("Param delete: " + request.getParameter("delete"));
//            }
//        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String qString = request.getQueryString();
        CarsService carsServ = new CarsService();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println(carsServ.getCars());
            if(qString != null){
                out.println(qString);
                out.print("Param delete: " + request.getParameter("delete"));
            }
        }

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
