package GUI;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class SimpleSymbol {
  private SimpleStringProperty name;
  private SimpleStringProperty scopeID;
  private SimpleStringProperty type;
  private SimpleIntegerProperty size;
  private SimpleStringProperty location;
  private SimpleIntegerProperty value;
  SimpleSymbol(String name, String scopeID, String type, Integer size, Integer location){
    this.name = new SimpleStringProperty(name);
    this.scopeID = new SimpleStringProperty(scopeID);
    this.type = new SimpleStringProperty(type);
    this.size = new SimpleIntegerProperty(size);
    this.location = new SimpleStringProperty(Integer.toString(location));
    this.value = new SimpleIntegerProperty(0);
  }


  public String getName() {
    return name.get();
  }

  public SimpleStringProperty nameProperty() {
    return name;
  }

  public void setName(String name) {
    this.name.set(name);
  }

  public String getScopeID() {
    return scopeID.get();
  }

  public SimpleStringProperty scopeIDProperty() {
    return scopeID;
  }

  public void setScopeID(String scopeID) {
    this.scopeID.set(scopeID);
  }

  public String getType() {
    return type.get();
  }

  public SimpleStringProperty typeProperty() {
    return type;
  }

  public void setType(String type) {
    this.type.set(type);
  }

  public Integer getSize() {
    return size.get();
  }

  public SimpleIntegerProperty sizeProperty() {
    return size;
  }

  public void setSize(int size) {
    this.size.set(size);
  }

  public String getLocation() {
    return location.get();
  }

  public SimpleStringProperty locationProperty() {
    return location;
  }

  public void setLocation(String location) {
    this.location.set(location);
  }

  public Integer getValue() {
    return value.get();
  }

  public SimpleIntegerProperty valueProperty() {
    return value;
  }

  public void setValue(int value) {
    this.value.set(value);
  }

}