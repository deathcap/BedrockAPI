package org.bukkit.util.io;

import java.io.Closeable;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectStreamConstants;


public class BukkitObjectInputStream extends ObjectInputStream  {


	protected BukkitObjectInputStream() throws IOException, SecurityException {
	}

	public BukkitObjectInputStream(InputStream in) throws IOException {
	}

    public BukkitObjectInputStream(InputStream in) throws IOException {
        super(in);
    }

    protected Object resolveObject(Object obj) throws IOException {
		return null;
	}
}
