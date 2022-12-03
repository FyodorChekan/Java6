import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Cars> list = Cars.asList();

        Scanner priceScanner = new Scanner(System.in);
        Cars[] carArray = new Cars[5];
        list.toArray(carArray);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if(carArray[i].getPrice() > carArray[j].getPrice()){
                    Cars a = carArray[i];
                    carArray[i]=carArray[j];
                    carArray[j]=a;
                }
            }
        }
        System.out.print("Enter maximum price: ");
        int price = priceScanner.nextInt();
        System.out.println("Your cars: ");
        for (int i = 0; i < 5; i++) {
            if (carArray[i].getPrice() <= price) {
                System.out.println(carArray[i].toString());
            }
        }
    }
}