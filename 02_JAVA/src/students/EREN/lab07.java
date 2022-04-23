package src.students.EREN;

public class lab07 {

    //    Write a return method that can reverse
    //number and return it as int

    public static void main(String[] args) {

        int number = 85679;

        int reverse = 0;

        while (number>0){
            reverse = reverse* 10 + number%10;
            number = number/10 ;

        }

        System.out.println(reverse);

    }

}
