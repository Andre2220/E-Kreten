package com.TheShadowBrokers.e_kreten.ui.evalutions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.TheShadowBrokers.e_kreten.R;

public class EvalutionsFragment extends Fragment {

    private EvalutionsViewModel evalutionsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        evalutionsViewModel =
                ViewModelProviders.of(this).get(EvalutionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_evalutions, container, false);
        final TextView textView = root.findViewById(R.id.text_evalutions);
        evalutionsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}