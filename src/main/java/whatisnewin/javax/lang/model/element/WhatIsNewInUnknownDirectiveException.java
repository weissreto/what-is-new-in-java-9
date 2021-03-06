package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.UnknownDirectiveException;
import javax.lang.model.element.ModuleElement.Directive;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link UnknownDirectiveException}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link UnknownDirectiveException} is a completely new class.
 * @since 9
 * @see UnknownDirectiveException
 */
public final class WhatIsNewInUnknownDirectiveException
{
  /**
   * Example call to new constructor {@link UnknownDirectiveException#UnknownDirectiveException(Directive, Object)}.
   * @since 9
   * @see UnknownDirectiveException#UnknownDirectiveException(Directive, Object)
   */
  public WhatIsNewInUnknownDirectiveException(Directive d, Object p)
  {
    UnknownDirectiveException testee = new UnknownDirectiveException(d, p);
  }

  /**
   * Example call to new method {@link UnknownDirectiveException#getUnknownDirective()}.
   * @since 9
   * @see UnknownDirectiveException#getUnknownDirective()
   */
  public Directive getUnknownDirective()
  {
    UnknownDirectiveException testee = $$$();

    Directive result = testee.getUnknownDirective();
    return result;
  }

  /**
   * Example call to new method {@link UnknownDirectiveException#getArgument()}.
   * @since 9
   * @see UnknownDirectiveException#getArgument()
   */
  public Object getArgument()
  {
    UnknownDirectiveException testee = $$$();

    Object result = testee.getArgument();
    return result;
  }

  private UnknownDirectiveException $$$()
  {
    return null;
  }
}
