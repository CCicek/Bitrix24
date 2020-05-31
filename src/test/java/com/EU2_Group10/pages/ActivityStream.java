package com.EU2_Group10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStream extends BasePage {

    @FindBy(css = "span[class=\"feed-add-post-micro-title\"]")
    public WebElement sendMessage;


}
