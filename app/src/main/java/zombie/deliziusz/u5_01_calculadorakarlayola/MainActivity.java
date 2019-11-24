package zombie.deliziusz.u5_01_calculadorakarlayola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean deci =false;
    boolean suma =false;
    boolean resta =false;
    boolean mul =false;
    boolean divi =false;
    String mostrar;
    Double[] numero=new Double[20];
    Double dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0=(Button)findViewById(R.id.btn0);
       btn0.setOnClickListener(this);
        Button btn1=(Button)findViewById(R.id.btn1);
       btn1.setOnClickListener(this);
        Button btn2=(Button)findViewById(R.id.btn2);
       btn2.setOnClickListener(this);
        Button btn3=(Button)findViewById(R.id.btn3);
       btn3.setOnClickListener(this);
        Button btn4=(Button)findViewById(R.id.btn4);
       btn4.setOnClickListener(this);
        Button btn5=(Button)findViewById(R.id.btn5);
       btn5.setOnClickListener(this);
        Button btn6=(Button)findViewById(R.id.btn6);
       btn6.setOnClickListener(this);
        Button btn7=(Button)findViewById(R.id.btn7);
       btn7.setOnClickListener(this);
        Button btn8=(Button)findViewById(R.id.btn8);
       btn8.setOnClickListener(this);
        Button btn9=(Button)findViewById(R.id.btn9);
       btn9.setOnClickListener(this);
        Button btnMas=(Button)findViewById(R.id.btnMas);
       btnMas.setOnClickListener(this);
        Button btnMenos=(Button)findViewById(R.id.btnMenos);
       btnMenos.setOnClickListener(this);
        Button btnMul=(Button)findViewById(R.id.btnMul);
       btnMul.setOnClickListener(this);
        Button btnDivi=(Button)findViewById(R.id.btnDivi);
        btnDivi.setOnClickListener(this);

        //Punto
        Button btnPunto=(Button)findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(this);

        //Botón de borrarTodo
        Button btnCE=(Button)findViewById(R.id.btnCE);
       btnCE.setOnClickListener(this);

        //Botón de borrar1
        Button btnBorrar = (Button)findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(this);

        //Botón igual
        Button btnIgual=(Button)findViewById(R.id.btnIgual);
       btnIgual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView txtCajita =(TextView)findViewById(R.id.txtCajita);
        int selector=v.getId();
        String tex= txtCajita.getText().toString();

        try{
            switch(selector){
                case R.id.btn0:
                    txtCajita.setText(tex+"0");
                    break;
                case R.id.btn1:
                    txtCajita.setText(tex+"1");
                    break;
                case R.id.btn2:
                    txtCajita.setText(tex+"2");
                    break;
                case R.id.btn3:
                    txtCajita.setText(tex+"3");
                    break;
                case R.id.btn4:
                    txtCajita.setText(tex+"4");
                    break;
                case R.id.btn5:
                    txtCajita.setText(tex+"5");
                    break;
                case R.id.btn6:
                    txtCajita.setText(tex+"6");
                    break;
                case R.id.btn7:
                    txtCajita.setText(tex+"7");
                    break;
                case R.id.btn8:
                    txtCajita.setText(tex+"8");
                    break;
                case R.id.btn9:
                    txtCajita.setText(tex+"9");
                    break;
                case R.id.btnMas:
                    suma=true;
                    numero[0]=Double.parseDouble(tex);
                    txtCajita.setText("");
                    deci=false;
                    break;
                case R.id.btnMenos:
                    resta=true;
                    numero[0]=Double.parseDouble(tex);
                    txtCajita.setText("");
                    deci=false;
                    break;
                case R.id.btnMul:
                    mul=true;
                    numero[0]=Double.parseDouble(tex);
                    txtCajita.setText("");
                    deci=false;
                    break;
                case R.id.btnDivi:
                    divi=true;
                    numero[0]=Double.parseDouble(tex);
                    txtCajita.setText("");
                    deci=false;
                    break;
                case R.id.btnCE:
                    txtCajita.setText("");
                    deci=false;
                    break;
                case R.id.btnIgual:
                    numero[1]=Double.parseDouble(tex);
                    if(suma==true){
                        dato=numero[0]+numero[1];
                        txtCajita.setText(String.valueOf(dato));
                    }else if(resta==true){
                        dato=numero[0]-numero[1];
                        txtCajita.setText(String.valueOf(dato));
                    }else if(mul==true){
                        dato=numero[0]*numero[1];
                        txtCajita.setText(String.valueOf(dato));
                    }else if(divi==true){
                        dato=numero[0]/numero[1];
                        txtCajita.setText(String.valueOf(dato));
                    }
                    deci=false;
                    suma=false;
                    resta=false;
                    mul=false;
                    divi=false;

                    break;
                case R.id.btnPunto:
                    if(deci==false){
                        txtCajita.setText(tex+".");
                        deci=true;
                    }else{
                        return;
                    }
                    break;

                case R.id.btnBorrar:
                    mostrar = txtCajita.getText().toString();
                    mostrar = mostrar.substring(0, mostrar.length()-1);
                    txtCajita.setText(mostrar);
            }

        }catch(Exception e){

        }

    }
}
