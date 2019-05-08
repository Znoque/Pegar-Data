/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Znoque
 */
public class principal {
    public static void main(String[] args) {
        ManipulandoData Mdata = new ManipulandoData();
        String data = Mdata.getDataFormatada();
        String dia = Mdata.getDiaSemana();
        
        System.out.println("DATA: "+data+"\nDIA: "+dia);
    }
}
