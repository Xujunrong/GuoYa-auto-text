package com.guoyasoft.gyautotest.ui.testCase.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaoBaoHome extends BaseUI {
    @FindBy(xpath = "//a[contains(text(),'请登录')]")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@id='q']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[contains(text(),'搜索')]")
    private WebElement searchButton;

    public void search(String text){
        sendKeys(searchInput,text);
        click(searchButton);

    }
    public  void clickLoginLink(){
        click(loginLink);
    }
    public void clickSearchButton(){
        click(searchButton);
    }
}
