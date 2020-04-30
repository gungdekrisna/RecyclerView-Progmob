package com.example.recyclerviewnew;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuesthouseAdapter extends RecyclerView.Adapter<GuesthouseAdapter.GuesthouseViewHolder> {
    private ArrayList<Guesthouse> dataList;
    private RecyclerViewClickListener listener;

    public GuesthouseAdapter(ArrayList<Guesthouse> dataList, RecyclerViewClickListener listener) {
        this.dataList = dataList;
        this.listener = listener;
    }

    @Override
    public GuesthouseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_guesthouse, parent, false);
        return new GuesthouseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GuesthouseViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtDeskripsi.setText(dataList.get(position).getDeskripsi());
        holder.txtLokasi.setText(dataList.get(position).getLokasi());
        holder.imgIcon.setImageResource(dataList.get(position).getIcon());
        holder.txtHarga.setText(dataList.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class GuesthouseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView txtNama, txtDeskripsi, txtLokasi, txtHarga;
        private ImageView imgIcon;

        public GuesthouseViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtDeskripsi = (TextView) itemView.findViewById(R.id.txt_deskripsi);
            txtLokasi = (TextView) itemView.findViewById(R.id.txt_lokasi);
            imgIcon = (ImageView) itemView.findViewById(R.id.icon);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
