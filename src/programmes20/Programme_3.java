package programmes20;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable
 * 3.2 Declare one instance method
 * 3.3 Declare one static method
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method
 * 3.6 Call both instance and static methods in the Main method and Run the Programme.
 */

public class Programme_3 {
   // 3.1 Declare one instance and one static variable
    String name= "Prime";
    static String surname = "Testing";

//    3.2 Declare one instance method
//    2.4 Call both instance and static variables into both static and instance methods inside print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Programme_3.surname); //using class name static variable is called
    }
//    3.3 Declare one static method.
//    3.4 Call both static and instance variables into both instance and static method into print statement.
    public static void staticMethod(){
        Programme_3 programme3= new Programme_3();
        System.out.println(programme3.name);   //using obj instance variable is called in print statement
        System.out.println(surname);           //directly called static method
    }

//    3.5 Declare the Main method.
//    3.6 Call bothy instance and static methods into the Main method and run the programme.
public static void main(String[] args) {
    Programme_3 programme3= new Programme_3();
    programme3.instanceMethod();
    staticMethod();
}
}
