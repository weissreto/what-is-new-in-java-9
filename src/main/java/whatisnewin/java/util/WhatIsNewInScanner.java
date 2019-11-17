package whatisnewin.java.util;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Scanner}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Scanner} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see Scanner
 */
public final class WhatIsNewInScanner
{
  /**
   * Example call to new method {@link Scanner#findAll(Pattern)}.
   * @since 9
   * @see Scanner#findAll(Pattern)
   */
  public Stream<MatchResult> findAll(Pattern pattern)
  {
    Scanner testee = $$$();

    Stream<MatchResult> result = testee.findAll(pattern);
    return result;
  }

  /**
   * Example call to new method {@link Scanner#tokens()}.
   * @since 9
   * @see Scanner#tokens()
   */
  public Stream<String> tokens()
  {
    Scanner testee = $$$();

    Stream<String> result = testee.tokens();
    return result;
  }

  private Scanner $$$()
  {
    return null;
  }
}
