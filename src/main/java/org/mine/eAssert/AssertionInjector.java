package org.mine.eAssert;

public abstract class AssertionInjector<T> {

  public static org.mine.eAssert.api.StringAssertions assertThat(String str) {
    return new org.mine.eAssert.api.StringAssertions(str);
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

  public static <T> org.mine.eAssert.api.ArrayAssertions assertThat(T[] array) {
    return new <T>org.mine.eAssert.api.ArrayAssertions(array);
  }

}