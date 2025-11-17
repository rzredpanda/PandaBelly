import java.util.ArrayList;

public class main{
    private ArrayList<Storage> mainStorage;

    public main(){
        mainStorage=new ArrayList<Storage>();
    }
    //Adds a category to the main storage if it is not already present in the list of categories
    public boolean addCategory(Storage x){
        for(Storage y: mainStorage){
            if(x.getCName().equals(y.getCName())){
                return false;
            }
        }
        mainStorage.add(x);
        return true;
    }


}