public class SearchDemo{
    public static void main(String[] args){
        int[] data = new int[9];
        data[0] = 15;
        data[1] = 22;
        data[2] = 99;
        data[3] = 3;
        data[4] = 41;
        data[5] = 15;
        data[6] = 8;
        data[7] = 61;
        data[8] = 86;


        for(int i=0;i<data.length;i++){
            int temp = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[temp]){
                    temp = j;
                }
            }
            int swapVariable = data[i];
            data[i] = data[temp];
            data[temp] = swapVariable;
        }

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}