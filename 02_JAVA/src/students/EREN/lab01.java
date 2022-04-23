package src.students.EREN;

public class lab01 {

    //Lab 01 -  (String) Find the unique
    //    Write a return  method that can find the unique characters from the String
    //
    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


    public static void main(String[] args) {

        String ogun = "AAABBBCCCDEF";

        char eren ;

        for (int i = 0; i<ogun.length(); i++){
            eren = ogun.charAt(i);
            if (ogun.indexOf(eren) == ogun.lastIndexOf(eren)){
                System.out.println(eren);

            }
        }




    }
}
