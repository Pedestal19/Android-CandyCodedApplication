package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    String storePhone = "tel:0123456789";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);





    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***




    // ***


    public void createMapIntent(View view){
        Uri uri2 =  Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
        // ***
        // TODO - Task 3 - Launch the Phone Activity
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        if(mapIntent.resolveActivity(getPackageManager()) != null){
            startActivity(mapIntent);
        }
    }

//    public void createPhoneIntent(View view){
//        Uri uri =  Uri.parse("tel:012345678");
//
//        Intent phone_intent_set_data = new Intent(Intent.ACTION_DIAL);
//        phone_intent_set_data.setData(Uri.parse("tel:012345678"));
//        startActivity(phone_intent_set_data);
//
//
//
//    }

    public void createPhoneIntent(View view){
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        Uri phoneUri = Uri.parse(storePhone);
        phoneIntent.setData(phoneUri);
        startActivity(phoneIntent);
    }
}
