package src.test.java.students.EREN;

import java.util.concurrent.TimeUnit;

public class Slab03 {
      /*
####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selected
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));

        if (!checkBox1.isSelected()){
            System.out.println("Checkbox1 verification has passed");
        }else {
            System.out.println("Checkbox1 verification has failed");
        }if (!checkBox2.isSelected()){
            System.out.println("Checkbox2 verification has passed");
        }else {
            System.out.println("Checkbox2 verification has failed");
        }if (!checkBox3.isSelected()){
            System.out.println("Checkbox3 verification has passed");
        }else {
            System.out.println("Checkbox3 verification has failed");
        }
        Thread.sleep(2000);
        checkBox3.click();

        if (checkBox3.isSelected()){
            System.out.println("Checkbox3 selection verification has passed");
        }else {
            System.out.println("Checkbox3 verification has failed");
        }


    }



}
