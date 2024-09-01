package geekbrains_course.java_core.seminar1;
import geekbrains_course.java_core.seminar1.package1.operations;
import geekbrains_course.java_core.seminar1.package1.writing;

public class Main {    
    public static void main(String[] args) {
        System.out.println("Write the number, then a symbol of mathematical operation, and the second number");
        double a, b;        
        String oper;
        a = writing.enter1number();
        oper = writing.operation();        
        if (oper.equals(":") || oper.equals("/")) { 
            b = writing.enter2numberwhendiv();        
        } else {
            b = writing.enter2number();
        }        
        double answer = 0;
        switch(oper) {
            case "+":                answer = operations.sum(a, b);
                break;
            case "-":                answer = operations.sub(a, b);
                break;
            case "*":                answer = operations.multi(a, b);
                break;
            case "x":                answer = operations.multi(a, b);
                break;
            case "õ":                answer = operations.multi(a, b);
                break;
            case ":":                answer = operations.div(a, b);
                break;
            case "/":                answer = operations.div(a, b);
                break;
            default:        
        }
        System.out.println(answer);
    }
}
