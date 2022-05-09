package com.example.manifestactivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.manifestactivity.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moveToSecondActivity()
        Log.d("mylogs", "onCreate FirstActivity")

    }

    override fun onStart() {
        super.onStart()
        Log.d("mylogs", "onStart FirstActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mylogs", "onResume FirstActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mylogs", "onPause FirstActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mylogs", "onStop FirstActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("mylogs", "onRestart FirstActivity ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mylogs", "onDestroy FirstActivity")
    }

    private fun moveToSecondActivity(){
        binding.buttonMoveToSecondActivity.setOnClickListener {

    intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
        }
    }
}