package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.RadioButtonPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RadioButtonsTest {
    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    public void radioButtonTest() {
        //TC #1:radio buttons
        //1.GO TO: http://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");

        //2. Confirm radio button #Blue is selected by default
        assertTrue(radioButtonPage.blueRadioButton.isSelected(), "blue button is selected");

        //3. Confirm radio button #Football is NOT selected by default
        assertTrue(!radioButtonPage.footballButton.isSelected(), "football button is selected");

        //4. Click radio button #Football to select it.
        radioButtonPage.footballButton.click();

        //5. Verify radio button #Football is selected.
        assertTrue(radioButtonPage.footballButton.isSelected(), "football button is not selected");

        //8. Click radio button #Red to select it.
        radioButtonPage.redButton.click();

        //6. Verify radio button #Red is selected.
        assertTrue(radioButtonPage.redButton.isSelected(), "red button is not selected");

        //6. Verify radio button #Blue is not selected.
        assertTrue(!radioButtonPage.blueRadioButton.isSelected(), "blue button is selected");
    }
}
