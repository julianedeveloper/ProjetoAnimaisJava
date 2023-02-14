
public class Arara extends Ave{
    private String corDasPenas;
    public void corDasPenas(){
        System.out.println("Penas com as cores do Brasil.");
    }
    public String getCorDasPenas(){
        return corDasPenas;
    }
    public void setCorDasPenas(){
        this.corDasPenas = corDasPenas;
        System.out.println(this.corDasPenas);
    }
}
