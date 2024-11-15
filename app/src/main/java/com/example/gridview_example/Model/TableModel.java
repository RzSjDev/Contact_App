package com.example.gridview_example.Model;

import android.widget.ImageView;

public class TableModel {
    String Row;
    String FullName;
    String NationalCode;
    int ImageView;

    public TableModel(String row, String fullName, String nationalCode, int imageView) {
        Row = row;
        FullName = fullName;
        NationalCode = nationalCode;
        ImageView = imageView;
    }

    public String getRow() {
        return Row;
    }

    public String getFullName() {
        return FullName;
    }

    public String getNationalCode() {
        return NationalCode;
    }

    public int getImageView() {
        return ImageView;
    }

}
