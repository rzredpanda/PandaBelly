import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> category;



    public Storage(){
        category = new ArrayList<Item>();
    }

    public void removeItem(String n){
        for (int i=0; i<category.size(); i++){
            if(category.get(i).getName().equals(n)){
                category.remove(i);
            }
        }
    }
    public void removeItem(int index){
        for (int i=0; i<category.size(); i++){
            if(i==index){
                category.remove(i);
            }
        }
    }
    
    
}




//OOOGGAAAA BOOOOOOOOOOOOOOOOOOOOOGGGGGGGGGGGGAAAAAAAAAAA