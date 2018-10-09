package com.itheima.service;

import java.util.List;

import com.itheima.dao.ProductDao;
import com.itheima.domain.PageBean;

public class ProductService {

	public List<PageBean> findAll(int pageNumber,int pageSize) throws Exception {
		ProductDao dao = new ProductDao();
		List<PageBean> list = dao.findAll( (pageNumber - 1) * pageSize , pageSize  );
		return null;
	}

}
