package TemplateMethod;

public class Client {
    TemplateClass templateClass;

    public void setTemplateClass(TemplateClass templateClass) {
        this.templateClass = templateClass;
    }

    public double operationTemplate(String str){
        return templateClass.operationTemplate(str);
    }
}
