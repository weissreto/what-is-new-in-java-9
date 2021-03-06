package whatisnewin.jdk.nashorn.api.tree;

import jdk.nashorn.api.tree.FunctionCallTree;
import jdk.nashorn.api.tree.ExpressionTree;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link FunctionCallTree}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link FunctionCallTree} is a completely new class.
 * @since 9
 * @see FunctionCallTree
 */
public final class WhatIsNewInFunctionCallTree
{
  /**
   * Example call to new method {@link FunctionCallTree#getFunctionSelect()}.
   * @since 9
   * @see FunctionCallTree#getFunctionSelect()
   */
  public ExpressionTree getFunctionSelect()
  {
    FunctionCallTree testee = $$$();

    ExpressionTree result = testee.getFunctionSelect();
    return result;
  }

  /**
   * Example call to new method {@link FunctionCallTree#getArguments()}.
   * @since 9
   * @see FunctionCallTree#getArguments()
   */
  public List<? extends ExpressionTree> getArguments()
  {
    FunctionCallTree testee = $$$();

    List<? extends ExpressionTree> result = testee.getArguments();
    return result;
  }

  private FunctionCallTree $$$()
  {
    return null;
  }
}
