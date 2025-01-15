import java.util.Scanner;
public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] teamName = new String[2];
        System.out.println("Please Enter Name of Team1");
        teamName[0] = sc.nextLine();
        System.out.println("Please Enter Name of Team2");
        teamName[1] = sc.nextLine();

        int noOfOvers = 0;
        System.out.println("Please Enter No of Overs");
        noOfOvers = sc.nextInt();

        int runPerOver[][][] = new int[2][noOfOvers][];

        // -61 wide
        // -62 no ball
        // -51 wicket

        for(int i=0;i<runPerOver.length;i++){
            for(int j=0;j<runPerOver[i].length;j++){
                System.out.println("Enter No of Balls played in over "+(j+1) +" of team "+teamName[i]);
                int ballsInThisOver = sc.nextInt();
                runPerOver[i][j] = new int[ballsInThisOver];
                for(int k=0;k<runPerOver[i][j].length;k++){
                    System.out.println("Enter Run taken in over "+(j+1) +" ball "+(k+1) + " = ");
                    runPerOver[i][j][k] = sc.nextInt();
                }
            }
        }



        for(int i=0;i<runPerOver.length;i++){
            int totalRun = 0;
            int totalExtra = 0;
            int totalWicket = 0;
            for(int j=0;j<runPerOver[i].length;j++){
                for(int k=0;k<runPerOver[i][j].length;k++){
                    if(runPerOver[i][j][k]<0){
                        if(runPerOver[i][j][k]==-61 || runPerOver[i][j][k]==-62 ){
                            totalExtra++;
                            totalRun++;
                        }
                        if(runPerOver[i][j][k]==-51 ){
                            totalWicket++;
                        }
                    }
                    else{
                        totalRun+=runPerOver[i][j][k];
                    }
                    
                }
            }

            System.out.println("Total ScoreBoard for "+teamName[i]+" = "+ totalRun+"/"+totalWicket + "("+runPerOver[i].length+")");
        }
        
    }
}