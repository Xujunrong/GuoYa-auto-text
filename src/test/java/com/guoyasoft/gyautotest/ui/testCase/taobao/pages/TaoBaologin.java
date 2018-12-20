package com.guoyasoft.gyautotest.ui.testCase.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
//关联 BaseUI
public class TaoBaologin extends BaseUI {
    //FindBY注解把页面元素
    @FindBy(xpath = "//i[@id=\"J_Quick2Static\"]")
    //private私有的权限,把元素赋值到loginIcon
    private WebElement loginIcon;
    @FindBy(xpath = "//input[@id=\"TPL_username_1\"]")
    private WebElement loginUserName;
    @FindBy(xpath = "//input[@id=\"TPL_password_1\"]")
    private WebElement loginPassword;
    @FindBy(xpath = "//input[@id=\"J_SubmitStatic\"]")
    private WebElement loginButton;
//把页面元素操作封装成一个方法
    public void clickLoginIcon(){
        click(loginIcon); }
    public void sendKeysLoginUserName(String userName){
        sendKeys(loginUserName,userName);
    }
    public void sendKeysPassword(String password){
        sendKeys(loginPassword,password);
    }
    public void clickButton(){
        click(loginButton); }




}
