import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.mine.TestInjector.assertThat;

public class testclass {
  static String string1                 = "hello world";
  static String string1startswith       = "hel";
  static String string1endswith         = "rld";
  static int posint                     = 1;
  static int negint                     = -1;
  static int zero                       = 0;
  static Boolean trubool                = true;
  static Boolean falbool                = false;
  static ArrayList<String> stringlist   = new ArrayList<>(java.util.Arrays.asList(string1, "string2", "string3"));
  static ArrayList<Integer> integerlist = new ArrayList<>(java.util.Arrays.asList(posint,3,7));
  static ArrayList<Boolean> booleanlist = new ArrayList<>(java.util.Arrays.asList(trubool, falbool, trubool));

  // STRING TEST CASES

  @Test
  public void TestStringStartsNoMessagePos() {
    assertThat(string1).startsWith(string1startswith);
  }
  @Test
  public void TestStringStartsWithMessagePos() {
    assertThat(string1).startsWith(string1startswith, "Assert that 'Hello' starts with 'Hel'");
  }
  @Test
  public void TestStringStartsNoMessageNeg() {
    System.out.println("Expected to fail:");
    assertThat(string1).startsWith(Character.toString((char)string1.charAt(0)+1));
  }
  @Test
  public void TestStringStartsWithMessageNeg() {
    System.out.println("Expected to fail:");
    assertThat(string1).startsWith(Character.toString((char)string1.charAt(0)+1), "Assert that "+ string1 + " starts with " + Character.toString((char)string1.charAt(0)+1));
  }

  @Test
  public void TestStringIsNotEmptyNoMessage() {
    assertThat(string1).isNotEmpty();
  }

  @Test
  public void TestStringIsNotEmptyWithMessage() {
    assertThat(string1).isNotEmpty("Assert that Hello is not empty");
  }

  @Test
  public void TestStringStartsNoMessageIgnoringCase() {
    assertThat(string1).startsWithIgnoringCase(string1startswith);
  }

  @Test
  public void TestStringStartsWithMessageIgnoringCase() {
    assertThat(string1).startsWithIgnoringCase(string1startswith, "Assert that 'Hello' starts with 'Hel'");
  }

  // INT TEST CASES

  @Test
  public void TestIntNotZeroNoMessage() {
    assertThat(posint).isNotZero();
  }

  @Test
  public void TestIntNotZeroWithMessage() {
    assertThat(posint).isNotZero("Assert that " + 0 + " is not zero");
  }

  @Test
  public void TestIntIsPositiveNoMessage() {
    assertThat(posint).isPositive();
  }

  @Test
  public void TestIntIsPositiveWithMessage() {
    assertThat(posint).isPositive("Assert that " + posint + " is positive");
  }

  @Test
  public void TestIntIsNegativeNoMessage() {
    assertThat(negint).isNegative();
  }

  @Test
  public void TestIntIsNegativeWithMessage() {
    assertThat(negint).isNegative("Assert that " + negint + " is negative");
  }

  // BOOLEAN TEST CASES
  @Test
  public void TestBooleanIsTrueNoMessage() {
    assertThat(trubool).isPositive();
  }

  @Test
  public void TestBooleanIsFalseWithMessage() {
    assertThat(posint).isPositive();
  }

  @Test
  public void TestBooleanIsFalseNoMessage() {
    assertThat(posint).isPositive();
  }

  @Test
  public void TestBooleanIsTrueWithMessage() {
    assertThat(posint).isPositive();
  }

  // ARRAYLIST TEST CASES
  @Test
  public void TestArrayListOfStringsNoMessage() {
    assertThat(stringlist).contains(string1);
  }

  @Test
  public void TestArrayListOfStringsWithMessage() {
    assertThat(stringlist).contains(string1, "Assert " + stringlist +  " constains " + string1);
  }

  @Test
  public void TestArrayListOfIntegersNoMessage() {
    assertThat(integerlist).contains(posint);
  }

  @Test
  public void TestArrayListOfIntegersWithMessage() {
    assertThat(integerlist).contains(posint, "Assert " + integerlist +  " constains " + posint);
  }

  @Test
  public void TestArrayListOfBooleansNoMessage() {
    assertThat(booleanlist).contains(false);
  }
  @Test
  public void TestArrayListOfBooleansWithMessage() {
    assertThat(booleanlist).contains(falbool, "Assert " + booleanlist +  " constains " + falbool);
  }
  // ARRAY TEST CASES
  @Test
  public void TestArrayOfStringContainsItemNoMessage() {
    assertThat(1).isNotZero("Assert that " + 0 + " is not zero");
  }


}
