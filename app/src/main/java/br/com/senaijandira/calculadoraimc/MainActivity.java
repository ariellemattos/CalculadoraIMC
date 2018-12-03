package br.com.senaijandira.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtAltura, txtPeso;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAltura = findViewById(R.id.txtAltura);
        txtPeso = findViewById(R.id.txtPeso);
        txtResultado = findViewById(R.id.txtResultado);
    }

//    Metodo para calcular o IMC quando clicar no botão
    public void  calcularIMC(View v){

//        Verificar se a altura esta vazio
        if(txtAltura.getText().toString().isEmpty()){
            txtAltura.setError("Digite a altura");
            return;
        }
//        Verificar se o peso esta vazio
        if(txtPeso.getText().toString().isEmpty()){
            txtPeso.setError("Digite o peso");
//            Parar o metodo nesse ponto
            return;
        }



        Double peso = Double.parseDouble(txtPeso.getText().toString());
        Double altura = Double.parseDouble(txtAltura.getText().toString());
        Double resultado = peso/(altura*altura);
        txtResultado.setText("Seu IMC é:" + resultado);
;    }
}
