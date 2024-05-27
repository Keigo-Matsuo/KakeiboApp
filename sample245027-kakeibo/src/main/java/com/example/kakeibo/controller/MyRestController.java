package com.example.kakeibo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakeibo.entity.Kakeibo;
import com.example.kakeibo.service.KakeiboService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyRestController {
	@Autowired
	KakeiboService kakeiboService;
	
	@GetMapping("/api/kakeibo")
	public List<Kakeibo> getHome(Model model) {
		return kakeiboService.findAll();
	}
}
