package com.example.joanericacanada.daybook.activities;

import android.support.v4.app.Fragment;

import com.example.joanericacanada.daybook.FragmentLoader;
import com.example.joanericacanada.daybook.view.EntryListFragment;

/**
 * Created by joanericacanada on 10/29/15.
 */
public class EntryListActivity extends FragmentLoader {
    protected Fragment createFragment(){
        return new EntryListFragment();
    }
}
