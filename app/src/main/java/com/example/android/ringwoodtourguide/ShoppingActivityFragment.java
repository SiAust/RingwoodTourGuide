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
public class ShoppingActivityFragment extends Fragment {


    public ShoppingActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.rwood_places, container, false);

        final ArrayList<RingwoodConstructor> rwood = new ArrayList<>();
        rwood.add(new RingwoodConstructor(R.string.place_fatface, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_waitrose, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_timber, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_rwood_surplus, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));

        //Create a new LocationAdapter object, with our rwood ArrayList as an input.
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), rwood,
                R.color.colorPrimary);

        //Create a ListView object that we cast the rootView into so we can display our list of items
        //in our array in the ListView.xml file R.id.list.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent onItemClick = new Intent(getContext(), FatfaceActivity.class);
                    startActivity(onItemClick);
                } if (position == 1) {
                    Intent onItemClick = new Intent(getContext(), WaitroseActivity.class);
                    startActivity(onItemClick);
                } if (position == 2) {
                    Intent onItemClick = new Intent(getContext(), TimberActivity.class);
                    startActivity(onItemClick);
                } if (position == 3) {
                    Intent onItemClick = new Intent(getContext(), RwoodSurplusActivity.class);
                    startActivity(onItemClick);
                }
            }
        });

        return rootView;
    }

}
