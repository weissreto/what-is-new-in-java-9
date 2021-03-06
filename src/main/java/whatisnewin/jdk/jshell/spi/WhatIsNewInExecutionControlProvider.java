package whatisnewin.jdk.jshell.spi;

import jdk.jshell.spi.ExecutionControlProvider;
import java.util.Map;
import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionEnv;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ExecutionControlProvider}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link ExecutionControlProvider} is a completely new class.
 * @since 9
 * @see ExecutionControlProvider
 */
public final class WhatIsNewInExecutionControlProvider
{
  /**
   * Example call to new method {@link ExecutionControlProvider#name()}.
   * @since 9
   * @see ExecutionControlProvider#name()
   */
  public String name()
  {
    ExecutionControlProvider testee = $$$();

    String result = testee.name();
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControlProvider#defaultParameters()}.
   * @since 9
   * @see ExecutionControlProvider#defaultParameters()
   */
  public Map<String, String> defaultParameters()
  {
    ExecutionControlProvider testee = $$$();

    Map<String, String> result = testee.defaultParameters();
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControlProvider#generate(ExecutionEnv, Map)}.
   * @since 9
   * @see ExecutionControlProvider#generate(ExecutionEnv, Map)
   */
  public ExecutionControl generate(ExecutionEnv env, Map<String, String> parameters) throws Throwable
  {
    ExecutionControlProvider testee = $$$();

    ExecutionControl result = testee.generate(env, parameters);
    return result;
  }

  private ExecutionControlProvider $$$()
  {
    return null;
  }
}
