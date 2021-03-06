package whatisnewin.java.util;

import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link OptionalInt}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link OptionalInt} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see OptionalInt
 */
public final class WhatIsNewInOptionalInt
{
  /**
   * Example call to new method {@link OptionalInt#ifPresentOrElse(IntConsumer, Runnable)}.
   * @since 9
   * @see OptionalInt#ifPresentOrElse(IntConsumer, Runnable)
   */
  public void ifPresentOrElse(IntConsumer action, Runnable emptyAction)
  {
    OptionalInt testee = $$$();

    testee.ifPresentOrElse(action, emptyAction);
  }

  /**
   * Example call to new method {@link OptionalInt#stream()}.
   * @since 9
   * @see OptionalInt#stream()
   */
  public IntStream stream()
  {
    OptionalInt testee = $$$();

    IntStream result = testee.stream();
    return result;
  }

  private OptionalInt $$$()
  {
    return null;
  }
}
