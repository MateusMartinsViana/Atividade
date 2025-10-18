package atividades;

public class ConversorTemperatura {
    private double celsius, fahrenheit;
    
    public ConversorTemperatura(double celsius){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    
    public void celsiusParaFahrenheit(){
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Resultado de celsius para fahrenheit: "+fahrenheit);
    }
}
