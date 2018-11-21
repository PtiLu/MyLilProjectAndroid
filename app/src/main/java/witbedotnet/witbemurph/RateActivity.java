package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lca on 7/14/2017.
 */

public class RateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_layout);
        Button myButtonToMainActivity = (Button)findViewById(R.id.button);
        myButtonToMainActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Thanks !",Toast.LENGTH_LONG);
                toast.show();
                Log.i("Witbe Murph", "Rate Sent");
                Intent myIntent = new Intent(RateActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
