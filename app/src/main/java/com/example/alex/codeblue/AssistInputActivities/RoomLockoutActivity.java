package com.example.alex.codeblue.AssistInputActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alex.codeblue.Email.SendMail;
import com.example.alex.codeblue.R;

/**
 * Created by Alex Kiss on 3/25/2016.
 */
public class RoomLockoutActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaring EditText
    private EditText editBuildingNumber;
    private EditText editApartmentNumber;
    private EditText editCustomMessage;

    //Send button
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_lockout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing the views
        editBuildingNumber = (EditText) findViewById(R.id.editBuildingNumber);
        editApartmentNumber = (EditText) findViewById(R.id.editCarModel);
        editCustomMessage = (EditText) findViewById(R.id.editCustomMessage);

        buttonSend = (Button) findViewById(R.id.buttonSend);

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }



    private void sendEmail() {

        //Getting content for email
        String recipient = "police@flpoly.org";
        String subject = "Room Lockout Request";
        String buildingNumber = editBuildingNumber.getText().toString().trim();
        String apartmentNumber = editApartmentNumber.getText().toString().trim();
        String customMessage = editCustomMessage.getText().toString().trim();
        String body = "Ticket Type:  Room Lockout" +
                "\n\nCar Make:  " + buildingNumber +
                "\nCar Model:  " + apartmentNumber +
                "\nMessage:  " + customMessage;

        //Creating SendMail object
        SendMail sm = new SendMail(this, recipient, subject, body);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }

}
