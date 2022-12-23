package TemplateMethod;

public class Impl1 extends TemplateClass{
    @Override
    public double operationAbs1(String str) {
        return str.length();
    }

    @Override
    public double operationAbs2(double s) {
        return s*1;
    }
}
