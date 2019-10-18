package com.example.mytours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {


    public HotelsFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        {
            View rootView = inflater.inflate(R.layout.list_view, container, false);
            final ArrayList<Tours> ttour = new ArrayList<Tours>();
            ttour.add(new Tours(getString((R.string.conrad)), getString((R.string.time4)), (getString(R.string.price)), getString((R.string.num7)), R.drawable.hotel1));
            ttour.add(new Tours(getString((R.string.Steigenberger)), getString((R.string.time4)), (getString(R.string.price)), getString((R.string.num8)), R.drawable.hotel2));
            ttour.add(new Tours(getString((R.string.Four)), getString((R.string.time4)), getString((R.string.high)), getString((R.string.num9)), R.drawable.hotel3));
            ttour.add(new Tours(getString((R.string.Kempinski)), getString((R.string.time4)), getString((R.string.avg)), getString((R.string.num10)), R.drawable.hotel4));
            ttour.add(new Tours(getString((R.string.Hilton)), getString((R.string.time4)), (getString(R.string.price)), getString((R.string.num11)), R.drawable.hotel5));
            ttour.add(new Tours(getString((R.string.InterContinental)), getString((R.string.time4)), getString((R.string.avg)), getString((R.string.num12)), R.drawable.hotel6));

            AndroidToursAdapter flavorAdapter = new AndroidToursAdapter(getActivity(), ttour);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(flavorAdapter);
            return rootView;
        }
    }
}