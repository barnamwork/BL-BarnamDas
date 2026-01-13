public class Problem4 {
    public static void main(String[] args){
        int costPrice=129;
        int sellingPrice=191;
        
        if(sellingPrice>costPrice){
            System.out.println("Profit in number is Rs"+(sellingPrice-costPrice));
            System.out.println("Profit in percentage "+((sellingPrice-costPrice)*100/costPrice)+ "%");
        }
        else if(costPrice>sellingPrice){
            System.out.println("Loss in number "+(costPrice-sellingPrice));
            System.out.println("Loss in percentage"+((costPrice-sellingPrice)*100/costPrice));
        }
        else{
            System.out.println("Neither Profit nor Loss");
        }
    }
    
}
