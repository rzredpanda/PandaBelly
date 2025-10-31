public class Storage{
    private ArrayList<String> category;
    private ArrayList<String> name;
    private ArrayList<Double> price;
    private ArrayList<Integer> amount;
    private ArrayList<Integer> serialNumber;


    public Storage(){
        category = new ArrayList<String>();
        name = new ArrayList<String>();
        price = new ArrayList<Double>();
        amount = new ArrayList<Integer>();
        serialNumber = new ArrayList<Integer>();
    }

    public void removeItem(String c){
        for (int i=0; i<category.size(); i++){
            if(category.get(i).equals(c)){
                category.set(i, "null");
            }
        }
    }
    
}