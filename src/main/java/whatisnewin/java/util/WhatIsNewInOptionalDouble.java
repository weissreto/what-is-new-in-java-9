package whatisnewin.java.util;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.function.DoubleConsumer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link OptionalDouble}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link OptionalDouble} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see OptionalDouble
 */
public final class WhatIsNewInOptionalDouble
{
  /**
   * Example call to new method {@link OptionalDouble#stream}
   * @since 9
   * @see OptionalDouble#stream
   */
  public DoubleStream stream()
  {
    OptionalDouble testee = $$$();

    DoubleStream result = testee.stream();
    return result;
  }

  /**
   * Example call to new method {@link OptionalDouble#ifPresentOrElse}
   * @since 9
   * @see OptionalDouble#ifPresentOrElse
   */
  public void ifPresentOrElse(DoubleConsumer action, Runnable emptyAction)
  {
    OptionalDouble testee = $$$();

    testee.ifPresentOrElse(action, emptyAction);
  }

  private OptionalDouble $$$()
  {
    return null;
  }
}
