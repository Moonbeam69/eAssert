package org.mine.eAssert.api;

public class AbstractAssertions<T> {
  Object testobj                   = null;

  // Classes
  AbstractAssertions(Object obj) {
    this.testobj = obj;
  }

  public void IsInstanceOfClass(Class<?> cls) {
    if (testobj.getClass()!= cls) {
      throw new AssertionError();
    }
  }

}
