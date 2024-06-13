import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.mine.TestInjector.assertThat;

public class testclass {

  @Test
  public void TestStringStartsWithDefault() {
    assertThat("Hello").startsWith("Hel");
  }

  @Test
  public void TestStringStartsWithMessage() {
    assertThat("Hello").startsWith("Hel", "Assert that 'Hello' starts with 'Hel'");
  }

  @Test
  public void TestStringDefault() {
    assertThat("Hello").isNotEmpty();
  }

  @Test
  public void TestStringwithMessage() {
    assertThat("Hello").isNotEmpty("Assert that Hello is not empty");
  }

  @Test
  public void TestIntNotZeroDefault() {
    assertThat(0).isNotZero();
  }

  @Test
  public void TestIntNotZeroWithMessage() {
    assertThat(0).isNotZero("Assert that " + 0 + " is not zero");
  }

  @Test
  public void TestArrayList() {
    ArrayList<String> testlist = new java.util.ArrayList<>();
    testlist.add("string1");
    testlist.add("string2");
    testlist.add("string3");

    assertThat(testlist).contains("string3");
  }
}
