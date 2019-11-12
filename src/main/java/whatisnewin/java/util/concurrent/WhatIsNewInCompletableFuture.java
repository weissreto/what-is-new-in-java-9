package whatisnewin.java.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CompletionStage;
import java.util.function.Supplier;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link CompletableFuture}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link CompletableFuture} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see CompletableFuture
 */
public final class WhatIsNewInCompletableFuture<T>
{
  /**
   * Example call to new method {@link CompletableFuture#defaultExecutor}
   * @since 9
   * @see CompletableFuture#defaultExecutor
   */
  public Executor defaultExecutor()
  {
    CompletableFuture<T> testee = $$$();

    Executor result = testee.defaultExecutor();
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#completeOnTimeout}
   * @since 9
   * @see CompletableFuture#completeOnTimeout
   */
  public CompletableFuture<T> completeOnTimeout(T value, long timeout, TimeUnit unit)
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<T> result = testee.completeOnTimeout(value, timeout, unit);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#copy}
   * @since 9
   * @see CompletableFuture#copy
   */
  public CompletableFuture<T> copy()
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<T> result = testee.copy();
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#minimalCompletionStage}
   * @since 9
   * @see CompletableFuture#minimalCompletionStage
   */
  public CompletionStage<T> minimalCompletionStage()
  {
    CompletableFuture<T> testee = $$$();

    CompletionStage<T> result = testee.minimalCompletionStage();
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#failedFuture}
   * @since 9
   * @see CompletableFuture#failedFuture
   */
  public static <U> CompletableFuture<U> failedFuture(Throwable ex)
  {
    CompletableFuture<U> result = CompletableFuture.failedFuture(ex);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#delayedExecutor}
   * @since 9
   * @see CompletableFuture#delayedExecutor
   */
  public static Executor delayedExecutor(long delay, TimeUnit unit, Executor executor)
  {
    Executor result = CompletableFuture.delayedExecutor(delay, unit, executor);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#delayedExecutor}
   * @since 9
   * @see CompletableFuture#delayedExecutor
   */
  public static Executor delayedExecutor(long delay, TimeUnit unit)
  {
    Executor result = CompletableFuture.delayedExecutor(delay, unit);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#completedStage}
   * @since 9
   * @see CompletableFuture#completedStage
   */
  public static <U> CompletionStage<U> completedStage(U value)
  {
    CompletionStage<U> result = CompletableFuture.completedStage(value);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#completeAsync}
   * @since 9
   * @see CompletableFuture#completeAsync
   */
  public CompletableFuture<T> completeAsync(Supplier<? extends T> supplier, Executor executor)
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<T> result = testee.completeAsync(supplier, executor);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#completeAsync}
   * @since 9
   * @see CompletableFuture#completeAsync
   */
  public CompletableFuture<T> completeAsync(Supplier<? extends T> supplier)
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<T> result = testee.completeAsync(supplier);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#orTimeout}
   * @since 9
   * @see CompletableFuture#orTimeout
   */
  public CompletableFuture<T> orTimeout(long timeout, TimeUnit unit)
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<T> result = testee.orTimeout(timeout, unit);
    return result;
  }

  /**
   * Example call to new method {@link CompletableFuture#newIncompleteFuture}
   * @since 9
   * @see CompletableFuture#newIncompleteFuture
   */
  public <U> CompletableFuture<U> newIncompleteFuture()
  {
    CompletableFuture<T> testee = $$$();

    CompletableFuture<U> result = testee.newIncompleteFuture();
    return result;
  }

  private CompletableFuture $$$()
  {
    return null;
  }
}
