import java.util.ArrayList;

public class categoryStorage{
    private ArrayList<Storage> mainStorage;

    public categoryStorage(){
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