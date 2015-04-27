package com.example.k3lara.assignment_3_starter_kit;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

import se.mah.k3.skaneAPI.R;
import se.mah.k3.skaneAPI.control.Constants;
import se.mah.k3.skaneAPI.model.Journey;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    private ArrayList<Journey> myItems = new ArrayList<Journey>();
    private ExListAdapter myExListAdapter;
    private Spinner spinnerFrom;
    private Spinner spinnerTo;

    public ActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        spinnerFrom = (Spinner) view.findViewById(R.id.spinnerFran);
        spinnerTo = (Spinner) view.findViewById(R.id.spinnerTill);

        return inflater.inflate(R.layout.fragment_activity, container, false);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        int fromStation = spinnerFrom.getSelectedItemPosition();
        int toStation = spinnerTo.getSelectedItemPosition();

        String[] stationNo = getResources().getStringArray(R.array.stationNumbers);
        String searchURL = Constants.getURL(stationNo[fromStation], stationNo[toStation], 14);
        new MyAsyncTask().execute(searchURL);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
