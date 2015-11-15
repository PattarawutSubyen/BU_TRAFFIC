package th.ac.sbu.pattarawut.butraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.PriorityQueue;

/**
 * Created by student on 11/14/2015.
 */
public class PatAdapter extends BaseAdapter{

    // explicit
    private Context objContext;
    private String[] titleStrings;
    private int[] iconInts;

    public PatAdapter(Context objContext, String[] titleStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.iconInts = iconInts;
    }   //constructor

    @Override
    public int getCount() {
        return titleStrings.length;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //setup title
        TextView titleTexview = (TextView) objView1.findViewById(R.id.textView2);
        titleTexview.setText(titleStrings[position]);

        //setup icon (image)
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);


        return objView1;
    }
} // main class