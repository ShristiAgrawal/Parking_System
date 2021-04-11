package com.shristi.smart_parking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class BookingDetails extends AppCompatActivity {
    // Access a Cloud Firestore instance from your Activity

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button button;
    EditText name,veh,phn,duration;
    String TAG="null";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);
        button=findViewById(R.id.book);
        name=findViewById(R.id.name);
        veh=findViewById(R.id.veh);
        phn=findViewById(R.id.phn);
        duration=findViewById(R.id.duration);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });
    }
    private void addData() {
        UserData data=new UserData();
        data.setName(name.getText().toString());
        data.setVeh(veh.getText().toString());
        data.setPhn(Integer.parseInt(phn.getText().toString()));
        data.setDuration(duration.getText().toString());
        db.collection("User").document().set(data).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(BookingDetails.this,"Booking Confirmed",Toast.LENGTH_LONG).show();
                
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(BookingDetails.this,"Failure! Try again",Toast.LENGTH_LONG).show();
            }
        });
    }


}