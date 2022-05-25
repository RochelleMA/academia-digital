package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  public String getNome;
  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
}
