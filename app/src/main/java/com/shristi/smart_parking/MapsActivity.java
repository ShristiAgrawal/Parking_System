package com.shristi.smart_parking;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
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


        LatLng mylocation = new LatLng(21.8514048, 84.0110920);
//        mMap.addMarker(new MarkerOptions().position(mylocation).title("I am here"));
        LatLng member1 = new LatLng(21.8505973, 84.0079394);
        LatLng member2 = new LatLng(21.8498927, 84.0079021);
        LatLng member3 = new LatLng(21.8525139, 84.0079870);
        LatLng member4 = new LatLng(21.8514994,84.0135445 );
        mMap.addMarker(new MarkerOptions().position(member1)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Park1 here"));
        mMap.addMarker(new MarkerOptions().position(member2)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).title("Park2 here"));
        mMap.addMarker(new MarkerOptions().position(member3)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).title("Park3 here"));
        mMap.addMarker(new MarkerOptions().position(member4)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)).title("Park4 here"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mylocation,15),5000,null);
//        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom());
    }
}