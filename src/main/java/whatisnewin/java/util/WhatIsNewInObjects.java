package whatisnewin.java.util;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Objects}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Objects} is an old class but has new fields, constructors or methods.
 * @since 1.7
 * @see Objects
 */
public final class WhatIsNewInObjects
{
  /**
   * Example call to new method {@link Objects#requireNonNullElse(Object, Object)}.
   * @since 9
   * @see Objects#requireNonNullElse(Object, Object)
   */
  public static <T> T requireNonNullElse(T obj, T defaultObj)
  {
    T result = Objects.requireNonNullElse(obj, defaultObj);
    return result;
  }

  /**
   * Example call to new method {@link Objects#requireNonNullElseGet(Object, Supplier)}.
   * @since 9
   * @see Objects#requireNonNullElseGet(Object, Supplier)
   */
  public static <T> T requireNonNullElseGet(T obj, Supplier<? extends T> supplier)
  {
    T result = Objects.requireNonNullElseGet(obj, supplier);
    return result;
  }

  /**
   * Example call to new method {@link Objects#checkIndex(int, int)}.
   * @since 9
   * @see Objects#checkIndex(int, int)
   */
  public static int checkIndex(int index, int length)
  {
    int result = Objects.checkIndex(index, length);
    return result;
  }

  /**
   * Example call to new method {@link Objects#checkFromToIndex(int, int, int)}.
   * @since 9
   * @see Objects#checkFromToIndex(int, int, int)
   */
  public static int checkFromToIndex(int fromIndex, int toIndex, int length)
  {
    int result = Objects.checkFromToIndex(fromIndex, toIndex, length);
    return result;
  }

  /**
   * Example call to new method {@link Objects#checkFromIndexSize(int, int, int)}.
   * @since 9
   * @see Objects#checkFromIndexSize(int, int, int)
   */
  public static int checkFromIndexSize(int fromIndex, int size, int length)
  {
    int result = Objects.checkFromIndexSize(fromIndex, size, length);
    return result;
  }

}
