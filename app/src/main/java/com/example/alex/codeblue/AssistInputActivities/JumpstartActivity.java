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
public class JumpstartActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaring EditText
    private EditText editCarMake;
    private EditText editCarModel;
    private EditText editCarColor;
    private EditText editCarLocation;
    private EditText editCustomMessage;

    //Send button
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpstart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Initializing the views
        editCarMake = (EditText) findViewById(R.id.editCarMake);
        editCarModel = (EditText) findViewById(R.id.editCarModel);
        editCarColor = (EditText) findViewById(R.id.editCarColor);
        editCarLocation = (EditText) findViewById(R.id.editCarLocation);
        editCustomMessage = (EditText) findViewById(R.id.editCustomMessage);

        buttonSend = (Button) findViewById(R.id.buttonSend);

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }



    private void sendEmail() {

        //Getting content for email
        String recipient = "police@flpoly.org";
        String subject = "Jump Start Request";
        String carMake = editCarMake.getText().toString().trim();
        String carModel = editCarModel.getText().toString().trim();
        String carColor = editCarColor.getText().toString().trim();
        String carLocation = editCarLocation.getText().toString().trim();
        String customMessage = editCustomMessage.getText().toString().trim();
        String body = "Ticket Type:  Jump Start" +
                      "\n\nCar Make:  " + carMake +
                      "\nCar Model:  " + carModel +
                      "\nCar Color:  " + carColor +
                      "\nCar Location:  " + carLocation +
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