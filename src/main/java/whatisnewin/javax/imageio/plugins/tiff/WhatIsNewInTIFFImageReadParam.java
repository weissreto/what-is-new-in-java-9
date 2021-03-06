package whatisnewin.javax.imageio.plugins.tiff;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.imageio.plugins.tiff.TIFFTagSet;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TIFFImageReadParam}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link TIFFImageReadParam} is a completely new class.
 * @since 9
 * @see TIFFImageReadParam
 */
public final class WhatIsNewInTIFFImageReadParam
{
  /**
   * Example call to new constructor {@link TIFFImageReadParam#TIFFImageReadParam()}.
   * @since 9
   * @see TIFFImageReadParam#TIFFImageReadParam()
   */
  public WhatIsNewInTIFFImageReadParam()
  {
    TIFFImageReadParam testee = new TIFFImageReadParam();
  }

  /**
   * Example call to new method {@link TIFFImageReadParam#addAllowedTagSet(TIFFTagSet)}.
   * @since 9
   * @see TIFFImageReadParam#addAllowedTagSet(TIFFTagSet)
   */
  public void addAllowedTagSet(TIFFTagSet tagSet)
  {
    TIFFImageReadParam testee = $$$();

    testee.addAllowedTagSet(tagSet);
  }

  /**
   * Example call to new method {@link TIFFImageReadParam#removeAllowedTagSet(TIFFTagSet)}.
   * @since 9
   * @see TIFFImageReadParam#removeAllowedTagSet(TIFFTagSet)
   */
  public void removeAllowedTagSet(TIFFTagSet tagSet)
  {
    TIFFImageReadParam testee = $$$();

    testee.removeAllowedTagSet(tagSet);
  }

  /**
   * Example call to new method {@link TIFFImageReadParam#getAllowedTagSets()}.
   * @since 9
   * @see TIFFImageReadParam#getAllowedTagSets()
   */
  public List<TIFFTagSet> getAllowedTagSets()
  {
    TIFFImageReadParam testee = $$$();

    List<TIFFTagSet> result = testee.getAllowedTagSets();
    return result;
  }

  /**
   * Example call to new method {@link TIFFImageReadParam#setReadUnknownTags(boolean)}.
   * @since 9
   * @see TIFFImageReadParam#setReadUnknownTags(boolean)
   */
  public void setReadUnknownTags(boolean readUnknownTags)
  {
    TIFFImageReadParam testee = $$$();

    testee.setReadUnknownTags(readUnknownTags);
  }

  /**
   * Example call to new method {@link TIFFImageReadParam#getReadUnknownTags()}.
   * @since 9
   * @see TIFFImageReadParam#getReadUnknownTags()
   */
  public boolean getReadUnknownTags()
  {
    TIFFImageReadParam testee = $$$();

    boolean result = testee.getReadUnknownTags();
    return result;
  }

  private TIFFImageReadParam $$$()
  {
    return null;
  }
}
