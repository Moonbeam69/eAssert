package org.mine.eAssert.api;

public class IntegerAssertions<T> {
  private Integer i                                    = 0;
  private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.IntegerAssertions.class);

  //
  // Integer
  //
  public IntegerAssertions(Integer i){
    this.i = i;
  }

  // methods
  public IntegerAssertions isNotZero ()  {
    if (this.i==0) {throw new AssertionError();}
    return this;
  }

  public IntegerAssertions isNotZero (String message)  {
    if (this.i==0) {throw new AssertionError(message);}
    return this;
  }

  public IntegerAssertions isPositive ()  {
    if (this.i<0) {throw new AssertionError();}
    return this;
  }

  public IntegerAssertions isPositive (String message)  {
    if (this.i<0) {throw new AssertionError(message);}
    return this;
  }

  public IntegerAssertions isNegative ()  {
    if (this.i>0) {throw new AssertionError();}
    return this;
  }

  public void isNegative (String message)  {
    if (this.i>0) {throw new AssertionError(message);}
  }

}
