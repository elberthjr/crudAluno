package br.com.elber.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.elber.ws.model.Aluno;
import br.com.elber.ws.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;
	
	public Aluno cadastrar(Aluno aluno) {		
		return alunoRepository.save(aluno);
	}
	
	public Collection<Aluno> buscarTodos(){
		return alunoRepository.findAll();
	}
	
	public void excluir (Aluno aluno) {
		alunoRepository.delete(aluno);
	}
	
	public Aluno buscarPorId (Integer id) {
		return alunoRepository.findOne(id);
	}
	
	public Aluno alterar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
}
