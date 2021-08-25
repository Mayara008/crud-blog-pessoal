package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ponstagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repositoty;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetALL() {
		return ResponseEntity.ok(repositoty.findAll());
				;
	}

}
