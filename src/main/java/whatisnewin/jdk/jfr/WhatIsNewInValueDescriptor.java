package whatisnewin.jdk.jfr;

import jdk.jfr.ValueDescriptor;
import java.util.List;
import jdk.jfr.AnnotationElement;
import java.lang.annotation.Annotation;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ValueDescriptor}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ValueDescriptor} is a completely new class
 * @since 9
 * @see ValueDescriptor
 */
public final class WhatIsNewInValueDescriptor
{
  /**
   * Example call to new constructor {@link ValueDescriptor#ValueDescriptor}
   * @since 9
   * @see ValueDescriptor#ValueDescriptor
   */
  public WhatIsNewInValueDescriptor(Class<?> type, String name)
  {
    ValueDescriptor testee = new ValueDescriptor(type, name);
  }

  /**
   * Example call to new constructor {@link ValueDescriptor#ValueDescriptor}
   * @since 9
   * @see ValueDescriptor#ValueDescriptor
   */
  public WhatIsNewInValueDescriptor(Class<?> type, String name, List<AnnotationElement> annotations)
  {
    ValueDescriptor testee = new ValueDescriptor(type, name, annotations);
  }

  /**
   * Example call to new method {@link ValueDescriptor#getLabel}
   * @since 9
   * @see ValueDescriptor#getLabel
   */
  public String getLabel()
  {
    ValueDescriptor testee = $$$();

    String result = testee.getLabel();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getName}
   * @since 9
   * @see ValueDescriptor#getName
   */
  public String getName()
  {
    ValueDescriptor testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getFields}
   * @since 9
   * @see ValueDescriptor#getFields
   */
  public List<ValueDescriptor> getFields()
  {
    ValueDescriptor testee = $$$();

    List<ValueDescriptor> result = testee.getFields();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getAnnotationElements}
   * @since 9
   * @see ValueDescriptor#getAnnotationElements
   */
  public List<AnnotationElement> getAnnotationElements()
  {
    ValueDescriptor testee = $$$();

    List<AnnotationElement> result = testee.getAnnotationElements();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getAnnotation}
   * @since 9
   * @see ValueDescriptor#getAnnotation
   */
  public <A extends Annotation> A getAnnotation(Class<A> annotationType)
  {
    ValueDescriptor testee = $$$();

    A result = testee.getAnnotation(annotationType);
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#isArray}
   * @since 9
   * @see ValueDescriptor#isArray
   */
  public boolean isArray()
  {
    ValueDescriptor testee = $$$();

    boolean result = testee.isArray();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getContentType}
   * @since 9
   * @see ValueDescriptor#getContentType
   */
  public String getContentType()
  {
    ValueDescriptor testee = $$$();

    String result = testee.getContentType();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getDescription}
   * @since 9
   * @see ValueDescriptor#getDescription
   */
  public String getDescription()
  {
    ValueDescriptor testee = $$$();

    String result = testee.getDescription();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getTypeId}
   * @since 9
   * @see ValueDescriptor#getTypeId
   */
  public long getTypeId()
  {
    ValueDescriptor testee = $$$();

    long result = testee.getTypeId();
    return result;
  }

  /**
   * Example call to new method {@link ValueDescriptor#getTypeName}
   * @since 9
   * @see ValueDescriptor#getTypeName
   */
  public String getTypeName()
  {
    ValueDescriptor testee = $$$();

    String result = testee.getTypeName();
    return result;
  }

  private ValueDescriptor $$$()
  {
    return null;
  }
}