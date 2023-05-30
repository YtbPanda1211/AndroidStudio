package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer so1 = 0;
    Integer so2 = 0;
    Character dau = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtkq = (TextView) findViewById(R.id.kq);
        Button So0 = (Button)findViewById(R.id.so0);So0.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"0");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So1 = (Button)findViewById(R.id.so1);So1.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"1");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So2 = (Button)findViewById(R.id.so2);So2.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"2");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So3 = (Button)findViewById(R.id.so3);So3.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"3");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So4 = (Button)findViewById(R.id.so4);So4.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"4");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So5 = (Button)findViewById(R.id.so5);So5.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"5");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So6 = (Button)findViewById(R.id.so6);So6.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"6");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So7 = (Button)findViewById(R.id.so7);So7.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"7");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So8 = (Button)findViewById(R.id.so8);So8.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"8");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});
        Button So9 = (Button)findViewById(R.id.so9);So9.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View v) { txtkq.setText(txtkq.getText().toString()+"9");if(dau == null)
        { so1 = Integer.parseInt(txtkq.getText().toString()); }else {
            so2 = Integer.parseInt(txtkq.getText().toString()); } }});

        Button Cong = (Button)findViewById(R.id.btnCong);
        Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '+';
                txtkq.setText("");
            }
        });
        Button Chia = (Button)findViewById(R.id.btnChia);
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '/';
                txtkq.setText("");
            }
        });
        Button Tru = (Button)findViewById(R.id.btnTru);
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '-';
                txtkq.setText("");
            }
        });
        Button Nhan = (Button)findViewById(R.id.btnNhan);
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '*';
                txtkq.setText("");
            }
        });

        Button Tinh = (Button)findViewById(R.id.btnTinh);
        Tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dau != null)
                {
                    Integer kq = 0;
                    switch (dau)
                    {
                        case '+': kq = so1+so2; break;
                        case '-': kq = so1-so2; break;
                        case '*': kq = so1*so2; break;
                        case '/': kq = so1/so2; break;

                    }
                    txtkq.setText(kq.toString());
                    so1 = kq;
                    dau = null;

                }
            }
        });
        Button Xoa = (Button)findViewById(R.id.btnXoa);
        Xoa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                so1 = 0;
                so2 = 0;
                dau = null;
                txtkq.setText("");
            }
        });
    }

}