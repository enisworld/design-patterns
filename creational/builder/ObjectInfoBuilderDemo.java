public class EstateAgent {

	public static void main(String[] args) {
		
		System.out.println("Started");
		ObjectInfoBuilder objectInfoBuilder = new ObjectInfoBuilder();
		ObjectInfo objectInfo = objectInfoBuilder.setObjectId("")
							.setObjectName(""))
							.setObjectType("")
							.setObjectColor("")
							.setX(0.0)
							.setY(0.0)
							.setZ(0.0)
							.setWidth(0.0)
							.setHeight(0.0)
							.setDepth(0.0)
							.setAngle(0.0)
							.build();
    
    
    		ObjectInfo objectInfo2 = objectInfoBuilder.setObjectId("")
							.setObjectName(""))
							.setObjectType("")
							.setObjectColor("")
							.setAngle(0.0)
							.build();
    
   		ObjectInfo objectInfo3 = objectInfoBuilder.setX(0.0)
							.setY(0.0)
							.setZ(0.0)
							.setWidth(0.0)
							.setHeight(0.0)
							.setDepth(0.0)
							.setAngle(0.0)
							.build();
    

		System.out.println(objectInfo.print());
		System.out.println("******************************************");
		System.out.println(objectInfo2.print());
		System.out.println("******************************************");
		System.out.println(objectInfo3.print());


	}

}

