package com.itheima.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.itheima.domain.PageBean;
import com.itheima.service.ProductService;

public class ProductServlet extends HttpServlet {
	public String findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 获取
			String pageNumberStr = request.getParameter("pageNumber");
			String pageSizeStr = request.getParameter("pageSize");
			int pageNumber = Integer.valueOf(pageNumberStr);
			int pageSize = Integer.valueOf(pageSizeStr);

			// 处理
			ProductService service = new ProductService();
			List<PageBean> list =  service.findAll(pageNumber, pageSize);

			// 响应
			request.setAttribute("list", list);
			return "index.jsp";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
