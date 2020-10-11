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

public class MapsGhostel extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_ghostel);
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

        // Add a marker in Doon university and move the camera
        LatLng ofi = new LatLng(30.269508, 78.044429);
        mMap.addMarker(new MarkerOptions().position(ofi).title("Faculty Office"));
        LatLng bhos = new LatLng(30.269301, 78.045925);
        mMap.addMarker(new MarkerOptions().position(bhos).title("Boys Hostel"));
        LatLng admin = new LatLng(30.268393, 78.046223);
        mMap.addMarker(new MarkerOptions().position(admin).title("Administration Block"));
        LatLng Lhc = new LatLng(30.267107, 78.046571);
        mMap.addMarker(new MarkerOptions().position(Lhc).title("Academic Block 2"));
        LatLng Library = new LatLng(30.267366, 78.044961);
        mMap.addMarker(new MarkerOptions().position(Library).title("Library Block"));
        LatLng Sport = new LatLng(30.265775, 78.046138);
        mMap.addMarker(new MarkerOptions().position(Sport).title("Sports Stadium"));
        LatLng Lab = new LatLng(30.266700, 78.045690);
        mMap.addMarker(new MarkerOptions().position(Lab).title("Composite Laboratory"));
        LatLng Lodge = new LatLng(30.264822, 78.045309);
        mMap.addMarker(new MarkerOptions().position(Lodge).title("Faculty Lodge"));
        LatLng ghostel=new LatLng(30.266587, 78.044443);
        mMap.addMarker(new MarkerOptions().position(ghostel).title("Girls Hostel"));
        LatLng doonuni = new LatLng(30.269790, 78.043441);
        mMap.addMarker(new MarkerOptions().position(doonuni).title("Doon University Gate"));
        LatLng canteen=new LatLng(30.269196, 78.046577);
        mMap.addMarker(new MarkerOptions().position(canteen).title("Canteen"));
        mMap.addPolyline(new PolylineOptions().add(
                doonuni,
                new LatLng(30.269236, 78.043998),
                new LatLng(30.268985, 78.043994),
                new LatLng(30.268866, 78.044212),
                new LatLng(30.268185, 78.044199),
                new LatLng(30.266812, 78.044731),
                ghostel
        )
                .width(10)
                .color(Color.RED));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(doonuni, 18));
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

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
