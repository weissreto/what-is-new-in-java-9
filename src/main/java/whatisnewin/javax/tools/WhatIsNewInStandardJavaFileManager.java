package whatisnewin.javax.tools;

import javax.tools.StandardJavaFileManager;
import javax.tools.JavaFileObject;
import java.nio.file.Path;
import javax.tools.JavaFileManager.Location;
import java.util.Collection;
import java.io.IOException;
import javax.tools.FileObject;
import javax.tools.StandardJavaFileManager.PathFactory;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link StandardJavaFileManager}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link StandardJavaFileManager} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see StandardJavaFileManager
 */
public final class WhatIsNewInStandardJavaFileManager
{
  /**
   * Example call to new method {@link StandardJavaFileManager#getJavaFileObjectsFromPaths(Iterable)}.
   * @since 9
   * @see StandardJavaFileManager#getJavaFileObjectsFromPaths(Iterable)
   */
  public Iterable<? extends JavaFileObject> getJavaFileObjectsFromPaths(Iterable<? extends Path> paths)
  {
    StandardJavaFileManager testee = $$$();

    Iterable<? extends JavaFileObject> result = testee.getJavaFileObjectsFromPaths(paths);
    return result;
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#getJavaFileObjects(Path...)}.
   * @since 9
   * @see StandardJavaFileManager#getJavaFileObjects(Path...)
   */
  public Iterable<? extends JavaFileObject> getJavaFileObjects(Path... paths)
  {
    StandardJavaFileManager testee = $$$();

    Iterable<? extends JavaFileObject> result = testee.getJavaFileObjects(paths);
    return result;
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#setLocationFromPaths(Location, Collection)}.
   * @since 9
   * @see StandardJavaFileManager#setLocationFromPaths(Location, Collection)
   */
  public void setLocationFromPaths(Location location, Collection<? extends Path> paths) throws IOException
  {
    StandardJavaFileManager testee = $$$();

    testee.setLocationFromPaths(location, paths);
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#setLocationForModule(Location, String, Collection)}.
   * @since 9
   * @see StandardJavaFileManager#setLocationForModule(Location, String, Collection)
   */
  public void setLocationForModule(Location location, String moduleName, Collection<? extends Path> paths) throws IOException
  {
    StandardJavaFileManager testee = $$$();

    testee.setLocationForModule(location, moduleName, paths);
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#getLocationAsPaths(Location)}.
   * @since 9
   * @see StandardJavaFileManager#getLocationAsPaths(Location)
   */
  public Iterable<? extends Path> getLocationAsPaths(Location location)
  {
    StandardJavaFileManager testee = $$$();

    Iterable<? extends Path> result = testee.getLocationAsPaths(location);
    return result;
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#asPath(FileObject)}.
   * @since 9
   * @see StandardJavaFileManager#asPath(FileObject)
   */
  public Path asPath(FileObject file)
  {
    StandardJavaFileManager testee = $$$();

    Path result = testee.asPath(file);
    return result;
  }

  /**
   * Example call to new method {@link StandardJavaFileManager#setPathFactory(PathFactory)}.
   * @since 9
   * @see StandardJavaFileManager#setPathFactory(PathFactory)
   */
  public void setPathFactory(PathFactory f)
  {
    StandardJavaFileManager testee = $$$();

    testee.setPathFactory(f);
  }

  private StandardJavaFileManager $$$()
  {
    return null;
  }
}
