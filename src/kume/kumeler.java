package kume;
import java.util.ArrayList;
public class kumeler {
    
    private ArrayList<Integer> elemanlar;
    
    public kumeler(){
        elemanlar =new ArrayList<Integer>();
    }
    
    public kumeler(int[] a){
        elemanlar =new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            elemanlar.add(a[i]);
        }
    }
    public kumeler(kumeler a){
        this.elemanlar=new ArrayList<Integer>(a.elemanlar);
    }
    
    public void ekle(int a){
        
        elemanlar.add(a);
    }
    
    public void yazdir(){
        for(int i=0;i<elemanlar.size();i++)
            System.out.println(elemanlar.get(i));  
    }
    
    public boolean denk(kumeler a){
        if(this.elemanlar.size()==a.elemanlar.size()){
            return true;
        }
        return false;
    }
    
    public boolean esit(kumeler a){
        int c=0;
        for(int i=0;i<this.elemanlar.size();i++){
            for(int j=0;j<a.elemanlar.size();j++){
                     if(this.elemanlar.get(i)==a.elemanlar.get(j)){
                          c++;
                          break;
            }
        }
    }
        if(this.elemanlar.size()==c){
           return true; 
        }else return false;
    
    }
    public kumeler birlesim(kumeler a){
        kumeler bir=new kumeler();
        for(int i=0;i<this.elemanlar.size();i++){
            for(int j=0;j<a.elemanlar.size();j++){
                if(this.elemanlar.get(i)==a.elemanlar.get(j)){
                    bir.elemanlar.add(this.elemanlar.get(i));
                    break;
                }
                if(this.elemanlar.get(i)!=a.elemanlar.get(j)){
                    bir.elemanlar.add(a.elemanlar.get(j));
                    bir.elemanlar.add(this.elemanlar.get(i));
                    break;
                }
            }
            
        }
        return bir;
        
   }
    
}
