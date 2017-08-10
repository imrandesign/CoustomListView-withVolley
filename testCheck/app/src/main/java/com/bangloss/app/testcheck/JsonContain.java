package com.bangloss.app.testcheck;

import org.json.JSONObject;

/**
 * Created by Imran Hossain on 7/23/2017.
 */

public class JsonContain {
    String json;
    org.json.JSONArray jsonArray=null;
    public  static  String[] Name;
   public static String[] Id;

    String JSONArray="result";
    public static  final String JSONname="student_name";
    public static  final String  JSONId="student_roll";
    String JSONUrl="";

    public JsonContain(String responce) {

    this.json=responce;
    }


    public void JsonData(){
        JSONObject jsonObject=null;
        try {
            jsonObject=new JSONObject(json);
            jsonArray=jsonObject.getJSONArray(JSONArray);

            Id=new String[jsonArray.length()];
            Name=new String[jsonArray.length()];


            for (int i=0; i<jsonArray.length();i++ ){
                JSONObject jo= jsonArray.getJSONObject(i);

                Id[i]=jo.getString(JSONId);
                Name[i]=jo.getString(JSONname);

            }
        }catch (Exception e){

        }

    }
}
