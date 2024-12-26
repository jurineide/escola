package com.jurineide.escola.repositories;

import com.jurineide.escola.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Alunos,Long> {
}
