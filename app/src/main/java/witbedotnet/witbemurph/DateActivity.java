package witbedotnet.witbemurph;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Ludo on 31/12/16.
 */
public class DateActivity extends Activity implements TimePicker.OnTimeChangedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_layout);
        Button backToMenuButton = (Button) findViewById(R.id.backToMenu);
        backToMenuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("Witbe Murph", "Go Back To The Menu");
                Intent myIntent = new Intent(DateActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        Button setTimeButton = (Button) findViewById(R.id.timeSet);
        setTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePicker myTimePicker = (TimePicker) findViewById(R.id.witbeTimePicker);
                showDate(myTimePicker.getHour(), myTimePicker.getMinute());
            }
        });
    }

    private void showDate(int hour, int minute){
        CharSequence myText;
        myText = "You have chosen the " + hour +" hour "+ minute+" minute";
        Toast toast = Toast.makeText(getApplicationContext(),myText,Toast.LENGTH_LONG);
        toast.show();
    }


    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        Log.i("Witbe Murph", "Hour Set "+hourOfDay);
        showDate(hourOfDay, minute);
    }
}
