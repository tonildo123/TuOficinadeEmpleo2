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

public class Progresar extends Fragment {
    private Button btn1, btn2;
    private LinearLayout c;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.progresar_layout, container, false);

    btn1 = (Button)container.findViewById(R.id.bRequisitosP);
    btn2 = (Button)container.findViewById(R.id.bCuandoCobro);
    c = (LinearLayout)container.findViewById(R.id.contenedor);





        return rootView;
    }
}
