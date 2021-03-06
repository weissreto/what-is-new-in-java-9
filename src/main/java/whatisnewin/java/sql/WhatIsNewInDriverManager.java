package whatisnewin.java.sql;

import java.sql.DriverManager;
import java.util.stream.Stream;
import java.sql.Driver;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DriverManager}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link DriverManager} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see DriverManager
 */
public final class WhatIsNewInDriverManager
{
  /**
   * Example call to new method {@link DriverManager#drivers()}.
   * @since 9
   * @see DriverManager#drivers()
   */
  public static Stream<Driver> drivers()
  {
    Stream<Driver> result = DriverManager.drivers();
    return result;
  }

}
