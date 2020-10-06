package com.bram.vsgaprojectkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_plus, btn_minus, btn_divide, btn_multiple, btn_bersihkan;
    EditText angka1, angka2;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_divide = findViewById(R.id.btn_divider);
        btn_multiple = findViewById(R.id.btn_multiple);
        btn_bersihkan = findViewById(R.id.btn_bersihkan);
        angka1 = findViewById(R.id.et_angka1);
        angka2 = findViewById(R.id.et_angka2);
        hasil = findViewById(R.id.txt_hasil);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (angka1.getText().toString().equals("")){
                    angka1.setError("Anda belum memasukkan angka !");
                }else if (angka2.getText().toString().equals("")){
                    angka2.setError("Anda belum memasukkan angka !");
                }else{
                    hitung(angka1.getText().toString(),angka2.getText().toString(),"+");
                }


            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().equals("")){
                    angka1.setError("Anda belum memasukkan angka !");
                }else if (angka2.getText().toString().equals("")){
                    angka2.setError("Anda belum memasukkan angka !");
                }else{
                    hitung(angka1.getText().toString(),angka2.getText().toString(),"-");
                }

            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().equals("")){
                    angka1.setError("Anda belum memasukkan angka !");
                }else if (angka2.getText().toString().equals("")){
                    angka2.setError("Anda belum memasukkan angka !");
                }else{
                    hitung(angka1.getText().toString(),angka2.getText().toString(),"/");
                }
            }
        });

        btn_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angka1.getText().toString().equals("")){
                    angka1.setError("Anda belum memasukkan angka !");
                }else if (angka2.getText().toString().equals("")){
                    angka2.setError("Anda belum memasukkan angka !");
                }else{
                    hitung(angka1.getText().toString(),angka2.getText().toString(),"x");
                }

            }
        });

        btn_bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("");
            }
        });
    }

    private void hitung(String angka1, String angka2, String simbol){
        switch (simbol){
            case "+":
                Integer hitung = (Integer.parseInt(angka1)+Integer.parseInt(angka2));
                hasil.setText(hitung.toString());
                break;
            case "-":
                Integer hitung2 = (Integer.parseInt(angka1)+Integer.parseInt(angka2));
                hasil.setText(hitung2.toString());
                break;
            case "x":
                Integer hitung3 = (Integer.parseInt(angka1)*Integer.parseInt(angka2));
                hasil.setText(hitung3.toString());
                break;
            case "/":
                Float hitung4 = Float.valueOf(Integer.parseInt(angka1)/Integer.parseInt(angka2));
                hasil.setText(hitung4.toString());
                break;
        }
    }

}