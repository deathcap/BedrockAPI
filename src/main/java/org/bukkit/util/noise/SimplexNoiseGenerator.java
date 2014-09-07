package org.bukkit.util.noise;

import java.util.Random;
import org.bukkit.World;
import org.bukkit.util.noise.NoiseGenerator;
import org.bukkit.util.noise.PerlinNoiseGenerator;
import org.bukkit.util.noise.SimplexNoiseGenerator;


public class SimplexNoiseGenerator extends PerlinNoiseGenerator  {


	protected static double dot(int[] g, double x, double y) {
		return 0.0;
	}

	protected static double dot(int[] g, double x, double y, double z) {
		return 0.0;
	}

	protected static double dot(int[] g, double x, double y, double z, double w) {
		return 0.0;
	}

	public static double getNoise(double xin) {
		return 0.0;
	}

	public static double getNoise(double xin, double yin) {
		return 0.0;
	}

	public static double getNoise(double xin, double yin, double zin) {
		return 0.0;
	}

	public static double getNoise(double x, double y, double z, double w) {
		return 0.0;
	}

	public double noise(double xin, double yin, double zin) {
		return 0.0;
	}

	public double noise(double xin, double yin) {
		return 0.0;
	}

	public double noise(double x, double y, double z, double w) {
		return 0.0;
	}

	public static SimplexNoiseGenerator getInstance() {
		return null;
	}
}
