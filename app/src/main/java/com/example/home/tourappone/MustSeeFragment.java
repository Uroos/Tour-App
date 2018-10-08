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
public class MustSeeFragment extends Fragment {


    public MustSeeFragment() {
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
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_one), getString(R.string.mustsee_location_one), getString(R.string.mustsee_time_one), R.drawable.damane_koh));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_two), getString(R.string.mustsee_location_two), getString(R.string.mustsee_time_two), R.drawable.pir_sohawa));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_three), getString(R.string.mustsee_location_three), getString(R.string.mustsee_time_three), R.drawable.lok_virsa));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_four), getString(R.string.mustsee_location_four), getString(R.string.mustsee_time_four), R.drawable.pakistan_monument));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_five), getString(R.string.mustsee_location_five), getString(R.string.mustsee_time_five), R.drawable.khanpur_dam));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_six), getString(R.string.mustsee_location_six), getString(R.string.mustsee_time_six), R.drawable.trail_3));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_seven), getString(R.string.mustsee_location_seven), getString(R.string.mustsee_time_seven), R.drawable.natural_history_museum));
        PlaceInfos.add(new PlaceInfo(getString(R.string.mustsee_name_eight), getString(R.string.mustsee_location_eight), getString(R.string.mustsee_time_eight), R.drawable.saidpur_village));

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
