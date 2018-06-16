package ndk.myapplication2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class Custom_Adapter_Recycler_Activity extends ActionBarActivity {

    private RecyclerView mRecyclerView;

    private CustomAdapter_Recycler mAdapter;

    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_recycler);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mAdapter = new CustomAdapter_Recycler();

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }
}
