package com.abctech.abctech.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abctech.abctech.entities.OrdemServico;
import com.abctech.abctech.repositories.OrdemServicoRepository;

@RestController
@RequestMapping(value = "/servico")
public class OrdemServicoResource {
	
	@Autowired
	private OrdemServicoRepository repositorio;
	
	@GetMapping
	public List<OrdemServico> listar(){
		return repositorio.findAll();
	}
	
	@PostMapping
	public void salvar(@RequestBody OrdemServico ordemServico) {
		repositorio.save(ordemServico);
	}
	
	@PutMapping
	public void alterar(@RequestBody OrdemServico ordemServico) {
		if(ordemServico.getId() > 0)
		repositorio.save(ordemServico);
	}
	
	@DeleteMapping
	public void excluir(@RequestBody OrdemServico ordemServico) {
		repositorio.save(ordemServico);
	}
}
