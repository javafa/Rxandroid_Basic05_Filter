package com.kodonho.android.rxandroid_basic05_filter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rx.Observable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Integer dataset[] = {1,2,3,1,4,5,3,6,7,8,7,5,9};
    Button btnFilter,btnFor,btnFirst,btnLast,btnDistinct,btnTake,btnGroup;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);

        btnFilter = (Button)findViewById(R.id.btnFilter);
        btnFor = (Button)findViewById(R.id.btnFor);
        btnFirst = (Button)findViewById(R.id.btnFirst);
        btnLast = (Button)findViewById(R.id.btnLast);
        btnDistinct = (Button)findViewById(R.id.btnDistinct);
        btnTake = (Button)findViewById(R.id.btnTake);
        btnGroup = (Button)findViewById(R.id.btnGroup);

        btnFilter.setOnClickListener(this);
        btnFor.setOnClickListener(this);
        btnFirst.setOnClickListener(this);
        btnLast.setOnClickListener(this);
        btnDistinct.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        btnGroup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnFilter:
                filter();
                break;
            case R.id.btnFor:
                foreach();
                break;
            case R.id.btnFirst:
                first();
                break;
            case R.id.btnLast:
                last();
                break;
            case R.id.btnDistinct:
                distinct();
                break;
            case R.id.btnTake:
                take();
                break;
            case R.id.btnGroup:
                groupby();
                break;
        }
    }

    public void filter(){
        Observable.from(dataset)
        .filter(item -> item%2 == 0)
        .subscribe(
                result -> System.out.println(result)
        );
    }
    public void take(){

    }
    public void foreach(){

    }
    public void distinct(){

    }
    public void first(){

    }
    public void last(){

    }
    public void groupby(){

    }
}
