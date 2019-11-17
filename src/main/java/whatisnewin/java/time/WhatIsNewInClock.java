package whatisnewin.java.time;

import java.time.Clock;
import java.time.ZoneId;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Clock}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Clock} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see Clock
 */
public final class WhatIsNewInClock
{
  /**
   * Example call to new method {@link Clock#tickMillis(ZoneId)}.
   * @since 9
   * @see Clock#tickMillis(ZoneId)
   */
  public static Clock tickMillis(ZoneId zone)
  {
    Clock result = Clock.tickMillis(zone);
    return result;
  }

}
