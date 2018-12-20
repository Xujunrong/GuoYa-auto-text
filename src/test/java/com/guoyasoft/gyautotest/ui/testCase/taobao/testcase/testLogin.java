//package com.guoyasoft.gyautotest.ui.testCase.taobao.testcase;
//
//import com.guoyasoft.gyautotest.ui.common.BaseUI;
//import com.guoyasoft.gyautotest.ui.testCase.taobao.pages.SouSuo;
//import com.guoyasoft.gyautotest.ui.testCase.taobao.pages.TaoBaoHome;
//import com.guoyasoft.gyautotest.ui.testCase.taobao.pages.TaoBaologin;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.awt.print.PageFormat;
////新建一个类写业务代码
//public class testLogin extends BaseUI{
//@Test
//public void testLogin(){
//    driver.get ("https://www.taobao.com/");
//    //初始化网页
//    TaoBaoHome taoBaoHome= PageFactory.initElements(driver,TaoBaoHome.class);
//    //通过PageFactory取用封装的方法
//    taoBaoHome.clickLoginLink();
//    TaoBaologin taoBaologin=PageFactory.initElements(driver,TaoBaologin.class);
//    taoBaologin.clickLoginIcon();
//    taoBaologin.sendKeysLoginUserName("18601635061");
//    taoBaologin.sendKeysPassword("aaaaaaa");
//    taoBaologin.clickButton();
//    //getPageSource搜索网页   包含"我的淘宝"
//    boolean actual =driver.getPageSource().contains("我的淘宝");
//    //testng做判断   Assert断言
//    Assert.assertEquals(actual,true);
//}
//}
//@Test
//   public void suoSuo(){
//    driver.get("https://www.taobao.com/");
//    TaoBaoHome taoBaoHome=PageFactory.initElements(driver,TaoBaoHome.class);
//    TaoBaoHome sendKeyssearchInput("纪念币");
//    TaoBaoHome.click().searchButton;
//    SouSuo SouSuo=PageFactory.initElements(driver, SouSuo.class);


//}