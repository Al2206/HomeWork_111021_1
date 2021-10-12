package HomeWork;

public class Task_3 {

 public static void main(String[] args) {
    int a =12;
    int b = 12;
    int c = 19;
    int d = -7;
    if (a > b && a >c && a > d) {
        System.out.println( " Ответ: большее число - " + a );
    } else if (b > c && b > d) {
        System.out.println(" Ответ: большее число - " + b );
    } else if (c > d) {
        System.out.println(" Ответ: большее число - " + c );
    }
 }
}
