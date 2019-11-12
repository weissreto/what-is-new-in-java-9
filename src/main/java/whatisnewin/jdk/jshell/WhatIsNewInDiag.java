package whatisnewin.jdk.jshell;

import jdk.jshell.Diag;
import java.util.Locale;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Diag}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Diag} is a completely new class
 * @since 9
 * @see Diag
 */
public final class WhatIsNewInDiag
{
  /**
   * Example usage of the new field {@link Diag#NOPOS}
   * @since 9
   * @see Diag#NOPOS
   */
  public static  final long NOPOS = Diag.NOPOS;

  /**
   * Example call to new method {@link Diag#isError}
   * @since 9
   * @see Diag#isError
   */
  public boolean isError()
  {
    Diag testee = $$$();

    boolean result = testee.isError();
    return result;
  }

  /**
   * Example call to new method {@link Diag#getPosition}
   * @since 9
   * @see Diag#getPosition
   */
  public long getPosition()
  {
    Diag testee = $$$();

    long result = testee.getPosition();
    return result;
  }

  /**
   * Example call to new method {@link Diag#getStartPosition}
   * @since 9
   * @see Diag#getStartPosition
   */
  public long getStartPosition()
  {
    Diag testee = $$$();

    long result = testee.getStartPosition();
    return result;
  }

  /**
   * Example call to new method {@link Diag#getEndPosition}
   * @since 9
   * @see Diag#getEndPosition
   */
  public long getEndPosition()
  {
    Diag testee = $$$();

    long result = testee.getEndPosition();
    return result;
  }

  /**
   * Example call to new method {@link Diag#getMessage}
   * @since 9
   * @see Diag#getMessage
   */
  public String getMessage(Locale locale)
  {
    Diag testee = $$$();

    String result = testee.getMessage(locale);
    return result;
  }

  /**
   * Example call to new method {@link Diag#getCode}
   * @since 9
   * @see Diag#getCode
   */
  public String getCode()
  {
    Diag testee = $$$();

    String result = testee.getCode();
    return result;
  }

  private Diag $$$()
  {
    return null;
  }
}
