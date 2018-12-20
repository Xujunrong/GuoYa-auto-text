package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;

import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.CharsetString;
import sun.awt.image.ImageWatched;
import sun.security.pkcs11.Secmod;

import javax.swing.*;
import java.sql.Driver;
import java.util.*;

public class TestUI extends BaseUI {
    @Test
    public void testTextInput() {
        driver.get("https://www.taobao.com/");
        WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
        text.clear();
        text.sendKeys("ipad");
        sleep(2);

    }

    @Test
    public void testButton() {
        testTextInput();
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'搜索')]"));
        button.click();
        sleep(2);
    }

    @Test
    public void testLink() {
        //把网址给driver
        driver.get("https://www.taobao.com/");
        //用Xpath定位超链接(link)
        WebElement link = driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
        //给网址加入新行动
        Actions actions = new Actions(driver);
        //按下shift 点击 弹起shift 展现
        actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
        //等待5秒
        sleep(5);


    }

    @Test
    private void textSelect() {
        driver.get("file:///C:/Users/Administrator.LB-201810251211/Documents/WeChat%20Files/xujunrong312576/Files/demo(2).html");
        WebElement select = driver.findElement(By.xpath("//select"));
        //新建新的 Select 赋值给selects
        Select selects = new Select(select);
        //查找字符为香蕉的选项
        selects.selectByVisibleText("香蕉");

        sleep(2);
        selects.selectByIndex(0);
        sleep(2);
        selects.selectByValue("juzi");
        sleep(2);


        String js = "var xpath = \"//input[@type='date']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"2018-12-13\";";

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript(js);
    }

    @Test
    private void navigate() {
        driver.get("https://www.taobao.com/");
        sleep(2);
        driver.get("https://www.jd.com");
        sleep(2);
        driver.navigate().back();
        sleep(2);
        driver.navigate().forward();
        sleep(2);
        driver.navigate().refresh();
        driver.navigate().to("https://www.taobao.com/");
        sleep(2);
    }


    @Test
    private void textTextInput() {
        driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
        WebElement text = driver.findElement(By.xpath("//input[@id='userName']"));
        text.clear();
        text.sendKeys("xujr");
        sleep(2);
        WebElement text1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        text1.clear();
        text1.sendKeys("mmDECG11");
        sleep(2);
        WebElement button = driver.findElement(By.xpath("//input[@id=\"loginBtn\"]"));
        button.click();
        sleep(5);
    }

    @Test
    private void textTextsignUpInput() {
        driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
        WebElement text = driver.findElement(By.xpath("//input[@id='userName']"));
        text.clear();
        text.sendKeys("xurr");
        sleep(2);
        WebElement text1 = driver.findElement(By.xpath("//input[@id=\"realName\"]"));
        text1.clear();
        text1.sendKeys("徐荣荣");
        WebElement text2 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        text2.clear();
        text2.sendKeys("mmDECG11");
        WebElement text3 = driver.findElement(By.xpath("//input[@id=\"password2\"]"));
        text3.clear();
        text3.sendKeys("mmDECG11");
        sleep(2);
        WebElement text4 = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
        text4.clear();
        text4.sendKeys("13659033490");
        sleep(2);
        WebElement text5 = driver.findElement(By.xpath("//input[@id=\"age\"]"));
        text5.clear();
        text5.sendKeys("26");
        sleep(2);
        WebElement text6 = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
        text6.clear();
        text6.sendKeys("1234");
        sleep(2);

        WebElement button = driver.findElement(By.xpath("//input[@value=\"注册\"]"));
        button.click();
        sleep(5);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        sleep(2);
    }

    @Test
    private void windows() {
        driver.get("https://www.taobao.com/");
        sleep(2);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/div/ul/li[2]/a[1]"));
        sleep(2);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/div/ul/li[2]/a[2]"));
        sleep(2);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/div/ul/li[2]/a[3]"));
        sleep(2);
        Set<String> handles = driver.getWindowHandles();
        for (String h : handles) {
            driver.switchTo().window(h);
            sleep(5);
            if (driver.getTitle().contains("箱包")) ;
            break;


        }

    }

    @Test
    private void testContainer() {
        //数组
        //声明
        String[] strings = {"111", "222", " 333"};
        //String[] String1=new String[5];
        //取用
        strings[0] = "555";
        System.out.println(strings[0]);


        String[][] str2 = {{"1", "2", "3", "4"}, {"11", "22", "33", "44"}, {"111", "222", "333", "444"}};
        String[][] str21 = new String[3][4];
        System.out.println(str2[1][2]);


//不定长度
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(1, "444");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        Map<String, String> map = new HashMap<String, String>();
        map.put("姓名", "徐俊荣");
        map.put("性别", "男");
        map.put("年龄", "25");
        System.out.println(map.get("姓名"));

        map.remove("姓名");
        System.out.println(map.get("姓名"));

        Set<String> set = new HashSet<>();
        set.add("1111");
        set.add("1111");
        for (String s : set) {
            System.out.println(s);
        }


    }

    @Test
    public void testIframe() {
        //打开网址
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        //定位 打开 面试查询
        driver.findElement(By.xpath("//a[contains(text(),'面试查询')]")).click();
        sleep(3);
        //申明 iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        //
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[contains(text(),'查询')]")).click();
        sleep(3);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();
        sleep(3);


    }

    @Test
    private void testFor() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }


        for (int i : arr) {
            System.out.println(i);
        }
    }
    @Test
    private static void chenFa(){
        //多少列
        for (int i=1;i<=9;i++){
            //多少行
        for (int j=1;j<=i;j++){
      //j代表行的值*i代表列的值=i*j代表(行×列)的值,加制表符\t
            System.out.print(j+"*"+i+"="+i*j+"\t");}
        //换行打印
        System.out.println();}



    }
@Test
    private static void zhiFuBao(){
        int yuE=500;
        int yuEeBao=5000;
        int yinHangKa=5000000;
        int buyHouse=1000000;
        if (buyHouse<=yuE){
            System.out.println("余额支付成功"+buyHouse);
        }else if(buyHouse<=yuEeBao){
            System.out.println("余额宝支付成功"+buyHouse);
        }else if(buyHouse<=yinHangKa){
            System.out.println("银行卡支付成功"+buyHouse);
        }else{
        System.out.println("支付失败请充值");
    }

}
@Test
    private void testDubble(){
        int[] arr={17,21,14,32,8,19};

        for (int i=arr.length-1;i>=1;i--){
            for (int j=0;j<=i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;

                }
            }

            }for(int i:arr){
         System.out.println(i+"\t");}
}
@Test
    private void testassert(){
        driver.get("https://www.taobao.com");
        sleep(2);
        driver.findElement(By.xpath("//a[contains(test(),\"亲，请登录\")]")).click();
        sleep(2);
        driver.findElement(By.xpath("//i[@id=\"J_Quick2Static\"]")).click();
        sleep(2);

        WebElement username=driver.findElement(By.xpath("//input[@id=\"TPL_username_1\"]"));
        sleep(2);
        username.clear();
        username.sendKeys("18611635061");
        WebElement password=driver.findElement(By.xpath("//input[@id=\"TPL_password_1\"]"));
        password.clear();
        password.sendKeys("XUmmteresa");
        driver.findElement(By.xpath("//button[@id=\"J_SubmitStatic\"]")).click();
        //actual实际 ,pagesource网页源代码 ,assert断言
        boolean actual =driver.getPageSource().contains("我的淘宝");
         Assert.assertEquals(actual,true);


}
}












