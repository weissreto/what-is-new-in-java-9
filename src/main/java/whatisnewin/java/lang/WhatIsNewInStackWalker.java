package whatisnewin.java.lang;

import java.lang.StackWalker.Option;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;
import java.lang.StackWalker.StackFrame;
import java.util.function.Consumer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link StackWalker}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link StackWalker} is a completely new class.
 * @since 9
 * @see StackWalker
 */
public final class WhatIsNewInStackWalker
{
  /**
   * Example call to new method {@link StackWalker#getInstance()}.
   * @since 9
   * @see StackWalker#getInstance()
   */
  public static StackWalker getInstance()
  {
    StackWalker result = StackWalker.getInstance();
    return result;
  }

  /**
   * Example call to new method {@link StackWalker#getInstance(Option)}.
   * @since 9
   * @see StackWalker#getInstance(Option)
   */
  public static StackWalker getInstance(Option option)
  {
    StackWalker result = StackWalker.getInstance(option);
    return result;
  }

  /**
   * Example call to new method {@link StackWalker#getInstance(Set)}.
   * @since 9
   * @see StackWalker#getInstance(Set)
   */
  public static StackWalker getInstance(Set<Option> options)
  {
    StackWalker result = StackWalker.getInstance(options);
    return result;
  }

  /**
   * Example call to new method {@link StackWalker#getInstance(Set, int)}.
   * @since 9
   * @see StackWalker#getInstance(Set, int)
   */
  public static StackWalker getInstance(Set<Option> options, int estimateDepth)
  {
    StackWalker result = StackWalker.getInstance(options, estimateDepth);
    return result;
  }

  /**
   * Example call to new method {@link StackWalker#walk(Function)}.
   * @since 9
   * @see StackWalker#walk(Function)
   */
  public <T> T walk(Function<? super Stream<StackFrame>, ? extends T> function)
  {
    StackWalker testee = $$$();

    T result = testee.walk(function);
    return result;
  }

  /**
   * Example call to new method {@link StackWalker#forEach(Consumer)}.
   * @since 9
   * @see StackWalker#forEach(Consumer)
   */
  public void forEach(Consumer<? super StackFrame> action)
  {
    StackWalker testee = $$$();

    testee.forEach(action);
  }

  /**
   * Example call to new method {@link StackWalker#getCallerClass()}.
   * @since 9
   * @see StackWalker#getCallerClass()
   */
  public Class<?> getCallerClass()
  {
    StackWalker testee = $$$();

    Class<?> result = testee.getCallerClass();
    return result;
  }

  private StackWalker $$$()
  {
    return null;
  }
}
