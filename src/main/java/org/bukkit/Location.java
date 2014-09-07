package org.bukkit;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;


public class Location extends Object implements Cloneable  {


	public void setWorld(World world) {
	}

	public World getWorld() {
		return null;
	}

	public Chunk getChunk() {
		return null;
	}

	public Block getBlock() {
		return null;
	}

	public void setX(double x) {
	}

	public double getX() {
		return 0.0;
	}

	public int getBlockX() {
		return 0;
	}

	public void setY(double y) {
	}

	public double getY() {
		return 0.0;
	}

	public int getBlockY() {
		return 0;
	}

	public void setZ(double z) {
	}

	public double getZ() {
		return 0.0;
	}

	public int getBlockZ() {
		return 0;
	}

	public void setYaw(float yaw) {
	}

	public float getYaw() {
		return 0.0f;
	}

	public void setPitch(float pitch) {
	}

	public float getPitch() {
		return 0.0f;
	}

	public Vector getDirection() {
		return null;
	}

	public Location setDirection(Vector vector) {
		return null;
	}

	public Location add(Location vec) {
		return null;
	}

	public Location add(Vector vec) {
		return null;
	}

	public Location add(double x, double y, double z) {
		return null;
	}

	public Location subtract(Location vec) {
		return null;
	}

	public Location subtract(Vector vec) {
		return null;
	}

	public Location subtract(double x, double y, double z) {
		return null;
	}

	public double length() {
		return 0.0;
	}

	public double lengthSquared() {
		return 0.0;
	}

	public double distance(Location o) {
		return 0.0;
	}

	public double distanceSquared(Location o) {
		return 0.0;
	}

	public Location multiply(double m) {
		return null;
	}

	public Location zero() {
		return null;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public Vector toVector() {
		return null;
	}

	public Location clone() {
		return null;
	}

	public static int locToBlock(double loc) {
		return 0;
	}
}
