package com.example.wykl2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder =  new AlertDialog.Builder(ImageActivity.this);
            builder.setTitle("Tytuł okna");
            builder.setMessage("info");
            builder.setPositiveButton("Okey", dialogClickListener);
            builder.setNegativeButton("Cancel",dialogClickListener);
            builder.create().show();
        }
    };

    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            if(which==AlertDialog.BUTTON_POSITIVE) {
              Intent intent =  new Intent(ImageActivity.this, ViewPageAdapter.class);
                startActivity(intent);
            }else{
                Toast.makeText(ImageActivity.this, "Cancel", Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imigae);

        int i = getIntent().getExtras().getInt("index");
        TextView textView =(TextView) findViewById(R.id.index);
        textView.setText(Integer.toString(i));

        findViewById(R.id.imageView).setOnClickListener(onClickListener);
        initfragment();
    }

    private void initfragment(){
        ExampleFragment fragment = new ExampleFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.ex_fragment_button,fragment).commit();
    }
}
