package org.mine.eAssert.api;

public class IntegerAssertions<T> {
  private int i                                        = 0;
  private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.IntegerAssertions.class);



  //
  // Integer
  //
  public IntegerAssertions(int i){
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

}
