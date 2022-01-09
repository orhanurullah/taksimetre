import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double katSayı = 2.20;
        System.out.println("Lütfen Kaç Kilometre Gittiğinizi Bildirin : ");
        int km = scanner.nextInt();
        double tutar = 10 + (km * katSayı);
        System.out.println("Gittiğiniz " + km +
                " km için ödemeniz gereken tutar " + (tutar < 20 ? 20:tutar) + " TL'dir.");

    }
}
