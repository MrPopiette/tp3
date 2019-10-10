package controlleur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "servlet", urlPatterns = {"/sgp/collaborateurs/lister"})
public class ListerCollaborateursController extends HttpServlet {
    private static final String JSP_PAGE = "/WEB-INF/views/collab/listerCollaborateurs.jsp";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // A ajouter

        req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
    }
}
