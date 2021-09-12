
public class TeamsGroup {
    int TeamAPoint = 0;
    int TeamBPoint = 0;
    int TeamCPoint = 0;
    int TeamDPoint = 0;
    String TeamAname;
    String TeamBname;
    String TeamCname ;
    String TeamDname ;

    String Time;
    String Studium;
       

    public void GroupTeamsName(String TeamAname,String TeamBname,String TeamCname,String TeamDname)
    {
        this.TeamAname = TeamAname;
        this.TeamBname = TeamBname;
        this.TeamCname = TeamCname;
        this.TeamDname = TeamDname;
    }


    public void MatchInformation(String Time, String Studium, String TeamOne, String TeamTow,int TeamOneGoals, int TeamTowGoals) {
       
        //المباراة الاولى 
       if(TeamOne == this.TeamAname && TeamTow == this.TeamBname)
  { System.out.println(this.TeamAname + " VS " + this.TeamBname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
       System.out.println("================================================================");}

        if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamBname ) {
            this.TeamAPoint += 3;
        } else if (TeamOneGoals< TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamBname) {
            this.TeamBPoint += 3;
        } else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamBname)
        {
            this.TeamAPoint += 1;
            this.TeamBPoint += 1;
        } 
        

        //المباراة الثانية 
        if(TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            System.out.println(this.TeamCname + " VS " + this.TeamDname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
            System.out.println("================================================================");
        }
       
        else if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamCPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamDPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamDPoint += 1;
            this.TeamCPoint += 1;
        }


        //المباراة الثالثة 
        if(TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {System.out.println(this.TeamAname + " VS " + this.TeamCname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
         if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamAPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamCPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamAPoint += 1;
            this.TeamCPoint += 1;
        }

        //المباراة الرابعة 
        if(TeamOne == this.TeamDname && TeamTow == this.TeamBname)
        {System.out.println(this.TeamBname + " VS " + this.TeamBname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
         if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamBname)
        {
            this.TeamDPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamBname)
        {
            this.TeamBPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamBname)
        {
            this.TeamBPoint += 1;
            this.TeamDPoint += 1;
        }

        //المباراة الخامسة 
        if(TeamOne == this.TeamDname && TeamTow == this.TeamAname)
       { System.out.println(this.TeamDname + " VS " + this.TeamAname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
         if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamAname)
        {
            this.TeamDPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamAname)
        {
            this.TeamAPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamDname && TeamTow == this.TeamAname)
        {
            this.TeamDPoint += 1;
            this.TeamAPoint += 1;
        }

        //المباراة السادسة 
        if(TeamOne == this.TeamCname && TeamTow == this.TeamBname)
        {System.out.println(this.TeamCname + " VS " + this.TeamBname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
         if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamBname)
        {
            this.TeamCPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamBname)
        {
            this.TeamBPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamBname)
        {
            this.TeamBPoint += 1;
            this.TeamCPoint += 1;
        }

        //المباراة السابعة 
        if(TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {System.out.println(this.TeamAname + " VS " + this.TeamCname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
        if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamAPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamCPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamAname && TeamTow == this.TeamCname)
        {
            this.TeamAPoint += 1;
            this.TeamCPoint += 1;
        }

        //المباراة الثامنة 
        if(TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {System.out.println(this.TeamCname + " VS " + this.TeamDname + "(" + TeamOneGoals + "," + TeamTowGoals + ")");
        System.out.println("================================================================");}
        if (TeamOneGoals > TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamCPoint += 3;
        } else if (TeamOneGoals < TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamDPoint += 3;
        }else if(TeamOneGoals==TeamTowGoals && TeamOne == this.TeamCname && TeamTow == this.TeamDname)
        {
            this.TeamCPoint += 1;
            this.TeamDPoint += 1;
        }
    }


   
    public void MatchInformation(String Time, String Studium, String TeamOne, String TeamTow) {
        this.Time = Time;
        this.Studium = Studium;
        System.out.println("MatchDay : " + TeamOne+ " VS " + TeamTow);
        System.out.println("Time : " + this.Time);
        System.out.println("Studium : " + this.Studium);
    }
    



    public void GroupInformatinPoint() {
        // if ((this.TeamAPoint > this.TeamBPoint) && (TeamAPoint > TeamCPoint) && (TeamAPoint > TeamDPoint)) {
            System.out.println(this.TeamAname + " = " + this.TeamAPoint);
            System.out.println(this.TeamBname + " = " + this.TeamBPoint);
            System.out.println(this.TeamCname + " = " + this.TeamCPoint);
            System.out.println(this.TeamDname + " = " + this.TeamDPoint);

    

        // } else if ((this.TeamBPoint > this.TeamAPoint) && (TeamBPoint > TeamCPoint) && (TeamBPoint > TeamDPoint)) {
        //     System.out.println(this.TeamBname + " = " + TeamBPoint);
        //     System.out.println(this.TeamDname + " = " + this.TeamDPoint);
        //     System.out.println(this.TeamCname + " = " + this.TeamCPoint);
        //     System.out.println(this.TeamAname + " = " + this.TeamAPoint);

        // } else if ((this.TeamCPoint > this.TeamAPoint) && (TeamCPoint > TeamBPoint) && (TeamCPoint > TeamDPoint)) {
        //     System.out.println(this.TeamCname + " = " + TeamCPoint);
        //     System.out.println(this.TeamDname + " = " + this.TeamDPoint);
        //     System.out.println(this.TeamBname + " = " + this.TeamBPoint);
        //     System.out.println(this.TeamAname + " = " + this.TeamAPoint);
        // }

        // else if ((this.TeamDPoint > this.TeamAPoint) && (TeamDPoint > TeamBPoint) && (TeamDPoint > TeamCPoint)) {
        //     System.out.println(this.TeamDname + " = " + TeamDPoint);
        //     System.out.println(this.TeamCname + " = " + this.TeamAPoint);
        //     System.out.println(this.TeamBname + " = " + this.TeamBPoint);
        //     System.out.println(this.TeamAname + " = " + this.TeamCPoint);
        // }
    }

}
