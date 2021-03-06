package whatisnewin.java.security;

import java.security.Provider;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Provider}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Provider} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see Provider
 */
public final class WhatIsNewInProvider
{
  /**
   * Example call to new method {@link Provider#configure(String)}.
   * @since 9
   * @see Provider#configure(String)
   */
  public Provider configure(String configArg)
  {
    Provider testee = $$$();

    Provider result = testee.configure(configArg);
    return result;
  }

  /**
   * Example call to new method {@link Provider#isConfigured()}.
   * @since 9
   * @see Provider#isConfigured()
   */
  public boolean isConfigured()
  {
    Provider testee = $$$();

    boolean result = testee.isConfigured();
    return result;
  }

  /**
   * Example call to new method {@link Provider#getVersionStr()}.
   * @since 9
   * @see Provider#getVersionStr()
   */
  public String getVersionStr()
  {
    Provider testee = $$$();

    String result = testee.getVersionStr();
    return result;
  }

  private Provider $$$()
  {
    return null;
  }
}
