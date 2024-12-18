package org.pageObject;
import com.codeborne.selenide.*;
import org.junit.Before;

public class BasePageObject //here is the parent class, with authorization, loggers, etc.
{
    @Before
    public void setup() {Configuration.browser = "chrome";}
}
