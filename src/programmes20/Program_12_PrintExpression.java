package programmes20;

/**
 * Write a Java program to compute the specified expressions and print the output
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

public class Program_12_PrintExpression {
    public static void main(String[] args) {
      Program_12_PrintExpression t = new Program_12_PrintExpression();
      t.printExpressions();
    }
//    Printing expression
    public void printExpressions(){
        double a =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }
}
