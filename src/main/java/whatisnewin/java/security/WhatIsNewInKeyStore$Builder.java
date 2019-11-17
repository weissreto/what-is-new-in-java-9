package whatisnewin.java.security;

import java.security.KeyStore.Builder;
import java.io.File;
import java.security.KeyStore.ProtectionParameter;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Builder}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Builder} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see Builder
 */
public final class WhatIsNewInKeyStore$Builder
{
  /**
   * Example call to new method {@link Builder#newInstance(File, ProtectionParameter)}.
   * @since 9
   * @see Builder#newInstance(File, ProtectionParameter)
   */
  public static Builder newInstance(File file, ProtectionParameter protection)
  {
    Builder result = Builder.newInstance(file, protection);
    return result;
  }

}
