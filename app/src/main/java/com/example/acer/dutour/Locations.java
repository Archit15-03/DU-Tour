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
import android.widget.Button;
import android.widget.ImageButton;



public class Locations extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View  view = inflater.inflate(R.layout.fragment_locations,container,false) ;
        ImageButton Library = (ImageButton) view.findViewById(R.id.library);
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(getActivity(),LIB.class);
                startActivity(in);
                }
        });
        final ImageButton lhc= (ImageButton) view.findViewById(R.id.LHC);
        lhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1= new Intent(getActivity(),LHC.class);
                startActivity(in1);
            }
        });
        final ImageButton Admin= (ImageButton) view.findViewById(R.id.Admin);
        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2= new Intent(getActivity(),Admin.class);
                startActivity(in2);
            }
        });
        final ImageButton foffice= (ImageButton) view.findViewById(R.id.Foffice);
        foffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3= new Intent(getActivity(),Foffice.class);
                startActivity(in3);
            }
        });
        final ImageButton cmlab= (ImageButton) view.findViewById(R.id.Laboratory);
        cmlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4= new Intent(getActivity(),Laboratory.class);
                startActivity(in4);
            }
        });
        final ImageButton sport= (ImageButton) view.findViewById(R.id.Stadium);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5= new Intent(getActivity(),Stadium.class);
                startActivity(in5);
            }
        });
        final ImageButton girlshostel= (ImageButton) view.findViewById(R.id.Ghostel);
        girlshostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6= new Intent(getActivity(),Ghostel.class);
                startActivity(in6);
            }
        });
        final ImageButton boyshostel= (ImageButton) view.findViewById(R.id.Bhostel);
        boyshostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7= new Intent(getActivity(),Bhostel.class);
                startActivity(in7);
            }
        });
        final ImageButton Canteen= (ImageButton) view.findViewById(R.id.Canteen);
        Canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8= new Intent(getActivity(),Canteen.class);
                startActivity(in8);
            }
        });
        final ImageButton lodge= (ImageButton) view.findViewById(R.id.Flodge);
        lodge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9= new Intent(getActivity(),Flodge.class);
                startActivity(in9);
            }
        });
        return view;
    }
}
