package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> p;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> p, Activity activity) {
        this.p = p;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return p.size();
    }

    @Override
    public Object getItem(int position) {
        return p.get(position);
    }

    @Override
    public long getItemId(int position) {
        return p.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);
//        TextView detailsIngred = convertView.findViewById(R.id.detailsIngred);
//        TextView description = convertView.findViewById(R.id.description);
//        TextView preparation = convertView.findViewById(R.id.preparation);
        ImageView photo = convertView.findViewById(R.id.photo);

        //TextView id = convertView.findViewById(R.id.id);

        nom.setText(p.get(position).getNom());
        nbrIngredients.setText(p.get(position).getNbrIngredients()+"");
        photo.setImageResource(p.get(position).getPhoto());
        duree.setText(p.get(position).getDuree()+"");
//        detailsIngred.setText(p.get(position).getDetailsIngred()+"");
//        description.setText(p.get(position).getDescription()+"");
//        preparation.setText(p.get(position).getPreparation()+"");
        // id.setText(p.get(position).getId()+"");
        return convertView;
    }
}
