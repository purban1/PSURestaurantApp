package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import restaurant.model.MealResult;
import restaurant.model.MenuEntity;
import restaurant.model.MenuService;

/**
 *
 * @author Patrick Urban
 */
@WebServlet(name = "MenuServlet", urlPatterns = {"/choices.do"})
public class MenuServlet extends HttpServlet {
    private static int runCount = 0;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // For Persistence - commented out no persistence
//        MenuService mc = new MenuService();
//        
//        List<MenuEntity> itemsList= mc.retreiveMenuItems();
        
//        out.println(itemsList);
        
        
        // Set destination location
        final String DESTINATION = "billjsp.jsp";
//        final String DESTINATION = "testresult.jsp";
        
        
        String meal = request.getParameter("mainmeal");
        String beverage = request.getParameter("beverage");
        String dessert = request.getParameter("dessert");
        
        MealResult theMeal = new MealResult();
        
        Map bill = theMeal.mealSelection(meal, beverage, dessert);
        
        request.setAttribute("total", bill);
        
        // Send the updated request object to the billing page
        RequestDispatcher view =
                request.getRequestDispatcher(DESTINATION);
        view.forward(request, response);
        
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
