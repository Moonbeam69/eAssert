package org.mine.eAssert;

import java.util.ArrayList;

public abstract class TestInjector<T> {

  public static Assertions assertThat(String str) {
    return new Assertions(str);
  }
  public static Assertions assertThat(int i) {
    return new Assertions(i);
  }
  public static Assertions assertThat(Boolean b) {
    return new Assertions(b);
  }
  public static Assertions assertThat(ArrayList<?> list) {
    return new Assertions(list);
  }
  public static <T> Assertions assertThat(T[] array) {
    return new <T> Assertions(array);
  }
}