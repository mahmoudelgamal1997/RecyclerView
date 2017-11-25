package com.example2017.android.recyclerview;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by M7moud on 25-Nov-17.
 */
//MoviesAdapter is the Adapter_class
//movieHolder is the holder_class
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.movieHolder> {

    List<MoviesModel> list;
//cnstructr
public MoviesAdapter(List<MoviesModel> list){
this.list=list;
}


    @Override
    public movieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_frame,parent,false);
        movieHolder hold=new movieHolder(row);


        return hold;
    }

    @Override
    public void onBindViewHolder(movieHolder holder, int position)
    {

        //instace from moviemodel
        MoviesModel model=list.get(position);
        holder.img.setImageResource(model.image);
        holder.txt.setText(model.title);

    }

    @Override
    public int getItemCount()
    {
        //to return all images
        //if zero it won't appeat any thing
        return list.size();
    }

    //holder_class
    class movieHolder extends RecyclerView.ViewHolder
    {
       TextView txt;
       ImageView img;

        public movieHolder(View itemView)
        {
            super(itemView);

            txt=(TextView)itemView.findViewById(R.id.textView);
            img=(ImageView)itemView.findViewById(R.id.imageView);

        }

}

}