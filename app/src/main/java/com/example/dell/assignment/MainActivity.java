package com.example.dell.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<Person> person=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input of name and number
        person.add(new Person("Amad Butt","03365002142"));
        person.add(new Person("Azam Khan","03365343434"));
        person.add(new Person("Bashir Ali","03465002141"));
        person.add(new Person("Bushara Ansari","033150342142"));
        person.add(new Person("Colin Khan","03001342141"));
        person.add(new Person("Careem Ali","03165342243"));
        person.add(new Person("Dawood Khan","03465002164"));
        person.add(new Person("Dharmendar Kumar","03314002151"));
        person.add(new Person("Elesa Chaurdary","03337702142"));
        person.add(new Person("Elvis Shahid","03463122935"));
        person.add(new Person("Fatimah Ali","03439739854"));
        person.add(new Person("Fawad Khan","03019739753"));
        person.add(new Person("Gul Nabi","03239739235"));
        person.add(new Person("Gufaran Rehman","03339639854"));
        person.add(new Person("Hammad Arif","03315002141"));
        person.add(new Person("Haimna Yosuf","03265102679"));
        person.add(new Person("Imra Zareef","03065802213"));
        person.add(new Person("Imran Khan","03325102285"));
        person.add(new Person("Junaid Ali","03335002141"));
        person.add(new Person("Jafra Abbssi","03461232789"));
        person.add(new Person("Kulsum Bibi","03306822572"));
        person.add(new Person("Kashif Zia","03464822149"));
        person.add(new Person("Lalulna Khan","03460752028"));
        person.add(new Person("Lashari Chaudary","03011342142"));
        person.add(new Person("Mehwish Hiyat","03412352143"));
        person.add(new Person("Munna Haseen","03463122402"));
        person.add(new Person("Nasurallah Kakar","03322162406"));
        person.add(new Person("Naila Gul","03425102509"));
        person.add(new Person("Osmama Suliman","03479903140"));
        person.add(new Person("Omer Ali","03469802158"));
        person.add(new Person("Parveen Kumar","03015892208"));
        person.add(new Person("Pelwesha Aslam","03439639725"));
        person.add(new Person("Qurtalain Baloch","03027522846"));
        person.add(new Person("Qabeel Arif","03361232710"));
        person.add(new Person("Rashan Khan","03311231431"));
        person.add(new Person("Rauf Ali","03021342542"));
        person.add(new Person("Sharheen Rehman","03468564561"));
        person.add(new Person("Shabeer Ahmed","03265002147"));
        person.add(new Person("Taufeeq Umar","03434502407"));
        person.add(new Person("Tallah Dar","03464492149"));
        person.add(new Person("Umair Jaswal","03115621230"));
        person.add(new Person("Umar Amin","03022162123"));
        person.add(new Person("Vinod Khanna","03422162713"));
        person.add(new Person("Veena Khan","03074562418"));
        person.add(new Person("Waseef ahmed","02145452552"));
        person.add(new Person("Waseef qasim","02215654854"));
        person.add(new Person("Xavier Naseeb","03210962840"));
        person.add(new Person("Xavi Hernades","03467032714"));
        person.add(new Person("Yousuf Raza","03234402741"));
        person.add(new Person("Yasir Shah","03434852412"));

        person.add(new Person("Zaheer waqas","36254215784"));
        person.add(new Person("Zaheer UdDin","03439739854"));
        ListAdapter listAdapter=new CustomizedList(this,person);



        ListView listView1=(ListView) findViewById(R.id.Listviiew1);
        listView1.setAdapter(listAdapter);


        //Event Listener being used to get to next activity
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name= person.get(position).getName();


                Intent detailView=new Intent(MainActivity.this,ContactDetails.class);
                detailView.putExtra("Haamad", person.get(position));
                startActivity(detailView);
            }

        });



    }


}
