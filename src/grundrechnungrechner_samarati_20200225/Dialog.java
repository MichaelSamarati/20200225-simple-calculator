package grundrechnungrechner_samarati_20200225;

import java.util.Scanner;

public class Dialog {
    
    Rechner r = new Rechner();
    Scanner sc;
    int z;
    boolean diagnosticOn;
    String s;
    boolean b;
    char c;
    
    public Dialog(){
        sc = new Scanner(System.in);
        this.z=0;
        boolean diagnosticOn = false;
        boolean b = true;
        c = ' ';
    }
    
    public void setDiagnosticOn(boolean diagnosticOn){
        this.diagnosticOn = diagnosticOn;
    }
    
    void inkrementZ() {
        if(this.diagnosticOn){
            this.z++;
        }
    }
    
    public int getZ() {
        return this.z;
    }

    public float getOperand(String s){
        this.inkrementZ();
        String answer;
        System.out.print("Eingabe "+s+" ? ");
        answer = this.sc.next();
        return Float.valueOf(answer);
    }
 
    public void signOn(String s){
        this.inkrementZ();
        System.out.println(s);
    }
    
    public void help(String s){
        this.inkrementZ();
        System.out.println(s);
    }
    
    public void signOff(String s){
        this.inkrementZ();
        System.out.println(s);
    }
    
    public String getOperator(String s){
        this.inkrementZ();
        System.out.println("Welcher "+s+" ? ");
        this.s = this.sc.next();
        this.bool();
        return s;
    }
    
    public void bool(){
        this.inkrementZ();
        if(s=="x"){
            b = true;
        }else{
            b = false;
        }
    }
    
    public boolean exit(){
        this.inkrementZ();
            return b;
    }
    
    public void getOperation(String s){
        this.inkrementZ();
        if(s==("+")){
            r.addiere();
        }else{
            if(s==("-")){
                r.subtrahiere();
            }else{
                if(s==("*")){
                    r.multipliziere();
                }else{
                    if(s==(":")){
                        r.dividiere();
                    }else{
                        if(s==("/")){
                            r.dividiere();
                        }else{
                            if(s==("x")){
                                bool();
                            }else{
                                System.out.println("Ungültiger Operator! "); 
                            }   
                        }
                    }
                }
            }
        }
    }

}           