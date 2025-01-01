public class NewDemo{
    public static void main(String[] args){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(8-i>=j){
                    System.out.print("("+i+"-"+j+")"+" ");
                }
            }
            System.out.println("");
        }
    }
}