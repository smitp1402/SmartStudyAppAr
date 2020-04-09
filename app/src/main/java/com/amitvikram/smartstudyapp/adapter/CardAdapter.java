package com.amitvikram.smartstudyapp.adapter;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.amitvikram.smartstudyapp.activity.DetailsActivity;
import com.amitvikram.smartstudyapp.R;
import com.amitvikram.smartstudyapp.model.Planet;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.PlanetHolder> {
  private List<Planet> planets;
  private Context context;
  public CardAdapter() {
    this.planets = new ArrayList<>();
  }
  
  public void updateData(List<Planet> planets, Context context) {
    this.planets = planets;
    this.context = context;
    this.notifyDataSetChanged();
  }
  
  @NonNull
  @Override
  public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
    return new PlanetHolder(LayoutInflater.from(parent.getContext()).inflate(
        R.layout.item_card,
        parent,
        false
    ));
  }
  
  @Override
  public void onBindViewHolder(@NonNull PlanetHolder holder, final int position) {
    Planet planet = planets.get(position);
    holder.setDetails(planet);
  }
  
  @Override
  public int getItemCount() {
    return planets.size();
  }
  
  class PlanetHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtName;
    private TextView txtDistance;
    private TextView txtGravity;
    private TextView txtDiameter;
    
    private Planet planetDetails = null;
    
    PlanetHolder(View itemView) {
      super(itemView);
      
      txtName = itemView.findViewById(R.id.txtName);
      txtDistance = itemView.findViewById(R.id.txtDistance);
      txtGravity = itemView.findViewById(R.id.txtGravity);
      txtDiameter = itemView.findViewById(R.id.txtDiameter);
      
      itemView.setOnClickListener(this);
    }
    
    void setDetails(Planet planet) {
      this.planetDetails = planet;
      
      txtName.setText(planet.getPlanetName());
      txtDistance.setText(String.format(Locale.US, "Distance from Sun : %d Million KM", planet.getDistanceFromSun()));
      txtGravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planet.getGravity()));
      txtDiameter.setText(String.format(Locale.US, "Diameter : %d KM", planet.getDiameter()));
    }
    
    @Override
    public void onClick(View clickedView) {
      if (planetDetails != null) {
        Toast.makeText(
            itemView.getContext(),
            planetDetails.getPlanetName(),
            Toast.LENGTH_SHORT
        ).show();
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra("planetNo",planetDetails.getPlanetNo());
        intent.putExtra("planetName", planetDetails.getPlanetName());
        clickedView.getContext().startActivity(intent);
      }
    }
  }
}
