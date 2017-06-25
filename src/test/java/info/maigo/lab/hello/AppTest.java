package info.maigo.lab.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

  public AppTest(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite( AppTest.class );
  }

  /**
   * getUserInfoURL Test
   */
  public void testGetUserInfoURL() {
    String name = "niwasawa";
    App app = new App(name);
    assertEquals("https://api.github.com/users/niwasawa", app.getUserInfoURL());
  }
}

