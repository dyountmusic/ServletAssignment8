/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncc.nbad;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danielyount
 */
public class MembershipControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            String action = request.getAttribute("actionMessage").toString();
            out.println(action);
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if (action == null) {
            request.setAttribute("actionMessage", "<p>Error! The action parameter is required, only signup value is valid</p>");
        }
        
        if ("profile".equals(action)) {
            response.sendRedirect("profile.jsp");
        }

        if ("signup".equals(action)) {
            System.out.println("Throwing to signup jsp");
            
            getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
        } else {
            request.setAttribute("actionMessage", "<p>Error! The action parameter is required, only signup value is valid</p>");
        }
        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String action = request.getParameter("action");
        
        if (action == null) {
            request.setAttribute("actionMessage", "<p>Error! The action parameter is required, only signup value is valid</p>");
        }

        if ("signup".equals(action)) {
            System.out.println("Throwing to signup jsp");
            
            // Validate all parts of the message
            
            String name = request.getParameter("name");
            String username = request.getParameter("username");
            String passid = request.getParameter("passid");
            String address = request.getParameter("address");
            String country = request.getParameter("country");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String sex = request.getParameter("sex");
            String langs = request.getParameter("langs");
            String about = request.getParameter("about");
            
            System.out.println(name);
            System.out.println(username);
            System.out.println(passid);
            System.out.println(address);
            System.out.println(country);
            System.out.println(zip);
            System.out.println(email);
            System.out.println(sex);
            System.out.println(langs);
            System.out.println(about);
            
            
            if (name == null || username == null || passid == null || address == null || country == null || zip == null || email == null || sex == null || langs == null || about == null) {
                String message = "";
                if (name == null || "".equals(name)) {
                    message += "name ";
                }
                if (username == null || "".equals(username) ) {
                    message += "username ";
                }
                if (passid == null || "".equals(passid)) {
                    message += "passid ";
                }
                if (address == null || "".equals(address)) {
                    message += "address ";
                }
                if (country == null || "".equals("Default")) {
                    message += "country ";
                }
                if (zip == null || "".equals(zip)) {
                    message += "zip ";
                }
                if (email == null || "".equals(email)) {
                    message += "email ";
                }
                if (sex == null || "".equals(sex)) {
                    message += "sex ";
                }
                if (langs == null || "".equals(langs)) {
                    message += "langs ";
                }
                if (about == null || "".equals(about)) {
                    message += "about ";
                }
                request.setAttribute("actionMessage", "<p>Fill in all the fields: " + message + "</p>");
                
            } else {
                
                // Creating JavaBean Object
                UserInfo user = new UserInfo();
                
                // Setting all the fields of it
                user.setAbout(about);
                user.setAddress(address);
                user.setCountry(country);
                user.setEmail(email);
                user.setLangs(langs);
                user.setName(name);
                user.setPassid(passid);
                user.setSex(sex);
                user.setUsername(username);
                user.setZip(zip);

                request.setAttribute("UserData", user);
                
                getServletContext().getRequestDispatcher("/profile.jsp").forward(request, response);
                
            }
                    
        } else {
            request.setAttribute("actionMessage", "<p>Error! The action parameter is required, only signup value is valid</p>");
        }
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
