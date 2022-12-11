public class Main {
    public static void main(String[] args) {
    task4();
    }
    public static void task() {
        char clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");}

        else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else {
            System.out.println("ошибка");
        }
    }
        public  static void task1() {
            int clientOS =10;
            int clientDeviceYear = 2015;
            if (clientOS == 1 && clientDeviceYear <= 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
                else if(clientOS == 0 && clientDeviceYear <= 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            else if(clientOS == 1 && clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
                }
            else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else
                System.out.println("Ошибка");
            }
    public static void task2(){
        int year = 2004;
        //double weightBoneYear1 = year % 100;
        //double weightBoneYear = (year + 4) % 4;
        if ((year + 4) % 4 == 0 && year % 100 != 0){
            System.out.println(year + " Год весокосный");
        }
        else {
            System.out.println("Год не весокостный");
        }
    }
    public static void task3(){

       int deliveryDistance = 95;
       int delivertDays = 1;
       if (deliveryDistance < 20){
           System.out.println("Потребуется дней:" + delivertDays+" + срок доставки");
       }
       else if (deliveryDistance == 20 || deliveryDistance < 60) {
           int deliveryDays2 = delivertDays + 1;
           System.out.println("Потребуется дней:" + deliveryDays2  + " + срок доставки");

       }
       else if (deliveryDistance <= 60 || deliveryDistance <= 100){
           int deliveryDays3 = delivertDays + 2;

           System.out.println("Потребуется дней:" + deliveryDays3 + " + срок доставки");
       }
       else if (deliveryDistance > 100){
           System.out.println("Доставки нет");
       }
    }
    public static void task4(){
        int season = 6;

                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("введите корретный месяц");
        }

    }

}