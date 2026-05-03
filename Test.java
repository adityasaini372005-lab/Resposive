// Finally 

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block ");
            int data =25/0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        }
        finally{
            System.out.println("finally block always executed");
        }
        System.out.println("Rest of code is running");
    }
}
