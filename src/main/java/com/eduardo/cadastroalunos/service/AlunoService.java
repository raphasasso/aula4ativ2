package com.eduardo.cadastroalunos.service;
import com.eduardo.cadastroalunos.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();
    private Long contador = 1L;

    public List<Aluno> listarTodos() {
        return alunos;
    }

    public void salvar(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(contador++);
            alunos.add(aluno);
        } else {
            atualizar(aluno);
        }
    }

    public Aluno buscarPorId(Long id) {
        return alunos.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private void atualizar(Aluno aluno) {

        Aluno existente = buscarPorId(aluno.getId());

        if (existente != null) {
            existente.setNome(aluno.getNome());
            existente.setEmail(aluno.getEmail());
            existente.setCurso(aluno.getCurso());
        }

    }

    public void excluir(Long id) {
        alunos.removeIf(a -> a.getId().equals(id));
    }
}
