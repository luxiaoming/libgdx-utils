package no.mehl.libgdx.utils;

import com.badlogic.gdx.math.Vector2;

/**
 * A simple class describing dimension in game world.
 * @author Kjetil Mehl <kjetil@mehl.no>
 */
public class Dimension {
	
	public float width, height, depth, radius;
	private transient Vector2 center;
	
	/** Creates an empty dimension */
	public Dimension() {
		this(0, 0);
	}
	
	/** Constructor for the dimensions for a Circle. */
	public Dimension(float radius) {
		this(2*radius, 2*radius, 2*radius);
		this.radius = radius;
	}
	
	/** Constructor for a simple rectangle **/
	public Dimension(float width, float height) {
		this(width, height, 1);
		center = new Vector2(width * 0.5f, height * 0.5f);
	}
	
	public Dimension(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public Dimension(Dimension dim) {
		this.width = dim.width;
		this.height = dim.height;
		this.depth = dim.depth;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public float getHeight() {
		return this.height;
	}
	
	public float getDepth() {
		return this.depth;
	}
	
	public float getRadius() {
		return this.width;
	}

	/** Returns the relative position for the centre of this dimension */
	public Vector2 getCenter() {
		return this.center;
	}

	public int compare(Dimension dimension) {
		if(this.width != dimension.width || this.height != dimension.height) return -1;
		return 1;
	}

	public Dimension set(Dimension dimension) {
		this.width = dimension.width;
		this.height = dimension.height;
		this.depth = dimension.depth;
		return this;
	}
	
	public String toString() {
		return "Width: " + width + " height: " + height + " depth: " + depth;
	}

	public void set(float value, float value2, float value3) {
		this.width = value;
		this.height = value2;
		this.depth = value3;
	}
}
