package whatisnewin.java.lang.invoke;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.lang.invoke.VarHandle.AccessMode;
import java.nio.ByteOrder;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link MethodHandles}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link MethodHandles} is an old class but has new fields, constructors or methods
 * @since 1.7
 * @see MethodHandles
 */
public final class WhatIsNewInMethodHandles
{
  /**
   * Example call to new method {@link MethodHandles#whileLoop}
   * @since 9
   * @see MethodHandles#whileLoop
   */
  public static MethodHandle whileLoop(MethodHandle init, MethodHandle pred, MethodHandle body)
  {
    MethodHandle result = MethodHandles.whileLoop(init, pred, body);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#privateLookupIn}
   * @since 9
   * @see MethodHandles#privateLookupIn
   */
  public static Lookup privateLookupIn(Class<?> targetClass, Lookup lookup) throws IllegalAccessException
  {
    Lookup result = MethodHandles.privateLookupIn(targetClass, lookup);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#empty}
   * @since 9
   * @see MethodHandles#empty
   */
  public static MethodHandle empty(MethodType type)
  {
    MethodHandle result = MethodHandles.empty(type);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#arrayElementVarHandle}
   * @since 9
   * @see MethodHandles#arrayElementVarHandle
   */
  public static VarHandle arrayElementVarHandle(Class<?> arrayClass) throws IllegalArgumentException
  {
    VarHandle result = MethodHandles.arrayElementVarHandle(arrayClass);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#varHandleInvoker}
   * @since 9
   * @see MethodHandles#varHandleInvoker
   */
  public static MethodHandle varHandleInvoker(AccessMode accessMode, MethodType type)
  {
    MethodHandle result = MethodHandles.varHandleInvoker(accessMode, type);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#arrayConstructor}
   * @since 9
   * @see MethodHandles#arrayConstructor
   */
  public static MethodHandle arrayConstructor(Class<?> arrayClass) throws IllegalArgumentException
  {
    MethodHandle result = MethodHandles.arrayConstructor(arrayClass);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#loop}
   * @since 9
   * @see MethodHandles#loop
   */
  public static MethodHandle loop(MethodHandle[][] clauses)
  {
    MethodHandle result = MethodHandles.loop(clauses);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#arrayLength}
   * @since 9
   * @see MethodHandles#arrayLength
   */
  public static MethodHandle arrayLength(Class<?> arrayClass) throws IllegalArgumentException
  {
    MethodHandle result = MethodHandles.arrayLength(arrayClass);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#byteBufferViewVarHandle}
   * @since 9
   * @see MethodHandles#byteBufferViewVarHandle
   */
  public static VarHandle byteBufferViewVarHandle(Class<?> viewArrayClass, ByteOrder byteOrder) throws IllegalArgumentException
  {
    VarHandle result = MethodHandles.byteBufferViewVarHandle(viewArrayClass, byteOrder);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#zero}
   * @since 9
   * @see MethodHandles#zero
   */
  public static MethodHandle zero(Class<?> type)
  {
    MethodHandle result = MethodHandles.zero(type);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#foldArguments}
   * @since 9
   * @see MethodHandles#foldArguments
   */
  public static MethodHandle foldArguments(MethodHandle target, int pos, MethodHandle combiner)
  {
    MethodHandle result = MethodHandles.foldArguments(target, pos, combiner);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#countedLoop}
   * @since 9
   * @see MethodHandles#countedLoop
   */
  public static MethodHandle countedLoop(MethodHandle iterations, MethodHandle init, MethodHandle body)
  {
    MethodHandle result = MethodHandles.countedLoop(iterations, init, body);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#countedLoop}
   * @since 9
   * @see MethodHandles#countedLoop
   */
  public static MethodHandle countedLoop(MethodHandle start, MethodHandle end, MethodHandle init, MethodHandle body)
  {
    MethodHandle result = MethodHandles.countedLoop(start, end, init, body);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#dropArgumentsToMatch}
   * @since 9
   * @see MethodHandles#dropArgumentsToMatch
   */
  public static MethodHandle dropArgumentsToMatch(MethodHandle target, int skip, List<Class<?>> newTypes, int pos)
  {
    MethodHandle result = MethodHandles.dropArgumentsToMatch(target, skip, newTypes, pos);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#varHandleExactInvoker}
   * @since 9
   * @see MethodHandles#varHandleExactInvoker
   */
  public static MethodHandle varHandleExactInvoker(AccessMode accessMode, MethodType type)
  {
    MethodHandle result = MethodHandles.varHandleExactInvoker(accessMode, type);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#doWhileLoop}
   * @since 9
   * @see MethodHandles#doWhileLoop
   */
  public static MethodHandle doWhileLoop(MethodHandle init, MethodHandle body, MethodHandle pred)
  {
    MethodHandle result = MethodHandles.doWhileLoop(init, body, pred);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#byteArrayViewVarHandle}
   * @since 9
   * @see MethodHandles#byteArrayViewVarHandle
   */
  public static VarHandle byteArrayViewVarHandle(Class<?> viewArrayClass, ByteOrder byteOrder) throws IllegalArgumentException
  {
    VarHandle result = MethodHandles.byteArrayViewVarHandle(viewArrayClass, byteOrder);
    return result;
  }

  /**
   * Example call to new method {@link MethodHandles#iteratedLoop}
   * @since 9
   * @see MethodHandles#iteratedLoop
   */
  public static MethodHandle iteratedLoop(MethodHandle iterator, MethodHandle init, MethodHandle body)
  {
    MethodHandle result = MethodHandles.iteratedLoop(iterator, init, body);
    return result;
  }

}