package com.tohasheikh.chineseattractions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.tohasheikh.chineseattractions.databinding.FragmentFirstBinding;

/* loaded from: classes3.dex */
public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentFirstBinding inflate = FragmentFirstBinding.inflate(inflater, container, false);
        this.binding = inflate;
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.buttonFirst.setOnClickListener(new View.OnClickListener() { // from class: com.tohasheikh.chineseattractions.FirstFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }
}
