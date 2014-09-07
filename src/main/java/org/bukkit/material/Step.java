package org.bukkit.material;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Step;
import org.bukkit.material.TexturedMaterial;


public class Step extends TexturedMaterial  {


	public List<Material> getTextures() {
		return null;
	}

	public boolean isInverted() {
		return false;
	}

	public void setInverted(boolean inv) {
	}

	@Deprecated protected int getTextureIndex() {
		return 0;
	}

	@Deprecated protected void setTextureIndex(int idx) {
	}

	public Step clone() {
		return null;
	}

	public String toString() {
		return null;
	}
}
