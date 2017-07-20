package com.example.tamura.tuoficinadeempleo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by TAMURA on 19/07/2017.
 */

public class Jovenes extends Fragment {
    private Button btn3, btn4;
    private LinearLayout c2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jovenes_layout, container, false);

        btn3 = (Button)container.findViewById(R.id.bRequisitos);
        btn4 = (Button)container.findViewById(R.id.bCronograma);
        c2 = (LinearLayout)container.findViewById(R.id.contiene);

        

        return rootView;
    }
}
