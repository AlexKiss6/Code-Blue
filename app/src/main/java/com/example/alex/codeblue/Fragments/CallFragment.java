package com.example.alex.codeblue.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alex.codeblue.R;

/**
 * Created by Alex Kiss on 3/25/2016.
 */
public class CallFragment extends Fragment {

    public CallFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_call, container, false);

        Button ButtonEmergency = (Button) rootView.findViewById(R.id.ButtonEmergency);
        ButtonEmergency.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        Button ButtonCampusSecurity = (Button) rootView.findViewById(R.id.ButtonCampusSecurity);
        ButtonCampusSecurity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18638748472"));
                startActivity(intent);
            }
        });

        Button ButtonLakelandPolice = (Button) rootView.findViewById(R.id.ButtonLakelandPolice);
        ButtonLakelandPolice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18638346900"));
                startActivity(intent);
            }
        });

        Button ButtonPolkCountySheriff = (Button) rootView.findViewById(R.id.ButtonPolkCountySheriff);
        ButtonPolkCountySheriff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18632986200"));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
