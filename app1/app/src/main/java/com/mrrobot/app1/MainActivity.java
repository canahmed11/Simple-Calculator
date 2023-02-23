package com.mrrobot.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Burada temel olarak kullanıcıdan 2 sayı alacağız ve 4 işleme tabi tutacağız.
       2 sayıyı alabilmek için EditText'e ihtiyacımız var. 4 işlemi yaptıktan sonra sonucu kullanıcıya gösterebilmek için TextView' e ihtiyacımız var.
       O sebeple onları burada tanımlamamız gerekiyor.
    */
    EditText editText1;//Bütün metodlarda kullanabilmek için ilk olarak burada tanımladık.
    EditText editText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {//onCreate metodu uygulama ilk açıldığında çalışır.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        resultText=findViewById(R.id.resultText);
        /* Bunları burada tanımladık fakat içinde yazan değerleri almadık.
           onCreate metodunda almadık çünkü uygulamaya giriş yapıldığında değil,
           kullanıcı butona tıkladığında verileri almak istiyoruz.
        */

    }





    // Not: Buton eklediğimiz zaman mutlaka onClick metod ismi vermeliyiz.Xml kısmında veya ana ekranda.
    // Metodları MainActivity class'ının içinde ve onCreate metodunun dışında tanımlamalıyız.
    public void topla(View view){//Parametre olarak View kısmından çağrılacağı için View view veriyoruz.Hata verirse View kısmına gelip alt+enter yapmalıyız.
        if(!editText1.getText().toString().matches("")&&!editText2.getText().toString().matches("")){
            /*Yukarıda tanımladık ama verileri burada stringe çevirerek aldık.
          Fakat biz 4 işlem yapacağımız için integer'a çevirmeliyiz. O sebeple parseInt metodunu kullanarak
            integer'a çevirdik.
         */
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result=number1+number2;
            resultText.setText("Result: "+result);//Burada result değişkenini direk veremiyoruz yoksa uygulama çöker. Çünkü setText bizden string istiyor.
            //Bir string yazıp ardından int değişken yazarsak bizim yerimize otomatik olarak string'e çevirir.
        }else{
            resultText.setText("Lütfen boş bırakmayınız...");
        }
        }

    public void cikar(View view){
        if(!editText1.getText().toString().matches("")&&!editText2.getText().toString().matches("")){
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result=number1-number2;
            resultText.setText("Result: "+result);
        }else{
            resultText.setText("Lütfen boş bırakmayınız...");
        }

    }

    public void carp(View view){
        if(!editText1.getText().toString().matches("")&&!editText2.getText().toString().matches("")){
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result=number1*number2;
            resultText.setText("Result: "+result);
        }else{
            resultText.setText("Lütfen boş bırakmayınız...");
        }

    }

    public void bol(View view){
        if(!editText1.getText().toString().matches("")&&!editText2.getText().toString().matches("")){
            int number1=Integer.parseInt(editText1.getText().toString());
            int number2=Integer.parseInt(editText2.getText().toString());
            int result=number1/number2;
            resultText.setText("Result: "+result);
        }else{
            resultText.setText("Lütfen boş bırakmayınız...");
        }

    }

    /* activity_main.xml kısmında EditText'lerin input type'ını number yaparsak daha iyi olur.
        Çünkü string girersek uygulama çöker.
     */

}