/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author karin
 */
@WebServlet(name = "calculo", urlPatterns = {"/calculo"})
public class calculo extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        float primeiro_numero = Float.parseFloat(request.getParameter("primeiro_numero"));
        float segundo_numero = Float.parseFloat(request.getParameter("segundo_numero"));
   
        float resultado = (primeiro_numero + segundo_numero) /2;
        
        request.setAttribute("resultado", resultado);
        
        request.getRequestDispatcher("Calcular.jsp").forward(request, response);
        
    }
}
    
