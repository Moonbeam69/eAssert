package org.mine.eAssert;

public abstract class Assertions<T> {

  public static org.mine.eAssert.api.StringAssertion assertThat(String str) {
    return new org.mine.eAssert.api.StringAssertion(str);
  }
  public static org.mine.eAssert.api.IntegerAssertions assertThat(int integer) {
    return new org.mine.eAssert.api.IntegerAssertions(integer);
  }
  public static org.mine.eAssert.api.BooleanAssertions assertThat(Boolean bool) {
    return new org.mine.eAssert.api.BooleanAssertions(bool);
  }
  public static org.mine.eAssert.api.ArrayListAssertions assertThat(java.util.ArrayList<?> list) {
    return new org.mine.eAssert.api.ArrayListAssertions(list);
  }
  public static org.mine.eAssert.api.DateAssertions assertThat(java.time.LocalDateTime date_) {
    return new org.mine.eAssert.api.DateAssertions(date_);
  }
  public static <T> org.mine.eAssert.api.ArrayAssertions assertThat(T[] array) {
    return new <T>org.mine.eAssert.api.ArrayAssertions(array);
  }

}