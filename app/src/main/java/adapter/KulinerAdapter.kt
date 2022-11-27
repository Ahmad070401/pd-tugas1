package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ahmad.listapp.databinding.ItemList1Binding
import com.ahmad.listapp.model.DaftarKuliner

class KulinerAdapter (private val context: Context):RecyclerView.Adapter<KulinerAdapter.KulinerviewHolder>() {

    private val list = ArrayList<DaftarKuliner>()
    fun setData(Listparams: List<DaftarKuliner>) {
        list.clear()
        list.addAll(Listparams)
        notifyDataSetChanged()
    }

    inner class KulinerviewHolder(private val binding: ItemList1Binding) :
        ViewHolder(binding.root) {
        fun bind(data: DaftarKuliner) {
            binding.imgview.setImageResource(data.image)
            binding.tvTitle.text = data.Title
            binding.tvDeskrip.text = data.deskripsi
            binding.tvrating.text = data.rating
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = KulinerviewHolder(
        ItemList1Binding.inflate(LayoutInflater.from(context), parent, false)
    )

    override fun onBindViewHolder(holder: KulinerviewHolder, position: Int) {
        holder.bind(list[position])


    }

    override fun getItemCount(): Int = list.size
}