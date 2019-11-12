package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.LoaderDelegate;
import jdk.jshell.spi.ExecutionControl.EngineTerminationException;
import jdk.jshell.spi.ExecutionControl.InternalException;
import jdk.jshell.spi.ExecutionControl.ClassBytecodes;
import jdk.jshell.spi.ExecutionControl.ClassInstallException;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link LoaderDelegate}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link LoaderDelegate} is a completely new class
 * @since 9
 * @see LoaderDelegate
 */
public final class WhatIsNewInLoaderDelegate
{
  /**
   * Example call to new method {@link LoaderDelegate#addToClasspath}
   * @since 9
   * @see LoaderDelegate#addToClasspath
   */
  public void addToClasspath(String path) throws EngineTerminationException, InternalException
  {
    LoaderDelegate testee = $$$();

    testee.addToClasspath(path);
  }

  /**
   * Example call to new method {@link LoaderDelegate#findClass}
   * @since 9
   * @see LoaderDelegate#findClass
   */
  public Class<?> findClass(String name) throws ClassNotFoundException
  {
    LoaderDelegate testee = $$$();

    Class<?> result = testee.findClass(name);
    return result;
  }

  /**
   * Example call to new method {@link LoaderDelegate#load}
   * @since 9
   * @see LoaderDelegate#load
   */
  public void load(ClassBytecodes[] cbcs) throws ClassInstallException, NotImplementedException, EngineTerminationException
  {
    LoaderDelegate testee = $$$();

    testee.load(cbcs);
  }

  /**
   * Example call to new method {@link LoaderDelegate#classesRedefined}
   * @since 9
   * @see LoaderDelegate#classesRedefined
   */
  public void classesRedefined(ClassBytecodes[] cbcs)
  {
    LoaderDelegate testee = $$$();

    testee.classesRedefined(cbcs);
  }

  private LoaderDelegate $$$()
  {
    return null;
  }
}
