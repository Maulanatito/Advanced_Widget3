package xirpl508172635.project.smktelkom_mlg.sch.id.advancedwidget3;

import android.databinding.DataBindingUtil;
import android.databinding.tool.DataBindingBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xirpl508172635.project.smktelkom_mlg.sch.id.advancedwidget3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    String nama;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNama(nama);
    }
}
