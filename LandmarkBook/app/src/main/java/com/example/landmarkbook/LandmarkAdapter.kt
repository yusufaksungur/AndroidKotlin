package com.example.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkbook.databinding.RecyclerRowBinding

class LandmarkAdapter(private val landmarkList: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        val landmark = landmarkList[position]
        holder.binding.recyclerRowTextView.text = landmark.name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java).apply {
                putExtra("landmark", landmark)  // Landmark sınıfının Parcelable ya da Serializable olduğundan emin ol!
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = landmarkList.size
}
