package th.ac.sbu.pattarawut.butraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    //explicit-- variable declaration
    private ListView trafficListView;
    private Button aboutMeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        bindWidget();

        //button controller
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //soundEffect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.horse);
                buttonPlayer.start();

                //intent to web view
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("http://www.bu.ac.th/tha/"));
                startActivity(objIntent);

            }  //event
        });


        //create listview
        createListView();


    }    //main method

    private void createListView() {
        //setup array แบบ 1
        String[] strTitle = new String[20];
        strTitle[0] = "Don't Turn Left";
        strTitle[1] = "Don't Turn Right";
        strTitle[2] = "Go Straight";
        strTitle[3] = "Turn Right";
        strTitle[4] = "Turn Left";
        strTitle[5] = "Exit";
        strTitle[6] = "In";
        strTitle[7] = "Out";
        strTitle[8] = "Stop";
        strTitle[9] = "Height Restriction 2.5 M";
        strTitle[10] = "Junction";
        strTitle[11] = "Don't Turn";
        strTitle[12] = "Stop";
        strTitle[13] = "Approaching Cars Have Right of Way";
        strTitle[14] = "No Overtaking";
        strTitle[15] = "In";
        strTitle[16] = "Stop Check Point";
        strTitle[17] = "Speed Restriction 50";
        strTitle[18] = "Width Restriction 2.5 M";
        strTitle[19] = "5.0 M";

        //setup array แบบ 2
        int[] intIcon = {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,
                R.drawable.traffic_04,R.drawable.traffic_05,R.drawable.traffic_06,
                R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,
                R.drawable.traffic_10,R.drawable.traffic_11,R.drawable.traffic_12,
                R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
                R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,
                R.drawable.traffic_19,R.drawable.traffic_20,};

        PatAdapter objPatAdapter = new PatAdapter(MainActivity.this, strTitle, intIcon);
        trafficListView.setAdapter(objPatAdapter);


    } //create listview

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }


}        //main class
