public class Main {
    public static void main(String[] args) {

        System.out.println( " Задача №1 ");
        int clientOs = 1;
        if ( clientOs == 0){
            System.out.println( " установи версию ПО для IOS по ссылке");
        } else if ( clientOs == 1) {
            System.out.println( " установи верисю ПО для Android по ссылке");
        };
        System.out.println( " Задача 2 ");
        int clientDeviceYear = 2016;
        if ( clientDeviceYear < 2015 && clientOs == 0){
            System.out.println( " Установите облегченную версию ПО IOS  по ссылке ");
        } else if ( clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println( " Позже вам все равно необходимо будет установить облегченную версию для IOS" );
        }
        if ( clientDeviceYear < 2015 && clientOs == 1){
            System.out.println( " Установи облегченную версию для Android по ссылке ");
        } else if ( clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println( " Позже вам все равно необходимо будет установить облегченную версию для Android ");
        }else{
            System.out.println( " неверно задана ОС ");
        };


        System.out.println(  " задача №3 ");
        int year = 2021;
        int a = year % 4;
        int c = year % 400;
        if ( year < 1584){
            System.out.println( " до 1584 года понятия высокосный год не существовало");
        } else if ((year >= 1584 && a == 0) || (year >= 1584 && c == 0)) {
            System.out.println( year + " год является высокосным ");
        }else {
            System.out.println( year + " год не является высокосным ");
        };
        System.out.println(  " Задача №4 ");
        int deliveryDistance = 121;
        int days = 1;
        if ( deliveryDistance <= 20){
            System.out.println( " Доставка будет сегодня в течении суток");
        }
        if ( deliveryDistance > 20 && deliveryDistance < 60 ){
            int days1 = 2;
            System.out.println( " Доставка будет в течении " +days1 + " дней ");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100){
            int days2 = 3;
            System.out.println( " доставка будет в течении " + days2 + " дней");
        }
        if (deliveryDistance >100){
            days = - 1;
        }
        if (days == -1){
            System.out.println( " Доставки нет ");
        };

        System.out.println( " Задание 5");
        int monthNumber = 14;
        switch ( monthNumber) {
            case 1, 2, 12:
                System.out.println( " Зима ");
                break;
            case 3,4,5:
                System.out.println( " Весна ");
                break;
            case 6,7,8:
                System.out.println( " Лето ");
                break;
            case 9,10,11:
                System.out.println( " Осень ");
                break;
            default:
                System.out.println( " задан не верный месяц");
        }

    }
}