package org.bukkit;



public interface BlockChangeDelegate  {


	@Deprecated boolean setRawTypeId(int x, int y, int z, int typeId);

	@Deprecated boolean setRawTypeIdAndData(int x, int y, int z, int typeId, int data);

	@Deprecated boolean setTypeId(int x, int y, int z, int typeId);

	@Deprecated boolean setTypeIdAndData(int x, int y, int z, int typeId, int data);

	@Deprecated int getTypeId(int x, int y, int z);

	int getHeight();

	boolean isEmpty(int x, int y, int z);
}
