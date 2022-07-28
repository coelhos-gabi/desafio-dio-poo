package br.com.dioprojetos;

import br.com.dioprojetos.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now().plusDays(15));

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now().plusDays(15));

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriela");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev1.getNome() + " :\n" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos concluídos " + dev1.getNome() + " :\n" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + dev1.getNome() + " :\n" + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev2.getNome() + " :\n"+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos concluídos " + dev2.getNome() + " :\n" + dev2.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + dev2.getNome() + " :\n"+ dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}