package is.silverberg.smartgymandroid;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/**
 * Class for displaying and interacting with Home Activity
 * @author Silverberg
 *
 */
public class HomeActivity extends Activity {

	/**
	 * Called when activity is opened
	 */
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }
    
    /**
     * Called when profiles button is pressed.
     * Opens profiles activity.
     * @param view
     */
    public void openProfiles(View view) {
        Intent intent = new Intent(this, ProfilesActivity.class);
        startActivity(intent);
    }

    /**
     * Called when exercises button is presed.
     * Opens exercises activity.
     * @param view
     */
    public void openExercise(View view) {
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }

    
}