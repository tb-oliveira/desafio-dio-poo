package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main  {
    public static void main (String[] args){
        Curso curso01 = new Curso();
        Curso curso02 = new Curso();
        Mentoria mentoria01 = new Mentoria();
        Mentoria mentoria02 = new Mentoria();

        curso01.setTitulo("curso java");
        curso01.setDescricao("descricao curso java");
        curso01.setCodigo("C-JV-001");
        curso01.setCargaHoraria(8);
        curso02.setTitulo("curso js");
        curso02.setDescricao("descricao curso js");
        curso02.setCodigo("C-JS-002");
        curso02.setCargaHoraria(4);
        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println("-----------------------");


        mentoria01.setTitulo("mentoria java");
        mentoria01.setDescricao("descricao mentoria java");
        mentoria01.setCodigo("M-JV-001");
        mentoria01.setData(LocalDate.now());
        mentoria02.setTitulo("mentoria js");
        mentoria02.setDescricao("descricao mentoria js");
        mentoria02.setCodigo("M-JS-002");
        mentoria02.setData(LocalDate.now());
        System.out.println(mentoria01);
        System.out.println(mentoria02);
        System.out.println("-----------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Maratona Java");
        bootcamp.setDescricao("Descricao da Maratona Java");
        bootcamp.setCodigo("B-001");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);
        bootcamp.getConteudos().add(mentoria02);

        System.out.println("Disciplinas do bootcamp: " + bootcamp.getConteudos());
        System.out.println("-----------------------");


        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.setMatricula("D-001");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.setMatricula("D-002");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.setMatricula("D-003");

        Dev devstela = new Dev();
        devstela.setNome("Stela");
        devstela.setMatricula("D-004");

        devThiago.inscreverBootcamp(bootcamp);
        devJose.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("Devs inscritos no bootcamp: " + bootcamp.getDevsInscritos());
        System.out.println("-----------------------");

        System.out.println("O dev " + devThiago.getNome() + " está inscrito no bootcamp: " + devThiago.getBootcampInscrito());
        System.out.println("O dev " + devThiago.getNome() + " cursará: " + devThiago.getConteudosInscritos());
        System.out.println("O dev " + devThiago.getNome() + " tem " + devThiago.calcularTotalXP() + " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devJose.getNome() + " está inscrito no bootcamp: " + devJose.getBootcampInscrito());
        System.out.println("O dev " + devJose.getNome() + " cursará: "  + devJose.getConteudosInscritos());
        System.out.println("O dev " + devJose.getNome() + " tem " + devJose.calcularTotalXP() + " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devMaria.getNome() + " está inscrito no bootcamp: " + devMaria.getBootcampInscrito());
        System.out.println("O dev " + devMaria.getNome() + " cursará: "  + devMaria.getConteudosInscritos());
        System.out.println("O dev " + devMaria.getNome() + " tem " + devMaria.calcularTotalXP() + " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devstela.getNome() + " está inscrito no bootcamp: " + devstela.getBootcampInscrito());
        System.out.println("O dev " + devstela.getNome() + " cursará: "  + devstela.getConteudosInscritos());
        System.out.println("O dev " + devstela.getNome() + " tem " + devstela.calcularTotalXP() +  " de experiencia");
        System.out.println("-----------------------");

        devThiago.progredir();
        devThiago.progredir();
        devMaria.progredir();

        System.out.println("O dev " + devThiago.getNome() + " concluiu: " + devThiago.getConteudosConcluidos());
        System.out.println("O dev " + devThiago.getNome() + " ainda falta concluir: " + devThiago.getConteudosInscritos());
        System.out.println("O dev " + devThiago.getNome() + " tem " + devThiago.calcularTotalXP() + " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devJose.getNome() + " concluiu: "  + devJose.getConteudosConcluidos());
        System.out.println("O dev " + devJose.getNome() + " ainda falta concluir: " + devJose.getConteudosInscritos());
        System.out.println("O dev " + devJose.getNome() + " tem " + devJose.calcularTotalXP() + " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devMaria.getNome() + " concluiu: "  + devMaria.getConteudosConcluidos());
        System.out.println("O dev " + devMaria.getNome() + " ainda falta concluir: " + devMaria.getConteudosInscritos());
        System.out.println("O dev " + devMaria.getNome() + " tem " + devMaria.calcularTotalXP() +  " de experiencia");
        System.out.println("-----------------------");
        System.out.println("O dev " + devstela.getNome() + " concluiu: "  + devstela.getConteudosConcluidos());
        System.out.println("O dev " + devstela.getNome() + " ainda falta concluir: " + devstela.getConteudosInscritos());
        System.out.println("O dev " + devstela.getNome() + " tem " + devstela.calcularTotalXP() +  " de experiencia");

    }
}
