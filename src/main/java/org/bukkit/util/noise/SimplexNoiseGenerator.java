package org.bukkit.util.noise;

import java.util.Random;
import org.bukkit.World;
import org.bukkit.util.noise.NoiseGenerator;
import org.bukkit.util.noise.PerlinNoiseGenerator;
import org.bukkit.util.noise.SimplexNoiseGenerator;


public class SimplexNoiseGenerator extends PerlinNoiseGenerator  {


	protected static final double SQRT_3 = 0.0;

	protected static final double SQRT_5 = 0.0;

	protected static final double F2 = 0.0;

	protected static final double G2 = 0.0;

	protected static final double G22 = 0.0;

	protected static final double F3 = 0.0;

	protected static final double G3 = 0.0;

	protected static final double F4 = 0.0;

	protected static final double G4 = 0.0;

	protected static final double G42 = 0.0;

	protected static final double G43 = 0.0;

	protected static final double G44 = 0.0;

	protected static final int[][] grad4 = null;

	protected static final int[][] simplex = null;

	protected static double offsetW = 0.0;

	protected SimplexNoiseGenerator() {
	}

	public SimplexNoiseGenerator(World world) {
	}

	public SimplexNoiseGenerator(long seed) {
	}

	public SimplexNoiseGenerator(Random rand) {
	}

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
