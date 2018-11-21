package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by lca on 5/11/2017.
 */

public class ImageDetectionActivity extends Activity {
    final int THOUSAND = 1000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_detection_layout);
        Button nextButton = (Button) findViewById(R.id.button3);
        final EditText timeToWait = (EditText)findViewById(R.id.editText2);

        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v("EditText", timeToWait.getText().toString());

                if(timeToWait.getText().toString().equals("")){
                    Log.v("Witbe Murph","Oupsy no value");
                    Toast.makeText(getApplicationContext(),R.string.no_value,
                            Toast.LENGTH_LONG).show();
                }
                else if (timeToWait.getText().toString().equals("0")){
                    Log.v("Witbe Murph","Time set to "+timeToWait.getText().toString());
                    setContentView(R.layout.wait_for_image);
                }
                else{
                    Log.v("Witbe Murph","Time set to "+timeToWait.getText().toString());
                    final int time = Integer.valueOf(timeToWait.getText().toString())*THOUSAND;
                    setContentView(R.layout.wait_for_image);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imageView = (ImageView) findViewById(R.id.robotWitbe);
                            imageView.setImageResource(R.drawable.witberobot);
                        }
                    },time);
                }
            }
        });


    }
}
