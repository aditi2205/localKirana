package com.selfproject.localKirana.service;

import java.util.List;

import com.selfproject.localKirana.dao.KiranaProduct;

public interface IProductQueryService {
	List<KiranaProduct> findByName(String s);
}
