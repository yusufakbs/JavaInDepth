package enums;

public class Test {
    public static void main(String[] args) {
        int day = Days.TUESDAY;
        printDay(day);

        printEnumDay(Day.WEDNESDAY);

    }
    private static void printEnumDay(Day day){

        System.out.println("Gün sayısı:" + Day.values().length);

        switch (day){
            case MONDAY :
                System.out.println("Pazartesi");
                break;
            case TUESDAY :
                System.out.println("Salı");
                break;
            case WEDNESDAY :
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Tanımsız gün!");
        }
    }
    private static void printDay(int day){
        System.out.println("Gün sayısı: " + day);
        switch (day){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Tanımsız gün!");
        }
    }
}
