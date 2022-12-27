package com.web.josh.servlet;

@WebServlet("/JoshSaasServlet")
public class JoshSaasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public JoshSaasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Hello: ").append(request.getParameter("name"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		/*
		 * String type = req.getParameter("Type"); JoshService service = new
		 * JoshService(); LiquorType l = LiquorType.valueOf(type);
		 * 
		 * List productList = service.getProducts(l);
		 * 
		 * req.setAttribute("products", productList); RequestDispatcher view =
		 * req.getRequestDispatcher("result.jsp"); view.forward(req, resp);
		 */
	}

}
