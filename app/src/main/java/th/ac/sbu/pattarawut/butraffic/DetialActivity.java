package th.ac.sbu.pattarawut.butraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetialActivity extends AppCompatActivity {

    //explicit
    private TextView titleTextView, deTextView;
    private ImageView traffImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);

        bindWidget();
        //receive value from intent
        receiverFromIntent();
    } // main method

    private void receiverFromIntent() {
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        traffImageView.setImageResource(intImage);

        String[] strDetail = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        deTextView.setText(strDetail[intIndex]);


    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView3);
        deTextView = (TextView) findViewById(R.id.textView4);
        traffImageView = (ImageView) findViewById(R.id.imageView2);
    }

} //main class

