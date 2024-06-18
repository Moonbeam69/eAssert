import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.mine.eAssert.Assertions.assertThat;

public class testclass extends org.mine.eAssert.PositiveTestdata {

  private final Logger logger                     = LogManager.getLogger(testclass.class);
  private final String expectedAssertionException = "Assertion exception is expected";

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
  @Test
  public void TestStringMethodsWithFluencyNoMessage() {
    assertThat(str1)
            .startsWith("h")
            .startsWithIgnoringCase("H")
            .isNotEmpty();
  }

  @Test
  public void TestStringMethodsWithFluencyWithMessage() {
    assertThat(str1)
            .startsWith("h", "Asserts starts with h")
            .startsWithIgnoringCase("HE", "Asserts starts with HE ignore case")
            .isNotEmpty();
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

  @Test
  public void TestBooleanFluencyNoMessage() {
    assertThat(posint)
            .isPositive()
            .isNotZero();
  }

  // BOOLEAN TEST CASES
  @Test
  public void TestBooleanIsTrueNoMessage() {
    assertThat(trubool).isTrue();
  }

  @Test
  public void TestBooleanIsFalseWithMessage() {
    assertThat(falbool).isFalse();
  }

  @Test
  public void TestBooleanIsFalseNoMessage() {
    assertThat(falbool).isFalse();
  }

  @Test
  public void TestBooleanIsTrueWithMessage() {
    assertThat(trubool).isTrue("Assert true is true");
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

  @Test
  public void TestDateIsBeforeNoMessage() {
    LocalDateTime today = LocalDateTime.now();
    assertThat(today).isAfter(past);
  }
  @Test
  public void TestDateIsBeforeNoMessageNeg() {
    logger.error(expectedAssertionException);
    LocalDateTime today = LocalDateTime.now();
    assertThat(past).isAfter(today);
  }
}
