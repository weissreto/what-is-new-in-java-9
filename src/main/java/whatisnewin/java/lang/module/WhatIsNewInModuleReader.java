package whatisnewin.java.lang.module;

import java.lang.module.ModuleReader;
import java.util.stream.Stream;
import java.io.IOException;
import java.util.Optional;
import java.net.URI;
import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ModuleReader}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link ModuleReader} is a completely new class.
 * @since 9
 * @see ModuleReader
 */
public final class WhatIsNewInModuleReader
{
  /**
   * Example call to new method {@link ModuleReader#list()}.
   * @since 9
   * @see ModuleReader#list()
   */
  public Stream<String> list() throws IOException
  {
    ModuleReader testee = $$$();

    Stream<String> result = testee.list();
    return result;
  }

  /**
   * Example call to new method {@link ModuleReader#close()}.
   * @since 9
   * @see ModuleReader#close()
   */
  public void close() throws IOException
  {
    ModuleReader testee = $$$();

    testee.close();
  }

  /**
   * Example call to new method {@link ModuleReader#find(String)}.
   * @since 9
   * @see ModuleReader#find(String)
   */
  public Optional<URI> find(String name) throws IOException
  {
    ModuleReader testee = $$$();

    Optional<URI> result = testee.find(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleReader#open(String)}.
   * @since 9
   * @see ModuleReader#open(String)
   */
  public Optional<InputStream> open(String name) throws IOException
  {
    ModuleReader testee = $$$();

    Optional<InputStream> result = testee.open(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleReader#release(ByteBuffer)}.
   * @since 9
   * @see ModuleReader#release(ByteBuffer)
   */
  public void release(ByteBuffer bb)
  {
    ModuleReader testee = $$$();

    testee.release(bb);
  }

  /**
   * Example call to new method {@link ModuleReader#read(String)}.
   * @since 9
   * @see ModuleReader#read(String)
   */
  public Optional<ByteBuffer> read(String name) throws IOException
  {
    ModuleReader testee = $$$();

    Optional<ByteBuffer> result = testee.read(name);
    return result;
  }

  private ModuleReader $$$()
  {
    return null;
  }
}
