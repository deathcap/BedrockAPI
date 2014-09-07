package org.bukkit.util.noise;

import org.bukkit.util.noise.NoiseGenerator;
import org.bukkit.util.noise.PerlinOctaveGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;


public abstract class OctaveGenerator extends Object  {


	protected final NoiseGenerator[] octaves = null;

	protected double xScale = 0.0;

	protected double yScale = 0.0;

	protected double zScale = 0.0;

	protected OctaveGenerator(NoiseGenerator[] octaves) {
	}

	public void setScale(double scale) {
	}

	public double getXScale() {
		return 0.0;
	}

	public void setXScale(double scale) {
	}

	public double getYScale() {
		return 0.0;
	}

	public void setYScale(double scale) {
	}

	public double getZScale() {
		return 0.0;
	}

	public void setZScale(double scale) {
	}

	public NoiseGenerator[] getOctaves() {
		return null;
	}

	public double noise(double x, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}

	public double noise(double x, double y, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, double y, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}

	public double noise(double x, double y, double z, double frequency, double amplitude) {
		return 0.0;
	}

	public double noise(double x, double y, double z, double frequency, double amplitude, boolean normalized) {
		return 0.0;
	}
}
