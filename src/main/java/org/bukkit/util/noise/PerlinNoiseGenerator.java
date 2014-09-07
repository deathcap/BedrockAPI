package org.bukkit.util.noise;

import java.util.Random;
import org.bukkit.World;
import org.bukkit.util.noise.NoiseGenerator;
import org.bukkit.util.noise.PerlinNoiseGenerator;
import org.bukkit.util.noise.SimplexNoiseGenerator;


public class PerlinNoiseGenerator extends NoiseGenerator  {


	protected static final int[][] grad3 = null;

	protected PerlinNoiseGenerator() {
	}

	public PerlinNoiseGenerator(World world) {
	}

	public PerlinNoiseGenerator(long seed) {
	}

	public PerlinNoiseGenerator(Random rand) {
	}

	public static double getNoise(double x) {
		return 0.0;
	}

	public static double getNoise(double x, double y) {
		return 0.0;
	}

	public static double getNoise(double x, double y, double z) {
		return 0.0;
	}

	public static PerlinNoiseGenerator getInstance() {
		return null;
	}

	public double noise(double x, double y, double z) {
		return 0.0;
	}

	public static double getNoise(double x, int octaves, double frequency, double amplitude) {
		return 0.0;
	}

	public static double getNoise(double x, double y, int octaves, double frequency, double amplitude) {
		return 0.0;
	}

	public static double getNoise(double x, double y, double z, int octaves, double frequency, double amplitude) {
		return 0.0;
	}
}
