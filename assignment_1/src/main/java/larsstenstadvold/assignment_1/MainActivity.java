package larsstenstadvold.assignment_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    //method that is called when the next button is pressed
    public void nextQuote(View v){
        //sets textView2 to the displayQuote
        TextView displayQuote = (TextView)findViewById(R.id.textView2);
        //generates a random rumber between 0-3
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(4);
        //sets quotes_array from the string.xml file to quotesArray
        String[] quotesArray = getResources().getStringArray(R.array.quotes_array);
        //sets the text for displayQuote to the quote from a random index in quotesArray
        displayQuote.setText(quotesArray[randomInt]);

        /*
        old way of doing it
        if(randomInt == 0) {
            String quote1 = getResources().getString(R.string.quote_1);
            displayQuote.setText(quote1);
        }
        if(randomInt == 1){
            String quote2 = getResources().getString(R.string.quote_2);
            displayQuote.setText(quote2);
        }
        if(randomInt == 2){
            String quote3 = getResources().getString(R.string.quote_3);
            displayQuote.setText(quote3);
        }
        if(randomInt == 3){
            String quote4 = getResources().getString(R.string.quote_4);
            displayQuote.setText(quote4);
        }
        */

        Log.i("MyAPP", "Button pressed");
        Log.i("RandomInt is: ", String.valueOf(randomInt));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MyAPP", "onCreate!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyAPP", "onStop!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyAPP", "onDestroy!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyAPP", "onPause!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyAPP", "onStart!");
    }
}
