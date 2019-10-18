package com.example.mytours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        {
            View rootView = inflater.inflate(R.layout.list_view,container,false);
            final ArrayList<Tours> msc = new ArrayList<Tours>();
            msc.add(new Tours((getString(R.string.Egy)), (getString(R.string.time)), (getString(R.string.price)), (getString(R.string.num1)), R.drawable.museum));
            msc.add(new Tours((getString(R.string.cairo)),getString((R.string.time1)),(getString(R.string.price)),getString((R.string.num2)),R.drawable.cairocitadel));
            msc.add(new Tours(getString((R.string.giza)),getString((R.string.time2)),(getString(R.string.price)),getString((R.string.num3)),R.drawable.giza1));
            msc.add(new Tours(getString((R.string.church)),getString((R.string.time3)),getString((R.string.free)),getString((R.string.num4)),R.drawable.the_hanging_church));
            msc.add(new Tours(getString((R.string.moez)),getString((R.string.time4)),getString((R.string.free)),getString((R.string.na)),R.drawable.al_moez));
            msc.add(new Tours(getString((R.string.abdeen)),getString((R.string.time6)),(getString(R.string.price)),getString((R.string.num5)),R.drawable.palace));
            AndroidToursAdapter flavorAdapter = new AndroidToursAdapter(getActivity(), msc);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(flavorAdapter);
            return rootView;
        }
    }
}
