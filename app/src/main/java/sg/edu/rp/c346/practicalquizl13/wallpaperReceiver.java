package sg.edu.rp.c346.practicalquizl13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 17001227 on 15/8/2018.
 */

public class wallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "You have changed the wallpaper", Toast.LENGTH_SHORT).show();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id", R.id.radioButton);

        if (id == R.id.radioButton) {
            Toast.makeText(context, "You have a good taste", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(context, "Bro, think twice about it", Toast.LENGTH_LONG).show();
        }

    }
}
