package com.thuan.trainning.jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thuan.trainning.jspservlet.model.Product;

@WebServlet(urlPatterns = "/productList")
public class ProductListServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static List<Product> products = null;

	public ProductListServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		if (products == null || products.size() == 0) {
			products = new ArrayList<Product>();
			products.add(new Product("1", "Nokia", 100F));
			products.add(new Product("2", "Samung", 100F));
			products.add(new Product("3", "Iphone", 100F));
			products.add(new Product("4", "LG", 100F));
		}

		req.setAttribute("productList", products);
		req.setAttribute("test", "Test message");

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/productListView.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
