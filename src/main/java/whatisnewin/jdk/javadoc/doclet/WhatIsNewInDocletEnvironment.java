package whatisnewin.jdk.javadoc.doclet;

import jdk.javadoc.doclet.DocletEnvironment;
import java.util.Set;
import javax.lang.model.element.Element;
import com.sun.source.util.DocTrees;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileManager;
import javax.lang.model.SourceVersion;
import jdk.javadoc.doclet.DocletEnvironment.ModuleMode;
import javax.tools.JavaFileObject.Kind;
import javax.lang.model.element.TypeElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DocletEnvironment}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link DocletEnvironment} is a completely new class.
 * @since 9
 * @see DocletEnvironment
 */
public final class WhatIsNewInDocletEnvironment
{
  /**
   * Example call to new method {@link DocletEnvironment#getSpecifiedElements()}.
   * @since 9
   * @see DocletEnvironment#getSpecifiedElements()
   */
  public Set<? extends Element> getSpecifiedElements()
  {
    DocletEnvironment testee = $$$();

    Set<? extends Element> result = testee.getSpecifiedElements();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getIncludedElements()}.
   * @since 9
   * @see DocletEnvironment#getIncludedElements()
   */
  public Set<? extends Element> getIncludedElements()
  {
    DocletEnvironment testee = $$$();

    Set<? extends Element> result = testee.getIncludedElements();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getDocTrees()}.
   * @since 9
   * @see DocletEnvironment#getDocTrees()
   */
  public DocTrees getDocTrees()
  {
    DocletEnvironment testee = $$$();

    DocTrees result = testee.getDocTrees();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getElementUtils()}.
   * @since 9
   * @see DocletEnvironment#getElementUtils()
   */
  public Elements getElementUtils()
  {
    DocletEnvironment testee = $$$();

    Elements result = testee.getElementUtils();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getTypeUtils()}.
   * @since 9
   * @see DocletEnvironment#getTypeUtils()
   */
  public Types getTypeUtils()
  {
    DocletEnvironment testee = $$$();

    Types result = testee.getTypeUtils();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#isIncluded(Element)}.
   * @since 9
   * @see DocletEnvironment#isIncluded(Element)
   */
  public boolean isIncluded(Element e)
  {
    DocletEnvironment testee = $$$();

    boolean result = testee.isIncluded(e);
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#isSelected(Element)}.
   * @since 9
   * @see DocletEnvironment#isSelected(Element)
   */
  public boolean isSelected(Element e)
  {
    DocletEnvironment testee = $$$();

    boolean result = testee.isSelected(e);
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getJavaFileManager()}.
   * @since 9
   * @see DocletEnvironment#getJavaFileManager()
   */
  public JavaFileManager getJavaFileManager()
  {
    DocletEnvironment testee = $$$();

    JavaFileManager result = testee.getJavaFileManager();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getSourceVersion()}.
   * @since 9
   * @see DocletEnvironment#getSourceVersion()
   */
  public SourceVersion getSourceVersion()
  {
    DocletEnvironment testee = $$$();

    SourceVersion result = testee.getSourceVersion();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getModuleMode()}.
   * @since 9
   * @see DocletEnvironment#getModuleMode()
   */
  public ModuleMode getModuleMode()
  {
    DocletEnvironment testee = $$$();

    ModuleMode result = testee.getModuleMode();
    return result;
  }

  /**
   * Example call to new method {@link DocletEnvironment#getFileKind(TypeElement)}.
   * @since 9
   * @see DocletEnvironment#getFileKind(TypeElement)
   */
  public Kind getFileKind(TypeElement type)
  {
    DocletEnvironment testee = $$$();

    Kind result = testee.getFileKind(type);
    return result;
  }

  private DocletEnvironment $$$()
  {
    return null;
  }
}
