package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;
import javax.lang.model.element.ModuleElement.ProvidesDirective;
import javax.lang.model.element.ModuleElement.RequiresDirective;
import javax.lang.model.element.ModuleElement.Directive;
import javax.lang.model.element.ModuleElement.OpensDirective;
import javax.lang.model.element.ModuleElement.ExportsDirective;
import javax.lang.model.element.ModuleElement.UsesDirective;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DirectiveVisitor}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link DirectiveVisitor} is a completely new class
 * @since 9
 * @see DirectiveVisitor
 */
public final class WhatIsNewInModuleElement$DirectiveVisitor<R, P>
{
  /**
   * Example call to new method {@link DirectiveVisitor#visitProvides}
   * @since 9
   * @see DirectiveVisitor#visitProvides
   */
  public R visitProvides(ProvidesDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitProvides(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitRequires}
   * @since 9
   * @see DirectiveVisitor#visitRequires
   */
  public R visitRequires(RequiresDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitRequires(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visit}
   * @since 9
   * @see DirectiveVisitor#visit
   */
  public R visit(Directive d)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visit(d);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visit}
   * @since 9
   * @see DirectiveVisitor#visit
   */
  public R visit(Directive d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visit(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitUnknown}
   * @since 9
   * @see DirectiveVisitor#visitUnknown
   */
  public R visitUnknown(Directive d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitUnknown(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitOpens}
   * @since 9
   * @see DirectiveVisitor#visitOpens
   */
  public R visitOpens(OpensDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitOpens(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitExports}
   * @since 9
   * @see DirectiveVisitor#visitExports
   */
  public R visitExports(ExportsDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitExports(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitUses}
   * @since 9
   * @see DirectiveVisitor#visitUses
   */
  public R visitUses(UsesDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitUses(d, p);
    return result;
  }

  private DirectiveVisitor $$$()
  {
    return null;
  }
}
