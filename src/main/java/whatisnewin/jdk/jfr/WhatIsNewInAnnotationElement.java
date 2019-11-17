package whatisnewin.jdk.jfr;

import jdk.jfr.AnnotationElement;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.List;
import jdk.jfr.ValueDescriptor;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AnnotationElement}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link AnnotationElement} is a completely new class.
 * @since 9
 * @see AnnotationElement
 */
public final class WhatIsNewInAnnotationElement
{
  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement(Class, Map)}.
   * @since 9
   * @see AnnotationElement#AnnotationElement(Class, Map)
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType, Map<String, Object> values)
  {
    AnnotationElement testee = new AnnotationElement(annotationType, values);
  }

  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement(Class, Object)}.
   * @since 9
   * @see AnnotationElement#AnnotationElement(Class, Object)
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType, Object value)
  {
    AnnotationElement testee = new AnnotationElement(annotationType, value);
  }

  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement(Class)}.
   * @since 9
   * @see AnnotationElement#AnnotationElement(Class)
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType)
  {
    AnnotationElement testee = new AnnotationElement(annotationType);
  }

  /**
   * Example call to new method {@link AnnotationElement#getValues()}.
   * @since 9
   * @see AnnotationElement#getValues()
   */
  public List<Object> getValues()
  {
    AnnotationElement testee = $$$();

    List<Object> result = testee.getValues();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getAnnotation(Class)}.
   * @since 9
   * @see AnnotationElement#getAnnotation(Class)
   */
  public <A> A getAnnotation(Class<? extends Annotation> annotationType)
  {
    AnnotationElement testee = $$$();

    A result = testee.getAnnotation(annotationType);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getAnnotationElements()}.
   * @since 9
   * @see AnnotationElement#getAnnotationElements()
   */
  public List<AnnotationElement> getAnnotationElements()
  {
    AnnotationElement testee = $$$();

    List<AnnotationElement> result = testee.getAnnotationElements();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getValue(String)}.
   * @since 9
   * @see AnnotationElement#getValue(String)
   */
  public Object getValue(String name)
  {
    AnnotationElement testee = $$$();

    Object result = testee.getValue(name);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getTypeName()}.
   * @since 9
   * @see AnnotationElement#getTypeName()
   */
  public String getTypeName()
  {
    AnnotationElement testee = $$$();

    String result = testee.getTypeName();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getTypeId()}.
   * @since 9
   * @see AnnotationElement#getTypeId()
   */
  public long getTypeId()
  {
    AnnotationElement testee = $$$();

    long result = testee.getTypeId();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#hasValue(String)}.
   * @since 9
   * @see AnnotationElement#hasValue(String)
   */
  public boolean hasValue(String name)
  {
    AnnotationElement testee = $$$();

    boolean result = testee.hasValue(name);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getValueDescriptors()}.
   * @since 9
   * @see AnnotationElement#getValueDescriptors()
   */
  public List<ValueDescriptor> getValueDescriptors()
  {
    AnnotationElement testee = $$$();

    List<ValueDescriptor> result = testee.getValueDescriptors();
    return result;
  }

  private AnnotationElement $$$()
  {
    return null;
  }
}
