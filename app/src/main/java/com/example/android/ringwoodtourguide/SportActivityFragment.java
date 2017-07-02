package com.example.android.ringwoodtourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportActivityFragment extends Fragment {


    public SportActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.rwood_places, container, false);

        //Create a new ArrayList of type RingwoodConstructor. Add items to the ArrayList.
        // TODO: 29/06/2017 update placeholder data
        final ArrayList<RingwoodConstructor> rwood = new ArrayList<>();
        rwood.add(new RingwoodConstructor(R.string.place_health_and_leisure, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_cornerways, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_rwood_medical, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_david_lloyd, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), rwood,
                R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent onItemClick = new Intent(getContext(), HealthCentreActivity.class);
                    startActivity(onItemClick);
                } if (position == 1) {
                    Intent onItemClick = new Intent(getContext(), CornerwaysActivity.class);
                    startActivity(onItemClick);
                } if (position == 2) {
                    Intent onItemClick = new Intent(getContext(), RwoodMedicalActivity.class);
                    startActivity(onItemClick);
                } if (position == 3) {
                    Intent onItemClick = new Intent(getContext(), DavidLloydActivity.class);
                    startActivity(onItemClick);
                }
            }
        });

        return rootView;
    }

}
