package org.mine.eAssert.api;

public class DateAssertions {

  private static java.time.LocalDateTime date_         = null;
  private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(DateAssertions.class);

  public DateAssertions(java.time.LocalDateTime date_) {
      this.date_ = date_;
  }

  // methods
  public org.mine.eAssert.api.DateAssertions isAfter ( java.time.LocalDateTime beforedate_) {
    if (beforedate_.isAfter(date_)) {
      throw new AssertionError();
    }
    return this;
  }

}
