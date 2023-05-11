package com.example.finalproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalproject.Models.Staff;
import com.example.finalproject.R;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

public class StaffAdapter extends ArrayAdapter<Staff> {

    private Context context;
    private ArrayList<Staff> staffs;

    public StaffAdapter(Context context, ArrayList<Staff> staffs) {
        super(context, 0, staffs);
        this.context = context;
        this.staffs = staffs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.staff_item, parent, false);
        }
        ImageView ivStaffAvatar = convertView.findViewById(R.id.ivStaffAvatar);
        TextView tvStaffName = convertView.findViewById(R.id.tvStaffName);
        TextView tvStaffRole = convertView.findViewById(R.id.tvStaffRole);
        ImageButton btnCheckStaff = convertView.findViewById(R.id.btnCheckStaff);

        Staff staff = staffs.get(position);
        Picasso.get().load(new File(staff.getAvatar())).into(ivStaffAvatar);
        tvStaffName.setText(staff.getLastName()+" "+staff.getFirstName());
        String role = (staff.getRole() == 0) ? "Nhân viên" : "Quản lý";
        tvStaffRole.setText(role);
        btnCheckStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle check button click event
            }
        });
        return convertView;
    }
}
