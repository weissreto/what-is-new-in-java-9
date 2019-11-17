package whatisnewin.jdk.nashorn.api.tree;

import jdk.nashorn.api.tree.SwitchTree;
import jdk.nashorn.api.tree.ExpressionTree;
import java.util.List;
import jdk.nashorn.api.tree.CaseTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SwitchTree}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link SwitchTree} is a completely new class.
 * @since 9
 * @see SwitchTree
 */
public final class WhatIsNewInSwitchTree
{
  /**
   * Example call to new method {@link SwitchTree#getExpression()}.
   * @since 9
   * @see SwitchTree#getExpression()
   */
  public ExpressionTree getExpression()
  {
    SwitchTree testee = $$$();

    ExpressionTree result = testee.getExpression();
    return result;
  }

  /**
   * Example call to new method {@link SwitchTree#getCases()}.
   * @since 9
   * @see SwitchTree#getCases()
   */
  public List<? extends CaseTree> getCases()
  {
    SwitchTree testee = $$$();

    List<? extends CaseTree> result = testee.getCases();
    return result;
  }

  private SwitchTree $$$()
  {
    return null;
  }
}
