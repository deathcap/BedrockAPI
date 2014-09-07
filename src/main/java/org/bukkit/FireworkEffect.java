package org.bukkit;

import java.io.Serializable;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import java.util.List;
import java.util.Map;
import org.bukkit.Color;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.configuration.serialization.ConfigurationSerializable;


public final class FireworkEffect extends Object implements ConfigurationSerializable  {


	public static FireworkEffect.Builder builder() {
		return null;
	}

	public boolean hasFlicker() {
		return false;
	}

	public boolean hasTrail() {
		return false;
	}

	public List<Color> getColors() {
		return null;
	}

	public List<Color> getFadeColors() {
		return null;
	}

	public FireworkEffect.Type getType() {
		return null;
	}

	public static ConfigurationSerializable deserialize(Map<String,Object> map) {
		return null;
	}

	public Map<String,Object> serialize() {
		return null;
	}

	public String toString() {
		return null;
	}

	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		return false;
	}

	
	
	
	public static final class Builder extends Object  {
	
	
		public Builder with(Type type) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withFlicker() {
			return null;
		}
	
		public Builder flicker(boolean flicker) {
			return null;
		}
	
		public Builder withTrail() {
			return null;
		}
	
		public Builder trail(boolean trail) {
			return null;
		}
	
		public Builder withColor(Color color) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withColor(Color... colors) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withColor(Iterable<?> colors) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withFade(Color color) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withFade(Color... colors) throws IllegalArgumentException {
			return null;
		}
	
		public Builder withFade(Iterable<?> colors) throws IllegalArgumentException {
			return null;
		}
	
		public FireworkEffect build() {
			return null;
		}
	}

	
	
	
	public static enum Type  {
	
		BALL,
		BALL_LARGE,
		STAR,
		BURST,
		CREEPER,
		;
	}
}
