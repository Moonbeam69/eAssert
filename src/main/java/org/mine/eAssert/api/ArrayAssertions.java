package org.mine.eAssert.api;

public class ArrayAssertions<T> {
  private String str                       = "";
  private int i                            = 0;
  private java.util.ArrayList<String> stringlist     = null;
  private java.util.ArrayList<Integer> integerlist   = null;
  private java.util.ArrayList<Boolean> booleanlist   = null;
  private Boolean b                        = true;
  private T[] array                        = null;
  private String[] stringarray             = null;
  private Integer[] integerarray           = null;
  private Boolean[] booleanarray           = null;
  Object testobj                           = null;

  //
  // 1-D Array
  //
  public ArrayAssertions(T[] array){
    this.array = array;

    if (array.length==0) {
      throw new AssertionError("empty array");
    }

    Object firstElement = array[0];
    if (firstElement instanceof String) {
      stringarray = (String[]) array;
    } else if (firstElement instanceof Integer) {
      integerarray = (Integer[]) array;
    } else if (firstElement instanceof Boolean) {
      booleanarray = (Boolean[]) array;
    } else {
      throw new IllegalArgumentException("Unsupported list type");
    }
  }

  // methods
  public void containsItem(String str) {
    for (String s : stringarray) {
      if (s.equals(str)) {
        return;
      }
    }
    throw new AssertionError();
  }
  public void containsItem(String str, String message) {
    for (String s : stringarray) {
      if (s.equals(str)) {
        return;
      }
    }
    throw new AssertionError(message);
  }
  public void containsUniquely(String str) {
    int cnt=0;
    for (String s : stringarray) {
      if (s.equals(str)) {
        cnt++;
      }
    }
    if (cnt!=1) throw new AssertionError();
  }
  public void containsUniquely(String str, String message) {
    int cnt=0;
    for (String s : stringarray) {
      if (s.equals(str)) {
        cnt++;
      }
    }
    if (cnt!=1) throw new AssertionError(message);
  }

  public void containsItem(Integer in) {
    for (Integer i : integerarray) {
      if (i.equals(in)) {
        return;
      }
    }
    throw new AssertionError();
  }
  public void containsItem(Integer in, String message) {
    for (Integer i : integerarray) {
      if (i.equals(in)) {
        return;
      }
    }
    throw new AssertionError(message);
  }
  public void containsUniquely(Integer in) {
    containsUniquely(in, "");
  }
  public void containsUniquely(Integer in, String message) {
    int cnt = 0;
    for (Integer i : integerarray) {
      if (i.equals(in)) {
        cnt++;
      }
    }
    if (cnt!=1) throw new AssertionError(message);
  }

  public void containsItem(Boolean bool) {
    for (Boolean b : booleanarray) {
      if (b==bool) {
        return;
      }
    }
    throw new AssertionError();
  }
  public void containsItem(Boolean bool, String message) {
    for (Boolean b : booleanarray) {
      if (b==bool) {
        return;
      }
    }
    throw new AssertionError(message);
  }
  public void containsUniquely(Boolean bool) {
    for (Boolean b : booleanarray) {
      if (b==bool) {
        return;
      }
    }
    throw new AssertionError();
  }
  public void containsUniquely(Boolean bool, String message) {
    int cnt = 0;
    for (Boolean b : booleanarray) {
      if (b==bool) {
        cnt++;
      }
    }
    if (cnt!=1) throw new AssertionError(message);
  }
//
//  // Classes
//
//  ArrayAssertions(Object obj) {
//    this.testobj = obj;
//  }
//
//  public void IsInstanceOfClass(Class<?> cls) {
//    if (testobj.getClass()!= cls) {
//      throw new AssertionError();
//    }
//  }

}
