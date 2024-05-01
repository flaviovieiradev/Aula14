package com.example.aula14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapImg extends BaseAdapter {
    Context context;
    String listpreco[];
    int listImages[];
    LayoutInflater inflater;

    public AdapImg(Context ctx, String[] preco, int[] images) {
        this.context = ctx;
        this.listpreco = preco;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.modelo_lista, null);
        TextView texto1 = (TextView) view.findViewById(R.id.texto1);
        TextView texto2 = (TextView) view.findViewById(R.id.texto2);
        ImageView img = (ImageView) view.findViewById(R.id.imageView2);
        texto1.setText("" + i);
        texto2.setText(listpreco[i]);
        img.setImageResource(listImages[i]);
        return view;
    }
}