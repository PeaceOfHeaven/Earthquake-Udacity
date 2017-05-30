package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Nhat on 5/30/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

  public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
    super(context, 0, earthquakes);
  }

  /**
   * return list item view for each earthquake item in the list
   */
  @NonNull @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    // Reuse old view
    View view = convertView;
    if(view == null) {
      // Our custom view to display earthquake data
      view = LayoutInflater.from(parent.getContext())
          .inflate(R.layout.earthquake_custom_item, parent, false);
    }
    Earthquake currentEarthquake = getItem(position);

    TextView magnitudeTxtView = (TextView) view.findViewById(R.id.magTxtView);
    magnitudeTxtView.setText(String.valueOf(currentEarthquake.getMagnitude()));

    TextView placeTxtView = (TextView) view.findViewById(R.id.placeTxtView);
    placeTxtView.setText(currentEarthquake.getPlace());

    TextView dateTxtView = (TextView) view.findViewById(R.id.dateTxtView);
    dateTxtView.setText(currentEarthquake.getTime());

    return view;
  }
}
