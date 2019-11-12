package whatisnewin.java.util;

import java.util.Currency;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Currency}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Currency} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see Currency
 */
public final class WhatIsNewInCurrency
{
  /**
   * Example call to new method {@link Currency#getNumericCodeAsString}
   * @since 9
   * @see Currency#getNumericCodeAsString
   */
  public String getNumericCodeAsString()
  {
    Currency testee = $$$();

    String result = testee.getNumericCodeAsString();
    return result;
  }

  private Currency $$$()
  {
    return null;
  }
}