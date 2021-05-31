package qurban;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldi
 */
public abstract class Hewan{
    protected String pengurban;
    protected String kode;
    protected String jenis;
    protected int zakar;
    protected int umur;
    protected int bobot;
    protected boolean sehat;
    protected boolean buta;
    protected boolean pincang;
    protected boolean tandukPatah;
    protected boolean telingaRobek;
    protected boolean ekorPutus;
    protected boolean jantan;
    public boolean status;
    public abstract void cekJenis();
    public void cekUmur(){
        if(umur<24){
            status = false;
        }
    }
    public void cekBobot(){
        if(bobot<18){
            status = false;
        }
    }
    public void cekSehat(){
        if(sehat){
            status = true;
        }else{
            status = false;
        }
    }
    public void cekButa(){
        if(buta){
            status = false;
        }
    }
    public void cekPincang(){
        if(pincang){
            status = false;
        }
    }
    public void cekTandukPatah(){
        if(tandukPatah){
            status = false;
        }
    }
    public void cekTelingaRobek(){
        if(telingaRobek){
            status = false;
        }
    }
    public void cekEkorPutus(){
        if(ekorPutus){
            status = false;
        }
    }
    public void cekKelamin(){
        if(!jantan){
            status = false;
        } else {
            if(zakar==2){
                status = true;
            } else {
                status = false;
            }
        }
    }
    public String boolean2teks(boolean parameter){
        if(parameter){
            return"Ya";
        }else{
            return"Tidak";
        }
    }
    public String cekStatus(){
        String hasil = "";
        hasil+="\nPengurban    : "+pengurban+"\n\n\nKode         : "+kode+"\njenis        : "+jenis;
        cekUmur();
        hasil+="\nUsia         : "+umur+" bulan"+"\nBobot        : "+bobot+" Kilogram";
        cekSehat();
        hasil+="\nKondisi      : ";
        if(!sehat)hasil+="Tidak ";
        cekButa();
        hasil+="Sehat\nButa         : ";
        hasil+=boolean2teks(buta);
        cekPincang();
        hasil+="\nPincang      : ";
        hasil+=boolean2teks(pincang);
        cekTandukPatah();
        hasil+="\nTanduk Patah : ";
        hasil+=boolean2teks(tandukPatah);
        cekTelingaRobek();
        hasil+="\nTelinga Robek: ";
        hasil+=boolean2teks(telingaRobek);
        cekEkorPutus();
        hasil+="\nEkor Putus   : ";
        hasil+=boolean2teks(ekorPutus);
        hasil+="\nJenis Kelamin: ";
        if(jantan){
            hasil+="Jantan"+"\nBiji Zakar   : "+zakar+" buah";
        }else{
            hasil+="Betina";
        }
        hasil+="\nStatus : ";
        hasil+=boolean2teks(status);
        return hasil;
    }
}
