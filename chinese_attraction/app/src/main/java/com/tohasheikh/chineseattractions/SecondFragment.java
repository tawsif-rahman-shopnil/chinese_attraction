package com.tohasheikh.chineseattractions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.tohasheikh.chineseattractions.databinding.FragmentSecondBinding;

/* loaded from: classes3.dex */
public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentSecondBinding inflate = FragmentSecondBinding.inflate(inflater, container, false);
        this.binding = inflate;
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.buttonSecond.setOnClickListener(new View.OnClickListener() { // from class: com.tohasheikh.chineseattractions.SecondFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }
}
