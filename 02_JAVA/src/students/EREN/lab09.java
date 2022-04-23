package src.students.EREN;

public class lab09 {

    //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
    //        Write a java operation to remove all the names named hello

    public static void main(String[] args) {

        String names = "Amed, hello, Eric , Mike  ";


        System.out.println("Before: " + names);

        names = names.replaceAll("hello","");

        System.out.println("After : " + names);



    }
}
