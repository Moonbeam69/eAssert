import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.mine.eAssert.AssertionInjector.assertThat;


public class testclass {
  final static String str1                          = "hello world";
  final String string1startswith             = "hel";
  final String string1endswith               = "rld";
  final Integer posint                       = 1;
  final Integer negint                       = -1;
  final Integer zero                         = 0;
  final boolean trubool                      = true;
  final boolean falbool                      = false;
  final ArrayList<String> stringlist         = new ArrayList<>(java.util.Arrays.asList(str1, "string2", "string3"));
  final ArrayList<Integer> integerlist       = new ArrayList<>(java.util.Arrays.asList(posint,3,7));
  final ArrayList<Boolean> booleanlist       = new ArrayList<>(java.util.Arrays.asList(trubool, falbool, trubool));
  final String[] stringArrayUniqueItems      = {str1, "string2", "string3"};
  final String[] stringArrayNonUniqueItems   = {str1, str1, "string2", "string3"};
  final Integer[] integerArrayUniqueItems    = {posint, 4, 7};
  final Integer[] integerArrayNonUniqueItems = {posint, posint, 7};
  final Boolean[] booleanArray               = {trubool, falbool, trubool};
  private final Logger logger                = LogManager.getLogger(testclass.class);
  private final String expectedAssertionException = "Assertion exception is expected";

  // STRING TEST CASES
  @Test
  public void TestStringStartsNoMessagePos() {
    assertThat(str1).startsWith(string1startswith);

  }
  @Test
  public void TestStringStartsWithMessagePos() {
    assertThat(str1).startsWith(string1startswith, "Assert that " + str1 + " starts with " + str1.substring(0,3));
  }
  @Test
  public void TestStringStartsWithMessageNeg() {
    logger.error(expectedAssertionException);
    assertThat(str1).startsWith(Character.toString((char) str1.charAt(0)+1), "Assert that "+ str1 + " starts with " + Character.toString((char) str1.charAt(0)+1));
  }
  @Test
  public void TestStringIsNotEmptyNoMessage() {
    assertThat(str1).isNotEmpty();
  }

  @Test
  public void TestStringIsNotEmptyWithMessage() {
    assertThat(str1).isNotEmpty("Assert that Hello is not empty");
  }

  @Test
  public void TestStringStartsNoMessageIgnoringCase() {
    assertThat(str1).startsWithIgnoringCase(string1startswith);
  }

  @Test
  public void TestStringStartsWithMessageIgnoringCase() {
    assertThat(str1).startsWithIgnoringCase(string1startswith, "Assert that 'Hello' starts with 'Hel'");
  }

//  @Test
//  public void TestStringMethodsWithFluency() {
//    assertThat(str1)
//            .startsWith("h")
//            .startsWithIgnoringCase("H")
//            .isNotEmpty();
//  }
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
    assertThat(trubool).isTrue();
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
    assertThat(stringlist).contains(str1);
  }

  @Test
  public void TestArrayListOfStringsWithMessage() {
    assertThat(stringlist).contains(str1, "Assert " + stringlist +  " constains " + str1);
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
    assertThat(stringArrayUniqueItems).containsItem(str1);
  }
  @Test
  public void TestArrayOfStringContainsItemWithMessage() {
    String message = "Assert String[] contains ".concat(str1);
    assertThat(stringArrayUniqueItems).containsItem(str1, message);
  }
  @Test
  public void TestArrayOfStringContainsUniquelyNoMessage() {
    assertThat(stringArrayUniqueItems).containsUniquely(str1);
  }
  @Test
  public void TestArrayOfStringContainsUniquelyWithMessage() {
    String message = "Assert String[] contains an instance of ".concat(str1);
    assertThat(stringArrayUniqueItems).containsUniquely(str1, message);
  }

  @Test
  public void TestArrayOfStringContainsUniquelyWithMessageNeg() {
    logger.error(expectedAssertionException);
    String message = "Assert " + java.util.Arrays.toString(stringArrayNonUniqueItems) + " contains a single instance of ".concat(str1);
    assertThat(stringArrayNonUniqueItems).containsUniquely(str1, message);
  }
  @Test
  public void TestArrayOfIntegerContainsItemNoMessage_1() {
    assertThat(integerArrayNonUniqueItems).containsItem(posint);
  }
  @Test
  public void TestArrayOfIntegerContainsItemNoMessage_2() {
    assertThat(integerArrayUniqueItems).containsItem(posint);
  }
  @Test
  public void TestArrayOfIntegerContainsItemWithMessage() {
    String message = "Assert " + java.util.Arrays.toString(integerArrayNonUniqueItems) + " contains an instance of " + String.valueOf(posint);
    assertThat(integerArrayNonUniqueItems).containsItem(posint, message);
  }
  @Test
  public void TestArrayOfIntegerContainsUniquelyNoMessage() {
    assertThat(integerArrayUniqueItems).containsUniquely(posint);
  }

  @Test
  public void TestArrayOfIntegerContainsUniquelyWithMessage() {
    String message = "Assert " + java.util.Arrays.toString(integerArrayUniqueItems) + " contains a single instance of " + String.valueOf(posint);
    assertThat(integerArrayUniqueItems).containsUniquely(1, message);
  }
  @Test
  public void TestArrayOfBooleanContainsItemNoMessage() {
    assertThat(booleanArray).containsItem(trubool);
  }
  @Test
  public void TestArrayOfBooleanContainsItemWithMessage() {
    String message = "Assert " + java.util.Arrays.toString(booleanArray) + " contains an instance of " + String.valueOf(trubool);
    assertThat(booleanArray).containsItem(trubool,message);
  }
  @Test
  public void TestArrayOfBooleanContainsUniquelyNoMessage() {
    assertThat(booleanArray).containsItem(trubool);
  }
  @Test
  public void TestArrayOfBooleanContainsUniquelyWithMessage() {
    String message = "Assert " + java.util.Arrays.toString(booleanArray) + " contains an instance of " + String.valueOf(trubool);
    assertThat(booleanArray).containsItem(trubool,message);
  }

  // CLASS Test Classes
//  @Test
//  public void TestIsInstanceOfClass() {
//    Foo o = new Foo();
//
//    assertThat(o).IsInstanceOfClass(Foo.class);
//  }
//
//  private class Foo {
//  }
}
