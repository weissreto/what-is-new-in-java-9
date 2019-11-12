package whatisnewin.java.awt;

import java.awt.Desktop;
import java.awt.desktop.PrintFilesHandler;
import java.awt.desktop.SystemEventListener;
import java.awt.desktop.OpenURIHandler;
import java.awt.desktop.QuitHandler;
import java.io.File;
import java.awt.desktop.PreferencesHandler;
import java.awt.desktop.OpenFilesHandler;
import java.awt.desktop.QuitStrategy;
import javax.swing.JMenuBar;
import java.awt.desktop.AboutHandler;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Desktop}
 * that were newly introduced in Java versions 9.<br>
 *
 * {@link Desktop} is an old class but has new fields, constructors or methods
 * @since 1.6
 * @see Desktop
 */
public final class WhatIsNewInDesktop
{
  /**
   * Example call to new method {@link Desktop#setPrintFileHandler}
   * @since 9
   * @see Desktop#setPrintFileHandler
   */
  public void setPrintFileHandler(PrintFilesHandler printFileHandler)
  {
    Desktop testee = $$$();

    testee.setPrintFileHandler(printFileHandler);
  }

  /**
   * Example call to new method {@link Desktop#addAppEventListener}
   * @since 9
   * @see Desktop#addAppEventListener
   */
  public void addAppEventListener(SystemEventListener listener)
  {
    Desktop testee = $$$();

    testee.addAppEventListener(listener);
  }

  /**
   * Example call to new method {@link Desktop#setOpenURIHandler}
   * @since 9
   * @see Desktop#setOpenURIHandler
   */
  public void setOpenURIHandler(OpenURIHandler openURIHandler)
  {
    Desktop testee = $$$();

    testee.setOpenURIHandler(openURIHandler);
  }

  /**
   * Example call to new method {@link Desktop#setQuitHandler}
   * @since 9
   * @see Desktop#setQuitHandler
   */
  public void setQuitHandler(QuitHandler quitHandler)
  {
    Desktop testee = $$$();

    testee.setQuitHandler(quitHandler);
  }

  /**
   * Example call to new method {@link Desktop#removeAppEventListener}
   * @since 9
   * @see Desktop#removeAppEventListener
   */
  public void removeAppEventListener(SystemEventListener listener)
  {
    Desktop testee = $$$();

    testee.removeAppEventListener(listener);
  }

  /**
   * Example call to new method {@link Desktop#browseFileDirectory}
   * @since 9
   * @see Desktop#browseFileDirectory
   */
  public void browseFileDirectory(File file)
  {
    Desktop testee = $$$();

    testee.browseFileDirectory(file);
  }

  /**
   * Example call to new method {@link Desktop#setPreferencesHandler}
   * @since 9
   * @see Desktop#setPreferencesHandler
   */
  public void setPreferencesHandler(PreferencesHandler preferencesHandler)
  {
    Desktop testee = $$$();

    testee.setPreferencesHandler(preferencesHandler);
  }

  /**
   * Example call to new method {@link Desktop#openHelpViewer}
   * @since 9
   * @see Desktop#openHelpViewer
   */
  public void openHelpViewer()
  {
    Desktop testee = $$$();

    testee.openHelpViewer();
  }

  /**
   * Example call to new method {@link Desktop#setOpenFileHandler}
   * @since 9
   * @see Desktop#setOpenFileHandler
   */
  public void setOpenFileHandler(OpenFilesHandler openFileHandler)
  {
    Desktop testee = $$$();

    testee.setOpenFileHandler(openFileHandler);
  }

  /**
   * Example call to new method {@link Desktop#requestForeground}
   * @since 9
   * @see Desktop#requestForeground
   */
  public void requestForeground(boolean allWindows)
  {
    Desktop testee = $$$();

    testee.requestForeground(allWindows);
  }

  /**
   * Example call to new method {@link Desktop#setQuitStrategy}
   * @since 9
   * @see Desktop#setQuitStrategy
   */
  public void setQuitStrategy(QuitStrategy strategy)
  {
    Desktop testee = $$$();

    testee.setQuitStrategy(strategy);
  }

  /**
   * Example call to new method {@link Desktop#setDefaultMenuBar}
   * @since 9
   * @see Desktop#setDefaultMenuBar
   */
  public void setDefaultMenuBar(JMenuBar menuBar)
  {
    Desktop testee = $$$();

    testee.setDefaultMenuBar(menuBar);
  }

  /**
   * Example call to new method {@link Desktop#disableSuddenTermination}
   * @since 9
   * @see Desktop#disableSuddenTermination
   */
  public void disableSuddenTermination()
  {
    Desktop testee = $$$();

    testee.disableSuddenTermination();
  }

  /**
   * Example call to new method {@link Desktop#setAboutHandler}
   * @since 9
   * @see Desktop#setAboutHandler
   */
  public void setAboutHandler(AboutHandler aboutHandler)
  {
    Desktop testee = $$$();

    testee.setAboutHandler(aboutHandler);
  }

  /**
   * Example call to new method {@link Desktop#enableSuddenTermination}
   * @since 9
   * @see Desktop#enableSuddenTermination
   */
  public void enableSuddenTermination()
  {
    Desktop testee = $$$();

    testee.enableSuddenTermination();
  }

  private Desktop $$$()
  {
    return null;
  }
}