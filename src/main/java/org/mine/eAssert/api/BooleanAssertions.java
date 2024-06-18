package org.mine.eAssert.api;

public class BooleanAssertions<T> {
  private Boolean b                                    = true;
  private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.BooleanAssertions.class);

  //
  // Booleans
  //
  public BooleanAssertions(Boolean b){
    this.b=b;
  }
  // methods
  public BooleanAssertions isTrue ()  {
    if (this.b!=true) {throw new AssertionError();}
    return this;
  }

  public BooleanAssertions isTrue (String message)  {
    if (this.b!=true) {throw new AssertionError(message);}
    return this;
  }

  public BooleanAssertions isFalse ()  {
    if (this.b!=false) {throw new AssertionError();}
    return this;
  }

  public BooleanAssertions isFalse (String message)  {
    if (this.b!=false) {throw new AssertionError(message);}
    return this;
  }
}
