package com.independenciatecnologica.chat_practica.viewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.independenciatecnologica.chat_practica.R;
import com.independenciatecnologica.chat_practica.adapters.MessageAdapter;
import com.independenciatecnologica.chat_practica.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MensajesViewModel extends AndroidViewModel {
   private Message message;
   private MessageAdapter adapter;
   private String Tag = "MensajeViewModel";

   private Context context;



    public MensajesViewModel (Application context , MessageAdapter adapter){
        super(context);
        this.adapter = adapter;
        this.context = context;
    }

    public void setMenssagesList(){
        Message lista = new Message("Leo","hola amigo como estas?","01:10", R.mipmap.ic_launcher_round);
        adapter.setInfo(lista);
        Log.d(Tag,"items : "+adapter.getItemCount());
        adapter.notifyDataSetChanged();
    }

    public MessageAdapter getAdapter() {
        return adapter;
    }

    @BindingAdapter({"adapter"})
    public static void bindRecyclerViewAdapter(RecyclerView recyclerView, MessageAdapter adapter) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(adapter);
    }




}
