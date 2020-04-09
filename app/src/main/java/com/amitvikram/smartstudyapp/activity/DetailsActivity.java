package com.amitvikram.smartstudyapp.activity;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.amitvikram.smartstudyapp.R;
import com.amitvikram.smartstudyapp.ViewActivity;

import java.util.Locale;

public class DetailsActivity extends AppCompatActivity {
    private TextToSpeech t1;
    private TextView txtDesc;
    private Button btnSpak;
    private TextView txtPlanetTitle;
    private Intent intent;
    private Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        intent = getIntent();
        txtDesc = findViewById(R.id.txtdesc);
        txtPlanetTitle = findViewById(R.id.txtPlanetName);
        txtPlanetTitle.setText(intent.getCharSequenceExtra("planetName"));
        int planetNo = intent.getIntExtra("planetNo",1);
        btnSpak = findViewById(R.id.btnSpeak);
        btnShow = findViewById(R.id.btnView);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //to do for 3d activity
                Intent intent = new Intent(DetailsActivity.this, ViewActivity.class);
                intent.putExtra("planetNo", planetNo);
                startActivity(intent);
            }
        });
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        switch(planetNo) {
            case 1:
                txtDesc.setText(R.string.earth_txt);
                break;
            case 2:
                txtDesc.setText(R.string.jupiter_txt);
                break;
            case 3:
                txtDesc.setText(R.string.mars_txt);
                break;
            case 4:
                txtDesc.setText(R.string.pluto_txt);
                break;
            case 5:
                txtDesc.setText(R.string.venus_txt);
                break;
            case 6:
                txtDesc.setText(R.string.satrun_txt);
                break;
            case 7:
                txtDesc.setText(R.string.mercury_txt);
                break;
            case 8:
                txtDesc.setText(R.string.neptune_txt);
                break;
            case 9:
                txtDesc.setText(R.string.uranus_txt);
                break;
        }
        btnSpak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = txtDesc.getText().toString();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }
    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}
