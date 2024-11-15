package com.example.gridview_example;

import android.content.ClipData;
import android.content.Intent;
import android.media.RouteListingPreference;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.gridview_example.Account.CreateAccountActivity;
import com.example.gridview_example.Account.LoginActivity;
import com.example.gridview_example.Model.TableAdapter;
import com.example.gridview_example.Model.TableModel;
import com.example.gridview_example.ui.home.HomeViewModel;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.activity.EdgeToEdge;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gridview_example.databinding.ActivityMain2Binding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMain2Binding binding;
    androidx.recyclerview.widget.RecyclerView RecyclerView;
    TableAdapter adapter;
    SearchView searchView;
    TextView NotFound;


    List<TableModel> model=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain2.toolbar);
        binding.appBarMain2.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        NotFound=findViewById(R.id.NotFound);
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==2131230800) {

            startActivity(new Intent(MainActivity2.this,
                    CreateAccountActivity.class));

        }
        return super.onOptionsItemSelected(item);
    }
    private List<TableModel> getList() {
        model.add(new TableModel("1","علی کریمی","23434",R.drawable.example1));
        model.add(new TableModel("2","احمد احمدی","23434",R.drawable.example2));
        model.add(new TableModel("3","محمد محمدی","34634",R.drawable.example3));
        model.add(new TableModel("4","محسن داراخانی","234324",R.drawable.example4));
        model.add(new TableModel("5","کامران کامرانی","234423",R.drawable.example5));
        model.add(new TableModel("6","احسان احسانی","43546",R.drawable.example6));
        model.add(new TableModel("8","شایان شایانی","23447",R.drawable.example7));
        model.add(new TableModel("9","علی یاوری","345435",R.drawable.example8));
        model.add(new TableModel("10","صمد مرفابی","23234",R.drawable.example16));
        model.add(new TableModel("11","عباس بوعذار","45654",R.drawable.example15));
        model.add(new TableModel("12","احمد بوعذار","34636",R.drawable.example14));
        model.add(new TableModel("13","داداش بوعذار","45654",R.drawable.example12));
        model.add(new TableModel("14","کامران بوعذار","2343244",R.drawable.example17));
        model.add(new TableModel("15","علی کریمی","34636",R.drawable.example1));
        model.add(new TableModel("16","احمد احمدی","345643",R.drawable.example2));
        model.add(new TableModel("17","محمد محمدی","345435",R.drawable.example3));
        model.add(new TableModel("18","محسن داراخانی","67678",R.drawable.example4));
        model.add(new TableModel("19","کامران کامرانی","4565464",R.drawable.example5));
        model.add(new TableModel("20","احسان احسانی","3244",R.drawable.example6));
        model.add(new TableModel("21","شایان شایانی","23447",R.drawable.example7));
        model.add(new TableModel("22","علی یاوری","456546",R.drawable.example8));
        model.add(new TableModel("23","صمد مرفابی","23234",R.drawable.example16));
        model.add(new TableModel("24","عباس بوعذار","45654",R.drawable.example15));
        model.add(new TableModel("25","احمد بوعذار","4565",R.drawable.example14));
        model.add(new TableModel("26","داداش بوعذار","45654",R.drawable.example12));
        model.add(new TableModel("27","کامران بوعذار","2343244",R.drawable.example17));
        model.add(new TableModel("28","علی کریمی","456546",R.drawable.example1));
        model.add(new TableModel("29","احمد احمدی","89876",R.drawable.example2));
        model.add(new TableModel("30","محمد محمدی","756232",R.drawable.example3));
        model.add(new TableModel("31","محسن داراخانی","54654",R.drawable.example4));
        model.add(new TableModel("32","کامران کامرانی","34535",R.drawable.example5));
        model.add(new TableModel("33","احسان احسانی","3244",R.drawable.example6));
        model.add(new TableModel("34","شایان شایانی","23447",R.drawable.example7));
        model.add(new TableModel("35","علی یاوری","987821",R.drawable.example8));
        model.add(new TableModel("36","صمد مرفابی","23234",R.drawable.example16));
        model.add(new TableModel("37","عباس بوعذار","45654",R.drawable.example15));
        model.add(new TableModel("38","احمد بوعذار","542234",R.drawable.example14));
        model.add(new TableModel("39","داداش بوعذار","45654",R.drawable.example12));
        model.add(new TableModel("40","کامران بوعذار","345453",R.drawable.example17));
        return  model;
    }
    private void TableFilter(String filterText) {
        List<TableModel> FilterItem=new ArrayList<>();
        for (TableModel item:model){
            if(item.getFullName().toLowerCase().contains(filterText.toLowerCase())){
                FilterItem.add(item);
            }if (FilterItem.isEmpty()){
                //Toast.makeText(this,"موردی یافت نشد",Toast.LENGTH_SHORT).show();
                adapter.SetFilter(FilterItem);
                NotFound.setVisibility(View.VISIBLE);
            }else {
                adapter.SetFilter(FilterItem);
                NotFound.setVisibility(View.INVISIBLE);

            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}



