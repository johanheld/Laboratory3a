package com.example.johan.laboratory3a;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment
{
    private Button btnColor;
    private TextView tvColor;
    private String [] content = {"RED", "BLUE", "YELLOW", "GREEN"};
    Controller controller;

    public ColorFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        init(view);
        return view;
    }

    private void init(View view)
    {
        controller = new Controller(this);
        btnColor = (Button)view.findViewById(R.id.btnColor);
        tvColor = (TextView)view.findViewById(R.id.tvColor);
        btnColor.setText("RED");
        tvColor.setBackgroundColor(Color.RED);

        btnColor.setOnClickListener(new BL());

        ListView lv = (ListView)view.findViewById(R.id.lvColor);
        lv.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, content));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position == 0)
                {
                    controller.listItemClicked(0);
                }
                if (position == 1)
                {
                    controller.listItemClicked(1);
                }

                if (position == 2)
                {
                    controller.listItemClicked(2);
                }

                if (position == 3)
                {
                    controller.listItemClicked(3);
                }
            }
        });

    }

    public void setButtonText(String text)
    {
        btnColor.setText(text);
    }

    public void setTextViewColor(int color)
    {
        tvColor.setBackgroundColor(color);
    }

    private class BL implements View.OnClickListener{

        @Override
        public void onClick(View v)
        {
            controller.btnColorClicked(btnColor.getText().toString());
        }
    }


}
