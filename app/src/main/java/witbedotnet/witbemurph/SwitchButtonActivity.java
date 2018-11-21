package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ludo on 01/01/17.
 */
public class SwitchButtonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_button_layout);
        Button myButtonToRateActivity= (Button)findViewById(R.id.rateButton1);
        myButtonToRateActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("Witbe Murph", "Rate the application");
                Intent myIntent = new Intent(SwitchButtonActivity.this, RateActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
