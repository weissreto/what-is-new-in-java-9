package whatisnewin.java.sql;

import java.sql.Statement;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Statement}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link Statement} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see Statement
 */
public final class WhatIsNewInStatement
{
  /**
   * Example call to new method {@link Statement#enquoteLiteral(String)}.
   * @since 9
   * @see Statement#enquoteLiteral(String)
   */
  public String enquoteLiteral(String val) throws SQLException
  {
    Statement testee = $$$();

    String result = testee.enquoteLiteral(val);
    return result;
  }

  /**
   * Example call to new method {@link Statement#enquoteIdentifier(String, boolean)}.
   * @since 9
   * @see Statement#enquoteIdentifier(String, boolean)
   */
  public String enquoteIdentifier(String identifier, boolean alwaysQuote) throws SQLException
  {
    Statement testee = $$$();

    String result = testee.enquoteIdentifier(identifier, alwaysQuote);
    return result;
  }

  /**
   * Example call to new method {@link Statement#isSimpleIdentifier(String)}.
   * @since 9
   * @see Statement#isSimpleIdentifier(String)
   */
  public boolean isSimpleIdentifier(String identifier) throws SQLException
  {
    Statement testee = $$$();

    boolean result = testee.isSimpleIdentifier(identifier);
    return result;
  }

  /**
   * Example call to new method {@link Statement#enquoteNCharLiteral(String)}.
   * @since 9
   * @see Statement#enquoteNCharLiteral(String)
   */
  public String enquoteNCharLiteral(String val) throws SQLException
  {
    Statement testee = $$$();

    String result = testee.enquoteNCharLiteral(val);
    return result;
  }

  private Statement $$$()
  {
    return null;
  }
}
