import java.time.LocalDate;

import br.Curso;
import br.Mentoria;

public class Main {

    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Curso java básico");
        curso1.setCargaHoraria(100);

        Curso curso3 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Curso java intermediário");
        curso1.setCargaHoraria(100);

        Curso curso4 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Curso java avançado");
        curso1.setCargaHoraria(100);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescrição("Mentoria java básico");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso3);
        System.out.println(curso4);
        System.out.println(mentoria);

    }
}
