package src.test.java.students.EREN;

public class Slab01 {

    /*
    ##Task 1
#### Go to https://www.etsy.com/
#### Maximize window
#### title doesnt contains "Smile"
#### Verify Current Url

##Task 2
#### Go to https://www.amazon.com/
#### Verify title
#### Verify Current Url
#### Navigate Back
#### Refresh
#### Quit browser
     */
    WebDriver driver;

    @BeforeMethod

    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();}

    @Test
    public void TC_1(){
        driver.get("https://www.etsy.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Smile";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("title contains Smile");
        }else {
            System.out.println("not contains smile");
        }


        String Url = "https://www.etsy.com/";


        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url);
    }

    @Test
    public void TC_2(){
        driver.get("https://www.amazon.com/");

        String Title = driver.getTitle();
        System.out.println(Title);

        String titleVerify = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(Title,titleVerify);

        String url = "https://www.amazon.com/";
        Assert.assertEquals(url,"https://www.amazon.com/");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();


    }






    }

