package org.mine.eAssert.api;

public class BooleanAssertions<T> {
  private String str                       = "";
  private int i                            = 0;
  private java.util.ArrayList<String> stringlist     = null;
  private java.util.ArrayList<Integer> integerlist   = null;
  private java.util.ArrayList<Boolean> booleanlist   = null;
  private Boolean b                        = true;
  private T[] array                        = null;
  private final org.apache.logging.log4j.Logger logger              = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.BooleanAssertions.class);
  private String[] stringarray             = null;
  private Integer[] integerarray           = null;
  private Boolean[] booleanarray           = null;
  Object testobj                   = null;

  //
  // Booleans
  //
  public BooleanAssertions(Boolean b){
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


}
