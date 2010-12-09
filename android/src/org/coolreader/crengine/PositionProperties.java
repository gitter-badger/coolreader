package org.coolreader.crengine;

public class PositionProperties {
	public int x;
	public int y;
	public int fullHeight;
	public int pageHeight;
	public int pageWidth;
	public int pageNumber;
	public int pageCount;
	public int pageMode; // 1 for page mode, 0 for scroll mode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fullHeight;
		result = prime * result + pageCount;
		result = prime * result + pageHeight;
		result = prime * result + pageMode;
		result = prime * result + pageNumber;
		result = prime * result + pageWidth;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PositionProperties other = (PositionProperties) obj;
		if (fullHeight != other.fullHeight)
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (pageHeight != other.pageHeight)
			return false;
		if (pageMode != other.pageMode)
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (pageWidth != other.pageWidth)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
