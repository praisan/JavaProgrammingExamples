/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.sitcom.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.sitcom.model.Product;

/**
 *
 * @author INT676
 */
public class ProductListingServlet extends HttpServlet {

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
        String description = request.getParameter("description");
        if (description == null) {
            description = "%";
        }
        List<Product> productList = Product.getProductByDescription(description);
        //---------------
        request.setAttribute("products", productList);
        getServletContext().getRequestDispatcher("/ProductListing.jsp").forward(request, response);
        //----------------
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ProductListingServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Product lasting::</h1><hr>");
//            if(productList.size()>0){
//                out.println("<table>");
//                out.println("<th>");
//                out.println("<td>Product ID</td>");
//                out.println("<td>Product Description</td>");
//                out.println("<td>Price</td>");
//                out.println("</th>");
//                for (Product product : productList) {
//                    out.println("<tr>");
//                    out.println("<td>"+product.getProductId()+"</td>");
//                    out.println("<td>"+product.getDescription()+"</td>");
//                    out.println("<td>"+product.getPrice()+"</td>");
//                    out.println("</tr>");                    
//                }
//                
//                out.println("<table>");
//                out.println("</table>");
//            }else{
//                out.println("Product like "+description+" does not exits");
//            }
//            out.println("</body>");
//            out.println("</html>");
//        }
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
