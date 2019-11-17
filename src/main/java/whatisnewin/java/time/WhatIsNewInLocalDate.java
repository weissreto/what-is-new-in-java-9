package whatisnewin.java.time;

import java.time.LocalDate;
import java.time.Instant;
import java.time.ZoneId;
import java.util.stream.Stream;
import java.time.Period;
import java.time.LocalTime;
import java.time.ZoneOffset;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link LocalDate}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link LocalDate} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see LocalDate
 */
public final class WhatIsNewInLocalDate
{
  /**
   * Example call to new method {@link LocalDate#ofInstant(Instant, ZoneId)}.
   * @since 9
   * @see LocalDate#ofInstant(Instant, ZoneId)
   */
  public static LocalDate ofInstant(Instant instant, ZoneId zone)
  {
    LocalDate result = LocalDate.ofInstant(instant, zone);
    return result;
  }

  /**
   * Example call to new method {@link LocalDate#datesUntil(LocalDate)}.
   * @since 9
   * @see LocalDate#datesUntil(LocalDate)
   */
  public Stream<LocalDate> datesUntil(LocalDate endExclusive)
  {
    LocalDate testee = $$$();

    Stream<LocalDate> result = testee.datesUntil(endExclusive);
    return result;
  }

  /**
   * Example call to new method {@link LocalDate#datesUntil(LocalDate, Period)}.
   * @since 9
   * @see LocalDate#datesUntil(LocalDate, Period)
   */
  public Stream<LocalDate> datesUntil(LocalDate endExclusive, Period step)
  {
    LocalDate testee = $$$();

    Stream<LocalDate> result = testee.datesUntil(endExclusive, step);
    return result;
  }

  /**
   * Example call to new method {@link LocalDate#toEpochSecond(LocalTime, ZoneOffset)}.
   * @since 9
   * @see LocalDate#toEpochSecond(LocalTime, ZoneOffset)
   */
  public long toEpochSecond(LocalTime time, ZoneOffset offset)
  {
    LocalDate testee = $$$();

    long result = testee.toEpochSecond(time, offset);
    return result;
  }

  private LocalDate $$$()
  {
    return null;
  }
}
