package whatisnewin.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AtomicBoolean}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link AtomicBoolean} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see AtomicBoolean
 */
public final class WhatIsNewInAtomicBoolean
{
  /**
   * Example call to new method {@link AtomicBoolean#weakCompareAndSetPlain(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#weakCompareAndSetPlain(boolean, boolean)
   */
  public boolean weakCompareAndSetPlain(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#getPlain()}.
   * @since 9
   * @see AtomicBoolean#getPlain()
   */
  public boolean getPlain()
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.getPlain();
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#setPlain(boolean)}.
   * @since 9
   * @see AtomicBoolean#setPlain(boolean)
   */
  public void setPlain(boolean newValue)
  {
    AtomicBoolean testee = $$$();

    testee.setPlain(newValue);
  }

  /**
   * Example call to new method {@link AtomicBoolean#getOpaque()}.
   * @since 9
   * @see AtomicBoolean#getOpaque()
   */
  public boolean getOpaque()
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.getOpaque();
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#setOpaque(boolean)}.
   * @since 9
   * @see AtomicBoolean#setOpaque(boolean)
   */
  public void setOpaque(boolean newValue)
  {
    AtomicBoolean testee = $$$();

    testee.setOpaque(newValue);
  }

  /**
   * Example call to new method {@link AtomicBoolean#getAcquire()}.
   * @since 9
   * @see AtomicBoolean#getAcquire()
   */
  public boolean getAcquire()
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.getAcquire();
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#setRelease(boolean)}.
   * @since 9
   * @see AtomicBoolean#setRelease(boolean)
   */
  public void setRelease(boolean newValue)
  {
    AtomicBoolean testee = $$$();

    testee.setRelease(newValue);
  }

  /**
   * Example call to new method {@link AtomicBoolean#compareAndExchange(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#compareAndExchange(boolean, boolean)
   */
  public boolean compareAndExchange(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.compareAndExchange(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#compareAndExchangeAcquire(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#compareAndExchangeAcquire(boolean, boolean)
   */
  public boolean compareAndExchangeAcquire(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.compareAndExchangeAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#compareAndExchangeRelease(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#compareAndExchangeRelease(boolean, boolean)
   */
  public boolean compareAndExchangeRelease(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.compareAndExchangeRelease(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#weakCompareAndSetVolatile(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#weakCompareAndSetVolatile(boolean, boolean)
   */
  public boolean weakCompareAndSetVolatile(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.weakCompareAndSetVolatile(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#weakCompareAndSetAcquire(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#weakCompareAndSetAcquire(boolean, boolean)
   */
  public boolean weakCompareAndSetAcquire(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicBoolean#weakCompareAndSetRelease(boolean, boolean)}.
   * @since 9
   * @see AtomicBoolean#weakCompareAndSetRelease(boolean, boolean)
   */
  public boolean weakCompareAndSetRelease(boolean expectedValue, boolean newValue)
  {
    AtomicBoolean testee = $$$();

    boolean result = testee.weakCompareAndSetRelease(expectedValue, newValue);
    return result;
  }

  private AtomicBoolean $$$()
  {
    return null;
  }
}
