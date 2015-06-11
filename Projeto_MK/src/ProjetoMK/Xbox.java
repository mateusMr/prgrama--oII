/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoMK;

import javax.swing.JOptionPane;

/**
 *
 * @author MateusMalaquias
 */
public class Xbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Reptile r = new Reptile ();
        r.setChuteforte("A");
        r.setChutefraco("B");
        r.setDefesa("LT");
        r.setEspecial("LT");
        r.setSocoforte("Y");
        r.setSocofraco("X");
        r.setAgarra("RB");
       r. setTrocapersonagem("RT");
       
       
        Scorpion s = new Scorpion ();
         s.setChuteforte("A");
        s.setChutefraco("B");
        s.setDefesa("LR");
        s.setEspecial("LT");
        s.setSocoforte("Y");
        s.setSocofraco("X");
        s.setAgarra("RB");
       s. setTrocapersonagem("RT");
        
        Subzero  z = new Subzero () ;
         z.setChuteforte("A");
        z.setChutefraco("B");
        z.setDefesa("LR");
        z.setEspecial("LT");
        z.setSocoforte("Y");
        z.setSocofraco("X");
        z.setAgarra("RB");
       z. setTrocapersonagem("RT");
       
       KItana k = new KItana ();
        k.setChuteforte("A");
        k.setChutefraco("B");
        k.setDefesa("LR");
        k.setEspecial("LT");
        k.setSocoforte("Y");
        k.setSocofraco("X");
        k.setAgarra("RB");
       k. setTrocapersonagem("RT");
       
       KungLao kun = new KungLao ();
       
       kun.setChuteforte("A");
        kun.setChutefraco("B");
        kun.setDefesa("LR");
        kun.setEspecial("LT");
        kun.setSocoforte("Y");
        kun.setSocofraco("X");
        kun.setAgarra("RB");
       kun. setTrocapersonagem("RT");
       
       Raiden rai = new Raiden ();
       rai.setChuteforte("A");
        rai.setChutefraco("B");
        rai.setDefesa("LR");
        rai.setEspecial("LT");
        rai.setSocoforte("Y");
        rai.setSocofraco("X");
        rai.setAgarra("RB");
       rai. setTrocapersonagem("RT");
       
        JOptionPane.showMessageDialog(null," XBOX ");
        
       
        
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- REPTILE*********** \n"
                + "Invesivel :"+r.invesivel()+
        "\n Acido :"+r.Acido()+
                "\n Bola Lenta :"+r.Bola_lenta()+
                "\n Bola Rapida :"+r.Bola_rapida()+
                "\n Combo 1 :"+r.Combo1()+
                "\n Combo 2 :"+r.Combo2()+
                "\n Fatality1 :"+r.Fatality1()+
                "\n Fatality2 :"+r.Falality2());
        
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- SCORPION*********** \n"
                + "Spear :"+s.Spear()+
        "\n takedown :"+s.takedown()+
                "\n Teleport :"+s.teleport()+
                
                "\n Combo 1 :"+s.Combo1()+
                "\n Combo 2 :"+s.Combo2()+
                "\n Fatality1 :"+s.Fatality1()+
                "\n Fatality2 :"+s.Falality2());
        
        
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- SUB ZERO*********** \n"
                + "Slide :"+z.slide()+
        "\n Gelo chão :"+z.Gelochao()+
                "\n Gelo frente :"+z.Gelofrente()+
                
                "\n Combo 1 :"+z.Combo1()+
                "\n Combo 2 :"+z.Combo2()+
                "\n Fatality1 :"+z.Fatality1()+
                "\n Fatality2 :"+z.Falality2());
            JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- Kitana*********** \n"
                + "cortar :"+k.cortar()+
        "\n  ventania :"+k.ventania()+
                "\n voar :"+k.voar()+
                
                "\n Combo 1 :"+k.Combo1()+
                "\n Combo 2 :"+k.Combo2()+
                "\n Fatality1 :"+k.Fatality1()+
                "\n Fatality2 :"+k.Falality2());
            
                JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- Kung Lao*********** \n"
                + "giro :"+kun.giro()+
        "\n chapeu voador :"+kun.chapeuvoador()+
                "\n teleport :"+kun.teleport()+
                
                "\n Combo 1 :"+kun.Combo1()+
                "\n Combo 2 :"+kun.Combo2()+
                "\n Fatality1 :"+kun.Fatality1()+
                "\n Fatality2 :"+kun.Falality2());
                
                  JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- Raiden*********** \n"
                + "Bola de raio :"+rai.boladeraio()+
        "\n Raio frente :"+rai.raiofrente()+
                "\n teleport :"+rai.teleport()+
                
                "\n Combo 1 :"+rai.Combo1()+
                "\n Combo 2 :"+rai.Combo2()+
                "\n Fatality1 :"+rai.Fatality1()+
                "\n Fatality2 :"+rai.Falality2());
                
        
        
        
        Luta lrk = new Luta () ;
        lrk.setPersonagem1(r);
        lrk.setPersonagem2(k);
        JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n  Reptile "
        + " \n VS"
                + "\n  Kitana");
        
        
        lrk.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Reptile  :"+lrk.getPersonagem1().getVida()
        + " \n Kitana  :"+lrk.getPersonagem2().getVida());
        
        lrk.combo("p2");
        JOptionPane.showMessageDialog(null,"Personagem 2 acerta combo" );
        JOptionPane.showMessageDialog(null,"Reptile  :"+lrk.getPersonagem1().getVida()
        + " \n  Kitana :"+lrk.getPersonagem2().getVida());
        
        lrk.combo2("p2");
        JOptionPane.showMessageDialog(null,"Personagem 2 acerta combo" );
        JOptionPane.showMessageDialog(null,"Reptile  :"+lrk.getPersonagem1().getVida()
        + " \n  Kitana :"+lrk.getPersonagem2().getVida());
        
        
        Luta rk = new Luta () ;
        rk.setPersonagem1(rai);
        rk.setPersonagem2(kun);
         JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Raiden  "
        + " \n VS"
                + "\n  Kung Lao");
         
        rk.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Raiden 1 :"+rk.getPersonagem1().getVida()
        + " \n  Kung Lao :"+rk.getPersonagem2().getVida());
        
        rk.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta glope" );
        JOptionPane.showMessageDialog(null,"Raiden 1 :"+rk.getPersonagem1().getVida()
        + " \n  Kun Lao :"+rk.getPersonagem2().getVida());
        
        rk.combo2("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null," Raiden :"+rk.getPersonagem1().getVida()
        + " \n  Kung Lao :"+rk.getPersonagem2().getVida());
        
         rk.combo("p2");
        JOptionPane.showMessageDialog(null,"Personagem 2 acerta combo" );
        JOptionPane.showMessageDialog(null," Raiden :"+rk.getPersonagem1().getVida()
        + " \n  Kung Lao :"+rk.getPersonagem2().getVida());
        
        
         
        
        
        
    }
    
    
   
    
}
    
    

