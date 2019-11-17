package whatisnewin.java.security;

import java.security.KeyStore;
import java.io.File;
import java.security.KeyStoreException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link KeyStore}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link KeyStore} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see KeyStore
 */
public final class WhatIsNewInKeyStore
{
  /**
   * Example call to new method {@link KeyStore#getInstance(File, char[])}.
   * @since 9
   * @see KeyStore#getInstance(File, char[])
   */
  public static KeyStore getInstance(File file, char[] password) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException
  {
    KeyStore result = KeyStore.getInstance(file, password);
    return result;
  }

}
