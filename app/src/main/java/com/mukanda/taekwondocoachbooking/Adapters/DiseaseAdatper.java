package com.mukanda.taekwondocoachbooking.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mukanda.taekwondocoachbooking.DataRetrievalClass.DiseaseAndSymptoms;
import com.mukanda.taekwondocoachbooking.R;
import java.util.List;

public class DiseaseAdatper extends RecyclerView.Adapter<DiseaseAdatper.ViewHolder> {

    private Context context;
    private List<DiseaseAndSymptoms> diseaseAndSymptoms;

    public DiseaseAdatper(Context context, List<DiseaseAndSymptoms> diseaseAndSymptoms) {
        this.context = context;
        this.diseaseAndSymptoms = diseaseAndSymptoms;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_specialization_or_coach,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DiseaseAndSymptoms diseaseAndSymptom=diseaseAndSymptoms.get(position);
        holder.specializationname.setText(diseaseAndSymptom.getSpecializationName());
        holder.activity.setText("Activities: "+diseaseAndSymptom.getActivity());
        holder.info.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return diseaseAndSymptoms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView specializationname,activity,info;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            specializationname=itemView.findViewById(R.id.disease_or_doctor_name);
            activity=itemView.findViewById(R.id.symptoms_or_spl);
            info=itemView.findViewById(R.id.info);
        }
    }
}

