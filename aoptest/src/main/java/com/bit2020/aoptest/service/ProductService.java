package com.bit2020.aoptest.service;

import org.springframework.stereotype.Service;

import com.bit2020.aoptest.vo.ProductVo;

@Service
public class ProductService {
	public ProductVo find(String name) {
		System.out.println("[ProductService] finding...");
//		if(1-1 == 0) {
//			throw new RuntimeException("Find Exception");
//		}
		return new ProductVo(name);
	}
}
