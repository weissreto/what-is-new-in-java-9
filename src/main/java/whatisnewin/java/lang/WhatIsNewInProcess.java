package whatisnewin.java.lang;

import java.util.concurrent.CompletableFuture;
import java.lang.ProcessHandle.Info;
import java.util.stream.Stream;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Process}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Process} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Process
 */
public final class WhatIsNewInProcess
{
  /**
   * Example call to new method {@link Process#supportsNormalTermination()}.
   * @since 9
   * @see Process#supportsNormalTermination()
   */
  public boolean supportsNormalTermination()
  {
    Process testee = $$$();

    boolean result = testee.supportsNormalTermination();
    return result;
  }

  /**
   * Example call to new method {@link Process#pid()}.
   * @since 9
   * @see Process#pid()
   */
  public long pid()
  {
    Process testee = $$$();

    long result = testee.pid();
    return result;
  }

  /**
   * Example call to new method {@link Process#onExit()}.
   * @since 9
   * @see Process#onExit()
   */
  public CompletableFuture<Process> onExit()
  {
    Process testee = $$$();

    CompletableFuture<Process> result = testee.onExit();
    return result;
  }

  /**
   * Example call to new method {@link Process#toHandle()}.
   * @since 9
   * @see Process#toHandle()
   */
  public ProcessHandle toHandle()
  {
    Process testee = $$$();

    ProcessHandle result = testee.toHandle();
    return result;
  }

  /**
   * Example call to new method {@link Process#info()}.
   * @since 9
   * @see Process#info()
   */
  public Info info()
  {
    Process testee = $$$();

    Info result = testee.info();
    return result;
  }

  /**
   * Example call to new method {@link Process#children()}.
   * @since 9
   * @see Process#children()
   */
  public Stream<ProcessHandle> children()
  {
    Process testee = $$$();

    Stream<ProcessHandle> result = testee.children();
    return result;
  }

  /**
   * Example call to new method {@link Process#descendants()}.
   * @since 9
   * @see Process#descendants()
   */
  public Stream<ProcessHandle> descendants()
  {
    Process testee = $$$();

    Stream<ProcessHandle> result = testee.descendants();
    return result;
  }

  private Process $$$()
  {
    return null;
  }
}
