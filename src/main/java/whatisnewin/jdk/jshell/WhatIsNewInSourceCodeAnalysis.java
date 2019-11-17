package whatisnewin.jdk.jshell;

import jdk.jshell.SourceCodeAnalysis;
import java.util.List;
import jdk.jshell.Snippet;
import jdk.jshell.SourceCodeAnalysis.CompletionInfo;
import jdk.jshell.SourceCodeAnalysis.Documentation;
import jdk.jshell.SourceCodeAnalysis.SnippetWrapper;
import java.util.Collection;
import jdk.jshell.SourceCodeAnalysis.Suggestion;
import jdk.jshell.SourceCodeAnalysis.QualifiedNames;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SourceCodeAnalysis}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link SourceCodeAnalysis} is a completely new class.
 * @since 9
 * @see SourceCodeAnalysis
 */
public final class WhatIsNewInSourceCodeAnalysis
{
  /**
   * Example call to new method {@link SourceCodeAnalysis#sourceToSnippets(String)}.
   * @since 9
   * @see SourceCodeAnalysis#sourceToSnippets(String)
   */
  public List<Snippet> sourceToSnippets(String input)
  {
    SourceCodeAnalysis testee = $$$();

    List<Snippet> result = testee.sourceToSnippets(input);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#analyzeCompletion(String)}.
   * @since 9
   * @see SourceCodeAnalysis#analyzeCompletion(String)
   */
  public CompletionInfo analyzeCompletion(String input)
  {
    SourceCodeAnalysis testee = $$$();

    CompletionInfo result = testee.analyzeCompletion(input);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#documentation(String, int, boolean)}.
   * @since 9
   * @see SourceCodeAnalysis#documentation(String, int, boolean)
   */
  public List<Documentation> documentation(String input, int cursor, boolean computeJavadoc)
  {
    SourceCodeAnalysis testee = $$$();

    List<Documentation> result = testee.documentation(input, cursor, computeJavadoc);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#wrappers(String)}.
   * @since 9
   * @see SourceCodeAnalysis#wrappers(String)
   */
  public List<SnippetWrapper> wrappers(String input)
  {
    SourceCodeAnalysis testee = $$$();

    List<SnippetWrapper> result = testee.wrappers(input);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#wrapper(Snippet)}.
   * @since 9
   * @see SourceCodeAnalysis#wrapper(Snippet)
   */
  public SnippetWrapper wrapper(Snippet snippet)
  {
    SourceCodeAnalysis testee = $$$();

    SnippetWrapper result = testee.wrapper(snippet);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#dependents(Snippet)}.
   * @since 9
   * @see SourceCodeAnalysis#dependents(Snippet)
   */
  public Collection<Snippet> dependents(Snippet snippet)
  {
    SourceCodeAnalysis testee = $$$();

    Collection<Snippet> result = testee.dependents(snippet);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#analyzeType(String, int)}.
   * @since 9
   * @see SourceCodeAnalysis#analyzeType(String, int)
   */
  public String analyzeType(String code, int cursor)
  {
    SourceCodeAnalysis testee = $$$();

    String result = testee.analyzeType(code, cursor);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#completionSuggestions(String, int, int[])}.
   * @since 9
   * @see SourceCodeAnalysis#completionSuggestions(String, int, int[])
   */
  public List<Suggestion> completionSuggestions(String input, int cursor, int[] anchor)
  {
    SourceCodeAnalysis testee = $$$();

    List<Suggestion> result = testee.completionSuggestions(input, cursor, anchor);
    return result;
  }

  /**
   * Example call to new method {@link SourceCodeAnalysis#listQualifiedNames(String, int)}.
   * @since 9
   * @see SourceCodeAnalysis#listQualifiedNames(String, int)
   */
  public QualifiedNames listQualifiedNames(String code, int cursor)
  {
    SourceCodeAnalysis testee = $$$();

    QualifiedNames result = testee.listQualifiedNames(code, cursor);
    return result;
  }

  private SourceCodeAnalysis $$$()
  {
    return null;
  }
}
