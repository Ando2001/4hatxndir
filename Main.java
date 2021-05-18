import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Andznakan andznakan = new Andznakan();
        Andznakan andznakan1 = new Andznakan("Aram", "Gregorian", 21, "arakan", "Hay");
        Andznakan andznakan2 = new Andznakan("Karen","Karapetyan",45);
        Scanner scanner = new Scanner(System.in);
        int hamar = scanner.nextInt();
        switch (hamar){
            case 0:
                andznakan.display();
            case 1:
                andznakan1.display();
            case 2:
                andznakan2.display();
            default:
                System.out.println("Aydpisi tvyalnerov mard goyutyun chuni");
        }
    }
}
