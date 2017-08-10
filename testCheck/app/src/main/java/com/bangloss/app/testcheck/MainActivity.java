package com.bangloss.app.testcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    String url="http://webmakerteam.com/appdata/school/app_php/student_list.php";

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


listView=(ListView)findViewById(R.id.list);

        GetDatafromJson();
    }

    public void get(View view){



        Toast.makeText(MainActivity.this,JsonContain.Name[0],Toast.LENGTH_LONG).show();
    }


    public  void GetDatafromJson(){

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                getJsonData(s);


            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }

    });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void getJsonData(String responce){
        JsonContain jc=new JsonContain(responce);
        jc.JsonData();

        CoustmData cd=new CoustmData(this,JsonContain.Id,JsonContain.Name);

        listView.setAdapter(cd);
       // Toast.makeText(MainActivity.this, (CharSequence) cd,Toast.LENGTH_LONG).show();

    }

}
