package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.FailOverExecutionControlProvider;
import java.util.Map;
import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionEnv;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link FailOverExecutionControlProvider}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link FailOverExecutionControlProvider} is a completely new class.
 * @since 9
 * @see FailOverExecutionControlProvider
 */
public final class WhatIsNewInFailOverExecutionControlProvider
{
  /**
   * Example call to new constructor {@link FailOverExecutionControlProvider#FailOverExecutionControlProvider()}.
   * @since 9
   * @see FailOverExecutionControlProvider#FailOverExecutionControlProvider()
   */
  public WhatIsNewInFailOverExecutionControlProvider()
  {
    FailOverExecutionControlProvider testee = new FailOverExecutionControlProvider();
  }

  /**
   * Example call to new method {@link FailOverExecutionControlProvider#name()}.
   * @since 9
   * @see FailOverExecutionControlProvider#name()
   */
  public String name()
  {
    FailOverExecutionControlProvider testee = $$$();

    String result = testee.name();
    return result;
  }

  /**
   * Example call to new method {@link FailOverExecutionControlProvider#defaultParameters()}.
   * @since 9
   * @see FailOverExecutionControlProvider#defaultParameters()
   */
  public Map<String, String> defaultParameters()
  {
    FailOverExecutionControlProvider testee = $$$();

    Map<String, String> result = testee.defaultParameters();
    return result;
  }

  /**
   * Example call to new method {@link FailOverExecutionControlProvider#generate(ExecutionEnv, Map)}.
   * @since 9
   * @see FailOverExecutionControlProvider#generate(ExecutionEnv, Map)
   */
  public ExecutionControl generate(ExecutionEnv env, Map<String, String> parameters) throws Throwable
  {
    FailOverExecutionControlProvider testee = $$$();

    ExecutionControl result = testee.generate(env, parameters);
    return result;
  }

  private FailOverExecutionControlProvider $$$()
  {
    return null;
  }
}
