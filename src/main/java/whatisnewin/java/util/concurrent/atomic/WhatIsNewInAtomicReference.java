package whatisnewin.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AtomicReference}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link AtomicReference} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see AtomicReference
 */
public final class WhatIsNewInAtomicReference<V>
{
  /**
   * Example call to new method {@link AtomicReference#setOpaque(Object)}.
   * @since 9
   * @see AtomicReference#setOpaque(Object)
   */
  public void setOpaque(V newValue)
  {
    AtomicReference<V> testee = $$$();

    testee.setOpaque(newValue);
  }

  /**
   * Example call to new method {@link AtomicReference#weakCompareAndSetVolatile(Object, Object)}.
   * @since 9
   * @see AtomicReference#weakCompareAndSetVolatile(Object, Object)
   */
  public boolean weakCompareAndSetVolatile(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    boolean result = testee.weakCompareAndSetVolatile(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#getPlain()}.
   * @since 9
   * @see AtomicReference#getPlain()
   */
  public V getPlain()
  {
    AtomicReference<V> testee = $$$();

    V result = testee.getPlain();
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#getOpaque()}.
   * @since 9
   * @see AtomicReference#getOpaque()
   */
  public V getOpaque()
  {
    AtomicReference<V> testee = $$$();

    V result = testee.getOpaque();
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#compareAndExchangeRelease(Object, Object)}.
   * @since 9
   * @see AtomicReference#compareAndExchangeRelease(Object, Object)
   */
  public V compareAndExchangeRelease(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    V result = testee.compareAndExchangeRelease(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#getAcquire()}.
   * @since 9
   * @see AtomicReference#getAcquire()
   */
  public V getAcquire()
  {
    AtomicReference<V> testee = $$$();

    V result = testee.getAcquire();
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#weakCompareAndSetAcquire(Object, Object)}.
   * @since 9
   * @see AtomicReference#weakCompareAndSetAcquire(Object, Object)
   */
  public boolean weakCompareAndSetAcquire(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#setRelease(Object)}.
   * @since 9
   * @see AtomicReference#setRelease(Object)
   */
  public void setRelease(V newValue)
  {
    AtomicReference<V> testee = $$$();

    testee.setRelease(newValue);
  }

  /**
   * Example call to new method {@link AtomicReference#compareAndExchangeAcquire(Object, Object)}.
   * @since 9
   * @see AtomicReference#compareAndExchangeAcquire(Object, Object)
   */
  public V compareAndExchangeAcquire(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    V result = testee.compareAndExchangeAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#compareAndExchange(Object, Object)}.
   * @since 9
   * @see AtomicReference#compareAndExchange(Object, Object)
   */
  public V compareAndExchange(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    V result = testee.compareAndExchange(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReference#setPlain(Object)}.
   * @since 9
   * @see AtomicReference#setPlain(Object)
   */
  public void setPlain(V newValue)
  {
    AtomicReference<V> testee = $$$();

    testee.setPlain(newValue);
  }

  /**
   * Example call to new method {@link AtomicReference#weakCompareAndSetPlain(Object, Object)}.
   * @since 9
   * @see AtomicReference#weakCompareAndSetPlain(Object, Object)
   */
  public boolean weakCompareAndSetPlain(V expectedValue, V newValue)
  {
    AtomicReference<V> testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(expectedValue, newValue);
    return result;
  }

  private AtomicReference $$$()
  {
    return null;
  }
}
