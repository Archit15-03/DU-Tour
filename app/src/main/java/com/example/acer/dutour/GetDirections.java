package com.example.acer.dutour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class GetDirections extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_get_directions, container, false);
        ImageButton dlib = (ImageButton) view.findViewById(R.id.dirlib);
        dlib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MapsActivity.class);
                startActivity(in);
            }
        });
        ImageButton dlhc = (ImageButton) view.findViewById(R.id.dirlhc);
        dlhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), MapLHC.class);
                startActivity(in1);
            }
        });
        ImageButton Dadmin = (ImageButton) view.findViewById(R.id.diradmin);
        Dadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), MapAdmin.class);
                startActivity(in2);
            }
        });
        ImageButton foffice = (ImageButton) view.findViewById(R.id.diroffice);
        foffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), MapOffice.class);
                startActivity(in3);
            }
        });
        ImageButton flodge = (ImageButton) view.findViewById(R.id.dirlodge);
        flodge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), MapLodge.class);
                startActivity(in4);
            }
        });
        ImageButton clab = (ImageButton) view.findViewById(R.id.dirlab);
        clab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), MapLaboratory.class);
                startActivity(in5);
            }
        });
        ImageButton sport = (ImageButton) view.findViewById(R.id.dirsport);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), MapStadium.class);
                startActivity(in6);
            }
        });
        ImageButton bhostel = (ImageButton) view.findViewById(R.id.dirbhostel);
        bhostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(getActivity(), MapsBhostel.class);
                startActivity(in7);
            }
        });
        ImageButton ghostel = (ImageButton) view.findViewById(R.id.dirghostel);
        ghostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(getActivity(), MapsGhostel.class);
                startActivity(in8);
            }
        });
        ImageButton canteen = (ImageButton) view.findViewById(R.id.dircanteen);
        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(getActivity(), MapCanteen.class);
                startActivity(in9);
            }
        });

        return view;
    }
}
