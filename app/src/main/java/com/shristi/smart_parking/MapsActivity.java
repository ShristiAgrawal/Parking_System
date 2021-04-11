package com.shristi.smart_parking;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng mylocation = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(mylocation).title("I am here"));
        LatLng member1 = new LatLng(21.8545243, 84.0122088);
        LatLng member2 = new LatLng(21.8512377, 84.0122490);
        LatLng member3 = new LatLng(21.854, 84.01);
        LatLng member4 = new LatLng(21.85, 84.012);
        mMap.addMarker(new MarkerOptions().position(member1)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title("Member1 here"));
        mMap.addMarker(new MarkerOptions().position(member2)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).title("Member2 here"));
        mMap.addMarker(new MarkerOptions().position(member3)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).title("Member3 here"));
        mMap.addMarker(new MarkerOptions().position(member4)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)).title("Member4 here"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(member1));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(16),2000,null);
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {

            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent i=new Intent(MapsActivity.this,ParkingSlots.class);
                startActivity(i);
                return false;
            }
        });

    }
}