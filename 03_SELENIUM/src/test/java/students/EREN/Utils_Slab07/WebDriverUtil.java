package src.test.java.students.EREN.Utils_Slab07;

public class WebDriverUtil {
    //Create a util that takes browser type and create connection between browser and

    public static WebDriver getDriver(String browser){
        if (browser.equalsIgnoreCase("chrome")){

            // Chrome browser needs to be set up

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){

            // Set Up for Firefox
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else {
            System.out.println("Browser is not exist!!");
            System.out.println("Check browser name");
            System.out.println("browser = " +browser);
            return null;
        }
    }
}
