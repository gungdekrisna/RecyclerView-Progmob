package com.example.recyclerviewnew;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {
    private ArrayList<Guesthouse> dataList;

    public DetailAdapter(ArrayList<Guesthouse> dataList) {
        this.dataList = dataList;
    }

    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_detail_final, parent, false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtjumlahKamar.setText(dataList.get(position).getJumlahKamar());
        holder.txtLokasi.setText(dataList.get(position).getLokasi());
        holder.imgIcon.setImageResource(dataList.get(position).getIcon());
        holder.txtHarga.setText(dataList.get(position).getHarga());
        holder.txtFacility1.setText(dataList.get(position).getFacility1());
        holder.txtFacility2.setText(dataList.get(position).getFacility2());
        holder.txtFacility3.setText(dataList.get(position).getFacility3());
        holder.txtFacility4.setText(dataList.get(position).getFacility4());
        holder.txtWisata1.setText(dataList.get(position).getWisata1());
        holder.txtWisata2.setText(dataList.get(position).getWisata2());
        holder.txtWisata3.setText(dataList.get(position).getWisata3());
        holder.txtWisata4.setText(dataList.get(position).getWisata4());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class DetailViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtjumlahKamar, txtLokasi, txtHarga, txtFacility1, txtFacility2, txtFacility3, txtFacility4, txtWisata1, txtWisata2, txtWisata3, txtWisata4;
        private ImageView imgIcon;

        public DetailViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtjumlahKamar = (TextView) itemView.findViewById(R.id.txt_jumlah_kamar);
            txtLokasi = (TextView) itemView.findViewById(R.id.txt_lokasi);
            imgIcon = (ImageView) itemView.findViewById(R.id.icon);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);
            txtFacility1 = (TextView) itemView.findViewById(R.id.facility1);
            txtFacility2 = (TextView) itemView.findViewById(R.id.facility2);
            txtFacility3 = (TextView) itemView.findViewById(R.id.facility3);
            txtFacility4 = (TextView) itemView.findViewById(R.id.facility4);
            txtWisata1 = (TextView) itemView.findViewById(R.id.wisata1);
            txtWisata2 = (TextView) itemView.findViewById(R.id.wisata2);
            txtWisata3 = (TextView) itemView.findViewById(R.id.wisata3);
            txtWisata4 = (TextView) itemView.findViewById(R.id.wisata4);
        }
    }
}