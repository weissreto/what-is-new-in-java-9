package whatisnewin.com.sun.source.util;

import com.sun.source.util.DocTrees;
import java.util.List;
import com.sun.source.doctree.DocTree;
import com.sun.source.util.DocTreePath;
import javax.tools.FileObject;
import javax.lang.model.element.PackageElement;
import java.text.BreakIterator;
import com.sun.source.doctree.DocCommentTree;
import javax.lang.model.element.Element;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DocTrees}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link DocTrees} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see DocTrees
 */
public final class WhatIsNewInDocTrees
{
  /**
   * Example call to new method {@link DocTrees#getFirstSentence}
   * @since 9
   * @see DocTrees#getFirstSentence
   */
  public List<DocTree> getFirstSentence(List<? extends DocTree> list)
  {
    DocTrees testee = $$$();

    List<DocTree> result = testee.getFirstSentence(list);
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#getDocTreePath}
   * @since 9
   * @see DocTrees#getDocTreePath
   */
  public DocTreePath getDocTreePath(FileObject fileObject, PackageElement packageElement)
  {
    DocTrees testee = $$$();

    DocTreePath result = testee.getDocTreePath(fileObject, packageElement);
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#getBreakIterator}
   * @since 9
   * @see DocTrees#getBreakIterator
   */
  public BreakIterator getBreakIterator()
  {
    DocTrees testee = $$$();

    BreakIterator result = testee.getBreakIterator();
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#getDocCommentTree}
   * @since 9
   * @see DocTrees#getDocCommentTree
   */
  public DocCommentTree getDocCommentTree(Element e)
  {
    DocTrees testee = $$$();

    DocCommentTree result = testee.getDocCommentTree(e);
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#getDocCommentTree}
   * @since 9
   * @see DocTrees#getDocCommentTree
   */
  public DocCommentTree getDocCommentTree(FileObject fileObject)
  {
    DocTrees testee = $$$();

    DocCommentTree result = testee.getDocCommentTree(fileObject);
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#getDocCommentTree}
   * @since 9
   * @see DocTrees#getDocCommentTree
   */
  public DocCommentTree getDocCommentTree(Element e, String relativePath) throws IOException
  {
    DocTrees testee = $$$();

    DocCommentTree result = testee.getDocCommentTree(e, relativePath);
    return result;
  }

  /**
   * Example call to new method {@link DocTrees#setBreakIterator}
   * @since 9
   * @see DocTrees#setBreakIterator
   */
  public void setBreakIterator(BreakIterator breakiterator)
  {
    DocTrees testee = $$$();

    testee.setBreakIterator(breakiterator);
  }

  private DocTrees $$$()
  {
    return null;
  }
}