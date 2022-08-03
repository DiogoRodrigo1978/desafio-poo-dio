import br.com.bio.desafio.dominio.Bootcamp;
import br.com.bio.desafio.dominio.Curso;
import br.com.bio.desafio.dominio.Dev;
import br.com.bio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev() {
            @Override
            public String getConteudosInscritos() {
                return null;
            }
        };
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diogo:" + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Diogo:" + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Diogo:" + devDiogo.getConteudosConcluidos());
        System.out.println("XP:" + devDiogo.calcularTotalXp());

        System.out.println("-------");

        Dev devRodrigo = new Dev() {
            @Override
            public String getConteudosInscritos() {
                return null;
            }
        };
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rodrigo:" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devRodrigo.calcularTotalXp());

    }
}
