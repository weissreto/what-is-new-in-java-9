package whatisnewin.java.util;

import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.function.LongConsumer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link OptionalLong}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link OptionalLong} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see OptionalLong
 */
public final class WhatIsNewInOptionalLong
{
  /**
   * Example call to new method {@link OptionalLong#stream()}.
   * @since 9
   * @see OptionalLong#stream()
   */
  public LongStream stream()
  {
    OptionalLong testee = $$$();

    LongStream result = testee.stream();
    return result;
  }

  /**
   * Example call to new method {@link OptionalLong#ifPresentOrElse(LongConsumer, Runnable)}.
   * @since 9
   * @see OptionalLong#ifPresentOrElse(LongConsumer, Runnable)
   */
  public void ifPresentOrElse(LongConsumer action, Runnable emptyAction)
  {
    OptionalLong testee = $$$();

    testee.ifPresentOrElse(action, emptyAction);
  }

  private OptionalLong $$$()
  {
    return null;
  }
}
