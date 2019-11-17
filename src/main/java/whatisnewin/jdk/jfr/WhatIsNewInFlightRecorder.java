package whatisnewin.jdk.jfr;

import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import jdk.jfr.Event;
import java.util.List;
import jdk.jfr.EventType;
import jdk.jfr.FlightRecorderListener;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link FlightRecorder}
 * that were newly introduced in Java version 9.<br>
 *
 * {@link FlightRecorder} is a completely new class.
 * @since 9
 * @see FlightRecorder
 */
public final class WhatIsNewInFlightRecorder
{
  /**
   * Example call to new method {@link FlightRecorder#takeSnapshot()}.
   * @since 9
   * @see FlightRecorder#takeSnapshot()
   */
  public Recording takeSnapshot()
  {
    FlightRecorder testee = $$$();

    Recording result = testee.takeSnapshot();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#addPeriodicEvent(Class, Runnable)}.
   * @since 9
   * @see FlightRecorder#addPeriodicEvent(Class, Runnable)
   */
  public static void addPeriodicEvent(Class<? extends Event> eventClass, Runnable hook) throws SecurityException
  {
    FlightRecorder.addPeriodicEvent(eventClass, hook);
  }

  /**
   * Example call to new method {@link FlightRecorder#getEventTypes()}.
   * @since 9
   * @see FlightRecorder#getEventTypes()
   */
  public List<EventType> getEventTypes()
  {
    FlightRecorder testee = $$$();

    List<EventType> result = testee.getEventTypes();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#isAvailable()}.
   * @since 9
   * @see FlightRecorder#isAvailable()
   */
  public static boolean isAvailable()
  {
    boolean result = FlightRecorder.isAvailable();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#getRecordings()}.
   * @since 9
   * @see FlightRecorder#getRecordings()
   */
  public List<Recording> getRecordings()
  {
    FlightRecorder testee = $$$();

    List<Recording> result = testee.getRecordings();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#register(Class)}.
   * @since 9
   * @see FlightRecorder#register(Class)
   */
  public static void register(Class<? extends Event> eventClass)
  {
    FlightRecorder.register(eventClass);
  }

  /**
   * Example call to new method {@link FlightRecorder#addListener(FlightRecorderListener)}.
   * @since 9
   * @see FlightRecorder#addListener(FlightRecorderListener)
   */
  public static void addListener(FlightRecorderListener changeListener)
  {
    FlightRecorder.addListener(changeListener);
  }

  /**
   * Example call to new method {@link FlightRecorder#removePeriodicEvent(Runnable)}.
   * @since 9
   * @see FlightRecorder#removePeriodicEvent(Runnable)
   */
  public static boolean removePeriodicEvent(Runnable hook) throws SecurityException
  {
    boolean result = FlightRecorder.removePeriodicEvent(hook);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#removeListener(FlightRecorderListener)}.
   * @since 9
   * @see FlightRecorder#removeListener(FlightRecorderListener)
   */
  public static boolean removeListener(FlightRecorderListener changeListener)
  {
    boolean result = FlightRecorder.removeListener(changeListener);
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#unregister(Class)}.
   * @since 9
   * @see FlightRecorder#unregister(Class)
   */
  public static void unregister(Class<? extends Event> eventClass)
  {
    FlightRecorder.unregister(eventClass);
  }

  /**
   * Example call to new method {@link FlightRecorder#getFlightRecorder()}.
   * @since 9
   * @see FlightRecorder#getFlightRecorder()
   */
  public static FlightRecorder getFlightRecorder() throws IllegalStateException, SecurityException
  {
    FlightRecorder result = FlightRecorder.getFlightRecorder();
    return result;
  }

  /**
   * Example call to new method {@link FlightRecorder#isInitialized()}.
   * @since 9
   * @see FlightRecorder#isInitialized()
   */
  public static boolean isInitialized()
  {
    boolean result = FlightRecorder.isInitialized();
    return result;
  }

  private FlightRecorder $$$()
  {
    return null;
  }
}
