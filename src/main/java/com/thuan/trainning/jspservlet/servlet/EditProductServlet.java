package com.thuan.trainning.jspservlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thuan.trainning.jspservlet.model.Product;

@WebServlet(urlPatterns = "/editProduct")
public class EditProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("code");
		System.out.println("code =  " + code);
		Product editProduct = null;

		for (Product product : ProductListServlet.products) {
			if (product.getCode().equalsIgnoreCase(code)) {
				editProduct = product;
				break;
			}
		}
		req.setAttribute("product", editProduct);

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/editProductView.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = (String) req.getParameter("code");
		String name = (String) req.getParameter("name");
		String priceStr = (String) req.getParameter("price");
		float price = 0;
		try {
			price = Float.parseFloat(priceStr);
		} catch (Exception e) {
		}
		Product product = new Product(code, name, price);
		ProductListServlet.products.add(product);

		resp.sendRedirect(req.getContextPath() + "/productList");
	}

}
