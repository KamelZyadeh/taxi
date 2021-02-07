package com.java.tutorial.entities;

import java.util.Objects;

public class Location {

    private long id;
    private double lng;
    private double lat;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }
    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Location location = (Location) o;
        return id == location.id &&
                Objects.equals(lat, location.lat) &&
                Objects.equals(lng, location.lng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lat, lng);
    }

    @Override
    public String toString() {
        return "Location{" +
                "id-'" + id + '\'' +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }

}
