import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Tworzenie listy i wprowadzanie wartości
        List<Double> listing = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double checking;
        boolean flag = true;
        while (flag){
            System.out.println("Podaj liczby");
            checking = scanner.nextDouble();
            scanner.nextLine();
            //sprawdzanie, czy wartość nie jest ujemna
            if (checking < 0){
                flag = false;
                break;
            }
            listing.add(checking);
        }
        //drukowanie zawartości pierwotnej wersji listy
        System.out.println("Pierwotna wersja");
        System.out.print(listing +" ");
        System.out.println();
        //odwracanie kolejności w liście i drukowanie jej zawartości
        for (int i = listing.size()-1; i < listing.size() && i >=0 ; i--) {
            System.out.print(listing.get(i) + " ");
        }
        System.out.println();
        //obliczanie sumy
        double sum = 0;
        for (int i = 0; i < listing.size(); i++) {
            if (i + 1 >= listing.size()){
                System.out.print(listing.get(i) + " = ");
            }
            else {
                System.out.print(listing.get(i) + " + ");
            }
            sum +=listing.get(i);
        }
        System.out.println(sum);
        //wyświetlanie najmniejszej liczby
        double minValue = listing.get(0);
        for (int i = 0; i < listing.size(); i++) {
            if(minValue < listing.get(i)){
                minValue = listing.get(i);
            }
        }
        System.out.println();
        System.out.println("Najmniejsza wartość");
        System.out.println(minValue);
        //wyswietlanie największej wartośći
        double maxValue = listing.get(0);
        for (int i = 0; i < listing.size(); i++) {
            if(maxValue > listing.get(i)){
                maxValue = listing.get(i);
            }
        }
        System.out.println("Największa wartość");
        System.out.println(maxValue);
    }
}
