package witbedotnet.witbemurph;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static witbedotnet.witbemurph.R.layout.main_activity;


public class MainActivity extends AppCompatActivity{
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = false;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;

    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();

            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(main_activity);
        Button myButtonToNextActivity = (Button) findViewById(R.id.buttonNextActivity);
        myButtonToNextActivity.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Log.i("Witbe Murph","The click will launch the Video activity");
                Intent myIntent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(myIntent);
            }
        });

        Button myButtonToDateActivity = (Button)findViewById(R.id.buttonDateActivity);
        myButtonToDateActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.i("Witbe Murph", "The click will launch the Date activity");
                Intent myIntent = new Intent(MainActivity.this, DateActivity.class);
                startActivity(myIntent);
            }
        });

        Button myButtonToSwitchActivity = (Button)findViewById(R.id.buttonSwitchActivity);
        myButtonToSwitchActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("Witbe Murph", "This click will launch the Buttons Activity");
                Intent myIntent = new Intent(MainActivity.this, SwitchButtonActivity.class);
                startActivity(myIntent);
            }
        });

        Button myButtonToPictureActivity = (Button)findViewById(R.id.buttonPictureActivity);
        myButtonToPictureActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("Witbe Murph", "This click will launch the Picture Activity");
                Intent myIntent = new Intent(MainActivity.this, ImageDetectionActivity.class);
                startActivity(myIntent);
            }
        });

    }


}
