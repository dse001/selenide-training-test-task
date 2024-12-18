package org.pageObject;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class CheckoutCartObject extends BasePageObject {

    public final ElementsCollection cardListGoodsElement = $$(byXpath("//*[@id='shopping-cart-table']//*[@class='cart item']"));
    public final ElementsCollection checkOutButtonOnCardPage = $$(byXpath("//*[@class='action primary checkout']"));
}
