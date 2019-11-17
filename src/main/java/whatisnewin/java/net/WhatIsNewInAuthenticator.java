package whatisnewin.java.net;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.InetAddress;
import java.net.URL;
import java.net.Authenticator.RequestorType;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Authenticator}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Authenticator} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see Authenticator
 */
public final class WhatIsNewInAuthenticator
{
  /**
   * Example call to new method {@link Authenticator#getDefault()}.
   * @since 9
   * @see Authenticator#getDefault()
   */
  public static Authenticator getDefault()
  {
    Authenticator result = Authenticator.getDefault();
    return result;
  }

  /**
   * Example call to new method {@link Authenticator#requestPasswordAuthentication(Authenticator, String, InetAddress, int, String, String, String, URL, RequestorType)}.
   * @since 9
   * @see Authenticator#requestPasswordAuthentication(Authenticator, String, InetAddress, int, String, String, String, URL, RequestorType)
   */
  public static PasswordAuthentication requestPasswordAuthentication(Authenticator authenticator, String host, InetAddress addr, int port, String protocol, String prompt, String scheme, URL url, RequestorType reqType)
  {
    PasswordAuthentication result = Authenticator.requestPasswordAuthentication(authenticator, host, addr, port, protocol, prompt, scheme, url, reqType);
    return result;
  }

  /**
   * Example call to new method {@link Authenticator#requestPasswordAuthenticationInstance(String, InetAddress, int, String, String, String, URL, RequestorType)}.
   * @since 9
   * @see Authenticator#requestPasswordAuthenticationInstance(String, InetAddress, int, String, String, String, URL, RequestorType)
   */
  public PasswordAuthentication requestPasswordAuthenticationInstance(String host, InetAddress addr, int port, String protocol, String prompt, String scheme, URL url, RequestorType reqType)
  {
    Authenticator testee = $$$();

    PasswordAuthentication result = testee.requestPasswordAuthenticationInstance(host, addr, port, protocol, prompt, scheme, url, reqType);
    return result;
  }

  private Authenticator $$$()
  {
    return null;
  }
}
