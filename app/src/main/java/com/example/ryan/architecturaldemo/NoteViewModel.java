package com.example.ryan.architecturaldemo;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class NoteViewModel extends AndroidViewModel {
    public NoteViewModel(@NonNull Application application) {
        super(application);
    }
}
