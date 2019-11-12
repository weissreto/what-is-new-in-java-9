package whatisnewin.jdk.nashorn.api.tree;

import jdk.nashorn.api.tree.WithTree;
import jdk.nashorn.api.tree.StatementTree;
import jdk.nashorn.api.tree.ExpressionTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link WithTree}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link WithTree} is a completely new class
 * @since 9
 * @see WithTree
 */
public final class WhatIsNewInWithTree
{
  /**
   * Example call to new method {@link WithTree#getStatement}
   * @since 9
   * @see WithTree#getStatement
   */
  public StatementTree getStatement()
  {
    WithTree testee = $$$();

    StatementTree result = testee.getStatement();
    return result;
  }

  /**
   * Example call to new method {@link WithTree#getScope}
   * @since 9
   * @see WithTree#getScope
   */
  public ExpressionTree getScope()
  {
    WithTree testee = $$$();

    ExpressionTree result = testee.getScope();
    return result;
  }

  private WithTree $$$()
  {
    return null;
  }
}