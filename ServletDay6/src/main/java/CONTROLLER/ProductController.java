package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDao;
import DTO.ProductDto;

public class ProductController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int productId = Integer.parseInt(req.getParameter("productId"));
		String productName = req.getParameter("productName");
		String productBrand = req.getParameter("productBrand");
		double productPrice = Double.parseDouble(req.getParameter("productPrice"));
		String productManfacture = req.getParameter("productManfacture");
		String state = req.getParameter("state");

		ProductDto pd = new ProductDto();

		pd.setProductName(productName);
		pd.setProductBrand(productBrand);
		pd.setProductManfacture(productManfacture);
		pd.setState(state);

		if (state.equals("AP")) {

			ServletContext sc = getServletContext();
			double CGST = Double.parseDouble(sc.getInitParameter("CGST"));

			ServletConfig servletConfig = getServletConfig();
			double SGST = Double.parseDouble(servletConfig.getInitParameter("AP"));

			double totalPrice = productPrice + (CGST + SGST) * productPrice;

			pd.setProductPrice(totalPrice);

		} else {
			ServletContext context = getServletContext();
			double CGST = Double.parseDouble(context.getInitParameter("CGST"));

			ServletConfig config = getServletConfig();
			double SGST = Double.parseDouble(config.getInitParameter("TS"));

			double totalPrice = productPrice + (CGST + SGST) * productPrice;

			pd.setProductPrice(totalPrice);

		}

		ProductDao dao = new ProductDao();
		dao.saveProduct(pd);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("saved successfully");

	}

}
