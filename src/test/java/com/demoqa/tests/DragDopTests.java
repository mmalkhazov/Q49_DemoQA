package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.interactions.DroppablePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDopTests extends TestBase{

    @BeforeMethod
    public void precondtition(){
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable().hideIframes();
    }

    @Test
    public void actionDragMeTest(){

        new DroppablePage(driver)
                .actionDragMe().verifyDropped("Dropped!");
    }

    @Test
    public void dragAndDropByTest() {
        new DroppablePage(driver).dragAndDropBy(20,20)
                .verifyDropped("Droppe!");
    }
}
