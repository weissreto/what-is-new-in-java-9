package whatisnewin.java.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TimeUnit}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link TimeUnit} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see TimeUnit
 */
public final class WhatIsNewInTimeUnit
{
  /**
   * Example call to new method {@link TimeUnit#toChronoUnit()}.
   * @since 9
   * @see TimeUnit#toChronoUnit()
   */
  public ChronoUnit toChronoUnit()
  {
    TimeUnit testee = $$$();

    ChronoUnit result = testee.toChronoUnit();
    return result;
  }

  private TimeUnit $$$()
  {
    return null;
  }
}
