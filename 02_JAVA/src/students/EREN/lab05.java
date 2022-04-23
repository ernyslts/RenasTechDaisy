package src.students.EREN;

public class lab05 {

    //    Write a method that can return
    //the sum of the digits in a string

    public static void main(String[] args) {

        String str = "GA1l90A5TA";

        char arr [] = str.toCharArray();
        System.out.println(arr);
        int sum = 0 ;
        for (int i = 0 ; i<arr.length ; i++){

            if (Character.isDigit(arr[i])) {
                System.out.println(arr[i]);
                int a = Integer.parseInt(String.valueOf(arr[i]));
                sum = sum + a;
            }


        }


    }
}
