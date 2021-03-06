package moluls.com.smileview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        SmileView view = (SmileView) v;
        if (view.isAnimationRun()) {
            view.stopAnimation();
        } else {
            view.startAnimation();
        }

    }
}
