//package Dushi;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
////
////https://www.verizonwireless.com/tablets/ page, Filter by brand -
//// Apple and Filter by 2 year contract price, select a Apple New iPad® mini.
//// - Get Count of review for New iPad Mini from GW - Get Price from GW
////        - Select the iPad and go to PDP page
////        - Verify that iPad name is same as entered on GW as displaying on PDP
////        - - Select Color as GOLD, size as 256 GB, and payment options - 2 year contract. - Validate pricing
////        from GW to PDP - Add to cart "Continue" and enter zip code -08854 - pick as new customer
//
//public class HomeWork06Selenium1 {
//    private static WebDriver driver;
//    public static void main(String[] args){
//        try {
//            CharSequence reviewTextApple= "Review";
//            CharSequence ipadTitle = "Apple New iPad® mini";
//            String appleBrand = "Apple";
//            String twoYearContract = "2-Year Contract";
//
//
//            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
//            System.setProperty("webdriver.log.driver", "ERROR");
//
//            driver = new ChromeDriver();
//
//            String baseURL = "https://www.verizonwireless.com/tablets";
//
//            driver.get(baseURL);
//            driver.manage().window().maximize();
//
//
//            String xpBrandButton  = "//input[contains(@value,'Apple')][0]";
//            String xpFilterButton = "//button[@aria-controls='content-filters']";
//            String xpFilterBy2YearContract = "//option[@value='.two-year-price']";
//            String xpAppleMini = "//div[contains(@class,'tile-content')][5]";
//            String xpReviewAppleMini = "//span[contains(@class,'padLeft6')][0]";
//            String xpAppleMiniHeaderH1 = "//h1[contains(@class,'fontDSStd-75Bd')]";
//            String xp256GBSize = "//p[contains(@class,'fontSize_12')][1]";
//            String xpPrice ="//div[contains(@class,'col-sm-12')][5]";
//            String xpContinueButton = "//button[@id='ATC-Btn']";
//            String xpGoldColorSelected = "//div[contains(@class,'positionRelative')][9]";
//
//
//            String strFilterButton =driver.findElement(By.xpath(xpFilterButton)).click();
//
//
//            System.out.println("Filter by button :" + strFilterButton);
//
//            String strBrandButton   = driver.findElement(By.xpath(xpBrandButton)).click();
//
//
//
//            String xpNewBrandClick = Functions.xpTranslate(xpBrandButton, strBrandButton);
//            Functions.buttonClick(xpNewBrandClick);
//
//            String strFilterBy2YearContract = driver.findElement(By.xpath(xpBrandButton)).getText();
//
//            String xpFilterClick = Functions.xpTranslate(xpFilterBy2YearContract, strFilterBy2YearContract);
//            Functions.buttonClick(xpFilterClick);
//
//            if(strBrandButton.contains(appleBrand) && strFilterBy2YearContract.contains(twoYearContract)){
//                System.out.println("Brand Button  :" + strBrandButton + ",2 Year Contract " + strFilterBy2YearContract);;
//            }
//            else if((strBrandButton.contains(appleBrand) || !strFilterBy2YearContract.contains(twoYearContract))){
//                System.out.println("2 Year Contract not found");
//            }
//            else if((!strBrandButton.contains(appleBrand) || strFilterBy2YearContract.contains(twoYearContract))){
//                System.out.println("Brand not found");
//            }
//            else{
//                System.out.println("Brand and 2 years contract not found");
//            }
//
//
//            String stAppleMini   = driver.findElement(By.xpath(xpAppleMini)).click();
//
//
//            String stReviewAppleMini = driver.findElement(By.xpath(xpReviewAppleMini)).getText();
//
//            String xpAppleMiniClick = Functions.xpTranslate(xpFilterBy2YearContract, strFilterBy2YearContract);
//            Functions.buttonClick(xpAppleMiniClick);
//
//
//
//            if(stReviewAppleMini.contains(reviewTextApple)){
//                System.out.println("Count:" + stReviewAppleMini);
//            }
//            else{
//                System.out.println("Did not found review");
//            }
//
//            String xpPriceAppleMini = "//div[@class='NHaasTX55Rg'][2]";
//            String stPriceAppleMini = driver.findElement(By.xpath(xpPriceAppleMini)).getText();
//
//            if(xpPriceAppleMini == "$679.99"){
//                System.out.println("Price for Apple Mini Pad " + stPriceAppleMini);
//            }
//            else{
//                System.out.println("Price not found");
//            }
//
//
//
//
//            String strAppleMiniHeaderH1 = driver.findElement(By.xpath(xpAppleMiniHeaderH1)).getText();
//
//            String xpAppleMiniTitleSpan = "//a[contains(@aria-label,'Apple New iPad mini')]";
//            String strAppleMiniTitleSpan = driver.findElement(By.xpath(xpAppleMiniTitleSpan)).getText();
//
//
//            if(xpAppleMiniHeaderH1.contains(ipadTitle) == xpAppleMiniTitleSpan.contains(ipadTitle)){
//                System.out.println("Title matching from GW and Single Page");
//            }
//            else{
//                System.out.println("Not matching");
//            }
//
//
//            String strGoldColorSelected = driver.findElement(By.xpath(xpGoldColorSelected)).click();
//
//
//
//
//
//            String str256GBSize = driver.findElement(By.xpath(xp256GBSize)).click();
//            String strPrice  = driver.findElement(By.xpath(xpPrice)).click();
//            String strContinueButton = driver.findElement(By.xpath(xpContinueButton)).click();
//
//
//            String xp256GBSizeClick = Functions.xpTranslate(xp256GBSize, str256GBSize);
//            Functions.buttonClick(xp256GBSizeClick);
//
//            String xpPriceClick = Functions.xpTranslate(xpPrice, strPrice);
//            Functions.buttonClick(xpPriceClick);
//
//            String xpContinueButtonClick = Functions.xpTranslate(xpContinueButton, strContinueButton);
//            Functions.buttonClick(xpContinueButtonClick);
//
//
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
