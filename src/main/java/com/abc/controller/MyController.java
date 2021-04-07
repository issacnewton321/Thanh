package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Hocsinh;
import com.abc.repository.HocsinhRepository;

@RestController
public class MyController {
	
	@Autowired
	HocsinhRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "wellcome to home";
	}
	@GetMapping("/hocsinh")
	public List<Hocsinh> getHocsinh(){
		return repo.findAll();
	}
	@PostMapping("/hocsinh")
	public String insertHocsinh( @Validated @RequestBody Hocsinh hs) {
		System.out.println(hs.getMssv());
		try {
			repo.save(hs);
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "false";
	}
}
