package atividades;

public class CalculadoraGeometria {
    double lado, area;
    
    public CalculadoraGeometria(double lado){
        this.lado = lado;
    }
    
    public void calcularAreaQuadrado(){
        area = lado * lado;
        System.out.println("Resultado da area: "+area);
    }
}
