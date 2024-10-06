package com.example.smoothRideAdmin;

import com.google.android.gms.maps.model.LatLng;

public class Waypoint {
    private final LatLng location;
    private final String instruction;
    private String name; // Optional name for the waypoint
    private final long timestamp; // Optional timestamp for tracking

    public Waypoint(LatLng location, String instruction) {
        this.location = location;
        this.instruction = instruction;
        this.timestamp = System.currentTimeMillis(); // Set timestamp to current time
    }

    public Waypoint(LatLng location, String instruction, String name) {
        this(location, instruction);
        this.name = name;
    }

    public LatLng getLocation() {
        return location;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getName() {
        return name;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Waypoint{" +
                "location=" + location +
                ", instruction='" + instruction + '\'' +
                ", name='" + name + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Waypoint)) return false;
        Waypoint waypoint = (Waypoint) obj;
        return location.equals(waypoint.location) &&
                instruction.equals(waypoint.instruction);
    }

    @Override
    public int hashCode() {
        return 31 * location.hashCode() + instruction.hashCode();
    }
}
