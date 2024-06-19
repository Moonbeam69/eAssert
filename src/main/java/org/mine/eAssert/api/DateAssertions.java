package org.mine.eAssert.api;

public class DateAssertions {

  private static java.time.LocalDateTime localdatetime_now = null;
  private static java.util.Date date_now                   = null;
  private static java.time.ZonedDateTime zoneddatetime_now = null;

  public DateAssertions(java.time.LocalDateTime date_) {
      this.localdatetime_now = date_;
  }

  public DateAssertions(java.util.Date date_) {
    this.date_now = date_;
  }
  public DateAssertions(java.time.ZonedDateTime date_) {
    this.zoneddatetime_now = date_;
  }


  // methods
  public org.mine.eAssert.api.DateAssertions isAfter ( java.time.LocalDateTime afterdate) {
    if (!localdatetime_now.isAfter(afterdate)) {
      throw new AssertionError();
    }
    return this;
  }

  public org.mine.eAssert.api.DateAssertions isAfter ( java.util.Date afterdate) {
    if (!date_now.after(afterdate)) {
      throw new AssertionError();
    }
    return this;
  }

  public org.mine.eAssert.api.DateAssertions isAfter ( java.time.ZonedDateTime zonedatetime_after) {
    if (!zoneddatetime_now.isAfter(zonedatetime_after)) {
      throw new AssertionError();
    }
    return this;
  }
}
