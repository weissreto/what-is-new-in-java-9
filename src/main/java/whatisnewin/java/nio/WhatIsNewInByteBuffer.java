package whatisnewin.java.nio;

import java.nio.ByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ByteBuffer}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ByteBuffer} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see ByteBuffer
 */
public final class WhatIsNewInByteBuffer
{
  /**
   * Example call to new method {@link ByteBuffer#alignmentOffset}
   * @since 9
   * @see ByteBuffer#alignmentOffset
   */
  public int alignmentOffset(int index, int unitSize)
  {
    ByteBuffer testee = $$$();

    int result = testee.alignmentOffset(index, unitSize);
    return result;
  }

  /**
   * Example call to new method {@link ByteBuffer#alignedSlice}
   * @since 9
   * @see ByteBuffer#alignedSlice
   */
  public ByteBuffer alignedSlice(int unitSize)
  {
    ByteBuffer testee = $$$();

    ByteBuffer result = testee.alignedSlice(unitSize);
    return result;
  }

  private ByteBuffer $$$()
  {
    return null;
  }
}