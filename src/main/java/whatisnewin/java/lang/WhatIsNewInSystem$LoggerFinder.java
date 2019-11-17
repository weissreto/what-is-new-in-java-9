package whatisnewin.java.lang;

import java.lang.System.LoggerFinder;
import java.lang.System.Logger;
import java.util.ResourceBundle;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link LoggerFinder}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link LoggerFinder} is a completely new class.
 * @since 9
 * @see LoggerFinder
 */
public final class WhatIsNewInSystem$LoggerFinder
{
  /**
   * Example call to new method {@link LoggerFinder#getLogger(String, Module)}.
   * @since 9
   * @see LoggerFinder#getLogger(String, Module)
   */
  public Logger getLogger(String name, Module module)
  {
    LoggerFinder testee = $$$();

    Logger result = testee.getLogger(name, module);
    return result;
  }

  /**
   * Example call to new method {@link LoggerFinder#getLocalizedLogger(String, ResourceBundle, Module)}.
   * @since 9
   * @see LoggerFinder#getLocalizedLogger(String, ResourceBundle, Module)
   */
  public Logger getLocalizedLogger(String name, ResourceBundle bundle, Module module)
  {
    LoggerFinder testee = $$$();

    Logger result = testee.getLocalizedLogger(name, bundle, module);
    return result;
  }

  /**
   * Example call to new method {@link LoggerFinder#getLoggerFinder()}.
   * @since 9
   * @see LoggerFinder#getLoggerFinder()
   */
  public static LoggerFinder getLoggerFinder()
  {
    LoggerFinder result = LoggerFinder.getLoggerFinder();
    return result;
  }

  private LoggerFinder $$$()
  {
    return null;
  }
}
