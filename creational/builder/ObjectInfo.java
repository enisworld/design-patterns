public class ObjectInfo {
	private String objectId;
	private String sourceId;
	private String destinationId;
	private String objectName;
	private String objectType;
	private String objectColor;
	private String relatedObjects;	
	private double X;
	private double Y;
	private double Z;
	private double width;
	private double height;
	private double depth;
	private double angle;
	
	public ObjectInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public String getObjectColor() {
		return objectColor;
	}
	public void setObjectColor(String objectColor) {
		this.objectColor = objectColor;
	}
	public String getRelatedObjects() {
		return relatedObjects;
	}
	public void setRelatedObjects(String relatedObjects) {
		this.relatedObjects = relatedObjects;
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	public double getZ() {
		return Z;
	}
	public void setZ(double z) {
		Z = z;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}


	public String getSourceId() {
		return sourceId;
	}


	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}


	public String getDestinationId() {
		return destinationId;
	}


	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}


	public String print() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("ID: " + objectId + ", ");
		sBuilder.append("Name: " + objectName + " ");
		sBuilder.append("Color: " + objectColor + " ");
		sBuilder.append("Type: " + objectType + " ");
		sBuilder.append("X: " + X + " ");
		sBuilder.append("Y: " + Y + " ");
		sBuilder.append("Z: " + Z + " ");
		sBuilder.append("Width: " + width + " ");
		sBuilder.append("Height: " + height + " ");
		sBuilder.append("Depth: " + depth + " ");
		sBuilder.append("Angle: " + angle + " ");
		sBuilder.append("RelatedObjs: " + relatedObjects);
		return sBuilder.toString();
	}

}
