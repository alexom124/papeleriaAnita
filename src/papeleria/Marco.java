
package papeleria;

import java.awt.*;

import javax.swing.*;


class Marco extends JFrame{
    
    public Marco(){
    
        
        LaminaPrincipal milamina= new LaminaPrincipal();
        setBounds(250,300,450,500);
        setVisible(true);
       add(milamina);
       
       
       
    }
}
class LaminaPrincipal extends JPanel{

    public LaminaPrincipal(){
        
        ///<<<<<<<<<<<------------DISEÑO GRID-LAYOUT Y BORDER-LAYOUT--------------------------------
    
      
        this.setLayout(new BorderLayout());  //establecemos que esta lamina(LaminaPrincipal) sera un borderLayout
        
        
        JPanel panel1=new JPanel();  //panel del gridlayout
        
        
        JPanel panelGL1=new JPanel();  //subpanel del gridlayout 1,1
        
        panel1.setLayout(new GridLayout(3,1));
        JLabel label1= new JLabel("INVENTARIO");  //Creamos un label
       panelGL1.add(label1);    //agregamos el subpanel a el panel 1
       panel1.add(panelGL1); //agregado (1,1)
        
       add(panel1,BorderLayout.CENTER);//agregamos el panel1 al centro de LaminaPrincipal(donde no encontramos)
       
       
       JPanel panelGL2=new JPanel();  //subpanel del gridlayout 1,2
       
       Box cajah1=Box.createHorizontalBox(); //creamos caja 1, elemento del subpanel 1,2
       Box cajah2=Box.createHorizontalBox(); //creamos caja 2, elemento del subpanel 1,2
       
       ImageIcon iconoAgregar=new ImageIcon("Imagenes/Incrementar.png"); //creamos icono de boton agregar
       ImageIcon iconoLupa=new ImageIcon("Imagenes/Lupa.png"); //creamos icono de boton agregar
       JButton botonAgregar= new JButton("agregar",iconoAgregar);    //creamos botonAgregar
       JButton botonConsultar= new JButton("Consultar",iconoLupa);    //creamos botonConsultar
       
       cajah1.add(botonAgregar); //agregamos el boton agregar a la caja 1
       cajah1.add(Box.createHorizontalStrut(50));  //creamos strut con espacio de 50
       
       cajah2.add(botonConsultar); //agregamos boton consultar a caja 2
       
       panelGL2.add(cajah1);  //agregamos caja 1 a subpanel 1,2
       panelGL2.add(cajah2); //agregamos caja 2 a subpanel 1,2
       
        panel1.add(panelGL2); //agregado (1,1)
       
       
       
       JPanel panel2=new JPanel();  //creamos panel2
       
       JButton cerrarSesion=new JButton("cerrarsesion"); //creamos boton cerrar sesion
       panel2.add(cerrarSesion);  //lo agregamos al panel 2
       
       
       
       add(panel2,BorderLayout.SOUTH);  //lo agregamos al sur, del panel LaminaPrincipal(donde nos encontramos)
}
}