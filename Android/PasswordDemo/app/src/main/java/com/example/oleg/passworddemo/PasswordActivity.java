package com.example.oleg.passworddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button encode, decode;
    EditText psw, show_text;
    SecretKeySpec secret_key;
    IvParameterSpec iv;
    Cipher cipher;
    static final String key = "fsdasdfaYKJH878HL887SFnm";
    static final String ivector = "pogctrdlmnvcrubc";//length=16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        encode = (Button) findViewById(R.id.button_encode);
        encode.setOnClickListener(this);
        decode = (Button) findViewById(R.id.button_decode);
        decode.setOnClickListener(this);
        psw = (EditText) findViewById(R.id.edit_password);
        show_text = (EditText) findViewById(R.id.show_text);

        secret_key = new SecretKeySpec(key.getBytes(), "AES");
        iv = new IvParameterSpec(ivector.getBytes());

        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onClick(View v) {
        if (v == encode) {
            String input = psw.getText().toString();
            try {
                cipher.init(Cipher.ENCRYPT_MODE, secret_key, iv);
                byte[] result = cipher.doFinal(input.getBytes());
                String out = Base64.encodeToString(result, Base64.DEFAULT);
                show_text.setText(out);

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        if (v == decode) {
            String input_string = show_text.getText().toString();
            byte[] input = Base64.decode(input_string.getBytes(), Base64.DEFAULT);

            try {
                cipher.init(Cipher.DECRYPT_MODE, secret_key, iv);
                byte[] result = cipher.doFinal(input);
                String out = new String(result);
                show_text.setText(out);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}
