package grundrechnungrechner_samarati_20200225;

class Rechner {
    
    float op1, op2;
    double res;
    String anz;
    
    public Rechner(){
        this.clear();
    }
    
    public String clear(){
        this.op1 = 0;   this.op2 = 0;   this.res = 0;   this.anz = "0";
        return this.anz;
    }
    
    public String enter(){
        return this.anz;
    }
    
    public void setOperand1(float op1){
        this.op1 = op1;
    }
    
    public void setOperand2(float op2){
        this.op2 = op2;
    }
    
    public void addiere(){
        this.res = this.op1 + this.op2;
        this.anz =      Float.toString(this.op1) + " + "
                    +   Float.toString(this.op2) + " = "
                    +   Double.toString(this.res); 
    }
    
    public void subtrahiere(){
        this.res = this.op1 - this.op2;
        this.anz =      Float.toString(this.op1) + " - "
                    +   Float.toString(this.op2) + " = "
                    +   Double.toString(this.res); 
    }
    
    public void multipliziere(){
        this.res = this.op1 * this.op2;
        this.anz =      Float.toString(this.op1) + " * "
                    +   Float.toString(this.op2) + " = "
                    +   Double.toString(this.res); 
    }
    
    public void dividiere(){
        if(this.op2!=0){
            this.res = this.op1 / this.op2;
            this.anz =      Float.toString(this.op1) + " : "
                        +   Float.toString(this.op2) + " = "
                        +   Double.toString(this.res); 
        }else{
            this.anz = "Die Division durch 0 ist nicht möglich! ";
        }
    }
}