package whatisnewin.com.sun.source.util;

import com.sun.source.util.SimpleDocTreeVisitor;
import com.sun.source.doctree.HiddenTree;
import com.sun.source.doctree.IndexTree;
import com.sun.source.doctree.ProvidesTree;
import com.sun.source.doctree.UsesTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SimpleDocTreeVisitor}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link SimpleDocTreeVisitor} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see SimpleDocTreeVisitor
 */
public final class WhatIsNewInSimpleDocTreeVisitor<R, P>
{
  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitHidden(HiddenTree, Object)}.
   * @since 9
   * @see SimpleDocTreeVisitor#visitHidden(HiddenTree, Object)
   */
  public R visitHidden(HiddenTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitHidden(node, p);
    return result;
  }

  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitIndex(IndexTree, Object)}.
   * @since 9
   * @see SimpleDocTreeVisitor#visitIndex(IndexTree, Object)
   */
  public R visitIndex(IndexTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitIndex(node, p);
    return result;
  }

  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitProvides(ProvidesTree, Object)}.
   * @since 9
   * @see SimpleDocTreeVisitor#visitProvides(ProvidesTree, Object)
   */
  public R visitProvides(ProvidesTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitProvides(node, p);
    return result;
  }

  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitUses(UsesTree, Object)}.
   * @since 9
   * @see SimpleDocTreeVisitor#visitUses(UsesTree, Object)
   */
  public R visitUses(UsesTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitUses(node, p);
    return result;
  }

  private SimpleDocTreeVisitor<R, P> $$$()
  {
    return null;
  }
}
