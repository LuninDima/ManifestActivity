package com.example.manifestactivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.manifestactivity.databinding.ActivityFirstBinding

/**
 * 2.09 Главное отличие жизненного цикла фрагмента от активити в том, что активити может существовать самостоятельно,
 * а фрагмент не может существовать без активити. Поэтому в жизненном цикле фрагмента добавлен метод onAttach для добавления
 * к активити и onDetach для открепления.
 * Помимо этого, backstack в активити реализован по принципу стека. Каждая новая активити помещается в стек поверх старой. При
 * нажатии на кнопку "назад" пользователь может вернуться на предыдущую активити в стеке. У фрагментов разработчик сам задает
 * данный порядок. Фрагмент может поместить вместо предыдущего фрагмента или добавиться поверх него. Во втором случае может
 * возникнуть ситуация, когда будут активны сразу 2 фрагмента. Одновременное исопльзование сразу 2-х активити возможно только
 * при разделении экрана на 2 части.
 * 2.10 Жизненный цикл активити необходимо для грамотной работы устройства с множеством независимых приложений
 * в условиях ограниченного количества ресурсов. Использование методов жизненного цикла позволяет разработчику
 * управлять приложением в зависимости от действий пользователя: сохранять состояние и останавливать ресурсоемкие задачи при сворачивании приложения или его уничтожении,
 * восстанавливать данные при возврате пользователя к приложению и т.д.
 *
 * 2.11
 * 1) Сохранение данных при сворачивании приложения и их восстановление при возвращении пользователя на экра
 * 2) остановка ресурскоемких задач при сворачивании приложения
 * 3) сохранение данных в базу данных при уничтожении приложения*
 */
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