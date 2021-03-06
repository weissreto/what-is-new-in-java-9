package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.Util;
import jdk.jshell.spi.ExecutionControl;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.function.Consumer;
import java.io.IOException;
import java.util.function.BiFunction;
import com.sun.jdi.VirtualMachine;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Util}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Util} is a completely new class.
 * @since 9
 * @see Util
 */
public final class WhatIsNewInUtil
{
  /**
   * Example call to new method {@link Util#forwardExecutionControl(ExecutionControl, ObjectInput, ObjectOutput)}.
   * @since 9
   * @see Util#forwardExecutionControl(ExecutionControl, ObjectInput, ObjectOutput)
   */
  public static void forwardExecutionControl(ExecutionControl ec, ObjectInput in, ObjectOutput out)
  {
    Util.forwardExecutionControl(ec, in, out);
  }

  /**
   * Example call to new method {@link Util#forwardExecutionControlAndIO(ExecutionControl, InputStream, OutputStream, Map, Map)}.
   * @since 9
   * @see Util#forwardExecutionControlAndIO(ExecutionControl, InputStream, OutputStream, Map, Map)
   */
  public static void forwardExecutionControlAndIO(ExecutionControl ec, InputStream inStream, OutputStream outStream, Map<String, Consumer<OutputStream>> outputStreamMap, Map<String, Consumer<InputStream>> inputStreamMap) throws IOException
  {
    Util.forwardExecutionControlAndIO(ec, inStream, outStream, outputStreamMap, inputStreamMap);
  }

  /**
   * Example call to new method {@link Util#remoteInputOutput(InputStream, OutputStream, Map, Map, BiFunction)}.
   * @since 9
   * @see Util#remoteInputOutput(InputStream, OutputStream, Map, Map, BiFunction)
   */
  public static ExecutionControl remoteInputOutput(InputStream input, OutputStream output, Map<String, OutputStream> outputStreamMap, Map<String, InputStream> inputStreamMap, BiFunction<ObjectInput, ObjectOutput, ExecutionControl> factory) throws IOException
  {
    ExecutionControl result = Util.remoteInputOutput(input, output, outputStreamMap, inputStreamMap, factory);
    return result;
  }

  /**
   * Example call to new method {@link Util#detectJdiExitEvent(VirtualMachine, Consumer)}.
   * @since 9
   * @see Util#detectJdiExitEvent(VirtualMachine, Consumer)
   */
  public static void detectJdiExitEvent(VirtualMachine vm, Consumer<String> unbiddenExitHandler)
  {
    Util.detectJdiExitEvent(vm, unbiddenExitHandler);
  }

}
