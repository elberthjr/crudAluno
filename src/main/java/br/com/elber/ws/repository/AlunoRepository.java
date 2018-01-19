package br.com.elber.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.elber.ws.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{


}
