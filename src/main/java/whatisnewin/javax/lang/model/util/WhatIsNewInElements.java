package whatisnewin.javax.lang.model.util;

import javax.lang.model.util.Elements;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.util.Elements.Origin;
import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.ModuleElement.Directive;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Elements}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Elements} is an old class but has new fields, constructors or methods
 * @since 1.6
 * @see Elements
 */
public final class WhatIsNewInElements
{
  /**
   * Example call to new method {@link Elements#getModuleElement}
   * @since 9
   * @see Elements#getModuleElement
   */
  public ModuleElement getModuleElement(CharSequence name)
  {
    Elements testee = $$$();

    ModuleElement result = testee.getModuleElement(name);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getTypeElement}
   * @since 9
   * @see Elements#getTypeElement
   */
  public TypeElement getTypeElement(ModuleElement module, CharSequence name)
  {
    Elements testee = $$$();

    TypeElement result = testee.getTypeElement(module, name);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getAllModuleElements}
   * @since 9
   * @see Elements#getAllModuleElements
   */
  public Set<? extends ModuleElement> getAllModuleElements()
  {
    Elements testee = $$$();

    Set<? extends ModuleElement> result = testee.getAllModuleElements();
    return result;
  }

  /**
   * Example call to new method {@link Elements#isBridge}
   * @since 9
   * @see Elements#isBridge
   */
  public boolean isBridge(ExecutableElement e)
  {
    Elements testee = $$$();

    boolean result = testee.isBridge(e);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getModuleOf}
   * @since 9
   * @see Elements#getModuleOf
   */
  public ModuleElement getModuleOf(Element type)
  {
    Elements testee = $$$();

    ModuleElement result = testee.getModuleOf(type);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getAllPackageElements}
   * @since 9
   * @see Elements#getAllPackageElements
   */
  public Set<? extends PackageElement> getAllPackageElements(CharSequence name)
  {
    Elements testee = $$$();

    Set<? extends PackageElement> result = testee.getAllPackageElements(name);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getOrigin}
   * @since 9
   * @see Elements#getOrigin
   */
  public Origin getOrigin(Element e)
  {
    Elements testee = $$$();

    Origin result = testee.getOrigin(e);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getOrigin}
   * @since 9
   * @see Elements#getOrigin
   */
  public Origin getOrigin(AnnotatedConstruct c, AnnotationMirror a)
  {
    Elements testee = $$$();

    Origin result = testee.getOrigin(c, a);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getOrigin}
   * @since 9
   * @see Elements#getOrigin
   */
  public Origin getOrigin(ModuleElement m, Directive directive)
  {
    Elements testee = $$$();

    Origin result = testee.getOrigin(m, directive);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getAllTypeElements}
   * @since 9
   * @see Elements#getAllTypeElements
   */
  public Set<? extends TypeElement> getAllTypeElements(CharSequence name)
  {
    Elements testee = $$$();

    Set<? extends TypeElement> result = testee.getAllTypeElements(name);
    return result;
  }

  /**
   * Example call to new method {@link Elements#getPackageElement}
   * @since 9
   * @see Elements#getPackageElement
   */
  public PackageElement getPackageElement(ModuleElement module, CharSequence name)
  {
    Elements testee = $$$();

    PackageElement result = testee.getPackageElement(module, name);
    return result;
  }

  private Elements $$$()
  {
    return null;
  }
}