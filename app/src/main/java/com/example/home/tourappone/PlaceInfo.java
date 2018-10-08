package com.example.home.tourappone;

/**
 * Created by Home on 11/26/2017.
 */

public class PlaceInfo {

    // Contains name of the place.
    private String name_of_place;

    // Contains the address of the place.
    private String location_of_place;

    // Contains the timings the place is open at.
    private String timings;

    // Contains a picture of the place to give an idea to the user about the type of place it is.
    private int mImageResourceId;

    /**
     * This is the constructor used to initialize the object
     *
     * @param name is the name of the place
     * @param location is where the place is located
     * @param time is when the place is open
     * @param imageId is the picture associated with the place
     */
    public PlaceInfo(String name, String location, String time, int imageId) {
        name_of_place = name;
        location_of_place = location;
        timings = time;
        mImageResourceId = imageId;
    }

    public String getName_of_place() {
        return name_of_place;
    }

    public String getLocation_of_place() {
        return location_of_place;
    }

    public String getTimings() {
        return timings;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
