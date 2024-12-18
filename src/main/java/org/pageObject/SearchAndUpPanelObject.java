package org.pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SearchAndUpPanelObject extends BasePageObject{
    public final SelenideElement generalSearchField = $("#search");
    public final SelenideElement generalSearchButton =$(".action search");
    public final SelenideElement cardButton =$(byXpath("//*[@class='action showcart']//*[@class='mbi mbi-bag2']"));
    public final SelenideElement countNumberOnCart =$(byXpath("//*[@class='counter qty']//*[@class='counter-number']/text()"));

    public void  addGoodsByCount(int count)
    {

        final SelenideElement addGoodsByNumber = $(byXpath("//*[@class='search results']/*[@class='products wrapper grid products-grid']/ol/*["+count+"]//*[@title='Add to Cart']"));
        // there need to check item name, but I don`t to have enough time;
        addGoodsByNumber.click();
    }

    public void AddSomeItemsInToCardBySearchOrder(int countItems)
    {
        for(int i= 1; i<= countItems; i++)
        {
            addGoodsByCount(i);
        }
    }
}
