package whatisnewin.java.awt.desktop;

import java.awt.desktop.UserSessionListener;
import java.awt.desktop.UserSessionEvent;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link UserSessionListener}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link UserSessionListener} is a completely new class
 * @since 9
 * @see UserSessionListener
 */
public final class WhatIsNewInUserSessionListener
{
  /**
   * Example call to new method {@link UserSessionListener#userSessionDeactivated}
   * @since 9
   * @see UserSessionListener#userSessionDeactivated
   */
  public void userSessionDeactivated(UserSessionEvent e)
  {
    UserSessionListener testee = $$$();

    testee.userSessionDeactivated(e);
  }

  /**
   * Example call to new method {@link UserSessionListener#userSessionActivated}
   * @since 9
   * @see UserSessionListener#userSessionActivated
   */
  public void userSessionActivated(UserSessionEvent e)
  {
    UserSessionListener testee = $$$();

    testee.userSessionActivated(e);
  }

  private UserSessionListener $$$()
  {
    return null;
  }
}
