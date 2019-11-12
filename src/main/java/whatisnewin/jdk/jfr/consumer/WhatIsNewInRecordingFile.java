package whatisnewin.jdk.jfr.consumer;

import jdk.jfr.consumer.RecordingFile;
import java.nio.file.Path;
import java.io.IOException;
import jdk.jfr.consumer.RecordedEvent;
import java.util.List;
import jdk.jfr.EventType;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link RecordingFile}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link RecordingFile} is a completely new class
 * @since 9
 * @see RecordingFile
 */
public final class WhatIsNewInRecordingFile
{
  /**
   * Example call to new constructor {@link RecordingFile#RecordingFile}
   * @since 9
   * @see RecordingFile#RecordingFile
   */
  public WhatIsNewInRecordingFile(Path file) throws IOException
  {
    RecordingFile testee = new RecordingFile(file);
  }

  /**
   * Example call to new method {@link RecordingFile#hasMoreEvents}
   * @since 9
   * @see RecordingFile#hasMoreEvents
   */
  public boolean hasMoreEvents()
  {
    RecordingFile testee = $$$();

    boolean result = testee.hasMoreEvents();
    return result;
  }

  /**
   * Example call to new method {@link RecordingFile#readEvent}
   * @since 9
   * @see RecordingFile#readEvent
   */
  public RecordedEvent readEvent() throws IOException
  {
    RecordingFile testee = $$$();

    RecordedEvent result = testee.readEvent();
    return result;
  }

  /**
   * Example call to new method {@link RecordingFile#readAllEvents}
   * @since 9
   * @see RecordingFile#readAllEvents
   */
  public static List<RecordedEvent> readAllEvents(Path path) throws IOException
  {
    List<RecordedEvent> result = RecordingFile.readAllEvents(path);
    return result;
  }

  /**
   * Example call to new method {@link RecordingFile#readEventTypes}
   * @since 9
   * @see RecordingFile#readEventTypes
   */
  public List<EventType> readEventTypes() throws IOException
  {
    RecordingFile testee = $$$();

    List<EventType> result = testee.readEventTypes();
    return result;
  }

  /**
   * Example call to new method {@link RecordingFile#close}
   * @since 9
   * @see RecordingFile#close
   */
  public void close() throws IOException
  {
    RecordingFile testee = $$$();

    testee.close();
  }

  private RecordingFile $$$()
  {
    return null;
  }
}
