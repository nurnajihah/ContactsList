package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.contactslist.R;

/**
 * Created by 17010475 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactItem> ContactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ContactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhoneNum);
        ContactItem currentItem = ContactList.get(position);
        int phonenum = currentItem.getPhoneNum();
        int country = currentItem.getCountryCode();
        tvName.setText(currentItem.getName());
        tvPhone.setText(String.valueOf(phonenum));
        tvCode.setText(String.valueOf(country));
        return rowView;
    }
}




