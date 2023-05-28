package com.abctech.abctech.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrdemServico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	private List<String> listaServicos = new ArrayList<>();
	private String localizacaoInicial;
	private String localizacaoFinal;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime inicial;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime fim;
	
	OrdemServico(){}

	public OrdemServico(Long id, String codigo, List<String> listaServicos, String localizacaoInicial,
			String localizacaoFinal, LocalDateTime inicial, LocalDateTime fim) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.listaServicos = listaServicos;
		this.localizacaoInicial = localizacaoInicial;
		this.localizacaoFinal = localizacaoFinal;
		this.inicial = inicial;
		this.fim = fim;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<String> getListaServicos() {
		return listaServicos;
	}

	public String getLocalizacaoInicial() {
		return localizacaoInicial;
	}

	public void setLocalizacaoInicial(String localizacaoInicial) {
		this.localizacaoInicial = localizacaoInicial;
	}

	public String getLocalizacaoFinal() {
		return localizacaoFinal;
	}

	public void setLocalizacaoFinal(String localizacaoFinal) {
		this.localizacaoFinal = localizacaoFinal;
	}

	public LocalDateTime getInicial() {
		return inicial;
	}

	public void setInicial(LocalDateTime inicial) {
		this.inicial = inicial;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
