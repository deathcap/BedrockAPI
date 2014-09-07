package org.bukkit.util;

import java.util.Map;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.util.BlockVector;
import org.bukkit.util.Vector;


public class Vector extends Object implements Cloneable, ConfigurationSerializable  {


	public Vector add(Vector vec) {
		return null;
	}

	public Vector subtract(Vector vec) {
		return null;
	}

	public Vector multiply(Vector vec) {
		return null;
	}

	public Vector divide(Vector vec) {
		return null;
	}

	public Vector copy(Vector vec) {
		return null;
	}

	public double length() {
		return 0.0;
	}

	public double lengthSquared() {
		return 0.0;
	}

	public double distance(Vector o) {
		return 0.0;
	}

	public double distanceSquared(Vector o) {
		return 0.0;
	}

	public float angle(Vector other) {
		return 0.0f;
	}

	public Vector midpoint(Vector other) {
		return null;
	}

	public Vector getMidpoint(Vector other) {
		return null;
	}

	public Vector multiply(int m) {
		return null;
	}

	public Vector multiply(double m) {
		return null;
	}

	public Vector multiply(float m) {
		return null;
	}

	public double dot(Vector other) {
		return 0.0;
	}

	public Vector crossProduct(Vector o) {
		return null;
	}

	public Vector normalize() {
		return null;
	}

	public Vector zero() {
		return null;
	}

	public boolean isInAABB(Vector min, Vector max) {
		return false;
	}

	public boolean isInSphere(Vector origin, double radius) {
		return false;
	}

	public double getX() {
		return 0.0;
	}

	public int getBlockX() {
		return 0;
	}

	public double getY() {
		return 0.0;
	}

	public int getBlockY() {
		return 0;
	}

	public double getZ() {
		return 0.0;
	}

	public int getBlockZ() {
		return 0;
	}

	public Vector setX(int x) {
		return null;
	}

	public Vector setX(double x) {
		return null;
	}

	public Vector setX(float x) {
		return null;
	}

	public Vector setY(int y) {
		return null;
	}

	public Vector setY(double y) {
		return null;
	}

	public Vector setY(float y) {
		return null;
	}

	public Vector setZ(int z) {
		return null;
	}

	public Vector setZ(double z) {
		return null;
	}

	public Vector setZ(float z) {
		return null;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public Vector clone() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Location toLocation(World world) {
		return null;
	}

	public Location toLocation(World world, float yaw, float pitch) {
		return null;
	}

	public BlockVector toBlockVector() {
		return null;
	}

	public static double getEpsilon() {
		return 0.0;
	}

	public static Vector getMinimum(Vector v1, Vector v2) {
		return null;
	}

	public static Vector getMaximum(Vector v1, Vector v2) {
		return null;
	}

	public static Vector getRandom() {
		return null;
	}

	public Map<String,Object> serialize() {
		return null;
	}

	public static Vector deserialize(Map<String,Object> args) {
		return null;
	}
}
