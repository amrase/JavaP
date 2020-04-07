//package Dushi;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import utilities.Functions;
//import utilities.Results;
//
//public class Wave3Selenium1 {
//    private static WebDriver driver;
//
//    // F6 - Line by Line
//// F8 - One Break point to another
//// F11 - Debug Mode
//// Double click to add debug point
//    public static void main(String[] args) {
//        try {
//            String xpHeader = "//h1[contains(@class,'heading')]"; // Header of the page
//            String xpSearchInputBox = "//input[@id='searchBar'] "; // Search Bar
//            String xpSearchIcon = "//div[contains(@class,'search-icon')]  "; // search icon to click
//            String xpSearchValue = "//input[@id='search']";
//            String xpListStores = "//div[contains(@class,'swiper-slide')]"; // list of all stores
//            String xpStoreNames = ".//p[contains(@class,'bold')] "; // Store name
//            String xpPhoneNumber = ".//a"; // Phone number for store
//
//            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
//            System.setProperty("webdriver.log.driver", "ERROR");
//
//            driver = new ChromeDriver();
//            String baseURL = "https://www.verizonwireless.com/tablets";
//
//            driver.get(baseURL);
//            driver.manage().window().maximize();
//
//            String strPrice = "Price $500.00 at monthly rate";
//            String strNewPrice = Functions.getPrice(strPrice);
//
//            String strDeviceName = "Apple iPhone® 11 Pro";
//            String strDeviceName1 = "Appe Iphone 11 pro";
//            Functions.textCompare(strDeviceName, strDeviceName1);
//            Results.pass(strDeviceName1, true);
//
//// div[@class='tile-content' and .//a[@aria-label='Apple iPhone 11 Pro']]
//            String xpChanged = "//div[@class='tile-content' and .//a[PLACEHOLDER]";
//// String xpDeviceN1 = "//div[@class='tile-content' and .//a[PLACEHOLDER]"; // aria-label xpath
//            System.out.println(xpChanged); // print out xpath
//            String xpDevice1Translation = Functions.xpTranslate(xpChanged, "aria-label", strDeviceName);
//
//// div[@class='tile-content' and .//span[text()='iPhone® 11 Pro']]
//            String xpDeviceN2 = "//div[@class='tile-content' and .//span[PLACEHOLDER]"; //
//            String xpDevice2Translation = Functions.xpTranslate(xpDeviceN2, strDeviceName);
//
//// xpTranslate
//            String strBrandFromPOrtal = "Apple"; // GetTestData.getData("F_BRANDNAME");
//            String xpBrandClick = "//ul[@id='Brand']//a[PLACEHOLDER]  "; // to select brand
//
//            String xpNewBrandClick = Functions.xpTranslate(xpBrandClick, strBrandFromPOrtal);
//            Functions.buttonClick(xpNewBrandClick);
//
//            String strDeviceNameFromPortal = "Apple iPhone 11 Pro";
//            String xpDeviceParent1 = "// div[@class='tile-content' and .//a[@aria-label='Apple iPhone 11 Pro']]";
//            String xpDeviceParent = "// div[@class='tile-content' and .//a[PLACEHOLDER]";
//            Functions.xpTranslate(xpDeviceParent, "aria-label", strDeviceNameFromPortal);
//
//            String strLstDevices = "//div[@class='tile-content'] ";//Testing
//// String strDeviceName = ".//div[@class='NHaasTX75Bd']";//Testing
//            String strDevicePrice = ".//div[@class='NHaasTX55Rg'] ";//Testing
//
//            List<WebElement> lstDevices = driver.findElements(By.xpath(strLstDevices));
//            for (WebElement weDevice : lstDevices) {
//                String strName = weDevice.findElement(By.xpath(strDeviceName)).getText();
//                System.out.println(strName);
//            }
//            String strDevice = driver.findElement(By.xpath(
//                    "//div[@class='tile-content' and .//span[text()='Galaxy Tab S5e']]//a[contains(@aria-label,'Galaxy')]"))
//                    .getText();
//            System.out.println();
//            String strExpectedHeader = "Find a Verizon store.";
//            String strActualHeader = driver.findElement(By.xpath(xpHeader)).getText(); // Fetching header of the page
//            System.out.println("Header of the page is : " + strActualHeader); // Log
//
//            if (strActualHeader.equals(strExpectedHeader)) { // Match Actual vs Expected
//                System.out.println("Both header are matched. your test case is passed"); // log
//            } else {
//                System.out.println("Header's are not matching"); // log
//            }
//
//            String strZipCode = "07067";
//// driver.findElement(By.id("searchBar")).sendKeys(strZipCode);
//            driver.findElement(By.xpath(xpSearchInputBox)).sendKeys(strZipCode);
//            driver.findElement(By.xpath(xpSearchIcon)).click();
//            Thread.sleep(4000);
//
//            String strActualZipCode = driver.findElement(By.xpath(xpSearchValue)).getAttribute("value");
//            if (strZipCode == strActualZipCode) {
//                System.out.println("Expected and Actual zip code has been match & value is : " + strActualZipCode);
//            } else {
//                System.out.println("ZipCode's didn't match");
//            }
//
//            List<WebElement> lstStore = driver.findElements(By.xpath(xpListStores)); // to create a list of stores
//            int intTotalStores = lstStore.size(); // total number of store
//            System.out.println("Total number of stores : " + intTotalStores);
//
//            for (int i = 0; i < lstStore.size(); i++) {
//
//            }
//
//            for (WebElement weStore : lstStore) {
//                String strStoreName = weStore.findElement(By.xpath(xpStoreNames)).getText(); // Get store name
//                String strStoreNumber = weStore.findElement(By.xpath(xpPhoneNumber)).getText(); // Get Phone number
//                System.out.println("Store Name is : " + strStoreName + "Phone number is : " + strStoreNumber);
//
//                if (strStoreNumber.contains("732. 326.7500")) {
//                    System.out.println("breaking out..");
//                    break;
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}