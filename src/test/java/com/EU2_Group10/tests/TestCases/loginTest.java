package com.EU2_Group10.tests.TestCases;

import com.EU2_Group10.pages.LoginPage;
import com.EU2_Group10.tests.TestBase;
import org.testng.annotations.Test;

public class loginTest extends TestBase {

    @Test
    public void login1(){
        new LoginPage().loginAsHelpDesk();
    }
    @Test
    public void login2(){
        new LoginPage().loginAsHR();
    }
    @Test
    public void login3(){
        new LoginPage().loginAsHelpDesk();
    }


}
