package org.mine;

import java.util.ArrayList;

public class Assertions<T> {
  private String str;
  private int i;
  private ArrayList<String> stringlist;
  private ArrayList<Integer> integerlist;
  private ArrayList<Boolean> booleanlist;
  private Boolean b;

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
    java.util.Iterator itr = stringlist.iterator();
    while(itr.hasNext()) {
      if (itr.next().equals(str)) {
        return;
      }
    }
    throw new AssertionError(message);
  }
}
