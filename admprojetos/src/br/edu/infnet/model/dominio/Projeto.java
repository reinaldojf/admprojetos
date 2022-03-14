package br.edu.infnet.model.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Projeto {
	private String codigo;
	private String descricao;
	private Cliente cliente;
	private List<Empregado> empregados;
	
//	public Projeto() {
//		codigo = "001";
//		descricao = "Projeto XYZ";
//	}
	@Override
	public String toString() {
		
		return String.format("%s;%s;%d", 
				codigo,
				descricao, 
				empregados.size());
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Empregado> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	
}
