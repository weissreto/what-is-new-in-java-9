package whatisnewin.javax.xml.xpath;

import javax.xml.xpath.XPathEvaluationResult;
import javax.xml.xpath.XPathEvaluationResult.XPathResultType;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link XPathEvaluationResult}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link XPathEvaluationResult} is a completely new class.
 * @since 9
 * @see XPathEvaluationResult
 */
public final class WhatIsNewInXPathEvaluationResult<T>
{
  /**
   * Example call to new method {@link XPathEvaluationResult#type()}.
   * @since 9
   * @see XPathEvaluationResult#type()
   */
  public XPathResultType type()
  {
    XPathEvaluationResult<T> testee = $$$();

    XPathResultType result = testee.type();
    return result;
  }

  /**
   * Example call to new method {@link XPathEvaluationResult#value()}.
   * @since 9
   * @see XPathEvaluationResult#value()
   */
  public T value()
  {
    XPathEvaluationResult<T> testee = $$$();

    T result = testee.value();
    return result;
  }

  private XPathEvaluationResult<T> $$$()
  {
    return null;
  }
}
