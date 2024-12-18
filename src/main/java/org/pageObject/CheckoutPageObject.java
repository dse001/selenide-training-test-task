package org.pageObject;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class CheckoutPageObject extends BasePageObject {
    public final ElementsCollection checkOutListGoodsElements = $$(byXpath("//*[@id='checkout']//*[@class='minicart-items']/li"));
}
