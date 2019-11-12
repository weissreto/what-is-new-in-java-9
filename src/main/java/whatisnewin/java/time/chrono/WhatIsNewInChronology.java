package whatisnewin.java.time.chrono;

import java.time.chrono.Chronology;
import java.time.ZoneOffset;
import java.time.chrono.Era;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Chronology}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Chronology} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see Chronology
 */
public final class WhatIsNewInChronology
{
  /**
   * Example call to new method {@link Chronology#epochSecond}
   * @since 9
   * @see Chronology#epochSecond
   */
  public long epochSecond(int prolepticYear, int month, int dayOfMonth, int hour, int minute, int second, ZoneOffset zoneOffset)
  {
    Chronology testee = $$$();

    long result = testee.epochSecond(prolepticYear, month, dayOfMonth, hour, minute, second, zoneOffset);
    return result;
  }

  /**
   * Example call to new method {@link Chronology#epochSecond}
   * @since 9
   * @see Chronology#epochSecond
   */
  public long epochSecond(Era era, int yearOfEra, int month, int dayOfMonth, int hour, int minute, int second, ZoneOffset zoneOffset)
  {
    Chronology testee = $$$();

    long result = testee.epochSecond(era, yearOfEra, month, dayOfMonth, hour, minute, second, zoneOffset);
    return result;
  }

  private Chronology $$$()
  {
    return null;
  }
}