import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Ans;


        int A = 0;
        int B = 100;
        int C;




        System.out.println("Придумайте число от 1 до 100, а я попытаюсь угадать его \n Отвечайте Y(да) и N(нет) ");
        while (B - A > 1) {
            C = (A + B) / 2;
            System.out.println("Ваше число больше " + C + " ?");

            Ans = scan.nextLine();

            if ("Y".equals(Ans)) {
                A = C;}
            else if ("N".equals(Ans)) {
                B = C;}
            else {
                System.out.println("Введите только Y или N!");}
        }
        System.out.println("Ваше число: " + (A + 1) + "?");
        Ans = scan.nextLine();
        while ( !("Y".equals(Ans) || "N".equals(Ans)) )
        {
            System.out.println("Введите только Y или N!");
            Ans = scan.nextLine();
        }
        if ("Y".equals(Ans))
        {System.out.println("Победа");}
        else if ("N".equals(Ans))
        {System.out.println("ВЫ МЕНЯ ОБМАНУЛИ ГДЕ ТО!");}
    }
}
