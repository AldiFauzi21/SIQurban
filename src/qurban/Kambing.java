/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qurban;

/**
 *
 * @author MATRIX COMPUTER
 */
public final class Kambing extends Hewan{
   public Kambing(boolean jantan, int zakar, int umur, int bobot, boolean sehat, boolean buta, boolean pincang, boolean tandukPatah, boolean telingaRobek, boolean ekorPutus, String pengurban, String count){
       super();
       jenis = "Kambing";
       kode = jenis+count;
       this.jantan = jantan;
       this.zakar = zakar;
       this.umur = umur;
       this.bobot = bobot;
       this.sehat = sehat;
       this.buta = buta;
       this.pincang = pincang;
       this.tandukPatah = tandukPatah;
       this.telingaRobek = telingaRobek;
       this.ekorPutus = ekorPutus;
       this.pengurban = pengurban;
       this.cekJenis();
       cekBobot();
       cekKelamin();
    } 
    @Override
    public void cekJenis() {
        if(!"Kambing".equals(jenis)){
            status = false;
        }
    }
}
