package com.example.assignmentfinal.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.assignmentfinal.R;
import com.example.assignmentfinal.adapter.ListClass_Adaper;
import com.example.assignmentfinal.data.StudentDBManager;
import com.example.assignmentfinal.model.ClassRoom;

import java.util.ArrayList;

public class ListClass extends AppCompatActivity {
    ListView lvClass;
    Bundle bundle;
    ArrayList<ClassRoom> listClass;
    StudentDBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_class);
        lvClass = findViewById(R.id.lv_list_class);
        bundle= getIntent().getExtras();

        dbManager = new StudentDBManager(ListClass.this);
        listClass = dbManager.getAllClass();


            final ListClass_Adaper listClassAdaper = new ListClass_Adaper(ListClass.this, R.layout.list_item_class, listClass);
            lvClass.setAdapter(listClassAdaper);
            lvClass.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    int i ;
                    ClassRoom classs = listClass.get(position);
                    i = classs.getStt();

                    listClass.remove(position);

                    dbManager.deleteStudent(i);
                    listClassAdaper.notifyDataSetChanged();




                    Toast.makeText(ListClass.this, "Da xoa", Toast.LENGTH_SHORT).show();
                    return false;
                }
            });







    }
}
