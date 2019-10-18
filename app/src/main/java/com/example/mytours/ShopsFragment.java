package com.example.mytours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        {
            View rootView = inflater.inflate(R.layout.list_view, container, false);
            final ArrayList<Tours> msc = new ArrayList<Tours>();
            msc.add(new Tours(getString((R.string.first)), getString((R.string.malltime1)), getString((R.string.avg)), getString((R.string.mallnum1)), R.drawable.mall));
            msc.add(new Tours(getString((R.string.citycenter)), getString((R.string.malltime2)), getString((R.string.avg)), getString((R.string.na)), R.drawable.mall2));
            msc.add(new Tours(getString((R.string.citystars)), getString((R.string.malltime3)), getString((R.string.avg)), getString((R.string.mall2num)), R.drawable.mall3));
            msc.add(new Tours(getString((R.string.jody)), getString((R.string.time4)), getString((R.string.avg)), getString((R.string.mall3num)), R.drawable.mall4));
            msc.add(new Tours(getString((R.string.genena)), getString((R.string.malltime5)), getString((R.string.avg)), getString((R.string.mallnum4)), R.drawable.mall5));
            msc.add(new Tours(getString((R.string.cairofest)), getString((R.string.malltime6)), getString((R.string.avg)), getString(R.string.mallnum5), R.drawable.mall6));

            AndroidToursAdapter flavorAdapter = new AndroidToursAdapter(getActivity(), msc);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(flavorAdapter);
            return rootView;
        }
    }
}
