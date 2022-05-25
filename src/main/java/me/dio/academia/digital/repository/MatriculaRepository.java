package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    Matricula save(Matricula matricula);

    IMatriculaService findById(Long id);

    List<Matricula> findAlunosBairro(String bairro);

}
