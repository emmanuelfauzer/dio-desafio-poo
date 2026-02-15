import br.com.inovasoftware.desafio.dominio.Bootcamp;
import br.com.inovasoftware.desafio.dominio.Curso;
import br.com.inovasoftware.desafio.dominio.Dev;
import br.com.inovasoftware.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de Java da DIO.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Curso de JavaScript da DIO.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java do Bootcamp da Dio.");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer!");
        bootcamp.setDescricao("Bootcamp de Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Aluno:" + dev1.getNome());
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP" + dev1.calcularTotalXP());

        System.out.println("===========================");

        Dev dev2 = new Dev();
        dev2.setNome("Emmanuel");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Aluno:" + dev2.getNome());
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP" + dev2.calcularTotalXP());
        System.out.println("===========================");

    }
}