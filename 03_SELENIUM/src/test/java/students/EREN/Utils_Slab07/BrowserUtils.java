package src.test.java.students.EREN.Utils_Slab07;

public class BrowserUtils {

    public static void wait (int second) throws InterruptedException {

        try {
            Thread.sleep(1000*second);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
