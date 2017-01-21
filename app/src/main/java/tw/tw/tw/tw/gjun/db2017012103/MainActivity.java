package tw.tw.tw.tw.gjun.db2017012103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,getResources().getString(R.string.sand));
        menu.add(0,1,1,getResources().getString(R.string.hanb));
        menu.add(0,2,2,getResources().getString(R.string.eggc));
        menu.add(1,3,3,getResources().getString(R.string.drink));
        //GroupId,ItemId,OrderId，應該用變數，不要有數字
        //怎麼用程式碼加圖示進去…

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

            Toast.makeText(MainActivity.this,item.getTitle()+""+item.getItemId(),Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
