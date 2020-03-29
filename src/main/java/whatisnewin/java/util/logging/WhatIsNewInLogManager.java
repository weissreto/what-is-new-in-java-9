package whatisnewin.java.util.logging;

import java.util.logging.LogManager;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.io.IOException;
import java.io.InputStream;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link LogManager}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link LogManager} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see LogManager
 */
public final class WhatIsNewInLogManager
{
  /**
   * Example call to new method {@link LogManager#updateConfiguration(Function)}.
   * @since 9
   * @see LogManager#updateConfiguration(Function)
   */
  public void updateConfiguration(Function<String, BiFunction<String, String, String>> mapper) throws IOException
  {
    LogManager testee = $$$();

    testee.updateConfiguration(mapper);
  }

  /**
   * Example call to new method {@link LogManager#updateConfiguration(InputStream, Function)}.
   * @since 9
   * @see LogManager#updateConfiguration(InputStream, Function)
   */
  public void updateConfiguration(InputStream ins, Function<String, BiFunction<String, String, String>> mapper) throws IOException
  {
    LogManager testee = $$$();

    testee.updateConfiguration(ins, mapper);
  }

  /**
   * Example call to new method {@link LogManager#addConfigurationListener(Runnable)}.
   * @since 9
   * @see LogManager#addConfigurationListener(Runnable)
   */
  public LogManager addConfigurationListener(Runnable listener)
  {
    LogManager testee = $$$();

    LogManager result = testee.addConfigurationListener(listener);
    return result;
  }

  /**
   * Example call to new method {@link LogManager#removeConfigurationListener(Runnable)}.
   * @since 9
   * @see LogManager#removeConfigurationListener(Runnable)
   */
  public void removeConfigurationListener(Runnable listener)
  {
    LogManager testee = $$$();

    testee.removeConfigurationListener(listener);
  }

  private LogManager $$$()
  {
    return null;
  }
}
