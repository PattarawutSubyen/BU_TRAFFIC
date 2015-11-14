package th.ac.sbu.pattarawut.butraffic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return 0;
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
        return null;
    }
} // main class
