package com.example.application;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    public void onCreateOptionsMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);

        MenuItem item1 = menu.findItem(R.id.calendar);
        Intent intent1 = new Intent(this, CalendarActivity.class);
        item1.setIntent(intent1);


    }

    private void goCalendar() {
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }

}
