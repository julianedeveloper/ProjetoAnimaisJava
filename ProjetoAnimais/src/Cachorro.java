
public class Cachorro extends Mamifero {
    private String enterrarOsso;
    private String abanarRabo;
    
    @Override
    public void emitirSom(){
        System.out.println("Au, au!");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando um osso.");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo.");
    } 
    public String getEnterrarOsso(){
        return enterrarOsso;
    }
    public void setEnterrarOsso(){
        this.enterrarOsso = enterrarOsso;
        System.out.println(enterrarOsso);
    }
    public String getAbanarRabo(){
        return abanarRabo;
    }
    public void setAbanarRabo(){
        this.abanarRabo = abanarRabo;
        System.out.println(this.abanarRabo);
    }
}
