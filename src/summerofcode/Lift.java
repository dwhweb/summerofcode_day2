package summerofcode;
import java.io.*;

public class Lift {
    public static void main(String[] args) {
        File aFile = new File("02-lifts.txt");
        BufferedReader bufferedFileReader = null;
        int c;
        int floor = 0;
        int highestfloor = 0;
        
        try {
            bufferedFileReader = new BufferedReader(new FileReader(aFile));
            
            while((c = bufferedFileReader.read()) != -1) {
                switch((char)c) {
                    case '^' :
                        floor++;
                        break;
                    case 'v' :
                        floor--;
                        break;
                    case '=' :
                        if(floor > highestfloor) {
                            highestfloor = floor;
                        }
                        break;
                }
            }
            
            System.out.println("You finish on floor " + floor);
            System.out.println("The highest floor you can get out on is floor " 
                    + highestfloor);
        } catch(Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                bufferedFileReader.close();
            } catch(Exception e) {
                System.out.println("Error" + e);
            }       
        }
    } 
}
