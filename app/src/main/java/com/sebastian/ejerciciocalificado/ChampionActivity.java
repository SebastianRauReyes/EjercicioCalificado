package com.sebastian.ejerciciocalificado;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChampionActivity extends AppCompatActivity {

    @BindView(R.id.name) TextView name;
    @BindView(R.id.spinner) Spinner spinner;
    @BindView(R.id.imageview) ImageView imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champion);
        ButterKnife.bind(this);

    }

    @SuppressLint("SetTextI18n")

    public void buscar(View view){

        switch (spinner.getSelectedItem().toString()) {
            case "Bomb King":
                imagen.setImageResource(R.drawable.img_bk);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("His Majesty");
                break;
            case "Tyra":
                imagen.setImageResource(R.drawable.img_tyra);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("The Untamed");
                break;
            case "Moji":
                imagen.setImageResource(R.drawable.img_moji);
                Toast.makeText(this, "Flank champion", Toast.LENGTH_SHORT).show();
                name.setText("and Friends");
                break;
            case "Terminus":
                imagen.setImageResource(R.drawable.img_terminus);
                Toast.makeText(this, "Frontline champion", Toast.LENGTH_SHORT).show();
                name.setText("The Fallen");
                break;
            case "Drogoz":
                imagen.setImageResource(R.drawable.img_drogoz);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("The Greedy");
                break;
            case "Grohk":
                imagen.setImageResource(R.drawable.img_grohk);
                Toast.makeText(this, "Support champion", Toast.LENGTH_SHORT).show();
                name.setText("\tThe Lightning Orc");
                break;
            case "Mal'Damba":
                imagen.setImageResource(R.drawable.img_maldamba);
                Toast.makeText(this, "Support champion", Toast.LENGTH_SHORT).show();
                name.setText("Wekono's Chosen");
                break;
            case "Seris":
                imagen.setImageResource(R.drawable.img_seris);
                Toast.makeText(this, "Support champion", Toast.LENGTH_SHORT).show();
                name.setText("Oracle of the Abyss");
                break;
            case "Sha lin":
                imagen.setImageResource(R.drawable.img_shalin);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("The Desert Wind");
                break;
            case "Torvald":
                imagen.setImageResource(R.drawable.img_torvald);
                Toast.makeText(this, "Frontline champion", Toast.LENGTH_SHORT).show();
                name.setText("The Runic Sage");
                break;
            case "Vivian":
                imagen.setImageResource(R.drawable.img_vivian);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("The Cunning");
                break;
            case "Strix":
                imagen.setImageResource(R.drawable.img_strix);
                Toast.makeText(this, "Damage champion", Toast.LENGTH_SHORT).show();
                name.setText("Ghost Feather");
                break;

        }

    }
}
