import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> category;



    public Storage(){
        category = new ArrayList<Item>();
    }

    public boolean removeItem(String n){
        for (int i=0; i<category.size(); i++){
            if(category.get(i).getName().equals(n)){
                category.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeItem(int index){
        if(index<=category.size()&&index>=0){
            for (int i=0; i<category.size(); i++){
                if(i==index){
                    category.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean addItem(String n, double p, int q, int s){
        for(Item y:category){
            if(y.getName().equals(n)){
                return false;
            }
        }
        category.add(new Item(n,p,q,s));
        return true;
    }

    
}





//OOOGGAAAA BOOOOOOOOOOOOOOOOOOOOOGGGGGGGGGGGGAAAAAAAAAAA