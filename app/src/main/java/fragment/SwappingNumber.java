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
public class SwappingNumber extends Fragment implements View.OnClickListener {

EditText first,second;
Button btnSwap;
TextView tvMessage;
    public SwappingNumber() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_swapping_number, container, false);
        first = view.findViewById(R.id.first);
        second = view.findViewById(R.id.second);
        btnSwap = view.findViewById(R.id.btnSwap);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int firstnum = Integer.parseInt(first.getText().toString());
        int secondnum = Integer.parseInt(second.getText().toString());

        firstnum = firstnum + secondnum;
        secondnum = firstnum - secondnum;
        firstnum = firstnum - secondnum;

        tvMessage.setText("After swapping value of first number is " + firstnum + " and value of second number is " + secondnum);
    }
}
