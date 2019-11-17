package whatisnewin.java.lang;

import java.util.stream.Stream;
import java.net.URL;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ClassLoader}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link ClassLoader} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see ClassLoader
 */
public final class WhatIsNewInClassLoader
{
  /**
   * Example call to new method {@link ClassLoader#getName()}.
   * @since 9
   * @see ClassLoader#getName()
   */
  public String getName()
  {
    ClassLoader testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#resources(String)}.
   * @since 9
   * @see ClassLoader#resources(String)
   */
  public Stream<URL> resources(String name)
  {
    ClassLoader testee = $$$();

    Stream<URL> result = testee.resources(name);
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#isRegisteredAsParallelCapable()}.
   * @since 9
   * @see ClassLoader#isRegisteredAsParallelCapable()
   */
  public boolean isRegisteredAsParallelCapable()
  {
    ClassLoader testee = $$$();

    boolean result = testee.isRegisteredAsParallelCapable();
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#getUnnamedModule()}.
   * @since 9
   * @see ClassLoader#getUnnamedModule()
   */
  public Module getUnnamedModule()
  {
    ClassLoader testee = $$$();

    Module result = testee.getUnnamedModule();
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#getPlatformClassLoader()}.
   * @since 9
   * @see ClassLoader#getPlatformClassLoader()
   */
  public static ClassLoader getPlatformClassLoader()
  {
    ClassLoader result = ClassLoader.getPlatformClassLoader();
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#getDefinedPackage(String)}.
   * @since 9
   * @see ClassLoader#getDefinedPackage(String)
   */
  public Package getDefinedPackage(String name)
  {
    ClassLoader testee = $$$();

    Package result = testee.getDefinedPackage(name);
    return result;
  }

  /**
   * Example call to new method {@link ClassLoader#getDefinedPackages()}.
   * @since 9
   * @see ClassLoader#getDefinedPackages()
   */
  public Package[] getDefinedPackages()
  {
    ClassLoader testee = $$$();

    Package[] result = testee.getDefinedPackages();
    return result;
  }

  private ClassLoader $$$()
  {
    return null;
  }
}
