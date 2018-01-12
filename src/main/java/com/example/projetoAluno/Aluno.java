package com.example.projetoAluno;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Aluno {
	
    private String nome;
    private String email;
    private String sexo;
    private String curso;
    private String dataInicio;
    
    public Aluno() {}
    
    public Aluno(
    		@JsonProperty("nome")String nome, 
    		@JsonProperty("email")String email, 
    		@JsonProperty("sexo")String sexo,
    		@JsonProperty("curso")String curso,
    		@JsonProperty("dataInicio")String dataInicio){
    	
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.curso = curso;
        this.dataInicio = dataInicio;
    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getdataInicio() {
		return dataInicio;
	}


	public void setdataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

    

}
