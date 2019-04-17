package edu.washington.jonl1138.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "on-create event fired")

        val msg = "Greetings, UW!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, msg, duration);
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"We're going down, Captain!")
    }
}
