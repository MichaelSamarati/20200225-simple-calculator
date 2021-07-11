package grundrechnungrechner_samarati_20200225;
public class Grundrechnungrechner_Samarati_20200225 {
    public static void main(String[] args) {
      
        Rechner r = new Rechner();
        
        Dialog d = new Dialog();
        
        d.setDiagnosticOn(true);
        d.signOn("Rechnerprogramm (c) Samarati v.0.1 - Start");
        d.help("Dieser Rechner kann Addition, Subtraktion, Multiplikation und Division für Glaitkommazahlen einfacher Genauigkeit als Operanden!");
        
        while(true){
            System.out.println(r.clear());
            r.setOperand1(d.getOperand("op1"));
            r.setOperand2(d.getOperand("op2"));
            d.getOperation(d.getOperator("Operator"));
            if(d.exit()==true) break;
            System.out.println(r.enter());
        }
        d.signOff("Rechnerprogramm (c) Samarati v.0.1 - Ende");
        
        System.out.println("Nutzung von Objekt d: "+d.getZ() );
    }
    
}
