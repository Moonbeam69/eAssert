package org.mine.eAssert.api;

public class StringAssertions<T> {
  private String str                                   = "";
  private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(org.mine.eAssert.api.StringAssertions.class);

  //
  // Strings
  //
  public StringAssertions(String str) {
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

}
