
package Controller;

public class Funcoes_DAO {
    
    public static double peso = 0;
    public static double altura = 0;
    public static double x = 0;
    
    public static void imc(){
        
        View.Tela_GUI.peso1_img.setVisible(false);
        View.Tela_GUI.peso2_img.setVisible(false);
        View.Tela_GUI.peso3_img.setVisible(false);
        View.Tela_GUI.peso4_img.setVisible(false);
        View.Tela_GUI.peso5_img.setVisible(false);
        
        peso = Double.parseDouble(View.Tela_GUI.imc1_txt.getText());
        altura = Double.parseDouble(View.Tela_GUI.imc2_txt.getText());
        
        x = peso/(altura*altura);
        
        String res = String.format("%.2f", x);
        
        View.Tela_GUI.res_txt.setText(String.valueOf(res));
        View.Tela_GUI.res_txt.setVisible(true);
        View.Tela_GUI.res2_txt.setVisible(true);
        
        if(x>=15 && x<=18.5){
            View.Tela_GUI.peso1_img.setVisible(true);
        }else if(x>=18.6 && x<=24.9){
            View.Tela_GUI.peso2_img.setVisible(true);
        }else if(x>=25 && x<=29.9){
            View.Tela_GUI.peso3_img.setVisible(true);
        }else if(x>=30 && x<=39.9){
            View.Tela_GUI.peso4_img.setVisible(true);
        }else if(x>=40){
            View.Tela_GUI.peso5_img.setVisible(true);
        }
        
    }
        
    
}
