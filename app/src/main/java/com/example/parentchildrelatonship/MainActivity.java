package com.example.parentchildrelatonship;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pair> pairs = new ArrayList<Pair>();
        pairs.add(0,new Pair( "Babul" , "Noral"));
        pairs.add(1,new Pair( "Lablu" , "Noral"));
        pairs.add(2, new Pair( "Noral" , "Taher"));

        Map<String, Parent> hm = new HashMap<>();

        for(Pair p:pairs){

            //  ----- Child -----
            Parent mmdChild ;
            if(hm.containsKey(p.getChildId())){
                mmdChild = hm.get(p.getChildId());

            }
            else{
                mmdChild = new Parent();
                hm.put(p.getChildId(),mmdChild);
            }
            mmdChild.setId(p.getChildId());
            mmdChild.setParentId(p.getParentId());




            // ------ Parent ----
            Parent mmdParent ;
            if(hm.containsKey(p.getParentId())){
                mmdParent = hm.get(p.getParentId());
            }
            else{
                mmdParent = new Parent();
                hm.put(p.getParentId(),mmdParent);
            }
            mmdParent.setId(p.getParentId());
            mmdParent.addChildrenItem(mmdChild);

            // Get the root
            List<Parent> dataParents = new ArrayList<Parent>();
            for(Parent mmd : hm.values()){
                if(mmd.getParentId().equals(mmdChild.getId()))
                    dataParents.add(mmd);
            }

            // Print
            for(Parent mmd: dataParents){
                System.out.println(" childs are : "+ mmd.getId());
            }
        }
    }
}