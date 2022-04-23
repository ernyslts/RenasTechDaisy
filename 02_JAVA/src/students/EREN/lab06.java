package src.students.EREN;

public class lab06 {

    public static void main(String[] args) {
        //    Write a return method that returns the
        // factorial number of any given number

        int a = 5;

        int factorial = 1 ;

        for (int i = 1; i <= a ; i++){
            factorial = factorial*i;
        }

        System.out.println(factorial);

    }
}
