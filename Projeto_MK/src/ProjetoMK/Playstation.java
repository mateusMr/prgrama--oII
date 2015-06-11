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
public class Playstation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        Reptile r = new Reptile ();
        r.setChuteforte( "Bolinha");
        r.setChutefraco("X");
        r.setDefesa("R2");
        r.setEspecial("R3");
        r.setSocoforte("Quadrado");
        r.setSocofraco("Triangulo");
        r.setAgarra("L1");
        r.setTrocapersonagem("L2");
        
        Scorpion s = new Scorpion ();
         s.setChuteforte( "Bolinha");
        s.setChutefraco("X");
        s.setDefesa("R2");
        s.setEspecial("R3");
        s.setSocoforte("Quadrado");
        s.setSocofraco("Triangulo");
        s.setAgarra("L1");
        s.setTrocapersonagem("L2");
        
        Subzero z = new Subzero () ;
         z.setChuteforte( "Bolinha");
        z.setChutefraco("X");
        z.setDefesa("R2");
        z.setEspecial("R3");
        z.setSocoforte("Quadrado");
        z.setSocofraco("Triangulo");
        z.setAgarra("L1");
       z.setTrocapersonagem("L2");
        JOptionPane.showMessageDialog(null," PLAYSTATION ");
       
        
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS ----- REPTILE*********** \n"
                + "Invesivel :"+r.invesivel()+
        "\n Acido :"+r.Acido()+
                "\n Bola Lenta :"+r.Bola_lenta()+
                "\n Bola Rapida :"+r.Bola_rapida()+
                "\n Combo 1 :"+r.Combo1()+
                "\n Combo 2 :"+r.Combo2()+
                "\n Fatality1 :"+r.Fatality1()+
                "\n Fatality2 :"+r.Falality2());
        
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- SUB ZERO*********** \n"
                + "Slide :"+z.slide()+
        "\n Gelo chão :"+z.Gelochao()+
                "\n Gelo frente :"+z.Gelofrente()+
                
                "\n Combo 1 :"+z.Combo1()+
                "\n Combo 2 :"+z.Combo2()+
                "\n Fatality1 :"+z.Fatality1()+
                "\n Fatality2 :"+z.Falality2());
        
         
        JOptionPane.showMessageDialog(null," \n************* COMANDOS ESPECIAS --- SCORPION*********** \n"
                + "Spear :"+s.Spear()+
        "\n takedown :"+s.takedown()+
                "\n Teleport :"+s.teleport()+
                
                "\n Combo 1 :"+s.Combo1()+
                "\n Combo 2 :"+s.Combo2()+
                "\n Fatality1 :"+s.Fatality1()+
                "\n Fatality2 :"+s.Falality2());
        
        
        Luta lutars = new Luta () ;
        lutars.setPersonagem1(r);
        lutars.setPersonagem2(s);
        
        
        lutars.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null," Reptile :"+lutars.getPersonagem1().getVida()
        + " \n  Scorpion :"+lutars.getPersonagem2().getVida());
        
        lutars.combo("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Reptile  :"+lutars.getPersonagem1().getVida()
        + " \n  Scorpion :"+lutars.getPersonagem2().getVida());
        
        lutars.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null," Reptile :"+lutars.getPersonagem1().getVida()
        + " \n  Scorpion :"+lutars.getPersonagem2().getVida());
        
        
        Luta lrsb = new Luta () ;
         lrsb.setPersonagem1(r);
        lrsb.setPersonagem2(z);
           JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Reptile "
        + " \n VS"
                + "\n Sub zero");
         lrsb.golpe("p2");
         
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null," Reptile :"+lrsb.getPersonagem1().getVida()
        + " \n  Sub zero :"+lrsb.getPersonagem2().getVida());
        
        lrsb.combo("p2");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null," Reptile :"+lrsb.getPersonagem1().getVida()
        + " \n  Sub zero :"+lrsb.getPersonagem2().getVida());
        
        lrsb.golpe("p2");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null," Reptile :"+lrsb.getPersonagem1().getVida()
        + " \n  sub zero :"+lrsb.getPersonagem2().getVida());
        
        Luta lrr = new Luta () ;
        lrr.setPersonagem1(r);
        lrr.setPersonagem2(r);
        JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Reptile "
        + " \n VS"
                + "\n Reptile");
         lrr.golpe("p1");
         
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Reptile 1 :"+lrr.getPersonagem1().getVida()
        + " \n reptile 2 :"+lrr.getPersonagem2().getVida());
        
        lrr.combo("p2");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Reptile 1 :"+lrr.getPersonagem1().getVida()
        + " \n Reptile 2 :"+lrr.getPersonagem2().getVida());
        
        lrr.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Reptile 1 :"+lrr.getPersonagem1().getVida()
        + " \n Reptile 2 :"+lrr.getPersonagem2().getVida());
        
        Luta lsz = new Luta ();
        lsz.setPersonagem1(s);
        lsz.setPersonagem2(z);
         JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Scorpion "
        + " \n VS"
                + "\n Sub Zero");
         
          lsz.golpe("p1");
         
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Scorpion  :"+lsz.getPersonagem1().getVida()
        + " \n Sub zero  :"+lsz.getPersonagem2().getVida());
        
        lsz.combo("p2");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Scorpion  :"+lsz.getPersonagem1().getVida()
        + " \n  Sub zero :"+lsz.getPersonagem2().getVida());
        
        lsz.golpe("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta golpe" );
        JOptionPane.showMessageDialog(null,"Scorpion  :"+lsz.getPersonagem1().getVida()
        + " \n  Sub zero :"+lsz.getPersonagem2().getVida());
        
        
      
        
        Luta lss = new Luta () ;
 
        lss.setPersonagem1(s);
        lss.setPersonagem2(s);
         JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Scorpion "
        + " \n VS"
                + "\n Scorpion");
         
          lss.combo("p1");
         
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Scorpion 1 :"+lss.getPersonagem1().getVida()
        + " \n Scorpion 2 :"+lss.getPersonagem2().getVida());
        
        lss.combo("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Scorpion 1 :"+lss.getPersonagem1().getVida()
        + " \n Scorpion 2 :"+lss.getPersonagem2().getVida());
        
        lss.combo("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Scorpion 1 :"+lss.getPersonagem1().getVida()
        + " \n Scorpion 2 :"+lss.getPersonagem2().getVida());
        
        Luta lzz = new Luta () ;
        lzz.setPersonagem1(z);
        lzz.setPersonagem2(z);
         JOptionPane.showMessageDialog(null,"********* LUTA *********"
                + "\n Sub zero "
        + " \n VS"
                + "\n Sub zero");
         
          lzz.combo("p1");
         
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta comob" );
        JOptionPane.showMessageDialog(null,"Sub zero 1 :"+lzz.getPersonagem1().getVida()
        + " \n Sub zero 2 :"+lzz.getPersonagem2().getVida());
        
        lzz.combo("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Sub zero 1 :"+lzz.getPersonagem1().getVida()
        + " \n Sub zero 2 :"+lzz.getPersonagem2().getVida());
        
        lzz.combo("p1");
        JOptionPane.showMessageDialog(null,"Personagem 1 acerta combo" );
        JOptionPane.showMessageDialog(null,"Sub zero 1 :"+lzz.getPersonagem1().getVida()
        + " \n Sub zero 2 :"+lzz.getPersonagem2().getVida());
    }
    
}
