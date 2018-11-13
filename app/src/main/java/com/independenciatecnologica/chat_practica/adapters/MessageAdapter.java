package com.independenciatecnologica.chat_practica.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.independenciatecnologica.chat_practica.R;
import com.independenciatecnologica.chat_practica.databinding.MesajesItemBinding;
import com.independenciatecnologica.chat_practica.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
    private List<Message> lista ;
    private LayoutInflater inflater;

    public MessageAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.lista = new ArrayList<>();
    }
    public void setInfo(Message mensaje){
        this.lista.add(mensaje);
        notifyDataSetChanged();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder{
        private MesajesItemBinding itemBinding;


        public MessageViewHolder( MesajesItemBinding itemView) {
            super(itemView.getRoot());
            this.itemBinding = itemView;
        }
        public void bind (Message item){
            itemBinding.setModel(item);
            itemBinding.executePendingBindings();
        }
    }
    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       MesajesItemBinding binding = DataBindingUtil.inflate(inflater,
               R.layout.mesajes_item,viewGroup,false);

       return new MessageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {
        Message model = lista.get(i);
        messageViewHolder.bind(model);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


}
