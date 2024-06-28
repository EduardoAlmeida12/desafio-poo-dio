import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1=new Curso("Curso java","descricao curso Java",8);
        Curso curso2=new Curso("Curso  js","descricao curso js",4);
        Mentoria mentoria=new Mentoria("Mentoria de Java","Descricao mentoria Java",LocalDate.now());
        Bootcamp bootcamp=new Bootcamp("Bootcamp Java Developer","Descricao Bootcamp Java Deeveloper");
        Dev devEduardo=new Dev();
        Dev devJoao=new Dev();




        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        devEduardo.setNome("Eduardo");
        bootcamp.addDevInscricao(devEduardo);
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("-------");
        System.out.println("Conteudos inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Eduardo:" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:"+devEduardo.calcularXp());


        System.out.println("------------------------");

        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-------");
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularXp());




//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

    }
}
