package whatisnewin.java.util;

import java.util.ServiceLoader;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.ServiceLoader.Provider;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ServiceLoader}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ServiceLoader} is an old class but has new fields, constructors or methods
 * @since 1.6
 * @see ServiceLoader
 */
public final class WhatIsNewInServiceLoader<S>
{
  /**
   * Example call to new method {@link ServiceLoader#findFirst}
   * @since 9
   * @see ServiceLoader#findFirst
   */
  public Optional<S> findFirst()
  {
    ServiceLoader<S> testee = $$$();

    Optional<S> result = testee.findFirst();
    return result;
  }

  /**
   * Example call to new method {@link ServiceLoader#load}
   * @since 9
   * @see ServiceLoader#load
   */
  public static <S> ServiceLoader<S> load(ModuleLayer layer, Class<S> service)
  {
    ServiceLoader<S> result = ServiceLoader.load(layer, service);
    return result;
  }

  /**
   * Example call to new method {@link ServiceLoader#stream}
   * @since 9
   * @see ServiceLoader#stream
   */
  public Stream<Provider<S>> stream()
  {
    ServiceLoader<S> testee = $$$();

    Stream<Provider<S>> result = testee.stream();
    return result;
  }

  private ServiceLoader $$$()
  {
    return null;
  }
}