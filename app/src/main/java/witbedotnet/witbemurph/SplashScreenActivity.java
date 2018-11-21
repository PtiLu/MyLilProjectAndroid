package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/**
 * Created by Ludo on 01/01/17.
 */
public class SplashScreenActivity extends Activity {
    private final int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        Button myMurphButton = (Button) findViewById(R.id.murphButton);
        myMurphButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Log.i("Witbe Murph", "Login Pop-up");
                Intent myIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
