package whatisnewin.java.lang;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.function.Supplier;
import java.util.ResourceBundle;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Logger}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Logger} is a completely new class.
 * @since 9
 * @see Logger
 */
public final class WhatIsNewInSystem$Logger
{
  /**
   * Example call to new method {@link Logger#isLoggable(Level)}.
   * @since 9
   * @see Logger#isLoggable(Level)
   */
  public boolean isLoggable(Level level)
  {
    Logger testee = $$$();

    boolean result = testee.isLoggable(level);
    return result;
  }

  /**
   * Example call to new method {@link Logger#getName()}.
   * @since 9
   * @see Logger#getName()
   */
  public String getName()
  {
    Logger testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link Logger#log(Level, String)}.
   * @since 9
   * @see Logger#log(Level, String)
   */
  public void log(Level level, String msg)
  {
    Logger testee = $$$();

    testee.log(level, msg);
  }

  /**
   * Example call to new method {@link Logger#log(Level, Supplier)}.
   * @since 9
   * @see Logger#log(Level, Supplier)
   */
  public void log(Level level, Supplier<String> msgSupplier)
  {
    Logger testee = $$$();

    testee.log(level, msgSupplier);
  }

  /**
   * Example call to new method {@link Logger#log(Level, Object)}.
   * @since 9
   * @see Logger#log(Level, Object)
   */
  public void log(Level level, Object obj)
  {
    Logger testee = $$$();

    testee.log(level, obj);
  }

  /**
   * Example call to new method {@link Logger#log(Level, String, Throwable)}.
   * @since 9
   * @see Logger#log(Level, String, Throwable)
   */
  public void log(Level level, String msg, Throwable thrown)
  {
    Logger testee = $$$();

    testee.log(level, msg, thrown);
  }

  /**
   * Example call to new method {@link Logger#log(Level, Supplier, Throwable)}.
   * @since 9
   * @see Logger#log(Level, Supplier, Throwable)
   */
  public void log(Level level, Supplier<String> msgSupplier, Throwable thrown)
  {
    Logger testee = $$$();

    testee.log(level, msgSupplier, thrown);
  }

  /**
   * Example call to new method {@link Logger#log(Level, String, Object[])}.
   * @since 9
   * @see Logger#log(Level, String, Object[])
   */
  public void log(Level level, String format, Object[] params)
  {
    Logger testee = $$$();

    testee.log(level, format, params);
  }

  /**
   * Example call to new method {@link Logger#log(Level, ResourceBundle, String, Throwable)}.
   * @since 9
   * @see Logger#log(Level, ResourceBundle, String, Throwable)
   */
  public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown)
  {
    Logger testee = $$$();

    testee.log(level, bundle, msg, thrown);
  }

  /**
   * Example call to new method {@link Logger#log(Level, ResourceBundle, String, Object[])}.
   * @since 9
   * @see Logger#log(Level, ResourceBundle, String, Object[])
   */
  public void log(Level level, ResourceBundle bundle, String format, Object[] params)
  {
    Logger testee = $$$();

    testee.log(level, bundle, format, params);
  }

  private Logger $$$()
  {
    return null;
  }
}
