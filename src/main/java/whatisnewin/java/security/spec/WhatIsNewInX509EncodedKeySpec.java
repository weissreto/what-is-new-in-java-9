package whatisnewin.java.security.spec;

import java.security.spec.X509EncodedKeySpec;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link X509EncodedKeySpec}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link X509EncodedKeySpec} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see X509EncodedKeySpec
 */
public final class WhatIsNewInX509EncodedKeySpec
{
  /**
   * Example call to new constructor {@link X509EncodedKeySpec#X509EncodedKeySpec(byte[], String)}.
   * @since 9
   * @see X509EncodedKeySpec#X509EncodedKeySpec(byte[], String)
   */
  public WhatIsNewInX509EncodedKeySpec(byte[] encodedKey, String algorithm)
  {
    X509EncodedKeySpec testee = new X509EncodedKeySpec(encodedKey, algorithm);
  }

}
