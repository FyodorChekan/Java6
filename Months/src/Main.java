import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        switch (index){
            case 1:
                System.out.println(Months.JANUARY.getMonthName());
                break;
            case 2:
                System.out.println(Months.FEBRUARY.getMonthName());
                break;
            case 3:
                System.out.println(Months.MARCH.getMonthName());
                break;
            case 4:
                System.out.println(Months.APRIL.getMonthName());
                break;
            case 5:
                System.out.println(Months.MAY.getMonthName());
                break;
            case 6:
                System.out.println(Months.JUNE.getMonthName());
                break;
            case 7:
                System.out.println(Months.JULY.getMonthName());
                break;
            case 8:
                System.out.println(Months.AUGUST.getMonthName());
                break;
            case 9:
                System.out.println(Months.SEPTEMBER.getMonthName());
                break;
            case 10:
                System.out.println(Months.OCTOBER.getMonthName());
                break;
            case 11:
                System.out.println(Months.NOVEMBER.getMonthName());
                break;
            case 12:
                System.out.println(Months.DECEMBER.getMonthName());
                break;
            default:
                System.out.println("Error! Enter correct value!");

        }
    }
}