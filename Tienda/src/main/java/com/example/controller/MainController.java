package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.model.dao.*;

@Controller
public class MainController {
	
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	ModeloProducto mp;

	
	@RequestMapping(value="/")
	public String index(Model datamap) {
		datamap.addAttribute("datetime", getDatetime());
		return "ropa";		
	}
	
	@RequestMapping(value="/lookbook")
	public String lookbook(Model datamap) {
		return "lookbook";		
	}
	
	@RequestMapping(value="/ropa")
	public String ropa(Model ropa) {
		return "ropa";		
	}
	
	private String getDatetime() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);  
	}
	
}
