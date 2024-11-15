package com.example.gridview_example;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gridview_example.Model.TableAdapter;
import com.example.gridview_example.Model.TableModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView RecyclerView;
    TableAdapter adapter;
    SearchView searchView;
    List<TableModel> model=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        searchView=findViewById(R.id.SearchView);
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                    return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                TableFilter(newText);
                return false;
            }


        });
        RecyclerView=findViewById(R.id.RecyclerView);
        setRecyclerView();
    }

    private void setRecyclerView() {
        RecyclerView.setHasFixedSize(true);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new TableAdapter(this,getList());
        RecyclerView.setAdapter(adapter);
    }

    private List<TableModel> getList() {
        model.add(new TableModel("1","علی کریمی","123131313",R.mipmap.ic_launcher));
        model.add(new TableModel("2","احمد احمدی","1232131",R.mipmap.ic_launcher));
        model.add(new TableModel("3","محمد محمدی","43553534543",R.mipmap.ic_launcher));
        model.add(new TableModel("4","محسن داراخانی","345353453",R.mipmap.ic_launcher));
        model.add(new TableModel("5","کامران کامرانی","34534535",R.mipmap.ic_launcher));
        model.add(new TableModel("6","احسان احسانی","345435343",R.mipmap.ic_launcher));
        model.add(new TableModel("8","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("9","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("10","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("11","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("12","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("13","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        model.add(new TableModel("14","شایان شایانی","3453543454",R.mipmap.ic_launcher));
        return  model;
    }
    public void TableFilter(String filterText) {
        List<TableModel> FilterItem=new ArrayList<>();
        for (TableModel item:model){
            if(item.getFullName().toLowerCase().contains(filterText.toLowerCase())){
                FilterItem.add(item);
            }if (FilterItem.isEmpty()){
                //Toast.makeText(this,"موردی یافت نشد",Toast.LENGTH_SHORT).show();

                adapter.SetFilter(FilterItem);
            }else {
                adapter.SetFilter(FilterItem);
            }
        }
    }

}
