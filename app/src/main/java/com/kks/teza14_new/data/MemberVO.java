package com.kks.teza14_new.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 10/4/2017.
 */

@Entity(tableName = "member")
public class MemberVO {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    int id;

    String name,bc_no,own_no,school_no,spouse_name,children_name,address,work,ph_no,note;


    MemberVO(String name, String bc_no, String own_no, String school_no, String spouse_name, String children_name, String address, String work, String ph_no, String note){
        this.name=name;
        this.bc_no=bc_no;
        this.own_no=own_no;
        this.school_no=school_no;
        this.spouse_name=spouse_name;
        this.children_name=children_name;
        this.address=address;
        this.work=work;
        this.ph_no=ph_no;
        this.note=note;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public  void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setBc_no(String bc_no){
        this.bc_no=bc_no;
    }

    public String getBc_no(){
        return bc_no;
    }

    public void setOwn_no(String own_no){
        this.own_no=own_no;
    }

    public String getOwn_no(){
        return own_no;
    }

    public void setSchool_no(String school_no){
        this.school_no=school_no;
    }

    public String getSchool_no(){
        return school_no;
    }

    public void setSpouse_name(String spouse_name){
        this.spouse_name=spouse_name;
    }

    public String getSpouse_name(){
        return spouse_name;
    }

    public void setChildren_name(String children_name){
        this.children_name=children_name;
    }

    public String getChildren_name(){
        return children_name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setWork(String work){
        this.work=work;
    }

    public String getWork(){
        return work;
    }

    public void setPh_no(String ph_no){
        this.ph_no=ph_no;
    }

    public String getPh_no(){
        return ph_no;
    }

    public void setNote(String note){
        this.note=note;
    }

    public String getNote(){
        return note;
    }

}
