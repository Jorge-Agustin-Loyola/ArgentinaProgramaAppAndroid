package com.curso.android.app.practica.argentinaprogramamvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.argentinaprogramamvvm.model.Result



class MainViewModel: ViewModel() {

    // Solo queremos que se pueda leer el resultado
    val result: LiveData<Result> get() = _result
    // no nos interesa que se modifique por afuera del viewmodel
    private var _result = MutableLiveData(Result(""))

    fun comparar(string1:String, string2: String){
        if(string1==string2){
            _result.value = Result("Los strings SON iguales")
        }else{
            _result.value = Result("Los strings NO SON iguales")
        }
    }
}