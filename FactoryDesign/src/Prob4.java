
import java.util.*;

//--------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface GameTracker {
 void addMatch(String team1, String team2, String score);
 String findFirst();
}

//--------- YOUR TASK STARTS HERE ---------

class VolleyballGameTracker implements GameTracker {

 // Declare your variables here
 HashMap<String,Integer> hm;
 String team="1";
 int maxScore;

 public VolleyballGameTracker(String[] teamNames) {
     // YOUR CODE GOES HERE
     hm=new HashMap<>();
     for(int i=0;i<teamNames.length;i++){
         hm.put(teamNames[i],0);
     }
     
 }

 @Override
 public void addMatch(String team1, String team2, String score) {
     // YOUR CODE GOES HERE
     // 1. Parse the score string (e.g., "20:19")
     // 2. Determine winner/loser or draw
     // 3. Update team points (Win=2, Draw=1, Loss=0)
     // 4. Update the leader if necessary to satisfy O(1) for findFirst()
     String[] s=score.split(":");
     String b="";
     int a=0;
     if(Integer.parseInt(s[0])>Integer.parseInt(s[1])){
         hm.put(team1,hm.get(team1)+2);
         
     }
     else if(Integer.parseInt(s[0])<Integer.parseInt(s[1])){
         hm.put(team2,hm.get(team2)+2);
         
     }
     else{
         hm.put(team1,hm.get(team1)+1);
         hm.put(team2,hm.get(team2)+1);
     }
     
     if(hm.get(team1)>maxScore){
         maxScore=hm.get(team1);
         team=team1;
     }
             
     else if(hm.get(team2)>maxScore){
         maxScore=hm.get(team2);
         team=team2;
     }
 }

 @Override
 public String findFirst() {
     // YOUR CODE GOES HERE

     return team; // Placeholder
 }
}

//--------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob4 {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     // 1. Read number of teams
     int n = Integer.parseInt(sc.nextLine());
     String[] teams = new String[n];
     
     // 2. Read team names
     for(int i = 0; i < n; i++) {
         teams[i] = sc.nextLine().trim();
     }
     
     // Initialize Tracker
     GameTracker tracker = new VolleyballGameTracker(teams);
     
     // 3. Read number of matches
     int m = Integer.parseInt(sc.nextLine());
     
     // 4. Process matches
     for(int i = 0; i < m; i++) {
         String line = sc.nextLine();
         String[] parts = line.split(" ");
         
         // Format: Team1 Team2 Score1:Score2
         // parts[0] = Team1, parts[1] = Team2, parts[2] = Score
         String team1 = parts[0];
         String team2 = parts[1];
         String score = parts[2];
         
         tracker.addMatch(team1, team2, score);
     }
     
     // 5. Output result
     System.out.println(tracker.findFirst());
     
     sc.close();
 }
}