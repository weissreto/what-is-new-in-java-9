package whatisnewin.java.lang.ref;

import java.lang.ref.Reference;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Reference}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Reference} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see Reference
 */
public final class WhatIsNewInReference<T>
{
  /**
   * Example call to new method {@link Reference#reachabilityFence(Object)}.
   * @since 9
   * @see Reference#reachabilityFence(Object)
   */
  public static void reachabilityFence(Object ref)
  {
    Reference.reachabilityFence(ref);
  }

}
