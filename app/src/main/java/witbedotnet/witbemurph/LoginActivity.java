package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import static witbedotnet.witbemurph.R.layout.login_layout;
import static witbedotnet.witbemurph.R.layout.main_activity;

/**
 * Created by lca on 7/5/2017.
 */

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(login_layout);
        Button loginButton = (Button)findViewById(R.id.okLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Witbe Murph","The click will launch main activity");
                Intent myIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
