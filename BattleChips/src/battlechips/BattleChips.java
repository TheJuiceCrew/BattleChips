/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;

/**
 *
 * @author paulo
 */
public class BattleChips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Table t= new Table (Table.FÁCIL,new Player());
        t.imprimeStatus();
        System.out.println("");
        t.InserirChip(Table.VERTICAL, 6, 8, ChipPiece.BOTAO);
        t.imprimeStatus();
        
       
    }
    
}
