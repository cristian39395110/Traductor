package com.softmaky.traductor;

import android.app.Application;

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
        String palabraLista="auto";
        traduce.setValue(palabraLista);

    }


}
