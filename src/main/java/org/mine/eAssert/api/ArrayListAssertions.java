package org.mine.eAssert.api;

public class ArrayListAssertions<T> {
  private String str                       = "";
  private int i                            = 0;
  private java.util.ArrayList<String> stringlist     = null;
  private java.util.ArrayList<Integer> integerlist   = null;
  private java.util.ArrayList<Boolean> booleanlist   = null;
  private Boolean b                        = true;
  private T[] array                        = null;
  private final org.apache.logging.log4j.Logger logger              = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.ArrayListAssertions.class);
  private String[] stringarray             = null;
  private Integer[] integerarray           = null;
  private Boolean[] booleanarray           = null;
  Object testobj                   = null;


  //
  // Arraylist
  //
  public ArrayListAssertions(java.util.ArrayList<?> list){

    if (list.isEmpty()) {
      System.out.println("The list is empty.");
      return;
    }

    Object firstElement = list.get(0);
    if (firstElement instanceof String) {
      stringlist = (java.util.ArrayList<String>) list;
    } else if (firstElement instanceof Integer) {
      integerlist = (java.util.ArrayList<Integer>) list;
    } else if (firstElement instanceof Boolean) {
      booleanlist = (java.util.ArrayList<Boolean>) list;
    } else {
      throw new IllegalArgumentException("Unsupported list type");
    }
  }

  // methods
  public void contains(String str) {
    java.util.Iterator itr = stringlist.iterator();
    while(itr.hasNext()) {
      if (itr.next().equals(str)) {
        return;
      }
    }
    throw new AssertionError();
  }

  public void contains(String str, String message) {
    java.util.Iterator itr = stringlist.iterator();
    while(itr.hasNext()) {
      if (itr.next().equals(str)) {
        return;
      }
    }
    throw new AssertionError(message);
  }
  public void contains(Integer i) {
    java.util.Iterator itr = integerlist.iterator();
    while(itr.hasNext()) {
      if (itr.next()==i) {
        return;
      }
    }
    throw new AssertionError();
  }

  public void contains(Integer i, String message) {
    java.util.Iterator itr = integerlist.iterator();
    while(itr.hasNext()) {
      if (itr.next()==i) {
        return;
      }
    }
    throw new AssertionError(message);
  }

  public void contains(Boolean b) {
    java.util.Iterator itr = booleanlist.iterator();
    while(itr.hasNext()) {
      if (itr.next()==b) {
        return;
      }
    }
    throw new AssertionError();
  }

  public void contains(Boolean b, String message) {
    java.util.Iterator itr = booleanlist.iterator();
    while(itr.hasNext()) {
      if (itr.next()==b) {
        return;
      }
    }
    throw new AssertionError(message);
  }

}
