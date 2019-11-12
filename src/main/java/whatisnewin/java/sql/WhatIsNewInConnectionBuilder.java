package whatisnewin.java.sql;

import java.sql.ConnectionBuilder;
import java.sql.ShardingKey;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ConnectionBuilder}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link ConnectionBuilder} is a completely new class
 * @since 9
 * @see ConnectionBuilder
 */
public final class WhatIsNewInConnectionBuilder
{
  /**
   * Example call to new method {@link ConnectionBuilder#password}
   * @since 9
   * @see ConnectionBuilder#password
   */
  public ConnectionBuilder password(String password)
  {
    ConnectionBuilder testee = $$$();

    ConnectionBuilder result = testee.password(password);
    return result;
  }

  /**
   * Example call to new method {@link ConnectionBuilder#shardingKey}
   * @since 9
   * @see ConnectionBuilder#shardingKey
   */
  public ConnectionBuilder shardingKey(ShardingKey shardingKey)
  {
    ConnectionBuilder testee = $$$();

    ConnectionBuilder result = testee.shardingKey(shardingKey);
    return result;
  }

  /**
   * Example call to new method {@link ConnectionBuilder#user}
   * @since 9
   * @see ConnectionBuilder#user
   */
  public ConnectionBuilder user(String username)
  {
    ConnectionBuilder testee = $$$();

    ConnectionBuilder result = testee.user(username);
    return result;
  }

  /**
   * Example call to new method {@link ConnectionBuilder#superShardingKey}
   * @since 9
   * @see ConnectionBuilder#superShardingKey
   */
  public ConnectionBuilder superShardingKey(ShardingKey superShardingKey)
  {
    ConnectionBuilder testee = $$$();

    ConnectionBuilder result = testee.superShardingKey(superShardingKey);
    return result;
  }

  /**
   * Example call to new method {@link ConnectionBuilder#build}
   * @since 9
   * @see ConnectionBuilder#build
   */
  public Connection build() throws SQLException
  {
    ConnectionBuilder testee = $$$();

    Connection result = testee.build();
    return result;
  }

  private ConnectionBuilder $$$()
  {
    return null;
  }
}