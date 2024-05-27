package com.example.kakeibo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kakeibo.entity.Kakeibo;
import com.example.kakeibo.repository.KakeiboRepository;

@Service
public class KakeiboService {
	@Autowired
	private KakeiboRepository kakeiboRepository;
	
	public List<Kakeibo> findAll() {
		return kakeiboRepository.findAll();
	}
}
