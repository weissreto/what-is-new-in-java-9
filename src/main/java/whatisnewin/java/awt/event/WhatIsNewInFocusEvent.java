package whatisnewin.java.awt.event;

import java.awt.event.FocusEvent;
import java.awt.Component;
import java.awt.event.FocusEvent.Cause;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link FocusEvent}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link FocusEvent} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see FocusEvent
 */
public final class WhatIsNewInFocusEvent
{
  /**
   * Example call to new constructor {@link FocusEvent#FocusEvent(Component, int, boolean, Component, Cause)}.
   * @since 9
   * @see FocusEvent#FocusEvent(Component, int, boolean, Component, Cause)
   */
  public WhatIsNewInFocusEvent(Component source, int id, boolean temporary, Component opposite, Cause cause)
  {
    FocusEvent testee = new FocusEvent(source, id, temporary, opposite, cause);
  }

  /**
   * Example call to new method {@link FocusEvent#getCause()}.
   * @since 9
   * @see FocusEvent#getCause()
   */
  public Cause getCause()
  {
    FocusEvent testee = $$$();

    Cause result = testee.getCause();
    return result;
  }

  private FocusEvent $$$()
  {
    return null;
  }
}
