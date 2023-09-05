import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int plus(String ss[]){
        int i = Integer.parseInt(ss[0]) + Integer.parseInt(ss[1]);
        return i;
    }
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        String s = vvod.nextLine();
        String[] f = s.split(" ");
        System.out.println(plus(f));


        System.out.println("test123");
        System.out.println("test");
    }
}