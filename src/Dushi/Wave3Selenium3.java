//package Dushi;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class Wave3Selenium3 {
//    public static void checkStore(){
//        URLCHECK: try{
//            String checkUrl = "https://www.verizonwireless.com/stores";
//
//            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
//            System.setProperty("webdriver.log.driver", "ERROR");
//
//            driver = new ChromeDriver();
//
//            String baseURL = "https://www.verizonwireless.com/stores";
//
//            driver.get(baseURL);
//
//
//            if ( checkUrl == baseURL){
//                driver.manage().window().maximize();
//            }
//            else{
//                System.out.println("URL different");
//                break URLCHECK;
//            }
//
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}
