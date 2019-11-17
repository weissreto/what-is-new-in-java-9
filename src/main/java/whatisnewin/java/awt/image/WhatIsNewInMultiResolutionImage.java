package whatisnewin.java.awt.image;

import java.awt.image.MultiResolutionImage;
import java.util.List;
import java.awt.Image;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link MultiResolutionImage}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link MultiResolutionImage} is a completely new class.
 * @since 9
 * @see MultiResolutionImage
 */
public final class WhatIsNewInMultiResolutionImage
{
  /**
   * Example call to new method {@link MultiResolutionImage#getResolutionVariants()}.
   * @since 9
   * @see MultiResolutionImage#getResolutionVariants()
   */
  public List<Image> getResolutionVariants()
  {
    MultiResolutionImage testee = $$$();

    List<Image> result = testee.getResolutionVariants();
    return result;
  }

  /**
   * Example call to new method {@link MultiResolutionImage#getResolutionVariant(double, double)}.
   * @since 9
   * @see MultiResolutionImage#getResolutionVariant(double, double)
   */
  public Image getResolutionVariant(double destImageWidth, double destImageHeight)
  {
    MultiResolutionImage testee = $$$();

    Image result = testee.getResolutionVariant(destImageWidth, destImageHeight);
    return result;
  }

  private MultiResolutionImage $$$()
  {
    return null;
  }
}
