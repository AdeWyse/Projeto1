/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author adeli
 */
public class janelaComponentes extends javax.swing.JFrame{
    public void JanelaComponentes(){
        
    }
    
    //Atualiza a label
    public void SliderValueShow(JSlider slider, JLabel label){
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               Integer sliderValue =  slider.getValue();
               label.setText(sliderValue.toString());
            }
        });
    }
    
    //Atualiza a label e limita outro slidee ao máximo do primeiro slider
    public void SliderValueShowWithLimit(JSlider slider, JLabel label, JSlider toLimit){
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               Integer sliderValue =  slider.getValue();
               label.setText(sliderValue.toString());
               toLimit.setMaximum(sliderValue);
            }
        });
    }
    
    public void VoltarPrincipal(){
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        this.dispose();
        janelaPrincipal.setVisible(true);
    }
    
    
            
            
}
