package org.pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MiniCardControl extends  BasePageObject{

    public final SelenideElement viewCard = $(byXpath("//*[@class='action primary viewcart']"));
    public final SelenideElement viewCheckOut = $("#top-cart-btn-checkout");
    public final ElementsCollection miniListGoods = $$(byXpath("//*[@id='mini-cart']/li"));
}
