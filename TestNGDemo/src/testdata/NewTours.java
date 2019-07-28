package testdata;

import org.testng.annotations.DataProvider;

public class NewTours {
	@DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "mercury", "mercury","oneway"  },
	      new Object[] { "test1", "test2","" },
	    };

	}
}