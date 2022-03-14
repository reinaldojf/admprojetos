package br.edu.infnet.model.dominio;

public class Cliente {
	private String cnpj;
	private String razaosocial;
	private String email;
	
	public Cliente (String cnpj, String razaosocial, String email) {
		this.cnpj= cnpj;
		this.razaosocial = razaosocial;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(cnpj);
		sb.append(";");
		sb.append(razaosocial);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
