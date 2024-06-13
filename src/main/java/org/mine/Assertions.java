package org.mine;

import java.util.ArrayList;

public class Assertions {
  private String str;
  private int i;
  private ArrayList<String> list;

  Assertions(String str) {
    this.str = str;
  }

  Assertions(int i){
    this.i = i;
  }

  Assertions(ArrayList<String> list){
    this.list = list;
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

  public void isNotZero ()  {
    if (this.i==0) {
      throw new AssertionError();
    }
  }

  public void isNotZero (String message)  {
    if (this.i==0) {
      throw new AssertionError(message);
    }
  }

  public void contains(String str) {
    java.util.Iterator itr = list.iterator();
    while(itr.hasNext()) {
      if (itr.next().equals(str)) {
        return;
      }
    }
    throw new AssertionError();
  }
}
