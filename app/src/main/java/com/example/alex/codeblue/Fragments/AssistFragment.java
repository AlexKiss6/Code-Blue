package com.example.alex.codeblue.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alex.codeblue.AssistInputActivities.AnimalControlActivity;
import com.example.alex.codeblue.AssistInputActivities.EscortActivity;
import com.example.alex.codeblue.AssistInputActivities.JumpstartActivity;
import com.example.alex.codeblue.AssistInputActivities.NoiseComplaintActivity;
import com.example.alex.codeblue.AssistInputActivities.RoomLockoutActivity;
import com.example.alex.codeblue.AssistInputActivities.VehicleLockoutActivity;
import com.example.alex.codeblue.R;

/**
 * Created by Alex Kiss on 3/25/2016.
 */
public class AssistFragment extends Fragment {

    public AssistFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_assist, container, false);

        Button ButtonJumpstart = (Button) rootView.findViewById(R.id.ButtonJumpstart);
        ButtonJumpstart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JumpstartActivity.class);
                startActivity(intent);
            }
        });

        Button ButtonRoomLockout = (Button) rootView.findViewById(R.id.ButtonRoomLockout);
        ButtonRoomLockout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RoomLockoutActivity.class);
                startActivity(intent);
            }
        });

        Button ButtonNoiseComplaint = (Button) rootView.findViewById(R.id.ButtonNoiseComplaint);
        ButtonNoiseComplaint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NoiseComplaintActivity.class);
                startActivity(intent);
            }
        });

        Button ButtonEscort = (Button) rootView.findViewById(R.id.ButtonEscort);
        ButtonEscort.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EscortActivity.class);
                startActivity(intent);
            }
        });

        Button ButtonVehicleLockout = (Button) rootView.findViewById(R.id.ButtonVehicleLockout);
        ButtonVehicleLockout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VehicleLockoutActivity.class);
                startActivity(intent);
            }
        });

        Button ButtonAnimalControl = (Button) rootView.findViewById(R.id.ButtonAnimalControl);
        ButtonAnimalControl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AnimalControlActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
