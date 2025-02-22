package br;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private String titulo;
    private String descrição;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descrição=" + descrição + ", data=" + data + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
        // Seguindo a regra de negócio vamos precisar adicionar mais xp sempre que o
        // aluno realizar um mentoria
    }

}
