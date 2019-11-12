package whatisnewin.javax.tools;

import javax.tools.JavaCompiler.CompilationTask;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link CompilationTask}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link CompilationTask} is an old class but has new fields, constructors or methods
 * @since UNDEFINED
 * @see CompilationTask
 */
public final class WhatIsNewInJavaCompiler$CompilationTask
{
  /**
   * Example call to new method {@link CompilationTask#addModules}
   * @since 9
   * @see CompilationTask#addModules
   */
  public void addModules(Iterable<String> moduleNames)
  {
    CompilationTask testee = $$$();

    testee.addModules(moduleNames);
  }

  private CompilationTask $$$()
  {
    return null;
  }
}
