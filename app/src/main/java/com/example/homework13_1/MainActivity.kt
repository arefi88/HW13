package com.example.homework13_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.View.OnClickListener
import android.view.View.VISIBLE
import android.widget.TextView
import com.example.homework13_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtRed.setOnClickListener(this)
        binding.txtOrange.setOnClickListener(this)
        binding.txtBlue.setOnClickListener(this)
        binding.txtGreen.setOnClickListener(this)
        binding.txtYellow.setOnClickListener(this)
        binding.txtIndigo.setOnClickListener(this)
        binding.txtViolet.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.txtRed -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
            R.id.txtOrange -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
            R.id.txtBlue -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }

            R.id.txtYellow -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
            R.id.txtIndigo -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
            R.id.txtViolet -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
            R.id.txtGreen -> {
                visible(view)
                setTextView(view as TextView)
                Handler(Looper.getMainLooper()).postDelayed({
                    setTextVi()
                    view.visibility= VISIBLE
                }, 5000)
            }
        }
    }

    private fun visible(view: View?) {
        view!!.visibility = View.INVISIBLE
    }

    private fun setTextView(view: TextView) {
        binding.txtRed.text = view.text
        binding.txtYellow.text = view.text
        binding.txtGreen.text = view.text
        binding.txtBlue.text = view.text
        binding.txtIndigo.text = view.text
        binding.txtViolet.text = view.text
        binding.txtOrange.text = view.text
    }

    private fun setTextVi() {
        binding.txtRed.text = resources.getString(R.string.red)
        binding.txtYellow.text =resources.getString(R.string.yellow)
        binding.txtGreen.text = resources.getString(R.string.green)
        binding.txtBlue.text = resources.getString(R.string.blue)
        binding.txtIndigo.text = resources.getString(R.string.indigo)
        binding.txtViolet.text = resources.getString(R.string.violet)
        binding.txtOrange.text = resources.getString(R.string.orange)
    }
}