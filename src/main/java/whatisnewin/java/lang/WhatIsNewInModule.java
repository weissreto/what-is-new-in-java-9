package whatisnewin.java.lang;

import java.lang.annotation.Annotation;
import java.util.Set;
import java.io.InputStream;
import java.io.IOException;
import java.lang.module.ModuleDescriptor;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Module}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Module} is a completely new class
 * @since 9
 * @see Module
 */
public final class WhatIsNewInModule
{
  /**
   * Example call to new method {@link Module#getAnnotation}
   * @since 9
   * @see Module#getAnnotation
   */
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass)
  {
    Module testee = $$$();

    T result = testee.getAnnotation(annotationClass);
    return result;
  }

  /**
   * Example call to new method {@link Module#isExported}
   * @since 9
   * @see Module#isExported
   */
  public boolean isExported(String pn, Module other)
  {
    Module testee = $$$();

    boolean result = testee.isExported(pn, other);
    return result;
  }

  /**
   * Example call to new method {@link Module#isExported}
   * @since 9
   * @see Module#isExported
   */
  public boolean isExported(String pn)
  {
    Module testee = $$$();

    boolean result = testee.isExported(pn);
    return result;
  }

  /**
   * Example call to new method {@link Module#isOpen}
   * @since 9
   * @see Module#isOpen
   */
  public boolean isOpen(String pn, Module other)
  {
    Module testee = $$$();

    boolean result = testee.isOpen(pn, other);
    return result;
  }

  /**
   * Example call to new method {@link Module#isOpen}
   * @since 9
   * @see Module#isOpen
   */
  public boolean isOpen(String pn)
  {
    Module testee = $$$();

    boolean result = testee.isOpen(pn);
    return result;
  }

  /**
   * Example call to new method {@link Module#getPackages}
   * @since 9
   * @see Module#getPackages
   */
  public Set<String> getPackages()
  {
    Module testee = $$$();

    Set<String> result = testee.getPackages();
    return result;
  }

  /**
   * Example call to new method {@link Module#addOpens}
   * @since 9
   * @see Module#addOpens
   */
  public Module addOpens(String pn, Module other)
  {
    Module testee = $$$();

    Module result = testee.addOpens(pn, other);
    return result;
  }

  /**
   * Example call to new method {@link Module#addReads}
   * @since 9
   * @see Module#addReads
   */
  public Module addReads(Module other)
  {
    Module testee = $$$();

    Module result = testee.addReads(other);
    return result;
  }

  /**
   * Example call to new method {@link Module#canRead}
   * @since 9
   * @see Module#canRead
   */
  public boolean canRead(Module other)
  {
    Module testee = $$$();

    boolean result = testee.canRead(other);
    return result;
  }

  /**
   * Example call to new method {@link Module#getLayer}
   * @since 9
   * @see Module#getLayer
   */
  public ModuleLayer getLayer()
  {
    Module testee = $$$();

    ModuleLayer result = testee.getLayer();
    return result;
  }

  /**
   * Example call to new method {@link Module#addUses}
   * @since 9
   * @see Module#addUses
   */
  public Module addUses(Class<?> service)
  {
    Module testee = $$$();

    Module result = testee.addUses(service);
    return result;
  }

  /**
   * Example call to new method {@link Module#getResourceAsStream}
   * @since 9
   * @see Module#getResourceAsStream
   */
  public InputStream getResourceAsStream(String name) throws IOException
  {
    Module testee = $$$();

    InputStream result = testee.getResourceAsStream(name);
    return result;
  }

  /**
   * Example call to new method {@link Module#getDescriptor}
   * @since 9
   * @see Module#getDescriptor
   */
  public ModuleDescriptor getDescriptor()
  {
    Module testee = $$$();

    ModuleDescriptor result = testee.getDescriptor();
    return result;
  }

  /**
   * Example call to new method {@link Module#getName}
   * @since 9
   * @see Module#getName
   */
  public String getName()
  {
    Module testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link Module#getAnnotations}
   * @since 9
   * @see Module#getAnnotations
   */
  public Annotation[] getAnnotations()
  {
    Module testee = $$$();

    Annotation[] result = testee.getAnnotations();
    return result;
  }

  /**
   * Example call to new method {@link Module#canUse}
   * @since 9
   * @see Module#canUse
   */
  public boolean canUse(Class<?> service)
  {
    Module testee = $$$();

    boolean result = testee.canUse(service);
    return result;
  }

  /**
   * Example call to new method {@link Module#getDeclaredAnnotations}
   * @since 9
   * @see Module#getDeclaredAnnotations
   */
  public Annotation[] getDeclaredAnnotations()
  {
    Module testee = $$$();

    Annotation[] result = testee.getDeclaredAnnotations();
    return result;
  }

  /**
   * Example call to new method {@link Module#addExports}
   * @since 9
   * @see Module#addExports
   */
  public Module addExports(String pn, Module other)
  {
    Module testee = $$$();

    Module result = testee.addExports(pn, other);
    return result;
  }

  /**
   * Example call to new method {@link Module#getClassLoader}
   * @since 9
   * @see Module#getClassLoader
   */
  public ClassLoader getClassLoader()
  {
    Module testee = $$$();

    ClassLoader result = testee.getClassLoader();
    return result;
  }

  /**
   * Example call to new method {@link Module#isNamed}
   * @since 9
   * @see Module#isNamed
   */
  public boolean isNamed()
  {
    Module testee = $$$();

    boolean result = testee.isNamed();
    return result;
  }

  private Module $$$()
  {
    return null;
  }
}
