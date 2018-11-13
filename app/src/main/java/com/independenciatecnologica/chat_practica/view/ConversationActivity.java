package com.independenciatecnologica.chat_practica.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.independenciatecnologica.chat_practica.R;
import com.independenciatecnologica.chat_practica.adapters.MessageAdapter;
import com.independenciatecnologica.chat_practica.databinding.ActivityConversationBinding;
import com.independenciatecnologica.chat_practica.viewModel.MensajesViewModel;

public class ConversationActivity extends AppCompatActivity {
    
    private ActivityConversationBinding binding;
    private MensajesViewModel viewModel;
    private MessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_conversation);
        initBinding();

    }

    private void initBinding(){
        adapter = new MessageAdapter(this);
        viewModel = new MensajesViewModel(getApplication(),adapter);
        binding.setViewModel(viewModel);

    }
}
