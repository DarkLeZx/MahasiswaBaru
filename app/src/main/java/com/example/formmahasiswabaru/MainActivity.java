package com.example.formmahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText etNomorPendaftaran;
    EditText etNamaCalon;
    Button btnDaftar;

    String nomorPendaftaran, nama;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNamaCalon = findViewById(R.id.et_nama_calon);
        btnDaftar = findViewById(R.id.btn_daftar);


        btnDaftar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama= etNamaCalon.getText().toString();

                if (nomorPendaftaran.trim().equals(""))
                {
                    etNomorPendaftaran.setError("NOMOR PENDAFTARAN WAJIB DIISI !!!");
                }
                else if (nama.trim().equals(""))
                {
                    etNamaCalon.setError("KOLOM NAMA WAJIB DISI !!!");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Selamat " + nama + " Anda Telah Masuk", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}