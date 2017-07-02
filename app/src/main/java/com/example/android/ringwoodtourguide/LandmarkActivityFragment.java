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
public class LandmarkActivityFragment extends Fragment {


    public LandmarkActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.rwood_places, container, false);

        ArrayList<RingwoodConstructor> rwood = new ArrayList<>();
        rwood.add(new RingwoodConstructor(R.string.place_linford_bottom, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_acorn_bench, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_moors_valley, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));
        rwood.add(new RingwoodConstructor(R.string.place_cenotaph, R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), rwood,
                R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent onItemClick = new Intent(getContext(), LinfordActivity.class);
                    startActivity(onItemClick);
                } if (position == 1) {
                    Intent onItemClick = new Intent(getContext(), AcornActivity.class);
                    startActivity(onItemClick);
                } if (position == 2) {
                    Intent onItemClick = new Intent(getContext(), MoorsValleyActivity.class);
                    startActivity(onItemClick);
                } if (position == 3) {
                    Intent onItemClick = new Intent(getContext(), CenotaphActivity.class);
                    startActivity(onItemClick);
                }
            }
        });

        return rootView;
    }

}
