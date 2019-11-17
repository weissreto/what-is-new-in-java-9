package whatisnewin.java.util;

import java.util.ServiceLoader.Provider;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Provider}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Provider} is a completely new class.
 * @since 9
 * @see Provider
 */
public final class WhatIsNewInServiceLoader$Provider<S>
{
  /**
   * Example call to new method {@link Provider#type()}.
   * @since 9
   * @see Provider#type()
   */
  public Class<? extends S> type()
  {
    Provider<S> testee = $$$();

    Class<? extends S> result = testee.type();
    return result;
  }

  /**
   * Example call to new method {@link Provider#get()}.
   * @since 9
   * @see Provider#get()
   */
  public S get()
  {
    Provider<S> testee = $$$();

    S result = testee.get();
    return result;
  }

  private Provider $$$()
  {
    return null;
  }
}
