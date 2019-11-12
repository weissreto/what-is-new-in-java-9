package whatisnewin.java.net;

import java.net.ServerSocket;
import java.net.SocketOption;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ServerSocket}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ServerSocket} is an old class but has new fields, constructors or methods
 * @since 1.0
 * @see ServerSocket
 */
public final class WhatIsNewInServerSocket
{
  /**
   * Example call to new method {@link ServerSocket#setOption}
   * @since 9
   * @see ServerSocket#setOption
   */
  public <T> ServerSocket setOption(SocketOption<T> name, T value) throws IOException
  {
    ServerSocket testee = $$$();

    ServerSocket result = testee.setOption(name, value);
    return result;
  }

  /**
   * Example call to new method {@link ServerSocket#getOption}
   * @since 9
   * @see ServerSocket#getOption
   */
  public <T> T getOption(SocketOption<T> name) throws IOException
  {
    ServerSocket testee = $$$();

    T result = testee.getOption(name);
    return result;
  }

  private ServerSocket $$$()
  {
    return null;
  }
}
