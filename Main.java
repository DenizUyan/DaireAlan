import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, a, Alan, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = input.nextDouble();

        System.out.println("Merkez Açı: ");
        a = input.nextDouble();

        Alan = (pi*(r*r)*a)/360;

        System.out.println("Alan= "+ Alan);






    }
}