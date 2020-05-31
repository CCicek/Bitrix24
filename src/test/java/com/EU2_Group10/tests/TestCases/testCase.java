package com.EU2_Group10.tests.TestCases;

import com.EU2_Group10.pages.ActivityStream;
import com.EU2_Group10.pages.LoginPage;
import com.EU2_Group10.tests.TestBase;
import org.testng.annotations.Test;

public class testCase extends TestBase {


    @Test
    public void tc1() {
        new LoginPage().loginAsHR();
        ActivityStream activityStream =new ActivityStream();
        activityStream.sendMessage.click();
    }



}
