package com.selfproject.localKirana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfproject.localKirana.dao.KiranaProduct;
import com.selfproject.localKirana.dao.KiranaProductRepository;

@Service
public class ProductQueryService implements IProductQueryService {

	@Autowired
	KiranaProductRepository KiranaProductRepository;
	
	@Override
	public List<KiranaProduct> findByName(String s) {
		List<KiranaProduct> l = KiranaProductRepository.findByName(s);
		return l;
	}
	

}
