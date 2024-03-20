package com.softmaky.traductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class TracuctorViewModel extends AndroidViewModel {

    private MutableLiveData<String> traduce;
    public TracuctorViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String> getMutableTraduce(){
        if (traduce == null){
            traduce=new MutableLiveData<>();
        }
        return traduce;
    }

    public void traducido(String palabra){
        String palabraLista=palabra;
        Intent intent =new Intent(getApplicationContext(), TraductorActivity.class);

    }

    private Context getApplicationContext() {
        return null;
    }


}
