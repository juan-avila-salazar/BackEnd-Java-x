package com.springbootservicelocatorfactory.springbootservicelocatorfactory.model;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serializableVersionUID = 1L;

    private String vehicleName;
    private String vehicleType;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleName='" + vehicleName + '\'' + ", vehicleType='" + vehicleType + '\'' + '}';
    }
}
