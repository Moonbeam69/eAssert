package org.mine;

public abstract class TestInjector {

  public static Assertions assertThat(String str) {
    return new Assertions(str);
  }

  public static Assertions assertThat(int i) {
    return new Assertions(i);
  }

  public static Assertions assertThat(java.util.ArrayList<String> list) {
    return new Assertions(list);
  }

}