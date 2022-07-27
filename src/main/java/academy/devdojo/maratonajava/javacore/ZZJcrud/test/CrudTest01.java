package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.sql.SQLException;
import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int op;
        while(true){
            menu();
          op =   Integer.parseInt(SCANNER.nextLine());
            ProducerService.buildMenu(op);
            if(op == 0) break;
            switch(op){
                case 1-> {
                    producerMenu();
                    op = Integer.parseInt((SCANNER.nextLine());
                    ProducerService.menu(op));
                }
                    case 2->{
                        animeMenu();
                        op = Integer.parseInt((SCANNER.nextLine());
                        AnimeService.menu(op));

                }
            }
        }


    }

    private static void menu(){
        System.out.println("Escolha a operação");
        System.out.println("1.Producer");
        System.out.println("2.Anime");
        System.out.println("0.exit");
    }
private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1.Search for producer");
        System.out.println("2.Delete for producer");
        System.out.println("3.Save for producer");
        System.out.println("4. Update for producer");
    System.out.println("9.Go back");
    }

    private static void animeMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1.Search for anime");
        System.out.println("2.Delete for anime");
        System.out.println("3.Save for anime");
        System.out.println("4. Update for anime");
        System.out.println("9.Go back");
    }
}
