package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.touchizen.drawerwithbottomnavigation.fragmentsParent.CardDetailFragment;
import com.touchizen.drawerwithbottomnavigation.fragmentsParent.VerificationFragment;

public class FragmentParentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_parent);

        int fragmentID = getIntent().getIntExtra("id", 1);

        switch (fragmentID) {

            case 0:
                replaceFragment(new VerificationFragment());
                break;
            case 1:
                replaceFragment(new CardDetailFragment());
                break;

        }

    }

    private void replaceFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}