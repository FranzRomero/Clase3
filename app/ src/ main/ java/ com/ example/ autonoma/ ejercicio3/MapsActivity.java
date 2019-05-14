package com.example.autonoma.ejercicio3;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.util.Log;
import android.widget.TabWidget;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String TAG = "Debug of Project";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        final LatLng autonoma = new LatLng(-12.195483, -76.9719602);
        LatLng libreria = new LatLng(-12.1950265, -76.9716449);
        LatLng jugos = new LatLng(-12.1963635, -76.9721322);

        // Add a marker in Sydney, Australia, and move the camera.

        mMap.addMarker(new MarkerOptions().position(autonoma).title("Universidad Autonoma"));
        mMap.addMarker(new MarkerOptions().position(libreria).title("libreria"));
        mMap.addMarker(new MarkerOptions().position(jugos).title("jugos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(autonoma, 18));

    mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
        @Override
        public boolean onMarkerClick(Marker marker) {
            Log.e(TAG,marker.getTitle());
            if (marker.getTitle().equals("Jugos")){
                Intent intent= new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com/maps/search/Jugos/@-12.1947386,-76.9710182,17z"));
                startActivity(intent);
            }
            if (marker.getTitle().equals("Libreria")){
                Intent intent= new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://goo.gl/maps/HXcyrKKoTqv"));
                startActivity(intent);
            }
                return false;
        }
    });


    }


}
