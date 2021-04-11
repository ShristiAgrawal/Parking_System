package com.shristi.smart_parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ParkingSlots extends AppCompatActivity {
ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_slots);
        i1=findViewById(R.id.imageButton1);
        i2=findViewById(R.id.imageButton2);
        i3=findViewById(R.id.imageButton3);
        i4=findViewById(R.id.imageButton4);
        i5=findViewById(R.id.imageButton5);
        i6=findViewById(R.id.imageButton6);
        i7=findViewById(R.id.imageButton7);
        i8=findViewById(R.id.imageButton8);
        i9=findViewById(R.id.imageButton9);
        i10=findViewById(R.id.imageButton10);
        Intent i=new Intent(ParkingSlots.this,BookingDetails.class);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(i);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });

    }

}