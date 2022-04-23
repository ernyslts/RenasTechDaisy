package src.students.EREN;

public class lab02 {

    public static void main(String[] args) {


        int arr[] = {94, 75, 11, 7, 24, 19, 5, -88};

        int max = arr[0];

        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]>max){
                max =  arr[i];
            }
        }


    }
}
