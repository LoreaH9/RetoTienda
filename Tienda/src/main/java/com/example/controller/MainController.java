package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.dao.ModeloImagen;
import com.example.model.dao.ModeloProducto;

@Controller
public class MainController {
	
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	ModeloProducto mp;
	ModeloImagen mi;
	
	@RequestMapping("/")
	public String index(Model datamap) {
		datamap.addAttribute("datetime", getDatetime());
		return ("index");		
	}
	
	@RequestMapping("/lookbook")
	public String lookbook(Model datamap) {
		datamap.addAttribute("datetime", getDatetime());
		return ("index");		
	}
	
	@RequestMapping("/ropa")
	public String ropa(Model datamap) {
		datamap.addAttribute("datetime", getDatetime());
		return ("index");		
	}
	
	private String getDatetime() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);  
	}
	
}
