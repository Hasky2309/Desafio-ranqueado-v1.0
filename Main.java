import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println("Olá herói! Digite seu nome: ");
        String nickhero = ss.nextLine();

        System.out.println("Digite seu nível");
        int level = ss.nextInt();

        String mensagembase = "O Herói de nome **" + nickhero + "** está no nível de **";

        if (level <= 1000) {
            System.out.println(mensagembase + "Ferro**!");
        }
        else if(level >= 1001 || level == 2000 ){
            System.out.println(mensagembase + "Bronze**!");
        }
        else if(level >= 2001 || level == 5000) {
            System.out.println(mensagembase + "Prata**!");
        }
        else if(level >= 5001 || level == 7000) {
            System.out.println(mensagembase + "Ouro**!");
        }
        else if(level >= 7001 || level == 8000) {
            System.out.println(mensagembase + "Platina**!");
        }
        else if(level >= 8001 || level == 9000) {
            System.out.println(mensagembase + "Ascendente**!");
        }
        else if(level >= 9001 || level == 10000) {
            System.out.println(mensagembase + "Imortal**!");
        }
        else if(level >= 10001) {
            System.out.println(mensagembase + "Radiante**!");
        }


    }
}