package whatisnewin.java.awt;

import java.awt.Component;
import java.awt.event.FocusEvent.Cause;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Component}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Component} is an old class but has new fields, constructors or methods
 * @since UNDEFINED
 * @see Component
 */
public final class WhatIsNewInComponent
{
  /**
   * Example call to new method {@link Component#requestFocus}
   * @since 9
   * @see Component#requestFocus
   */
  public void requestFocus(Cause cause)
  {
    Component testee = $$$();

    testee.requestFocus(cause);
  }

  /**
   * Example call to new method {@link Component#requestFocusInWindow}
   * @since 9
   * @see Component#requestFocusInWindow
   */
  public boolean requestFocusInWindow(Cause cause)
  {
    Component testee = $$$();

    boolean result = testee.requestFocusInWindow(cause);
    return result;
  }

  private Component $$$()
  {
    return null;
  }
}
