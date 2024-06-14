package org.mine.eAssert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Assertions<T> {
  private String str                       = "";
  private int i                            = 0;
  private ArrayList<String> stringlist     = null;
  private ArrayList<Integer> integerlist   = null;
  private ArrayList<Boolean> booleanlist   = null;
  private Boolean b                        = true;
  private T[] array                        = null;
  private final Logger logger              = LogManager.getLogger(Assertions.class);
  private String[] stringarray             = null;
  private Integer[] integerarray           = null;
  private Boolean[] booleanarray           = null;

  //
  // Strings
  //
  Assertions(String str) {
    this.str = str;
  }

  // methods
  public void startsWith (String startstr) {
    if (!this.str.substring(0,startstr.length()).equals(startstr) ) {
      throw new AssertionError();
    }
  }

  public void startsWith (String startstr, String message) {
    if (!this.str.substring(0,startstr.length()).equals(startstr) ) {
      throw new AssertionError(message);
    }
  }

  public void isNotEmpty () {
    if (this.str.length()==0) {
      throw new AssertionError();
    }
  }

  public void isNotEmpty (String message) {
    if (this.str.length()==0) {
      throw new AssertionError(message);
    }
  }

  public void startsWithIgnoringCase (String startstr) {
    if (!this.str.substring(0,startstr.length()).toLowerCase().equals(startstr.toLowerCase()) ) {
      throw new AssertionError();
    }
  }

  public void startsWithIgnoringCase (String startstr, String message) {
    if (!this.str.substring(0,startstr.length()).toLowerCase().equals(startstr.toLowerCase()) ) {
      throw new AssertionError(message);
    }
  }

  //
  // Ints
  //
  Assertions(int i){
    this.i = i;
  }

  // methods
  public void isNotZero ()  {
    if (this.i==0) {throw new AssertionError();}
  }

  public void isNotZero (String message)  {
    if (this.i==0) {throw new AssertionError(message);}
  }

  public void isPositive ()  {
    if (this.i<0) {throw new AssertionError();}
  }

  public void isPositive (String message)  {
    if (this.i<0) {throw new AssertionError(message);}
  }

  public void isNegative ()  {
    if (this.i>0) {throw new AssertionError();}
  }

  public void isNegative (String message)  {
    if (this.i>0) {throw new AssertionError(message);}
  }

  //
  // Booleans
  //
  Assertions(Boolean b){
    this.b=b;
  }

  // methods
  public void isTrue ()  {
    if (this.b!=true) {throw new AssertionError();}
  }

  public void isTrue (String message)  {
    if (this.b!=true) {throw new AssertionError(message);}
  }

  public void isFalse ()  {
    if (this.b!=false) {throw new AssertionError();}
  }

  public void isFalse (String message)  {
    if (this.b!=false) {throw new AssertionError(message);}
  }
  //
  // Arraylist
  //
  Assertions(ArrayList<?> list){

    if (list.isEmpty()) {
      System.out.println("The list is empty.");
      return;
    }

    Object firstElement = list.get(0);
    if (firstElement instanceof String) {
      stringlist = (ArrayList<String>) list;
    } else if (firstElement instanceof Integer) {
      integerlist = (ArrayList<Integer>) list;
    } else if (firstElement instanceof Boolean) {
      booleanlist = (ArrayList<Boolean>) list;
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

  //
  // 1-D Array
  //
  Assertions(T[] array){
    this.array = array;

    if (array.length==0) {
      logger.error("empty array");
      return;
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


}
