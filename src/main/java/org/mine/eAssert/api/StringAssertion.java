package org.mine.eAssert.api;

public class StringAssertion {

  private static String str                                   = "";

  public StringAssertion(String str) {
      this.str = str;
  }

  // methods
  public StringAssertion startsWith (String startstr) {
    if (!this.str.substring(0,startstr.length()).equals(startstr) ) {
      throw new AssertionError();
    }
    return this;
  }

  public StringAssertion startsWith (String startstr, String message) {
    if (!this.str.substring(0,startstr.length()).equals(startstr) ) {
      throw new AssertionError(message);
    }
    return this;
  }

  public StringAssertion isNotEmpty () {
    if (this.str.length()==0) {
      throw new AssertionError();
    }
    return this;
  }

  public StringAssertion isNotEmpty (String message) {
    if (this.str.length()==0) {
      throw new AssertionError(message);
    }
    return this;
  }

  public StringAssertion startsWithIgnoringCase (String startstr) {
    if (!this.str.substring(0,startstr.length()).toLowerCase().equals(startstr.toLowerCase()) ) {
      throw new AssertionError();
    }
    return this;
  }

  public StringAssertion startsWithIgnoringCase (String startstr, String message) {
    if (!this.str.substring(0,startstr.length()).toLowerCase().equals(startstr.toLowerCase()) ) {
      throw new AssertionError(message);
    }
    return this;
  }
}
