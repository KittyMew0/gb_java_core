package geekbrains_course.java_core.seminar1.package1;
import java.util.Scanner;

public class writing {    
    public static double enter1number() {        
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        return a;
    }    
    public static String operation() {        
        Scanner sc = new Scanner(System.in);
        String oper = sc.next();
        return oper;
    }    
    public static double enter2numberwhendiv() {        
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        if (b == 0) {
            do {                
                System.out.println("Sorry, I can't let you divide something by zero, write another number");
                b = sc.nextDouble();
            } while (b == 0);
        }        
        return b;
    }        
    public static double enter2number() {        
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        return b;
    }
}
