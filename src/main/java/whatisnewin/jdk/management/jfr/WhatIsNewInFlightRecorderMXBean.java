package whatisnewin.jdk.management.jfr;

import jdk.management.jfr.FlightRecorderMXBean;
import java.util.List;
import jdk.management.jfr.ConfigurationInfo;
import jdk.management.jfr.EventTypeInfo;
import java.util.Map;
import java.io.IOException;
import jdk.management.jfr.RecordingInfo;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link FlightRecorderMXBean}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link FlightRecorderMXBean} is a completely new class
 * @since 9
 * @see FlightRecorderMXBean
 */
public final class WhatIsNewInFlightRecorderMXBean
{
  /**
   * Example usage of the new field {@link FlightRecorderMXBean#MXBEAN_NAME}
   * @since 9
   * @see FlightRecorderMXBean#MXBEAN_NAME
   */
  public static  final String MXBEAN_NAME = FlightRecorderMXBean.MXBEAN_NAME;

  /**
   * Example call to new method {@link FlightRecorderMXBean#getConfigurations}
   * @since 9
   * @see FlightRecorderMXBean#getConfigurations
   */
  public List<ConfigurationInfo> getConfigurations()
  {
    FlightRecorderMXBean testee = $$$();

    List<ConfigurationInfo> result = testee.getConfigurations();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#getEventTypes}
   * @since 9
   * @see FlightRecorderMXBean#getEventTypes
   */
  public List<EventTypeInfo> getEventTypes()
  {
    FlightRecorderMXBean testee = $$$();

    List<EventTypeInfo> result = testee.getEventTypes();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#getRecordingOptions}
   * @since 9
   * @see FlightRecorderMXBean#getRecordingOptions
   */
  public Map<String, String> getRecordingOptions(long recordingId) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    Map<String, String> result = testee.getRecordingOptions(recordingId);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#takeSnapshot}
   * @since 9
   * @see FlightRecorderMXBean#takeSnapshot
   */
  public long takeSnapshot()
  {
    FlightRecorderMXBean testee = $$$();

    long result = testee.takeSnapshot();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#closeRecording}
   * @since 9
   * @see FlightRecorderMXBean#closeRecording
   */
  public void closeRecording(long recordingId) throws IOException
  {
    FlightRecorderMXBean testee = $$$();

    testee.closeRecording(recordingId);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#openStream}
   * @since 9
   * @see FlightRecorderMXBean#openStream
   */
  public long openStream(long recordingId, Map<String, String> streamOptions) throws IOException
  {
    FlightRecorderMXBean testee = $$$();

    long result = testee.openStream(recordingId, streamOptions);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#setRecordingSettings}
   * @since 9
   * @see FlightRecorderMXBean#setRecordingSettings
   */
  public void setRecordingSettings(long recordingId, Map<String, String> settings) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    testee.setRecordingSettings(recordingId, settings);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#newRecording}
   * @since 9
   * @see FlightRecorderMXBean#newRecording
   */
  public long newRecording() throws IllegalStateException, SecurityException
  {
    FlightRecorderMXBean testee = $$$();

    long result = testee.newRecording();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#cloneRecording}
   * @since 9
   * @see FlightRecorderMXBean#cloneRecording
   */
  public long cloneRecording(long recordingId, boolean stop) throws IllegalArgumentException, SecurityException
  {
    FlightRecorderMXBean testee = $$$();

    long result = testee.cloneRecording(recordingId, stop);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#setRecordingOptions}
   * @since 9
   * @see FlightRecorderMXBean#setRecordingOptions
   */
  public void setRecordingOptions(long recordingId, Map<String, String> options) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    testee.setRecordingOptions(recordingId, options);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#getRecordings}
   * @since 9
   * @see FlightRecorderMXBean#getRecordings
   */
  public List<RecordingInfo> getRecordings()
  {
    FlightRecorderMXBean testee = $$$();

    List<RecordingInfo> result = testee.getRecordings();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#copyTo}
   * @since 9
   * @see FlightRecorderMXBean#copyTo
   */
  public void copyTo(long recordingId, String outputFile) throws IOException, SecurityException
  {
    FlightRecorderMXBean testee = $$$();

    testee.copyTo(recordingId, outputFile);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#closeStream}
   * @since 9
   * @see FlightRecorderMXBean#closeStream
   */
  public void closeStream(long streamId) throws IOException
  {
    FlightRecorderMXBean testee = $$$();

    testee.closeStream(streamId);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#getRecordingSettings}
   * @since 9
   * @see FlightRecorderMXBean#getRecordingSettings
   */
  public Map<String, String> getRecordingSettings(long recordingId) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    Map<String, String> result = testee.getRecordingSettings(recordingId);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#setPredefinedConfiguration}
   * @since 9
   * @see FlightRecorderMXBean#setPredefinedConfiguration
   */
  public void setPredefinedConfiguration(long recordingId, String configurationName) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    testee.setPredefinedConfiguration(recordingId, configurationName);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#startRecording}
   * @since 9
   * @see FlightRecorderMXBean#startRecording
   */
  public void startRecording(long recordingId) throws IllegalStateException, SecurityException
  {
    FlightRecorderMXBean testee = $$$();

    testee.startRecording(recordingId);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#readStream}
   * @since 9
   * @see FlightRecorderMXBean#readStream
   */
  public byte[] readStream(long streamId) throws IOException
  {
    FlightRecorderMXBean testee = $$$();

    byte[] result = testee.readStream(streamId);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#setConfiguration}
   * @since 9
   * @see FlightRecorderMXBean#setConfiguration
   */
  public void setConfiguration(long recordingId, String contents) throws IllegalArgumentException
  {
    FlightRecorderMXBean testee = $$$();

    testee.setConfiguration(recordingId, contents);
  }

  /**
   * Example call to new method {@link FlightRecorderMXBean#stopRecording}
   * @since 9
   * @see FlightRecorderMXBean#stopRecording
   */
  public boolean stopRecording(long recordingId) throws IllegalArgumentException, IllegalStateException, SecurityException
  {
    FlightRecorderMXBean testee = $$$();

    boolean result = testee.stopRecording(recordingId);
    return result;
  }

  private FlightRecorderMXBean $$$()
  {
    return null;
  }
}