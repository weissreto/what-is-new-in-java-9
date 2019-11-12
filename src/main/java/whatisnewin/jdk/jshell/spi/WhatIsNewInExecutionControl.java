package whatisnewin.jdk.jshell.spi;

import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.RunException;
import jdk.jshell.spi.ExecutionControl.EngineTerminationException;
import jdk.jshell.spi.ExecutionControl.InternalException;
import jdk.jshell.spi.ExecutionEnv;
import java.util.Map;
import jdk.jshell.spi.ExecutionControl.ClassBytecodes;
import jdk.jshell.spi.ExecutionControl.ClassInstallException;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ExecutionControl}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ExecutionControl} is a completely new class
 * @since 9
 * @see ExecutionControl
 */
public final class WhatIsNewInExecutionControl
{
  /**
   * Example call to new method {@link ExecutionControl#invoke}
   * @since 9
   * @see ExecutionControl#invoke
   */
  public String invoke(String className, String methodName) throws RunException, EngineTerminationException, InternalException
  {
    ExecutionControl testee = $$$();

    String result = testee.invoke(className, methodName);
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControl#addToClasspath}
   * @since 9
   * @see ExecutionControl#addToClasspath
   */
  public void addToClasspath(String path) throws EngineTerminationException, InternalException
  {
    ExecutionControl testee = $$$();

    testee.addToClasspath(path);
  }

  /**
   * Example call to new method {@link ExecutionControl#extensionCommand}
   * @since 9
   * @see ExecutionControl#extensionCommand
   */
  public Object extensionCommand(String command, Object arg) throws RunException, EngineTerminationException, InternalException
  {
    ExecutionControl testee = $$$();

    Object result = testee.extensionCommand(command, arg);
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControl#close}
   * @since 9
   * @see ExecutionControl#close
   */
  public void close()
  {
    ExecutionControl testee = $$$();

    testee.close();
  }

  /**
   * Example call to new method {@link ExecutionControl#generate}
   * @since 9
   * @see ExecutionControl#generate
   */
  public static ExecutionControl generate(ExecutionEnv env, String name, Map<String, String> parameters) throws Throwable
  {
    ExecutionControl result = ExecutionControl.generate(env, name, parameters);
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControl#generate}
   * @since 9
   * @see ExecutionControl#generate
   */
  public static ExecutionControl generate(ExecutionEnv env, String spec) throws Throwable
  {
    ExecutionControl result = ExecutionControl.generate(env, spec);
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControl#varValue}
   * @since 9
   * @see ExecutionControl#varValue
   */
  public String varValue(String className, String varName) throws RunException, EngineTerminationException, InternalException
  {
    ExecutionControl testee = $$$();

    String result = testee.varValue(className, varName);
    return result;
  }

  /**
   * Example call to new method {@link ExecutionControl#redefine}
   * @since 9
   * @see ExecutionControl#redefine
   */
  public void redefine(ClassBytecodes[] cbcs) throws ClassInstallException, NotImplementedException, EngineTerminationException
  {
    ExecutionControl testee = $$$();

    testee.redefine(cbcs);
  }

  /**
   * Example call to new method {@link ExecutionControl#load}
   * @since 9
   * @see ExecutionControl#load
   */
  public void load(ClassBytecodes[] cbcs) throws ClassInstallException, NotImplementedException, EngineTerminationException
  {
    ExecutionControl testee = $$$();

    testee.load(cbcs);
  }

  /**
   * Example call to new method {@link ExecutionControl#stop}
   * @since 9
   * @see ExecutionControl#stop
   */
  public void stop() throws EngineTerminationException, InternalException
  {
    ExecutionControl testee = $$$();

    testee.stop();
  }

  private ExecutionControl $$$()
  {
    return null;
  }
}
