package Study.java基础进阶1.test1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        String[] team1= {"a","b","c"};
        String[] team2 = {"x","y","z"};
        String[][] matches =new String[team1.length][];
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < team1.length; i++) {
                List<String> list = new ArrayList<>();
                for (int j = 0; j < team2.length; j++) {
                    if (team1[i].equals("a") && team2[j].equals("x")){
                        System.out.println("a说不和x比");
                        continue;
                    }else if(team1[i].equals("c") && (team2[j].equals("x") || team2[j].equals("z"))){
                        System.out.println("c说不和x,z比");
                        continue;
                    }
                    System.out.println(team1[i]+":"+team2[j]);
                }

            }
        }

    }


}
