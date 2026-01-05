import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso javaCurso = new Curso();
        javaCurso.setTitulo("Curso Java");
        javaCurso.setDescricao("Introdução ao Java");
        javaCurso.setCargaHoraria(8);

        Curso jsCurso = new Curso();
        jsCurso.setTitulo("Curso JavaScript");
        jsCurso.setDescricao("Introdução ao JavaScript");
        jsCurso.setCargaHoraria(4);

        Mentoria javaMentoria = new Mentoria();
        javaMentoria.setTitulo("Mentoria Java");
        javaMentoria.setDescricao("Mentoria sobre Java");
        javaMentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp focado em Java");
        bootcampJava.getConteudos().add(javaCurso);
        bootcampJava.getConteudos().add(jsCurso);
        bootcampJava.getConteudos().add(javaMentoria);

        Dev Matheus = new Dev();
        Matheus.setNome("Matheus");
        Matheus.inscreverBootcamp(bootcampJava);

        Matheus.progredir();
        Matheus.progredir();

        System.out.println("Matheus - Inscritos: " + Matheus.listarConteudosInscritos());
        System.out.println("Matheus - Concluídos: " + Matheus.getConteudosConcluidos());
        System.out.println("Matheus - XP: " + Matheus.calcularTotalXp());

        System.out.println("-------");

        Dev Jose = new Dev();
        Jose.setNome("Jose");
        Jose.inscreverBootcamp(bootcampJava);

        Jose.progredir();
        Jose.progredir();
        Jose.progredir();

        System.out.println("Jose - Inscritos: " + Jose.listarConteudosInscritos());
        System.out.println("Jose - Concluídos: " + Jose.getConteudosConcluidos());
        System.out.println("Jose - XP: " + Jose.calcularTotalXp());

        for (Conteudo c : bootcampJava.getConteudos()) {
            System.out.println(c);
            System.out.println("-----");
        }

    }
}
