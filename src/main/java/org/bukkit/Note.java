package org.bukkit;

import java.io.Serializable;
import org.bukkit.Note;
import org.bukkit.Note.Tone;
import org.bukkit.Note;
import org.bukkit.Note.Tone;


public class Note extends Object  {


	public static Note flat(int octave, Note.Tone tone) {
		return null;
	}

	public static Note sharp(int octave, Note.Tone tone) {
		return null;
	}

	public static Note natural(int octave, Note.Tone tone) {
		return null;
	}

	public Note sharped() {
		return null;
	}

	public Note flattened() {
		return null;
	}

	@Deprecated public byte getId() {
		return 0;
	}

	public int getOctave() {
		return 0;
	}

	public Note.Tone getTone() {
		return null;
	}

	public boolean isSharped() {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public String toString() {
		return null;
	}

	
	
	
	public static enum Tone  {
	
		G,
		A,
		B,
		C,
		D,
		E,
		F,
		TONES_COUNT,
		;
	
	
	
		@Deprecated public byte getId() {
			return 0;
		}
	
		@Deprecated public byte getId(boolean sharped) {
			return 0;
		}
	
		public boolean isSharpable() {
			return false;
		}
	
		@Deprecated public boolean isSharped(byte id) {
			return false;
		}
	
		@Deprecated public static Tone getById(byte id) {
			return null;
		}
	}
}
