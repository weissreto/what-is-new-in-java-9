package whatisnewin.java.util;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Optional}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Optional} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see Optional
 */
public final class WhatIsNewInOptional<T>
{
  /**
   * Example call to new method {@link Optional#stream}
   * @since 9
   * @see Optional#stream
   */
  public Stream<T> stream()
  {
    Optional<T> testee = $$$();

    Stream<T> result = testee.stream();
    return result;
  }

  /**
   * Example call to new method {@link Optional#ifPresentOrElse}
   * @since 9
   * @see Optional#ifPresentOrElse
   */
  public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
  {
    Optional<T> testee = $$$();

    testee.ifPresentOrElse(action, emptyAction);
  }

  /**
   * Example call to new method {@link Optional#or}
   * @since 9
   * @see Optional#or
   */
  public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier)
  {
    Optional<T> testee = $$$();

    Optional<T> result = testee.or(supplier);
    return result;
  }

  private Optional $$$()
  {
    return null;
  }
}