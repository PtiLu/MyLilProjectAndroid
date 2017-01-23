package witbedotnet.witbemurph;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Ludo on 28/12/16.
 */
public class VideoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.video_layout);

        VideoView myVideo = (VideoView) findViewById(R.id.videoView);
        MediaController myMediaController = new MediaController(this);
        Uri video = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.movie);

        myVideo.setMediaController(myMediaController);
        myVideo.setVideoURI(video);
    }

    public void goToMainActivity(View v){
        Intent intentMain = new Intent(VideoActivity.this, MainActivity.class);
        startActivity(intentMain);
        Log.i("Witbe Murph","Go back to main activity");
    }
}
