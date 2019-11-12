package whatisnewin.javax.imageio.plugins.tiff;

import javax.imageio.plugins.tiff.TIFFField;
import javax.imageio.plugins.tiff.TIFFTag;
import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.imageio.plugins.tiff.TIFFTagSet;
import org.w3c.dom.Node;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link TIFFField}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link TIFFField} is a completely new class
 * @since 9
 * @see TIFFField
 */
public final class WhatIsNewInTIFFField
{
  /**
   * Example call to new constructor {@link TIFFField#TIFFField}
   * @since 9
   * @see TIFFField#TIFFField
   */
  public WhatIsNewInTIFFField(TIFFTag tag, int type, int count, Object data)
  {
    TIFFField testee = new TIFFField(tag, type, count, data);
  }

  /**
   * Example call to new constructor {@link TIFFField#TIFFField}
   * @since 9
   * @see TIFFField#TIFFField
   */
  public WhatIsNewInTIFFField(TIFFTag tag, int type, int count)
  {
    TIFFField testee = new TIFFField(tag, type, count);
  }

  /**
   * Example call to new constructor {@link TIFFField#TIFFField}
   * @since 9
   * @see TIFFField#TIFFField
   */
  public WhatIsNewInTIFFField(TIFFTag tag, long value)
  {
    TIFFField testee = new TIFFField(tag, value);
  }

  /**
   * Example call to new constructor {@link TIFFField#TIFFField}
   * @since 9
   * @see TIFFField#TIFFField
   */
  public WhatIsNewInTIFFField(TIFFTag tag, int type, long offset, TIFFDirectory dir)
  {
    TIFFField testee = new TIFFField(tag, type, offset, dir);
  }

  /**
   * Example call to new method {@link TIFFField#getAsDoubles}
   * @since 9
   * @see TIFFField#getAsDoubles
   */
  public double[] getAsDoubles()
  {
    TIFFField testee = $$$();

    double[] result = testee.getAsDoubles();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsString}
   * @since 9
   * @see TIFFField#getAsString
   */
  public String getAsString(int index)
  {
    TIFFField testee = $$$();

    String result = testee.getAsString(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getValueAsString}
   * @since 9
   * @see TIFFField#getValueAsString
   */
  public String getValueAsString(int index)
  {
    TIFFField testee = $$$();

    String result = testee.getValueAsString(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsSRational}
   * @since 9
   * @see TIFFField#getAsSRational
   */
  public int[] getAsSRational(int index)
  {
    TIFFField testee = $$$();

    int[] result = testee.getAsSRational(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsInt}
   * @since 9
   * @see TIFFField#getAsInt
   */
  public int getAsInt(int index)
  {
    TIFFField testee = $$$();

    int result = testee.getAsInt(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsSRationals}
   * @since 9
   * @see TIFFField#getAsSRationals
   */
  public int[][] getAsSRationals()
  {
    TIFFField testee = $$$();

    int[][] result = testee.getAsSRationals();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsFloat}
   * @since 9
   * @see TIFFField#getAsFloat
   */
  public float getAsFloat(int index)
  {
    TIFFField testee = $$$();

    float result = testee.getAsFloat(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsBytes}
   * @since 9
   * @see TIFFField#getAsBytes
   */
  public byte[] getAsBytes()
  {
    TIFFField testee = $$$();

    byte[] result = testee.getAsBytes();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsLongs}
   * @since 9
   * @see TIFFField#getAsLongs
   */
  public long[] getAsLongs()
  {
    TIFFField testee = $$$();

    long[] result = testee.getAsLongs();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#isIntegral}
   * @since 9
   * @see TIFFField#isIntegral
   */
  public boolean isIntegral()
  {
    TIFFField testee = $$$();

    boolean result = testee.isIntegral();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#createArrayForType}
   * @since 9
   * @see TIFFField#createArrayForType
   */
  public static Object createArrayForType(int dataType, int count)
  {
    Object result = TIFFField.createArrayForType(dataType, count);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getCount}
   * @since 9
   * @see TIFFField#getCount
   */
  public int getCount()
  {
    TIFFField testee = $$$();

    int result = testee.getCount();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getTypeName}
   * @since 9
   * @see TIFFField#getTypeName
   */
  public static String getTypeName(int dataType)
  {
    String result = TIFFField.getTypeName(dataType);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getData}
   * @since 9
   * @see TIFFField#getData
   */
  public Object getData()
  {
    TIFFField testee = $$$();

    Object result = testee.getData();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#hasDirectory}
   * @since 9
   * @see TIFFField#hasDirectory
   */
  public boolean hasDirectory()
  {
    TIFFField testee = $$$();

    boolean result = testee.hasDirectory();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#createFromMetadataNode}
   * @since 9
   * @see TIFFField#createFromMetadataNode
   */
  public static TIFFField createFromMetadataNode(TIFFTagSet tagSet, Node node)
  {
    TIFFField result = TIFFField.createFromMetadataNode(tagSet, node);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsNativeNode}
   * @since 9
   * @see TIFFField#getAsNativeNode
   */
  public Node getAsNativeNode()
  {
    TIFFField testee = $$$();

    Node result = testee.getAsNativeNode();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsLong}
   * @since 9
   * @see TIFFField#getAsLong
   */
  public long getAsLong(int index)
  {
    TIFFField testee = $$$();

    long result = testee.getAsLong(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsShorts}
   * @since 9
   * @see TIFFField#getAsShorts
   */
  public short[] getAsShorts()
  {
    TIFFField testee = $$$();

    short[] result = testee.getAsShorts();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsRational}
   * @since 9
   * @see TIFFField#getAsRational
   */
  public long[] getAsRational(int index)
  {
    TIFFField testee = $$$();

    long[] result = testee.getAsRational(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getTag}
   * @since 9
   * @see TIFFField#getTag
   */
  public TIFFTag getTag()
  {
    TIFFField testee = $$$();

    TIFFTag result = testee.getTag();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getTagNumber}
   * @since 9
   * @see TIFFField#getTagNumber
   */
  public int getTagNumber()
  {
    TIFFField testee = $$$();

    int result = testee.getTagNumber();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsDouble}
   * @since 9
   * @see TIFFField#getAsDouble
   */
  public double getAsDouble(int index)
  {
    TIFFField testee = $$$();

    double result = testee.getAsDouble(index);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsFloats}
   * @since 9
   * @see TIFFField#getAsFloats
   */
  public float[] getAsFloats()
  {
    TIFFField testee = $$$();

    float[] result = testee.getAsFloats();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsInts}
   * @since 9
   * @see TIFFField#getAsInts
   */
  public int[] getAsInts()
  {
    TIFFField testee = $$$();

    int[] result = testee.getAsInts();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getDirectory}
   * @since 9
   * @see TIFFField#getDirectory
   */
  public TIFFDirectory getDirectory()
  {
    TIFFField testee = $$$();

    TIFFDirectory result = testee.getDirectory();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsChars}
   * @since 9
   * @see TIFFField#getAsChars
   */
  public char[] getAsChars()
  {
    TIFFField testee = $$$();

    char[] result = testee.getAsChars();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getType}
   * @since 9
   * @see TIFFField#getType
   */
  public int getType()
  {
    TIFFField testee = $$$();

    int result = testee.getType();
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getTypeByName}
   * @since 9
   * @see TIFFField#getTypeByName
   */
  public static int getTypeByName(String typeName)
  {
    int result = TIFFField.getTypeByName(typeName);
    return result;
  }

  /**
   * Example call to new method {@link TIFFField#getAsRationals}
   * @since 9
   * @see TIFFField#getAsRationals
   */
  public long[][] getAsRationals()
  {
    TIFFField testee = $$$();

    long[][] result = testee.getAsRationals();
    return result;
  }

  private TIFFField $$$()
  {
    return null;
  }
}
