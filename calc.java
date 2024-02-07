import javax.swing.JOptionPane;

public class calc{
    public static void main(String[] args){
        
        String inputValue = JOptionPane.showInputDialog("Escolha uma Operação: 1-SOMA 2-SUBTRAÇÃO 3-MULTIPLICAÇÃO 4-DIVISÃO");
        
        if (inputValue.equals("1")){
            
            String firstNumber = 
                JOptionPane.showInputDialog("Digite primeiro número:");
        String secondNumber =
                JOptionPane.showInputDialog("Digite segundo número:");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
            int sum = number1 + number2;
            JOptionPane.showMessageDialog( null, "A soma é "+sum,"Soma de 2 Inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{
            if(inputValue.equals("2")){
                
                String firstNumber = 
                JOptionPane.showInputDialog("Digite primeiro número:");
        String secondNumber =
                JOptionPane.showInputDialog("Digite segundo número:");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
                int sum = number1 - number2;
                JOptionPane.showMessageDialog( null, "A subtração é "+sum,"Subtração de 2 Inteiros", JOptionPane.PLAIN_MESSAGE);
            }else{
                if(inputValue.equals("3")){
                    
                    String firstNumber = 
                JOptionPane.showInputDialog("Digite primeiro número:");
        String secondNumber =
                JOptionPane.showInputDialog("Digite segundo número:");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
                    int sum = number1 * number2;
                    JOptionPane.showMessageDialog( null, "A multipicação é "+sum,"Multiplicação de 2 Inteiros", JOptionPane.PLAIN_MESSAGE);
                }else{
                    if(inputValue.equals("4")){
                        
                        String firstNumber = 
                JOptionPane.showInputDialog("Digite primeiro número:");
        String secondNumber =
                JOptionPane.showInputDialog("Digite segundo número:");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
                        int sum = number1 / number2;
                        JOptionPane.showMessageDialog( null, "A divisão é "+sum,"Divisão de 2 Inteiros", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog( null, "Escolha uma opção válida","ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        
        }
    }
}
