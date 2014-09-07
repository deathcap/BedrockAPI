package org.bukkit.util.noise;

import org.bukkit.util.noise.PerlinNoiseGenerator;


public abstract class NoiseGenerator extends Object  {


	protected final int[] perm = null;

	protected double offsetX = 0.0;

	protected double offsetY = 0.0;

	protected double offsetZ = 0.0;

	public NoiseGenerator() {
	}

	public static int floor(double x) {
		return 0;
	}

	protected static double fade(double x) {
		return 0.0;
	}

	protected static double lerp(double x, double y, double z) {
		return 0.0;
	}

	protected static double grad(int hash, double x, double y, double z) {
		return 0.0;
	}

	public double noise(double x) {
		return 0.0;
	}

	public double noise(double x, double y) {
		return 0.0;
	}

	public abstract double noise(double x, double y, double z);

	public double noise(double x, int octaves, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, int octaves, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}

	public double noise(double x, double y, int octaves, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, double y, int octaves, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}

	public double noise(double x, double y, double z, int octaves, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, double y, double z, int octaves, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}
}
