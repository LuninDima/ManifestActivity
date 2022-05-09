package com.example.manifestactivity

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.manifestactivity.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startAlertDialog()
        startMultiAlertDialog()
        Log.d("mylogs", "onCreate SecondActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("mylogs", "onStart SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mylogs", "onResume SecondActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mylogs", "onPause SecondActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mylogs", "onStop SecondActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("mylogs", "onRestart SecondActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mylogs", "onDestroy SecondActivity")
    }


    private fun startAlertDialog(){
        binding.buttonStartAlertDialog.setOnClickListener {
            createAlertDialog()
        }
    }

    private fun startMultiAlertDialog(){
        binding.buttonStartMultiAlertDialog.setOnClickListener {
            createMultiAlertDialog()
        }
    }

    private fun createAlertDialog(){
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Тестовый Alert Dialog")
        .setMessage("вы вызвали Alert Dialog")
            .setCancelable(false)
            .setNeutralButton("дополнительная информация", DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this, "Нажата кнопка Neutral", Toast.LENGTH_SHORT).show() })
            .setPositiveButton("подвердить") { dialogInterface, i ->  Toast.makeText(this, "Нажата кнопка Positive", Toast.LENGTH_SHORT).show() }
            .setNegativeButton("отмена", DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this, "Нажата кнопка Negative", Toast.LENGTH_SHORT).show() })
        alertDialog.show()
    }

    private fun createMultiAlertDialog(){
        val multiAlertDialog = AlertDialog.Builder(this)
        multiAlertDialog.setTitle("Какой цвет Вам больше нравится?")
            .setMultiChoiceItems(R.array.multiChoice, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Log.d("myLog", "мой любимый цвет:" + i + "/ is " + b)
            })
            .setCancelable(false)
            .setNeutralButton("дополнительная информация", DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this, "Нажата кнопка Neutral", Toast.LENGTH_SHORT).show() })
            .setPositiveButton("подвердить") { dialogInterface, i ->  Toast.makeText(this, "Нажата кнопка Positive", Toast.LENGTH_SHORT).show() }
            .setNegativeButton("отмена", DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this, "Нажата кнопка Negative", Toast.LENGTH_SHORT).show() })
        multiAlertDialog.show()
    }
}

























