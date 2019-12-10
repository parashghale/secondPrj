package fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Automorphic extends Fragment implements View.OnClickListener{

EditText etAutomorphic;
Button btnAutomorphicC;
TextView tvMessage;
    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAutomorphic = view.findViewById(R.id.etAutomorphic);
        btnAutomorphicC = view.findViewById(R.id.btnAutomorphicC);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnAutomorphicC.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etAutomorphic.getText().toString());
        int square_num = num * num;

        String squarenum = Integer.toString(num);
        String square = Integer.toString(square_num);

        if(square.endsWith(squarenum)){
            tvMessage.setText(num + " is Automorphic number");
        }else {
            tvMessage.setText(num + " is not Automorphic number");
        }
    }
}
