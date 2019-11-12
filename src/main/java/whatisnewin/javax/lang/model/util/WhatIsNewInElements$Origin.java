package whatisnewin.javax.lang.model.util;

import javax.lang.model.util.Elements.Origin;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Origin}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Origin} is a completely new class
 * @since 9
 * @see Origin
 */
public final class WhatIsNewInElements$Origin
{
  /**
   * Example usage of the new field {@link Origin#EXPLICIT}
   * @since 9
   * @see Origin#EXPLICIT
   */
  public static  final Origin EXPLICIT = Origin.EXPLICIT;

  /**
   * Example usage of the new field {@link Origin#MANDATED}
   * @since 9
   * @see Origin#MANDATED
   */
  public static  final Origin MANDATED = Origin.MANDATED;

  /**
   * Example usage of the new field {@link Origin#SYNTHETIC}
   * @since 9
   * @see Origin#SYNTHETIC
   */
  public static  final Origin SYNTHETIC = Origin.SYNTHETIC;

  /**
   * Example call to new method {@link Origin#values}
   * @since 9
   * @see Origin#values
   */
  public static Origin[] values()
  {
    Origin[] result = Origin.values();
    return result;
  }

  /**
   * Example call to new method {@link Origin#valueOf}
   * @since 9
   * @see Origin#valueOf
   */
  public static Origin valueOf(String name)
  {
    Origin result = Origin.valueOf(name);
    return result;
  }

  /**
   * Example call to new method {@link Origin#isDeclared}
   * @since 9
   * @see Origin#isDeclared
   */
  public boolean isDeclared()
  {
    Origin testee = $$$();

    boolean result = testee.isDeclared();
    return result;
  }

  private Origin $$$()
  {
    return null;
  }
}
