import java.text.Format;

public class Main {
    public static void printYear (int k) {
        if (k % 4 == 0 && k % 100 != 0 || k % 400 == 0) {
            System.out.println(k + " год является високосным");
        } else {
            System.out.println(k + " год не является високосным");
        }
    }

    public static void instalApp(int DeviceYear, int OS) {
        if (DeviceYear >= 2015) {
            System.out.println("Установите приложение  для");
            if (OS == 0) {
                System.out.println("Android по ссылке");
            } else {
                System.out.println("iOS по ссылке");
            }
        } else if (DeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для");
            if (OS == 0) {
                System.out.println("Android по ссылке");
            } else {
                System.out.println("iOS по ссылке");
            }
        }

    }
    public static int calculatingDeliveryTime (int a) {
        double days = 1;
        int interval = 40;
        int startInterval = 20;
        int al = 1;
        if (a <= 20) {
            days=days;
        }else {
            days = (double)(a-startInterval)/interval;
            al = (int) Math.ceil(days)+1;
        }
        return al;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

         //task01//
        int year = 21156;
        printYear(year);

        //task02//

        int clientDeviceYear = 2014;
        byte clientOS1 = 0;
        // clientOS(Android)=0; clientOS(IOS)=1//
        instalApp(clientDeviceYear,clientOS1);

        //task03//

        int deliveryDistance = 21;
        int result = calculatingDeliveryTime(deliveryDistance);

        System.out.println("Для доставки на расстояне "+deliveryDistance+" км понадобиться дней: " + result);










    }
}