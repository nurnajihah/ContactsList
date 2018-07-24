package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ListView lvContacts;
   ArrayList<ContactItem> alContactList;
   CustomAdapter caList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);

        alContactList = new ArrayList<>();

        ContactItem contact1 = new ContactItem("Mary", +65, 65442334);

        ContactItem contact2 = new ContactItem("Ken", +65, 97442437);

        alContactList.add(contact1);
        alContactList.add(contact2);

        caList = new CustomAdapter(this, R.layout.contacts_item, alContactList);

        lvContacts.setAdapter(caList);

    }
}
