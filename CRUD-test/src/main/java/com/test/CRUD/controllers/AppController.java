package com.test.CRUD.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.test.CRUD.entities.*;
import com.test.CRUD.services.ProductService;

@Controller
public class AppController {
	
	@Autowired
	private ProductService ProdService;

	
	@RequestMapping("/")
	public String Home(Model model) {
		List<Product> LP=ProdService.listAll();
		model.addAttribute("lp",LP);
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {

	    Product product = new Product();
	    model.addAttribute("product", product);
	     
		return "add";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    ProdService.save(product);
	    return "redirect:/";
	}
	@RequestMapping(value = "/edit/{id}")
	public ModelAndView editProduct(Model model,@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit");
	    Product product = ProdService.get(id);
	    mav.addObject("product", product);
		return mav;
	}
	@RequestMapping(value = "/delete/{id}")
	public String deleteProduct(@ModelAttribute("product") Product product) {
	    ProdService.delete(product.getId());
	    return "redirect:/";
	}

}
