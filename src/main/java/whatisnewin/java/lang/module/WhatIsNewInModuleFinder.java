package whatisnewin.java.lang.module;

import java.lang.module.ModuleFinder;
import java.util.Optional;
import java.lang.module.ModuleReference;
import java.util.Set;
import java.nio.file.Path;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ModuleFinder}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link ModuleFinder} is a completely new class.
 * @since 9
 * @see ModuleFinder
 */
public final class WhatIsNewInModuleFinder
{
  /**
   * Example call to new method {@link ModuleFinder#find(String)}.
   * @since 9
   * @see ModuleFinder#find(String)
   */
  public Optional<ModuleReference> find(String name)
  {
    ModuleFinder testee = $$$();

    Optional<ModuleReference> result = testee.find(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleFinder#findAll()}.
   * @since 9
   * @see ModuleFinder#findAll()
   */
  public Set<ModuleReference> findAll()
  {
    ModuleFinder testee = $$$();

    Set<ModuleReference> result = testee.findAll();
    return result;
  }

  /**
   * Example call to new method {@link ModuleFinder#ofSystem()}.
   * @since 9
   * @see ModuleFinder#ofSystem()
   */
  public static ModuleFinder ofSystem()
  {
    ModuleFinder result = ModuleFinder.ofSystem();
    return result;
  }

  /**
   * Example call to new method {@link ModuleFinder#of(Path...)}.
   * @since 9
   * @see ModuleFinder#of(Path...)
   */
  public static ModuleFinder of(Path... entries)
  {
    ModuleFinder result = ModuleFinder.of(entries);
    return result;
  }

  /**
   * Example call to new method {@link ModuleFinder#compose(ModuleFinder...)}.
   * @since 9
   * @see ModuleFinder#compose(ModuleFinder...)
   */
  public static ModuleFinder compose(ModuleFinder... finders)
  {
    ModuleFinder result = ModuleFinder.compose(finders);
    return result;
  }

  private ModuleFinder $$$()
  {
    return null;
  }
}
