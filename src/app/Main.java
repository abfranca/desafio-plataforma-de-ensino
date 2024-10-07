package app;

import entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int duration = 0;
        int lessionCount;
        List<Lession> lessions = new ArrayList<Lession>();
        char lessionType;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas aulas tem o curso? ");
        lessionCount = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= lessionCount; i++) {
            System.out.printf("\nDados da %da aula:\n", i);

            System.out.printf("Conteúdo ou tarefa (c/t)? ");
            lessionType = sc.nextLine().charAt(0);

            if (lessionType == 'c') {
                Video content = new Video();

                System.out.printf("Título: ");
                content.setTitle(sc.nextLine());

                System.out.printf("URL do vídeo: ");
                content.setUrl(sc.nextLine());

                System.out.printf("Duração em segundos: ");
                content.setSeconds(sc.nextInt());
                sc.nextLine();

                lessions.add(content);

            } else if (lessionType == 't') {
                Task task = new Task();

                System.out.printf("Título: ");
                task.setTitle(sc.nextLine());

                System.out.printf("Descrição: ");
                task.setDescription(sc.nextLine());

                System.out.printf("Quantidade de questões: ");
                task.setQuestionCount(sc.nextInt());
                sc.nextLine();

                lessions.add(task);

            }

        }

        for (Lession lession : lessions) {
            duration += lession.duration();
        }

        System.out.printf("\nDURAÇÃO TOTAL DO CURSO = %d segundos", duration);

        sc.close();

    }

}
