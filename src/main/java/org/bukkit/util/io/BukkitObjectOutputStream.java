package org.bukkit.util.io;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.Flushable;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;


public class BukkitObjectOutputStream extends ObjectOutputStream  {


    public BukkitObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected Object replaceObject(Object obj) throws IOException {
		return null;
	}
}
