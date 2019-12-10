package fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment implements View.OnClickListener {



    private EditText principle,rate,time;
    private Button btnSI;
    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_simple_interest, container, false);

        rate =view.findViewById(R.id.rate);
        time=view.findViewById(R.id.time);
        principle=view.findViewById(R.id.principle);
        btnSI=view.findViewById(R.id.btnSI);

        btnSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(rate.getText().toString());
        int second=Integer.parseInt(time.getText().toString());
        int third=Integer.parseInt(principle.getText().toString());

        int si= (first*second*third)/100;
        Toast.makeText(getActivity(), "Simple Interest Is"+si, Toast.LENGTH_SHORT).show();

    }
}
