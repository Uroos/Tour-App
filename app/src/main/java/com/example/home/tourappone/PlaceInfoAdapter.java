package com.example.home.tourappone;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Home on 11/26/2017.
 */

public class PlaceInfoAdapter extends ArrayAdapter<PlaceInfo> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param placeInfo A List of PlaceInfo objects to display in a list
     */
    public PlaceInfoAdapter(Activity context, ArrayList<PlaceInfo> placeInfo) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, placeInfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items, parent, false);
        }
        // Get the {@link PlaceInfo} object located at this position in the list
        PlaceInfo currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of the place from the current PlaceInfo object and
        // set this text on the nameTextView
        nameTextView.setText(currentPlace.getName_of_place());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location from the current PlaceInfo object and
        // set this text on the locationTextView
        locationTextView.setText(currentPlace.getLocation_of_place());

        // Find the TextView in the list_item.xml layout with the ID timings_text_view.
        TextView timingsTextView = (TextView) listItemView.findViewById(R.id.timings_text_view);
        // Get the timings from the current PlaceInfo object and
        // set this text on the timingsTextView
        timingsTextView.setText(currentPlace.getTimings());

        // Find the ImageView in the list_item.xml layout with the ID place_image_view.
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.place_image_view);
        // Get the image resource ID from the current placeInfo object and
        // set the image to iconView.
        iconView.setImageResource(currentPlace.getmImageResourceId());

        return listItemView;

    }
}
