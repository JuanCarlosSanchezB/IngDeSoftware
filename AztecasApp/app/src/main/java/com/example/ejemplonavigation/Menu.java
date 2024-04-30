package com.example.ejemplonavigation;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    ArrayList<String> menuList;
    ArrayList<ArrayList<String>> subMenuList;
    public Menu(ArrayList<String> menuList, ArrayList
                <ArrayList<String>> subMenuList){
        this.menuList = menuList;
        this.subMenuList = subMenuList;

    }
}
