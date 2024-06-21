package com.mycompany.financaspessoa.classes;
public class Rendimentos {
    // porcentagem de rendimentos mensais
   private float popança = 0.0063f; 
   private float RDB = 0.0105f;
   private float tesourodireto = 0.0096f;
   private float IPCA = 0.006f+0.0005f;
   private float LCI = 0.0067f;

    public float getPopança() {
        return popança;
    }

    public float getRDB() {
        return RDB;
    }

    public float getTesourodireto() {
        return tesourodireto;
    }

    public float getIPCA() {
        return IPCA;
    }

    public float getLCI() {
        return LCI;
    }
   
}
