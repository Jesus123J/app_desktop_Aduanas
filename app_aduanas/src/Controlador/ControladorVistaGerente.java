package Controlador;

import Vista.PestañaGerente;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;//Comportacion --- Y el ActionListener necesita de este
import java.awt.event.ActionListener;//Dar accion a un ejercicio  ------ Ejemplo:("dar click")
import java.text.DecimalFormat;
import java.util.Date;
import javax.crypto.interfaces.PBEKey;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;

public class ControladorVistaGerente implements ActionListener {//Hijo de ActionEvent

    private Double tiempPrice  = 0.0;
    private Double price = 0.0;
    private final Object[] almacen = {"Alamcen1"};
    private PestañaGerente pestañaGerente;

    public ControladorVistaGerente(PestañaGerente pestañaGerente) {
        this.pestañaGerente = pestañaGerente;
        pestañaGerente.txtDia.setEnabled(false);
        pestañaGerente.txtSemana.setEnabled(false);
        pestañaGerente.txtMes.setEnabled(false);
        pestañaGerente.txtMes.setEnabled(false);
        pestañaGerente.txtAño.setEnabled(false);
        jButtonListener();
        radio();
        showNewGerente();

    }

    private void showNewGerente() {
        DefaultComboBoxModel box = new DefaultComboBoxModel();
        /*ComboBoxModel box1 = new ComboBoxModel() {
          @Override
          public void setSelectedItem(Object anItem) {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public Object getSelectedItem() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public int getSize() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public Object getElementAt(int index) {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public void addListDataListener(ListDataListener l) {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public void removeListDataListener(ListDataListener l) {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };*/
        pestañaGerente.cbxAlmacen.setModel(box);

        pestañaGerente.setLocationRelativeTo(null);

        pestañaGerente.setVisible(true);

    }

    /**
     * Acction Button Listener
     */
    private void jButtonListener() {
        pestañaGerente.bRegistrarTiempo.addActionListener(this);
        pestañaGerente.btConfirt.addActionListener(this);
    }

    /**
     * Action RadioButton
     */
    private void radio() {
        pestañaGerente.RBDia.addActionListener(this);
        pestañaGerente.RBSemana.addActionListener(this);
        pestañaGerente.RBMes.addActionListener(this);
        pestañaGerente.RBAño.addActionListener(this);

    }

    /**
     * Este metodo es de la clase absore el llmado del las acciones externas
     * bicht
     */
    @Override
    public void actionPerformed(ActionEvent e) {//Metodo abstracto de una interfas
        //Union de clases
        if (e.getSource().equals(pestañaGerente.bRegistrarTiempo)) {//Owner establece un parametro-------------

            pestañaGerente.jDialogDate.setSize(704, 584);
            pestañaGerente.jDialogDate.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            pestañaGerente.jDialogDate.setLocationRelativeTo(null);
            pestañaGerente.jDialogDate.setVisible(true);
        }

        if (e.getSource().equals(pestañaGerente.RBDia)) {
            if (pestañaGerente.RBDia.isSelected() == true) {
                pestañaGerente.txtDia.setEnabled(true);
            } else if (pestañaGerente.RBDia.isSelected() == false) {
                pestañaGerente.txtDia.setText("");
                pestañaGerente.txtDia.setEnabled(false);
            }

            /*  tiempPrice = 24.0;
            if (pestañaGerente.RBDia.isSelected() == true) {
                price += tiempPrice * 20;
            } else if (pestañaGerente.RBDia.isSelected() == false) {
                price -= tiempPrice * 20;
            }*/
        }

        if (e.getSource().equals(pestañaGerente.RBSemana)) {
            if (pestañaGerente.RBSemana.isSelected() == true) {
                pestañaGerente.txtSemana.setEnabled(true);
            } else if (pestañaGerente.RBSemana.isSelected() == false) {
                pestañaGerente.txtSemana.setText("");
                pestañaGerente.txtSemana.setEnabled(false);
            }
            /**
             * tiempPrice = 7.0 * 24.0; if (pestañaGerente.RBSemana.isSelected()
             * == true) { price += tiempPrice * 20; } else if
             * (pestañaGerente.RBSemana.isSelected() == false) { price -=
             * tiempPrice * 20; }
             */
        }
        if (e.getSource().equals(pestañaGerente.RBMes)) {
            if (pestañaGerente.RBMes.isSelected() == true) {
                pestañaGerente.txtMes.setEnabled(true);
            } else if (pestañaGerente.RBMes.isSelected() == false) {
                pestañaGerente.txtMes.setText("");
                pestañaGerente.txtMes.setEnabled(false);
            }
            /**
             * tiempPrice = 31.0 * 24; if (pestañaGerente.RBMes.isSelected() ==
             * true) { price += tiempPrice * 20; } else if
             * (pestañaGerente.RBMes.isSelected() == false) { price -=
             * tiempPrice * 20; }
             */
        }
        if (e.getSource().equals(pestañaGerente.RBAño)) {
            if (pestañaGerente.RBAño.isSelected() == true) {
                pestañaGerente.txtAño.setEnabled(true);
            } else if (pestañaGerente.RBAño.isSelected() == false) {
                pestañaGerente.txtAño.setText("");
                pestañaGerente.txtAño.setEnabled(false);
            }
            /*tiempPrice = 365.0 * 24.0;
           if(pestañaGerente.RBAño.isSelected()== true){
              price += tiempPrice * 20; 
           }else if(pestañaGerente.RBAño.isSelected()==false){
              price -= tiempPrice * 20;
           }*/
        }

        if (e.getSource().equals(pestañaGerente.btConfirt)) {
            JTextField[] datos = {pestañaGerente.txtDia, pestañaGerente.txtSemana, pestañaGerente.txtMes, pestañaGerente.txtAño};
            JRadioButton[] radio = {pestañaGerente.RBDia, pestañaGerente.RBAño, pestañaGerente.RBMes, pestañaGerente.RBSemana};
            boolean ver = true;
            for (JRadioButton x : radio) {
                if (x.isSelected() == true && x.equals(pestañaGerente.RBDia)) {
                    if (!datos[0].getText().isEmpty()) {
                        ver = false;
                        price = 24.0;
                        tiempPrice += (Double.parseDouble(datos[0].getText()) * price) * 3;
                    } else {
                        JOptionPane.showMessageDialog(pestañaGerente, "Ingrese un dato");
                        break;
                    }
                }
                if (x.isSelected() == true && x.equals(pestañaGerente.RBAño)) {
                    if (!datos[3].getText().isEmpty()) {
                        ver = false;
                        price = 134 * 24.0;
                        tiempPrice += (Double.parseDouble(datos[3].getText()) * price) * 3;
                    } else {
                        JOptionPane.showMessageDialog(pestañaGerente, "Ingrese un dato");
                        break;
                    }
                }
            }
            if (!ver) {
                pestañaGerente.jDialogDate.setVisible(false);
                pestañaGerente.lblMessage.setText(tiempPrice.toString());
                tiempPrice = 0.0;
            }
        }
    }

}
