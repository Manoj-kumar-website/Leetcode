class ProductOfNumbers {
    List<Integer> li=new ArrayList<>();
    public ProductOfNumbers() {
        li=new ArrayList<>();
        li.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            li=new ArrayList<>();
            li.add(1);
        }
        else{
            li.add(li.get(li.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        if(k>=li.size()){
            return 0;
        }
        return li.get(li.size()-1)/li.get(li.size()-1-k);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */