package com.selfproject.localKirana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.selfproject.localKirana.dao.KiranaProduct;
import com.selfproject.localKirana.dao.KiranaProductRepository;

@Controller
@RequestMapping(path="/home")
public class MainController {

	@Autowired
	private KiranaProductRepository kiranaProductRepository;
	
	
	
//TODO:	Add a product only if doesn't exist else increase the quantity by one
	@PostMapping(path="/addProduct")
	public @ResponseBody String addproduct(@RequestParam String name, @RequestParam Float cost, @RequestParam String category) {
		
		KiranaProduct kiranaProduct = new KiranaProduct();
		kiranaProduct.setProductName(name);
		kiranaProduct.setCost(cost);
		kiranaProduct.setQuantity(1);
		kiranaProduct.setCategory(category);
		kiranaProductRepository.save(kiranaProduct);
		
		return "Saved "+name+" to "+category;
		
	}
	
	@GetMapping(path="/allProducts")
	public @ResponseBody Iterable<KiranaProduct> getAllProducts(){
		return kiranaProductRepository.findAll();
	}
}
