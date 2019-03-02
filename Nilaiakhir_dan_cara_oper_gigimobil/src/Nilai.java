/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdityaMaulanaS
 */
public class Nilai {
        String nim,nama;
        float tgs,Uts,UAS,pTgs,pUTS,pUAS,nAkhir;
        
        void isiData(String nim,nama, float tgs,float UTS,float UAS,float pTgs,float pUts,float pUAS,float nAkhir)
        {
            this.nim=nim;
            this.nama=nama;
            this.tgs=tgs;
            this.Uts=Uts;
            this.UAS=UAS;
            this.pTgs=pTgs;
            this.pUTS=pUts;
            this.pUAS=pUAS;
            this.nAkhir=nAkhir;
        }
        void hitungNilai()
        {
            pTgs=.30f*tgs;
            pUTS=.35f*Uts;
            pUAS=.35f*UAS;
            nAkhir=pTgs+pUTS+pUAS;
        }
        
    
}
