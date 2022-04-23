package src.students.EREN;

public class lab08 {

    public static void main(String[] args) {

        //    Write a return method that returns the
        //Fibonacci of any given number


        int given = 8;

        int previousNum = 0 ;

        int nextNum = 1 ;

        int i = 1 ;

        while (i <= given){
            System.out.print(previousNum + " " );
            int sum = previousNum + nextNum ;
            previousNum = nextNum ;
            nextNum = sum ;
            i++;
        }


    }
}
