package com.example.ludmyla_almeida_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class ResumeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard

        Button btnDownload;
        String URL = "https://github.com/ludmylaalmeida/portfolio/blob/master/Ludmyla_Almeida_Resume.pdf";

        View view = inflater.inflate(R.layout.fragment_resume, null);
        ImageView imageView1 = (ImageView) view.findViewById(R.id.linkedin);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.github);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.linkedin.com/in/ludmyla-almeida/";
                Intent google=new Intent(Intent.ACTION_VIEW);
                google.setData(Uri.parse(url));
                startActivity(google);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://ludmylaalmeida.github.io/resume/";
                Intent google=new Intent(Intent.ACTION_VIEW);
                google.setData(Uri.parse(url));
                startActivity(google);
            }
        });

        Button imageLogo = (Button) view.findViewById(R.id.btnPdf);
        imageLogo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://github.com/ludmylaalmeida/portfolio/blob/master/Ludmyla_Almeida_Resume.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        return view;
    }


}