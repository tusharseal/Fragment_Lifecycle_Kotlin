package com.example.fragmentlifecyclekotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentlifecyclekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val COMMON_TAG = "CombinedLifeCycle"
    private val ACTIVITY_NAME = MainActivity::class.java.simpleName
    private val TAG = COMMON_TAG

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("Fragment Lifecycle Kotlin")

        Log.i(TAG, "$ACTIVITY_NAME onCreate")
        Toast.makeText(this, "I am on onCreate from MainActivity", Toast.LENGTH_SHORT).show()

        binding.fragment1Btn.setOnClickListener {

            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.frameLayout, Fragment1::class.java, null)
                .commit()

        }
    }

    override fun onStart() {
        Log.i(TAG, "$ACTIVITY_NAME onStart")
        Toast.makeText(this, "I am onStart from MainActivity", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "$ACTIVITY_NAME onResume")
        Toast.makeText(this, "I am onResume from MainActivity", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "$ACTIVITY_NAME onPause")
        Toast.makeText(this, "I am onPause from MainActivity", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "$ACTIVITY_NAME onStop")
        Toast.makeText(this, "I am onStop from MainActivity", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onRestart() {
        Log.i(TAG, "$ACTIVITY_NAME onRestart")
        Toast.makeText(this, "I am onRestart from MainActivity", Toast.LENGTH_SHORT).show()
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i(TAG, "$ACTIVITY_NAME onDestroy")
        Toast.makeText(this, "I am onDestroy from MainActivity", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onBackPressed() {
        val fragment = supportFragmentManager.findFragmentById(R.id.frameLayout)
        if (fragment !is IOnBackPressed || !(fragment as IOnBackPressed).onBackPressed()) {
            super.onBackPressed()
        }
    }
}
