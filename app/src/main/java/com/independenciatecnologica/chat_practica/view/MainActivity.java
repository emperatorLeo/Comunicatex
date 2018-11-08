package com.independenciatecnologica.chat_practica.view;

import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.independenciatecnologica.chat_practica.R;
import com.independenciatecnologica.chat_practica.databinding.ActivityConversationBinding;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton buttonSend;
    private ActivityConversationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_conversation);
    }
}
