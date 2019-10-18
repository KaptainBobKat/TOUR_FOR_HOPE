package com.example.mytours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        {
            View rootView = inflater.inflate(R.layout.list_view, container, false);
            final ArrayList<Tours> msc = new ArrayList<Tours>();
            msc.add(new Tours(getString((R.string.Sabaya)), getString((R.string.sabtime)), getString((R.string.avg)), getString(R.string.res1), R.drawable.sabaya));
            msc.add(new Tours((getString(R.string.MOROCCANRESTAURANT)), getString((R.string.morotime)), getString((R.string.avg)), getString((R.string.res2)), R.drawable.la_palmeraie_moroccan));
            msc.add(new Tours((getString(R.string.pacha)), getString((R.string.pachatime)), getString((R.string.high)), getString((R.string.res3)), R.drawable.lepacha1901));
            msc.add(new Tours((getString(R.string.bird)), getString((R.string.birdtime)), getString((R.string.avg)), getString((R.string.res4)), R.drawable.birdcage));
            msc.add(new Tours(getString((R.string.saigon)), getString((R.string.saitime)), getString((R.string.avg)), getString((R.string.res5)), R.drawable.saigonrestaurant));
            msc.add(new Tours(getString((R.string.Kebabgy)), getString((R.string.kababtime)), (getString(R.string.price)), getString((R.string.res6)), R.drawable.kabab));

            AndroidToursAdapter flavorAdapter = new AndroidToursAdapter(getActivity(), msc);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(flavorAdapter);
            return rootView;
        }
    }
}