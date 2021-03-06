package org.bukkit.plugin;

import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.bukkit.plugin.Plugin;


public class PluginLogger extends Logger  {


	public PluginLogger(Plugin context) {
        super(context.getName(), context.getName()); // TODO
    }

    /**
     * Protected method to construct a logger for a named subsystem.
     * <p/>
     * The logger will be initially configured with a null Level
     * and with useParentHandlers set to true.
     *
     * @param name               A name for the logger.  This should
     *                           be a dot-separated name and should normally
     *                           be based on the package name or class name
     *                           of the subsystem, such as java.net
     *                           or javax.swing.  It may be null for anonymous Loggers.
     * @param resourceBundleName name of ResourceBundle to be used for localizing
     *                           messages for this logger.  May be null if none
     *                           of the messages require localization.
     * @throws java.util.MissingResourceException
     *          if the resourceBundleName is non-null and
     *          no corresponding resource can be found.
     */
    protected PluginLogger(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }

    public void log(LogRecord logRecord) {
	}
}
