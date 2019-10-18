package com.example.mytours;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AndroidToursAdapter extends ArrayAdapter<Tours> {
    private static final String LOG_TAG = AndroidToursAdapter.class.getSimpleName();

    public AndroidToursAdapter(Activity context, ArrayList<Tours> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View ToursItemView = convertView;
        if (ToursItemView == null) {
            ToursItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tours currentTour = getItem(position);


        TextView location = ToursItemView.findViewById(R.id.Location);
        location.setText(currentTour.getLocation());
        TextView schedule = ToursItemView.findViewById(R.id.Schedule);
        schedule.setText(currentTour.getSchedule());
        TextView price = ToursItemView.findViewById(R.id.Price);
        price.setText(currentTour.getPrice());
        TextView phone = ToursItemView.findViewById(R.id.Phone);
        phone.setText(currentTour.getmPhone());
        ImageView imageView = ToursItemView.findViewById(R.id.image_lp);
        imageView.setImageResource(currentTour.getImageResourceId());

        return ToursItemView;
    }


}

