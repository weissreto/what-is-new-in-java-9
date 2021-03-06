package whatisnewin.javax.sql;

import javax.sql.DataSource;
import java.sql.ConnectionBuilder;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DataSource}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link DataSource} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see DataSource
 */
public final class WhatIsNewInDataSource
{
  /**
   * Example call to new method {@link DataSource#createConnectionBuilder()}.
   * @since 9
   * @see DataSource#createConnectionBuilder()
   */
  public ConnectionBuilder createConnectionBuilder() throws SQLException
  {
    DataSource testee = $$$();

    ConnectionBuilder result = testee.createConnectionBuilder();
    return result;
  }

  private DataSource $$$()
  {
    return null;
  }
}
