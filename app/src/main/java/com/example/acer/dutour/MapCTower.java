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

public class MapCTower extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_ctower);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Doon university and move the camera
        LatLng ctower = new LatLng(30.324394, 78.041973);
        mMap.addMarker(new MarkerOptions().position(ctower).title(" Clock Tower"));
        LatLng doonuni=new LatLng(30.269790, 78.043441);
        mMap.addMarker(new MarkerOptions().position(doonuni).title(" Doon University"));
        mMap.addPolyline(new PolylineOptions().add(
                ctower,
                new LatLng(30.322750, 78.042544),
                new LatLng(30.321823, 78.045377),
                new LatLng(30.317267, 78.046000),
                new LatLng(30.309734, 78.048667),
                new LatLng(30.305418, 78.047822),
                new LatLng(30.303006, 78.047873),
                new LatLng(30.295982, 78.041446),
                new LatLng(30.284452, 78.039036),
                new LatLng(30.281124, 78.040675),
                new LatLng(30.279158, 78.040068),
                new LatLng(30.276774, 78.043983),
                new LatLng(30.274546, 78.044893),
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
