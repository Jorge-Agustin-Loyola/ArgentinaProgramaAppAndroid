package com.curso.android.app.practica.argentinaprogramamvvm.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.activity.viewModels
import com.curso.android.app.practica.argentinaprogramamvvm.R
import com.curso.android.app.practica.argentinaprogramamvvm.databinding.ActivityMainBinding
import com.curso.android.app.practica.argentinaprogramamvvm.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    @SuppressLint("StaticFieldLeak")
    private lateinit var etTexto1: EditText

    @SuppressLint("StaticFieldLeak")
    private lateinit var etTexto2: EditText
    private lateinit var binding:ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        initComponents()


        mainViewModel.result.observe(/* owner = */ this){
            binding.tvResultado.text = it.resultStr

        }

        binding.btnComparar.setOnClickListener {
            val string1 = etTexto1.text.toString()
            val string2 = etTexto2.text.toString()
            mainViewModel.comparar(string1,string2)
        }

    }
    private fun initComponents(){
        etTexto1 = findViewById(R.id.etTexto1)
        etTexto2 = findViewById(R.id.etTexto2)
    }


}