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
public class EscortActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaring EditText
    private EditText editStartLocation;
    private EditText editEndLocation;
    private EditText editCustomMessage;

    //Send button
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escort);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Initializing the views
        editStartLocation = (EditText) findViewById(R.id.editStartLocation);
        editEndLocation = (EditText) findViewById(R.id.editEndLocation);
        editCustomMessage = (EditText) findViewById(R.id.editCustomMessage);

        buttonSend = (Button) findViewById(R.id.buttonSend);

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }



    private void sendEmail() {

        //Getting content for email
        String recipient = "police@flpoly.org";
        String subject = "Escort Request";
        String startLocation = editStartLocation.getText().toString().trim();
        String endLocation = editEndLocation.getText().toString().trim();
        String customMessage = editCustomMessage.getText().toString().trim();
        String body = "Ticket Type:  Escort Request" +
                "\n\nStart Location:  " + startLocation +
                "\nEnd Location:  " + endLocation +
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
