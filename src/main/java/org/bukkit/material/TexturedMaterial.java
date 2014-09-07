package org.bukkit.material;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.MonsterEggs;
import org.bukkit.material.SmoothBrick;
import org.bukkit.material.Step;
import org.bukkit.material.TexturedMaterial;


public abstract class TexturedMaterial extends MaterialData  {


    public TexturedMaterial() {
        // TODO
    }

	public TexturedMaterial(Material m) {
	}

	@Deprecated public TexturedMaterial(int type) {
	}

	@Deprecated public TexturedMaterial(int type, byte data) {
	}

	@Deprecated public TexturedMaterial(Material type, byte data) {
	}

	public abstract List<Material> getTextures();

	public Material getMaterial() {
		return null;
	}

	public void setMaterial(Material material) {
	}

	@Deprecated protected int getTextureIndex() {
		return 0;
	}

	@Deprecated protected void setTextureIndex(int idx) {
	}

	public String toString() {
		return null;
	}

	public TexturedMaterial clone() {
		return null;
	}
}
