package whatisnewin.java.util.logging;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ResourceBundle;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Logger}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Logger} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see Logger
 */
public final class WhatIsNewInLogger
{
  /**
   * Example call to new method {@link Logger#logrb}
   * @since 9
   * @see Logger#logrb
   */
  public void logrb(Level level, ResourceBundle bundle, String msg, Object[] params)
  {
    Logger testee = $$$();

    testee.logrb(level, bundle, msg, params);
  }

  /**
   * Example call to new method {@link Logger#logrb}
   * @since 9
   * @see Logger#logrb
   */
  public void logrb(Level level, ResourceBundle bundle, String msg, Throwable thrown)
  {
    Logger testee = $$$();

    testee.logrb(level, bundle, msg, thrown);
  }

  private Logger $$$()
  {
    return null;
  }
}
