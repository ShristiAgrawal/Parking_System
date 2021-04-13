package com.shristi.smart_parking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class ParkingSlots extends AppCompatActivity {
    ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7,imageButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_parking_slots);
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        imageButton1=findViewById(R.id.imageButton1);
        imageButton2=findViewById(R.id.imageButton2);
        imageButton3=findViewById(R.id.imageButton3);
        imageButton4=findViewById(R.id.imageButton4);
        imageButton5=findViewById(R.id.imageButton5);
        imageButton6=findViewById(R.id.imageButton6);
        imageButton7=findViewById(R.id.imageButton7);
        imageButton8=findViewById(R.id.imageButton8);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton1.setColorFilter(Color.argb(255, 255, 255, 255));
                Slot_status data=new Slot_status();
                data.setSlot("Slot1");
                db.collection("Booked").document().set(data).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton2.setColorFilter(Color.argb(255, 255, 255, 255));

                Slot_status data=new Slot_status();
                data.setSlot("Slot2");
                db.collection("Booked").document().set(data).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton3.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton4.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton5.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton6.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton7.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton8.setColorFilter(Color.argb(255, 255, 255, 255));

                Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
                startActivity(i);

            }
        });

    }


}