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
import android.widget.EditText;


public class Feedback extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       final View  view = inflater.inflate(R.layout.fragment_feedback,container,false) ;

        final EditText to = (EditText) view.findViewById(R.id.emsilid);
        final EditText feed = (EditText) view.findViewById(R.id.feed);
        final Button send = (Button) view.findViewById(R.id.sendb);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toS= to.getText().toString();
                String feS=feed.getText().toString();
                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.putExtra(Intent.EXTRA_EMAIL,new String[]{toS});
                Email.putExtra(Intent.EXTRA_TEXT,feS);

                Email.setType("message/rfs822");
                startActivity(Intent.createChooser(Email,"Choose app to send e-mail"));
            }
        });

    return view;
    }

}



