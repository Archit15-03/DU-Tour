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

public class MapRailway extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_railway);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng Railway=new LatLng(30.314713, 78.033327);
        mMap.addMarker(new MarkerOptions().position(Railway).title("Railway Station"));
        LatLng doonuni = new LatLng(30.269790, 78.043441);
        mMap.addMarker(new MarkerOptions().position(doonuni).title("Doon University Gate"));
        mMap.addPolyline(new PolylineOptions().add(
                Railway,
                new LatLng(30.312532, 78.034121),
                new LatLng(30.312657, 78.036142),
                new LatLng(30.309230, 78.036466),
                new LatLng(30.306364, 78.047509),
                new LatLng(30.305024, 78.047401),
                new LatLng(30.303092, 78.048195),
                new LatLng(30.296053, 78.041046),
                new LatLng(30.284331, 78.039157),
                new LatLng(30.279395, 78.040178),
                new LatLng(30.276001, 78.044363),
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
