package org.bukkit.block;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.block.BlockState;
import org.bukkit.metadata.Metadatable;


public interface NoteBlock extends BlockState  {


	Note getNote();

	@Deprecated byte getRawNote();

	void setNote(Note note);

	@Deprecated void setRawNote(byte note);

	boolean play();

	@Deprecated boolean play(byte instrument, byte note);

	boolean play(Instrument instrument, Note note);
}
