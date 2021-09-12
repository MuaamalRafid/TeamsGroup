import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TeamsGroup Match1 = new TeamsGroup();

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Group Team");
        System.out.print("Team One : ");
        String TeamAname = input.nextLine();
        System.out.print("Team Tow : ");
        String TeamBname = input.nextLine();
        System.out.print("Team Three : ");
        String TeamCname = input.nextLine();
        System.out.print("Team Four : ");
        String TeamDname = input.nextLine();
        System.out.println("================================================================");
        System.out.println("================================================================");

        Match1.GroupTeamsName(TeamAname, TeamBname, TeamCname, TeamDname);

          for(int i = 1 ; i<=8 ; i++)
          {
            
            switch(i)
            {
                case 1: 
                {
                    Match1.MatchInformation("8 AM KSA", "ALJAWHARA", TeamAname, TeamBname);
                    System.out.print( TeamAname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamBname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("8 AM KSA", "ALJAWHARA", TeamAname, TeamBname,TeamOne,TeamTow);
                   
                }
                break;
              
                case 2: 
                {
                    Match1.MatchInformation("9 AM KSA", "BASRA STUDIUM", TeamCname, TeamDname);
                    System.out.print( TeamCname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamDname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("9 AM KSA", "BASRA STUDIUM", TeamCname, TeamDname,TeamOne,TeamTow);
                    
                }
                break;

                case 3: 
                {
                    Match1.MatchInformation("8 AM KSA", "KARBALA STUDIOM", TeamAname, TeamCname);
                    System.out.print( TeamAname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamCname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("8 AM KSA", "KARBALA STUDIOM", TeamAname, TeamCname,TeamOne,TeamTow);
                }
                break;


                case 4: 
                {
                    Match1.MatchInformation("9 AM KSA", "ELEMARAT", TeamDname, TeamBname);
                    System.out.print( TeamDname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamBname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("9 AM KSA", "ELEMARAT", TeamDname, TeamBname,TeamOne,TeamTow);
                }
                break;

                case 5: 
                {
                    Match1.MatchInformation("8 AM KSA", "KARBALA STUDIOM", TeamDname, TeamAname);
                    System.out.print( TeamDname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamAname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("8 AM KSA", "KARBALA STUDIOM", TeamDname, TeamAname,TeamOne,TeamTow);
                }
                break;

                case 6: 
                {
                    Match1.MatchInformation("10 AM KSA", "SANTIAGO", TeamCname, TeamBname);
                    System.out.print( TeamCname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamBname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("10 AM KSA", "SANTIAGO", TeamCname, TeamBname,TeamOne,TeamTow);
                }
                break;

                case 7: 
                {
                    Match1.MatchInformation("9 AM KSA", "CAMP NO", TeamAname, TeamBname);
                    System.out.print( TeamAname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamBname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("9 AM KSA", "CAMP NO", TeamAname, TeamBname,TeamOne,TeamTow);
                }
                break;

                case 8: 
                {
                    Match1.MatchInformation("10 AM KSA", "BASRA STUDIUM", TeamCname, TeamDname);
                    System.out.print( TeamCname+" Goals :");
                    int TeamOne = input.nextInt();
                    System.out.print(TeamDname+" Goals :");
                    int TeamTow = input.nextInt();
                    Match1.MatchInformation("10 AM KSA", "BASRA STUDIUM", TeamCname, TeamDname,TeamOne,TeamTow);
                }
                break;
            }
            
          
          }
             Match1.GroupInformatinPoint();
    }
}
