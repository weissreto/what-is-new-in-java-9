package whatisnewin.java.lang;

import java.lang.module.Configuration;
import java.lang.ModuleLayer.Controller;
import java.util.List;
import java.util.function.Function;
import java.util.Set;
import java.util.Optional;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ModuleLayer}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link ModuleLayer} is a completely new class.
 * @since 9
 * @see ModuleLayer
 */
public final class WhatIsNewInModuleLayer
{
  /**
   * Example call to new method {@link ModuleLayer#defineModulesWithOneLoader(Configuration, ClassLoader)}.
   * @since 9
   * @see ModuleLayer#defineModulesWithOneLoader(Configuration, ClassLoader)
   */
  public ModuleLayer defineModulesWithOneLoader(Configuration cf, ClassLoader parentLoader)
  {
    ModuleLayer testee = $$$();

    ModuleLayer result = testee.defineModulesWithOneLoader(cf, parentLoader);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#defineModulesWithOneLoader(Configuration, List, ClassLoader)}.
   * @since 9
   * @see ModuleLayer#defineModulesWithOneLoader(Configuration, List, ClassLoader)
   */
  public static Controller defineModulesWithOneLoader(Configuration cf, List<ModuleLayer> parentLayers, ClassLoader parentLoader)
  {
    Controller result = ModuleLayer.defineModulesWithOneLoader(cf, parentLayers, parentLoader);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#defineModules(Configuration, Function)}.
   * @since 9
   * @see ModuleLayer#defineModules(Configuration, Function)
   */
  public ModuleLayer defineModules(Configuration cf, Function<String, ClassLoader> clf)
  {
    ModuleLayer testee = $$$();

    ModuleLayer result = testee.defineModules(cf, clf);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#defineModules(Configuration, List, Function)}.
   * @since 9
   * @see ModuleLayer#defineModules(Configuration, List, Function)
   */
  public static Controller defineModules(Configuration cf, List<ModuleLayer> parentLayers, Function<String, ClassLoader> clf)
  {
    Controller result = ModuleLayer.defineModules(cf, parentLayers, clf);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#empty()}.
   * @since 9
   * @see ModuleLayer#empty()
   */
  public static ModuleLayer empty()
  {
    ModuleLayer result = ModuleLayer.empty();
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#modules()}.
   * @since 9
   * @see ModuleLayer#modules()
   */
  public Set<Module> modules()
  {
    ModuleLayer testee = $$$();

    Set<Module> result = testee.modules();
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#defineModulesWithManyLoaders(Configuration, ClassLoader)}.
   * @since 9
   * @see ModuleLayer#defineModulesWithManyLoaders(Configuration, ClassLoader)
   */
  public ModuleLayer defineModulesWithManyLoaders(Configuration cf, ClassLoader parentLoader)
  {
    ModuleLayer testee = $$$();

    ModuleLayer result = testee.defineModulesWithManyLoaders(cf, parentLoader);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#defineModulesWithManyLoaders(Configuration, List, ClassLoader)}.
   * @since 9
   * @see ModuleLayer#defineModulesWithManyLoaders(Configuration, List, ClassLoader)
   */
  public static Controller defineModulesWithManyLoaders(Configuration cf, List<ModuleLayer> parentLayers, ClassLoader parentLoader)
  {
    Controller result = ModuleLayer.defineModulesWithManyLoaders(cf, parentLayers, parentLoader);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#configuration()}.
   * @since 9
   * @see ModuleLayer#configuration()
   */
  public Configuration configuration()
  {
    ModuleLayer testee = $$$();

    Configuration result = testee.configuration();
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#boot()}.
   * @since 9
   * @see ModuleLayer#boot()
   */
  public static ModuleLayer boot()
  {
    ModuleLayer result = ModuleLayer.boot();
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#parents()}.
   * @since 9
   * @see ModuleLayer#parents()
   */
  public List<ModuleLayer> parents()
  {
    ModuleLayer testee = $$$();

    List<ModuleLayer> result = testee.parents();
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#findModule(String)}.
   * @since 9
   * @see ModuleLayer#findModule(String)
   */
  public Optional<Module> findModule(String name)
  {
    ModuleLayer testee = $$$();

    Optional<Module> result = testee.findModule(name);
    return result;
  }

  /**
   * Example call to new method {@link ModuleLayer#findLoader(String)}.
   * @since 9
   * @see ModuleLayer#findLoader(String)
   */
  public ClassLoader findLoader(String name)
  {
    ModuleLayer testee = $$$();

    ClassLoader result = testee.findLoader(name);
    return result;
  }

  private ModuleLayer $$$()
  {
    return null;
  }
}
