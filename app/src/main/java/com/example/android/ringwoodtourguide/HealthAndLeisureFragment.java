package com.example.android.ringwoodtourguide;


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
public class HealthAndLeisureFragment extends Fragment {


    public HealthAndLeisureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.rwood_list, container, false);

        final ArrayList<RingwoodConstructor> rwood = new ArrayList<>();
        rwood.add(new RingwoodConstructor("Parsonage Barn Lane", R.string.health_leisure_main,
                R.drawable.ringwood_health_leisure));

        RingwoodAdapter itemsAdapter = new RingwoodAdapter(getActivity(), rwood,
                R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
