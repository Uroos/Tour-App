package com.example.home.tourappone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        /**
         * We need to create our own class to store the information about a place, like its name,
         * location, timings and a picture to go along with it.
         */
        final ArrayList<PlaceInfo> PlaceInfos = new ArrayList<PlaceInfo>();
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_one), getString(R.string.parks_location_one), getString(R.string.parks_time_one), R.drawable.japanese_park));
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_two), getString(R.string.parks_location_two), getString(R.string.parks_time_two), R.drawable.f9_park));
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_three), getString(R.string.parks_location_three), getString(R.string.parks_time_three), R.drawable.ayub_park));
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_four), getString(R.string.parks_location_four), getString(R.string.parks_time_four), R.drawable.lake_view_park));
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_five), getString(R.string.parks_location_five), getString(R.string.parks_time_five), R.drawable.rose_and_jasmine_garden));
        PlaceInfos.add(new PlaceInfo(getString(R.string.parks_name_six), getString(R.string.parks_location_six), getString(R.string.parks_time_six), R.drawable.jinnah_park));

        /**
         * Objects of any type besides the String cannot be passed to ArrayAdapter. Therefore
         * we need to create a custom ArrayAdapter that will take an object of our type and
         * display it properly.
         * The job of WordAdapter is to create a complete list item and return that so it can be
         * displayed.
         */
        PlaceInfoAdapter itemsAdapter = new PlaceInfoAdapter(getActivity(), PlaceInfos);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
