package HomeWork;

public class Task_3 {
    public static void main(String[] args) {
       int a = 12;
       int b = 12;
       int c = 19;
       int d = -7;
        boolean e;
        e= a >= b;// true
        e= a <= b;// true
        e= a >= c;// false
        e= a <= c;// true
        e= a >= d;// true
        e= a <= d;// false
        e= b >= c;// false
        e= b <= c;// true
        e= b >= d;// true
        e= b <= d;// false
        e= c >= d;// true
        e= c <= d;// falce
        System.out.print(" Ответ: " + e);
    }
}
