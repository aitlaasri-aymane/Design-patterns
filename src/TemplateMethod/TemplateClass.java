package TemplateMethod;

public abstract class TemplateClass {
    public double operationTemplate(String str){
        int size = str.length();
        double somme = 0;
        for (int i=0; i<size ; i++){
            double x=operationAbs1(str);
            somme+=i*x;
            double y=operationAbs2(somme);
            somme+=y*somme;
        }
        return somme ;
    };
    abstract public double operationAbs1(String str);
    abstract public double operationAbs2(double s);
}
