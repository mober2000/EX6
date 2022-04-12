package LIB.tests;

import LIB.CoreTestCase;
import LIB.ui.AssertElementPresent;
import org.junit.Test;

public class testAssertElementPresents extends CoreTestCase {

    @Test
    public void testAssertElementPresents(){

        AssertElementPresent AssertElementPresent = new AssertElementPresent(driver);

        String word_search = "Russia";

        AssertElementPresent.initSearchInput();
        AssertElementPresent.typeSearchLine(word_search);
        AssertElementPresent.pageListTitle();
        AssertElementPresent.resultSearchLocator();
        AssertElementPresent.assertElement();

    }
}
