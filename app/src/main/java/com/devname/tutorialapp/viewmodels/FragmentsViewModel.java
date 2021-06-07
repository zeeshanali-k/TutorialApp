package com.devname.tutorialapp.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentsViewModel extends ViewModel {

    public MutableLiveData<Integer> getIntegerLiveData() {
        return integerLiveData;
    }

    private final MutableLiveData<Integer> integerLiveData;
    private static final String TAG = "FragmentsViewModel";
//    private int a;
    public FragmentsViewModel(){
        integerLiveData=new MutableLiveData<>();
    }

    public void setA(int a){
        integerLiveData.setValue(a);
    }


}
