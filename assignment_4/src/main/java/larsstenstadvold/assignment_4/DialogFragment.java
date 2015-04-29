package larsstenstadvold.assignment_4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFragment extends Fragment {
    private static Planet planet;


    public DialogFragment(Planet planet){
        this.planet = planet;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_dialog, container, false);

        ImageView iv = (ImageView) v.findViewById(R.id.planetFactImage);
        iv.setImageDrawable(planet.getImage());

        TextView titleView = (TextView) v.findViewById(R.id.factTitle);
        titleView.setText(planet.getName());

        TextView desView = (TextView) v.findViewById(R.id.factDescription);
        desView.setText(planet.getSummary());

        return v ;
    }

}
