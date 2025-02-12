package src.test.java.students.EREN.Utils_Slab07;

public class DriverUtil {
    private DriverUtil(){

    }

    private static WebDriver driver;
    // we are using encapsulation logic in here by making driver priavate
    //we will need to create getter and setter for driver

    public static WebDriver getDriver(){
        if (driver==null){
            String browser= code.utilities.PropertiesReadingUtil.getProperties("browser");

            switch (browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case"chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
