package fr.ensim.tpSofienDerbel.Model;


public class Features {	
	private String type;
	 Geometry GeometryObject;
	 Properties PropertiesObject;
	 public String getType() {
	  return type;
	 }
	 public Geometry getGeometry() {
	  return GeometryObject;
	 }
	 public Properties getProperties() {
	  return PropertiesObject;
	 }
	 public void setType(String type) {
	  this.type = type;
	 }
	 public void setGeometry(Geometry geometryObject) {
	  this.GeometryObject = geometryObject;
	 }
	 public void setProperties(Properties propertiesObject) {
	  this.PropertiesObject = propertiesObject;
	 }
}
