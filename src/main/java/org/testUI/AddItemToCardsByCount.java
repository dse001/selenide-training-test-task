package org.testUI;

import junit.framework.Assert;
import org.junit.Test;
import org.pageObject.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddItemToCardsByCount {

    MiniCardControl miniCardControl = new MiniCardControl();
    CheckoutCartObject checkoutCart = new CheckoutCartObject();
    CheckoutPageObject checkoutPage =new  CheckoutPageObject();
    SearchAndUpPanelObject searchAndUpPanel = new SearchAndUpPanelObject();

    @Test
    public void testAddToCardsEndToEnd()
    {
        open("https://plexsupply.com/");
        //if I have more time, I will to make import from json or env var
        searchAndUpPanel.generalSearchField.click();
        searchAndUpPanel.generalSearchField.setValue("x").pressEnter();

        searchAndUpPanel.AddSomeItemsInToCardBySearchOrder(1);
        sleep(20000);//banner scip

        searchAndUpPanel.cardButton.click();
        long miniCardCheck = miniCardControl.miniListGoods.stream().count();
        Assert.assertEquals(1,miniCardCheck);

        miniCardControl.viewCard.click();
        long cardCheck =  checkoutCart.cardListGoodsElement.stream().count();
        Assert.assertEquals(1,cardCheck);

        checkoutCart.checkOutButtonOnCardPage.last().should();
        checkoutCart.checkOutButtonOnCardPage.last().click();

        sleep(5000);
        long checkoutCheck = checkoutPage.checkOutListGoodsElements.stream().count();
        Assert.assertEquals(1,checkoutCheck);
    }
}
