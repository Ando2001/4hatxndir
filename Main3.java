import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int koxm = scanner.nextInt();
        int koxm1 = scanner.nextInt();
        int koxm2 = scanner.nextInt();
        Tringle tringle = new Tringle(koxm,koxm1,koxm2);
        tringle.display();
    }
}
