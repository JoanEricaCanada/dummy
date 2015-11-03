package com.example.joanericacanada.daybook.activities;

import android.support.v4.app.Fragment;

import com.example.joanericacanada.daybook.FragmentLoader;
import com.example.joanericacanada.daybook.view.EntryFragment;

/**
 * Created by joanericacanada on 10/30/15.
 */
public class EntryActivity extends FragmentLoader{
    protected Fragment createFragment(){
        return new EntryFragment();
    }
}
