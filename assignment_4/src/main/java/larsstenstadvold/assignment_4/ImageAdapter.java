package larsstenstadvold.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by larsy09 on 4/29/15.
 */
public class ImageAdapter extends ArrayAdapter<Planet> {
    private Context mContext;
    private ArrayList<Planet> planetList;

    public ImageAdapter(Context c, ArrayList<Planet> planetList) {
        super(c, 0, planetList);
        mContext = c;
        this.planetList = planetList;
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ImageButton imageView;
        Log.i("MyListAdapter", "Called for position: " + position);
        Planet p = planetList.get(position);

        convertView = inflater.inflate(R.layout.grid_item,null);

        ImageView iv = (ImageView) convertView.findViewById(R.id.iv_planetpic);

        TextView tv = (TextView) convertView.findViewById(R.id.iv_planetname);

        tv.setText(p.getName());
        iv.setImageDrawable(p.getImage());
        return convertView;
    }
}
