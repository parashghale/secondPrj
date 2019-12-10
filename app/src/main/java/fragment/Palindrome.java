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
public class Palindrome extends Fragment implements View.OnClickListener {

EditText eNo;
Button btn;
TextView txtv;

    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
        eNo=view.findViewById(R.id.eNo);
        btn=view.findViewById(R.id.btn);
        txtv=view.findViewById(R.id.txtv);

        btn.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        int rem,rev = 0,temp;
        int first=Integer.parseInt(eNo.getText().toString());

        temp = first;

        while( first != 0 )
        {
            rem= first % 10;
            rev = (rev * 10) + rem;
            first=first/10;
        }

        if (temp == rev)
            txtv.setText("Yes "+temp+" is a palindrome number.");
        else
            txtv.setText("o"+temp+" is not a palindrome number.");

    }

}
