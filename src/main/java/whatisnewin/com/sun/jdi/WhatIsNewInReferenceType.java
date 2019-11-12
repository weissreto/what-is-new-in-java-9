package whatisnewin.com.sun.jdi;

import com.sun.jdi.ReferenceType;
import com.sun.jdi.ModuleReference;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ReferenceType}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ReferenceType} is an old class but has new fields, constructors or methods
 * @since 1.3
 * @see ReferenceType
 */
public final class WhatIsNewInReferenceType
{
  /**
   * Example call to new method {@link ReferenceType#module}
   * @since 9
   * @see ReferenceType#module
   */
  public ModuleReference module()
  {
    ReferenceType testee = $$$();

    ModuleReference result = testee.module();
    return result;
  }

  private ReferenceType $$$()
  {
    return null;
  }
}
