package whatisnewin.javax.sql;

import javax.sql.PooledConnectionBuilder;
import java.sql.ShardingKey;
import javax.sql.PooledConnection;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link PooledConnectionBuilder}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link PooledConnectionBuilder} is a completely new class.
 * @since 9
 * @see PooledConnectionBuilder
 */
public final class WhatIsNewInPooledConnectionBuilder
{
  /**
   * Example call to new method {@link PooledConnectionBuilder#shardingKey(ShardingKey)}.
   * @since 9
   * @see PooledConnectionBuilder#shardingKey(ShardingKey)
   */
  public PooledConnectionBuilder shardingKey(ShardingKey shardingKey)
  {
    PooledConnectionBuilder testee = $$$();

    PooledConnectionBuilder result = testee.shardingKey(shardingKey);
    return result;
  }

  /**
   * Example call to new method {@link PooledConnectionBuilder#password(String)}.
   * @since 9
   * @see PooledConnectionBuilder#password(String)
   */
  public PooledConnectionBuilder password(String password)
  {
    PooledConnectionBuilder testee = $$$();

    PooledConnectionBuilder result = testee.password(password);
    return result;
  }

  /**
   * Example call to new method {@link PooledConnectionBuilder#user(String)}.
   * @since 9
   * @see PooledConnectionBuilder#user(String)
   */
  public PooledConnectionBuilder user(String username)
  {
    PooledConnectionBuilder testee = $$$();

    PooledConnectionBuilder result = testee.user(username);
    return result;
  }

  /**
   * Example call to new method {@link PooledConnectionBuilder#superShardingKey(ShardingKey)}.
   * @since 9
   * @see PooledConnectionBuilder#superShardingKey(ShardingKey)
   */
  public PooledConnectionBuilder superShardingKey(ShardingKey superShardingKey)
  {
    PooledConnectionBuilder testee = $$$();

    PooledConnectionBuilder result = testee.superShardingKey(superShardingKey);
    return result;
  }

  /**
   * Example call to new method {@link PooledConnectionBuilder#build()}.
   * @since 9
   * @see PooledConnectionBuilder#build()
   */
  public PooledConnection build() throws SQLException
  {
    PooledConnectionBuilder testee = $$$();

    PooledConnection result = testee.build();
    return result;
  }

  private PooledConnectionBuilder $$$()
  {
    return null;
  }
}
