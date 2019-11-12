package whatisnewin.java.io;

import java.io.ObjectInputFilter;
import java.io.ObjectInputFilter.Status;
import java.io.ObjectInputFilter.FilterInfo;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ObjectInputFilter}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ObjectInputFilter} is a completely new class
 * @since 9
 * @see ObjectInputFilter
 */
public final class WhatIsNewInObjectInputFilter
{
  /**
   * Example call to new method {@link ObjectInputFilter#checkInput}
   * @since 9
   * @see ObjectInputFilter#checkInput
   */
  public Status checkInput(FilterInfo filterInfo)
  {
    ObjectInputFilter testee = $$$();

    Status result = testee.checkInput(filterInfo);
    return result;
  }

  private ObjectInputFilter $$$()
  {
    return null;
  }
}