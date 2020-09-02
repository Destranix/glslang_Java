package com.destranix.glslang;

public enum TLayoutGeometry {
	ElgNone(Main.ELG_NONE),
	ElgPoints(Main.ELG_POINTS),
	ElgLines(Main.ELG_LINES),
	ElgLinesAdjacency(Main.ELG_LINES_ADJACENCY),
	ElgLineStrip(Main.ELG_LINE_STRIP),
	ElgTriangles(Main.ELG_TRIANGLES),
	ElgTrianglesAdjacency(Main.ELG_TRIANGLES_ADJACENCY),
	ElgTriangleStrip(Main.ELG_TRIANGLE_STRIP),
	ElgQuads(Main.ELG_QUADS),
	ElgIsolines(Main.ELG_ISOLINES);

	private final int value;

	private TLayoutGeometry(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TLayoutGeometry valueByStr(String str) {
		switch (str) {
			case "ElgNone":
				return ElgNone;
			case "ElgPoints":
				return ElgPoints;
			case "ElgLines":
				return ElgLines;
			case "ElgLinesAdjacency":
				return ElgLinesAdjacency;
			case "ElgLineStrip":
				return ElgLineStrip;
			case "ElgTriangles":
				return ElgTriangles;
			case "ElgTrianglesAdjacency":
				return ElgTrianglesAdjacency;
			case "ElgTriangleStrip":
				return ElgTriangleStrip;
			case "ElgQuads":
				return ElgQuads;
			case "ElgIsolines":
				return ElgIsolines;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TLayoutGeometry valueByConstant(int constant) {
		switch (constant) {
			case Main.ELG_NONE:
				return ElgNone;
			case Main.ELG_POINTS:
				return ElgPoints;
			case Main.ELG_LINES:
				return ElgLines;
			case Main.ELG_LINES_ADJACENCY:
				return ElgLinesAdjacency;
			case Main.ELG_LINE_STRIP:
				return ElgLineStrip;
			case Main.ELG_TRIANGLES:
				return ElgTriangles;
			case Main.ELG_TRIANGLES_ADJACENCY:
				return ElgTrianglesAdjacency;
			case Main.ELG_TRIANGLE_STRIP:
				return ElgTriangleStrip;
			case Main.ELG_QUADS:
				return ElgQuads;
			case Main.ELG_ISOLINES:
				return ElgIsolines;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
