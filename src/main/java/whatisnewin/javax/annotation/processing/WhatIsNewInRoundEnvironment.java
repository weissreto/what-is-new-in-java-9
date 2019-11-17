package whatisnewin.javax.annotation.processing;

import javax.annotation.processing.RoundEnvironment;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link RoundEnvironment}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link RoundEnvironment} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see RoundEnvironment
 */
public final class WhatIsNewInRoundEnvironment
{
  /**
   * Example call to new method {@link RoundEnvironment#getElementsAnnotatedWithAny(javax.lang.model.element.TypeElement[])}.
   * @since 9
   * @see RoundEnvironment#getElementsAnnotatedWithAny(javax.lang.model.element.TypeElement[])
   */
  public Set<? extends Element> getElementsAnnotatedWithAny(TypeElement[] annotations)
  {
    RoundEnvironment testee = $$$();

    Set<? extends Element> result = testee.getElementsAnnotatedWithAny(annotations);
    return result;
  }

  private RoundEnvironment $$$()
  {
    return null;
  }
}
