package src.test.java.students.EREN;

public class Slab02 {
 /*
    # TASK: Google search
#### 1- Open a chrome browser
#### 2- Go to: https://google.com
#### 3- Write "orange" in search box
#### 4- Click google search button
#### 5- Verify title:
#### Expected: Title should start with "orange" word
#### 6-navigate back
#### 7-write banana in search box
#### 8-verify title contains banana.
     */


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Orange");
        Thread.sleep(2000);
        WebElement SearchButton = driver.findElement(By.className("gNO89b"));
        SearchButton.click();


        String expectedTitle = "Orange" ;
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Orange Title Verification has passed");
        }else {
            System.out.println("Orange Title Verification has failed");
            System.out.println("actualTitle= " + actualTitle);
        }

        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.name("q")).sendKeys("banana " + Keys.ENTER);

        String expectedTitle2 = "banana";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Banana title verification has passed");

        }else{
            System.out.println("Banana verification title has failed");
            System.out.println("actual title :" + actualTitle2);
        }



    }
}
