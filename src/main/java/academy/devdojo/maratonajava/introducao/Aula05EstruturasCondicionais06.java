package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia){
           /* case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
             case 3:
                System.out.println("Dia útil");
                break;
             case 4:
                System.out.println("Dia útil");
                break;
             case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Fora do intervalo");
                break;*/
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dias úteis");
                break;
            default:
                System.out.println("Fora do intervalo");
        }
    }
}
