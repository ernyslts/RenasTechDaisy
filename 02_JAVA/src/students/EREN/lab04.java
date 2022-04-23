package src.students.EREN;

public class lab04 {
    //    String -- Frequency of Characters
    //    Write a return method that can find the frequency of characters
    //
    //    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {

        String str = "AAABBCDD";
        char ch = 'A';
        char cb = 'B';
        char cc = 'C';
        char cd = 'D';

        int frequency = 0 ;
        int a = 0 ;
        int b = 0 ;
        int c = 0 ;

        for (int i = 0 ; i < str.length(); i++){
            if (ch == str.charAt(i)){
                ++frequency;
            } else if (cb == str.charAt(i)){
                ++a;
            }else if (cc==str.charAt(i)){
                ++b;
            }else if (cd == str.charAt(i)){
                ++c;
            }
        }

        System.out.println("Frequency of " + ch + cb + cc+ cd  + " = " + frequency +  a + b + c);


    }
}
