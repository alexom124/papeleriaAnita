
package papeleria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;



 class MenuMarco extends JFrame{
    
     
     public MenuMarco(){
     
       LaminaMenu milamina = new LaminaMenu();
        setBounds(250, 250, 500, 400);
        setVisible(true);
        add(milamina);
}
 }

 /*
class LaminaMenu extends JPanel  {
    
   String productos[]={"Lapices","Boligrafos","Borradores","Marcatextos","Cuaderno","Cajadecolores","Prit","paquete100dehojas"};
    double precios[]={5.0, 4.0, 2.5, 15.0, 25.0, 42.5, 8.0, 199.0 };
    
    DefaultTableModel tabla = new DefaultTableModel();//creamos modelo de tabla
    
    ArrayList<Venta> listaVenta= new ArrayList<Venta>(); //creamos arreglo tipo Venta
    
    double precio=0;
    int cantidad=0;
    
    public LaminaMenu(){
    
 
      
      
     
      
      JTable tblProductos= new JTable(tabla);
       
      
       lblPrecioUnitario= new JLabel(" ");
       
       
       
       lblPrecioTotal= new JLabel(" ");
       
       tabla.addColumn("Producto");
       tabla.addColumn("Precio unitario");
       tabla.addColumn("Cantidad");
      tabla.addColumn("Importe");
       
       lblSubtotal=new JLabel("");
      lblIva=new JLabel("");
       lblTotal=new JLabel("");
       
       
       
       JButton btnAgregar= new JButton("+"); //instanciamos botonAgregar
       
       
       //instanciar y agregar eventos
     /*  
        EventoCombo eventoCB = new EventoCombo(); //instanciamos EventoCombo
      
      cboProductos.addActionListener(eventoCB); //asignamos eventoCB
      
      EventoSpinner eventoSpin= new EventoSpinner(); //instanciamos evento spinner y creamos constructor de este
      
      spinnerCantidad.addChangeListener(eventoSpin); //definimos evento a spinnerCantidad
      
      EventoBoton eventoBtn= new EventoBoton(); //instanciomos EventoBoton
      
      btnAgregar.addActionListener(eventoBtn); //asignamos evento a boton
       
       */
/*
     cboProductos= new JComboBox();  
     
         DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos); //creamos modelo y asignamos arreglo productos
      cboProductos.setModel(comboModel); //asignamos modelo a comboBox
    }
    
    
     private JComboBox<String> cboProductos; //creamos comboBox
    
    //etiquetas dinamicas
    private JLabel lblPrecioUnitario;
    private JLabel lblPrecioTotal;
    private JLabel lblSubtotal;
    private JLabel lblIva;
    private JLabel lblTotal;
    
    //etiquetas estaticas
    private JLabel labelProductos;
    private JLabel labelCantidad;
    private JLabel labelPrecioUnitario;
    private JLabel labelPrecioTotal;
    private JLabel labelSubtotal;
    private JLabel labelIva;
    private JLabel labelTotal;
    
    //componentes SWING
    private JSpinner spinnerCantidad;
    private JButton btnAgregar;
    private JTable tblProductos;
    
}
*/


class LaminaMenu extends JPanel  {
    
    String productos[]={"Lapices","Boligrafos","Borradores","Marcatextos","Cuaderno","Caja de colores","Prit","paquete 100 de hojas"};
    double precios[]={5.0, 4.0, 2.5, 15.0, 25.0, 42.5, 8.0, 199.0 };
    
    DefaultTableModel tabla = new DefaultTableModel();//creamos modelo de tabla
    
    ArrayList<Venta> listaVenta= new ArrayList<Venta>(); //creamos arreglo tipo Venta
    
    double precio=0;
    int cantidad=0;
    
    
    public LaminaMenu(){
    
        
        
        
        
        
       // panelA.add(panel1);
        
    //    panel1.add(this,BorderLayout.CENTER);
        
        
       tblProductos= new JTable(tabla);   
       btnAgregar= new JButton("+"); //instanciamos botonAgregar
      cboProductos= new JComboBox<String>();
       spinnerCantidad= new JSpinner();
      
    
      DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos); //creamos modelo y asignamos arreglo productos
      cboProductos.setModel(comboModel); //asignamos modelo a comboBox
      
     
      
      
       
       lblIva= new JLabel(" ");
       lblPrecioTotal= new JLabel(" ");
       lblPrecioUnitario= new JLabel(" ");
       lblSubtotal= new JLabel(" ");
       lblTotal= new JLabel(" ");
    
       
        
       
       tabla.addColumn("Producto");
       tabla.addColumn("Precio unitario");
       tabla.addColumn("Cantidad");
       tabla.addColumn("Importe");
       
      labelProductos= new JLabel("Productos: ");
      labelCantidad= new JLabel("Cantidad: ");
      labelIva=new JLabel("Iva: ");
      labelPrecioTotal=new JLabel("Precio Total: ");
      labelPrecioUnitario=new JLabel("Precio: ");
      labelSubtotal=new JLabel("Subtotal: ");
      labelTotal=new JLabel("Total: ");
      
       
      
       
        
        
        //// LAYOUTS
        
        this.setLayout(new BorderLayout());
        
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(3,1));
        
        JLabel labelTitulo= new JLabel("PAPELERIA ANITA");
        JPanel panelTitulo= new JPanel();
        panelTitulo.add(labelTitulo);
        
        add(panelTitulo,BorderLayout.NORTH);
        
        
        JPanel panel1= new JPanel();
        panel1.setLayout(new GridLayout(1,2));
        
        JPanel panelA= new JPanel();
        
        Box cajaA1=Box.createVerticalBox();
        cajaA1.add(labelProductos);
        cajaA1.add(labelCantidad);
        
         
        
         Box cajaA2=Box.createVerticalBox();
        cajaA2.add(cboProductos);
        cajaA2.add(spinnerCantidad);
        
        JPanel panelB= new JPanel();
        
        Box cajaB1=Box.createVerticalBox();
        cajaB1.add(labelPrecioUnitario);
        cajaB1.add(labelPrecioTotal);
        
        
         Box cajaB2=Box.createVerticalBox();
         
        cajaB2.add(lblPrecioUnitario);
        cajaB2.add(lblPrecioTotal);
        
       
       
       
        
        panelA.add(cajaA1);
        panelA.add(cajaA2);
        panelB.add(cajaB1);
        panelB.add(cajaB2);
        
        panel1.add(panelA);
        panel1.add(panelB);
       
        panel.add(panel1);
        
        //panel 2
        JPanel panel2=new JPanel();
        
        panel2.add(tblProductos);
        panel2.add(btnAgregar);
        
        panel.add(panel2);
        
        //panel3
        JPanel panel3=new JPanel();
        
        Box cajaA3= Box.createVerticalBox();
        cajaA3.add(labelSubtotal);
        cajaA3.add(labelIva);
        cajaA3.add(labelTotal);
        
        cajaA3.add(Box.createHorizontalStrut(20));
        Box cajaB3= Box.createVerticalBox();
        cajaB3.add(lblSubtotal);
        cajaB3.add(lblIva);
        cajaB3.add(lblTotal);
        
        panel3.add(cajaA3);
        panel3.add(cajaB3);
        
        panel.add(panel3);
      
        
        add(panel,BorderLayout.CENTER);
        
       actualizarTabla();
        
       calcularPrecio();
        
       
       //instanciar y agregar eventos
        EventoCombo eventoCB = new EventoCombo(); //instanciamos EventoCombo
      
      cboProductos.addActionListener(eventoCB); //asignamos eventoCB
      
      EventoSpinner eventoSpin= new EventoSpinner(); //instanciamos evento spinner y creamos constructor de este
      
      spinnerCantidad.addChangeListener(eventoSpin); //definimos evento a spinnerCantidad
      
      EventoBoton eventoBtn= new EventoBoton(); //instanciomos EventoBoton
      
      btnAgregar.addActionListener(eventoBtn); //asignamos evento a boton
      
      
      
      /////////////////
       
       
       
      
    }
   
   public void calcularPrecio(){
   
       
       precio=precios[cboProductos.getSelectedIndex()];
       cantidad=Integer.parseInt(spinnerCantidad.getValue().toString());
       lblPrecioUnitario.setText(pesosMX(precio));
       lblPrecioTotal.setText(pesosMX(precio*cantidad));
       
       
   }
     public String pesosMX(double precio){
    
        return "$ "+ Math.round(precio*100.0)/100.0+" MXM";
    }
     
    
     public void borrarVenta(){
         
     precio=0;
     cantidad=1;
     cboProductos.setSelectedItem(0);
     spinnerCantidad.setValue(1);

     calcularPrecio();
     }
     
     public boolean buscarVenta(Venta nueva){
      //codigo para buscar una venta, si encuentra una devuelve un true, de ,lo contrario devuelve false
         for(Venta v: listaVenta){
         
             if(v.getId()==nueva.getId()){
             
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
             }
             
             
         }
      return false;
     }
     
     public void actualizarTabla(){
     
         while(tabla.getRowCount()>0){
         
             tabla.removeRow(0);
         }
         
         double subtotal=0;
         for(Venta v: listaVenta){
         
             Object x[]=new Object[4];
             x[0]=v.getDescripcion();
             x[1]=pesosMX(v.getPrecio()); //formato de pesos
             x[2]=v.getCantidad();
             x[3]=pesosMX(v.getImporte()); //formato de pesos
             tabla.addRow(x);
             
             subtotal+=v.getImporte(); //es un incremento pero funciona como suma
         }
         double iva=subtotal*0.16;
         double total=subtotal+iva;
         lblSubtotal.setText(pesosMX(subtotal));
         lblIva.setText(pesosMX(iva));
         lblTotal.setText(pesosMX(total));
         tblProductos.setModel(tabla);
         
     }
     
    //eventos
   private class EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            calcularPrecio();
        }
   }
   
   private class EventoSpinner implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {

            calcularPrecio();
        }
   
   }
   
   
   private class EventoBoton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            

            Venta venta= new Venta();
            venta.setId(cboProductos.getSelectedIndex());
            venta.setDescripcion(cboProductos.getSelectedItem().toString());
            venta.setPrecio(precio);
            venta.setCantidad(cantidad);
            venta.setImporte(precio*cantidad);
             if(!buscarVenta(venta)){
        
            listaVenta.add(venta);
        }
        
     //   listaVenta.add(venta);
        actualizarTabla();
        borrarVenta();

        }
        
        
   
       
   } 
        
     
            
   
    private JComboBox<String> cboProductos; //creamos comboBox
    
    //etiquetas dinamicas
    private JLabel lblPrecioUnitario;
    private JLabel lblPrecioTotal;
    private JLabel lblSubtotal;
    private JLabel lblIva;
    private JLabel lblTotal;
    
    //etiquetas estaticas
    private JLabel labelProductos;
    private JLabel labelCantidad;
    private JLabel labelPrecioUnitario;
    private JLabel labelPrecioTotal;
    private JLabel labelSubtotal;
    private JLabel labelIva;
    private JLabel labelTotal;
    
    //componentes SWING
    
    private JSpinner spinnerCantidad;
    private JButton btnAgregar;
    private JTable tblProductos;


    
    
}

