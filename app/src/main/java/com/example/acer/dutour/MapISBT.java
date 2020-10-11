package com.example.acer.dutour;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapISBT extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_isbt);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng doonuni = new LatLng(30.269790, 78.043441);
        mMap.addMarker(new MarkerOptions().position(doonuni).title("Doon University"));
        LatLng isbt=new LatLng(30.288194, 77.997732);
        mMap.addMarker(new MarkerOptions().position(isbt).title("ISBT Bus Station"));
        mMap.addPolyline(new PolylineOptions().add(
                isbt,
                new LatLng(30.289400, 77.998673),
                new LatLng(30.289662, 78.039579),
                new LatLng(30.284316, 78.038972),
                new LatLng(30.279128, 78.039883),
                new LatLng(30.276455, 78.044131),
                new LatLng(30.274725, 78.044799),
                new LatLng(30.271528, 78.043160),
                new LatLng(30.269641, 78.043585),
                doonuni
        )
                .width(10)
                .color(Color.RED));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(doonuni, 18));


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
