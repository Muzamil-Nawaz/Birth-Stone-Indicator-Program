package birthstoneindicator;

import java.util.Scanner;

public class BirthStoneIndicator {
    static String month;
    static String stone;
    static String color;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BirthStoneIndicator bsi = new BirthStoneIndicator();
        String s = bsi.getString();
        s = s+ " and the color of your birthstone is "+bsi.color;
        System.out.println(s);
    }
    public String getString(){
        System.out.print("Enter month you were born: ");
        Scanner sc = new Scanner(System.in);
        this.month = sc.next();
        this.stone = findBirthStone(month);
        this.color = findStoneColor(this.stone);
        if(stone == "")
            System.exit(0);
        else
            return "You were born in " + month + " and your birthstone is " + stone;
        return "";
    }
    public String findBirthStone(String month){
        switch(month.toLowerCase()){
            case "january":
                return "Garnet";
            case "february":
                return "The Amethyst";
            case "march":
                return "Aquamarine";
            case "april":
                return "Diamond";
            case "may":
                return "Emarald";
            case "june":
                return "Pearl";
            case "july":
                return "Ruby";
            case "august":
                return "Peridot";
            case "september":
                return "Sapphire";
            case "october":
                return "Opal";
            case "november":
                return "Topaz";
            case "december":
                return "Zircon";
            default :
                return "";
                
        }
    
    }
    public String findStoneColor(String aStone){
        switch(aStone.toLowerCase()){
            case "garnet":
                return "dark red.";
            case "the amethyst":
                return "purple.";
            case "aquamarine":
                return " light greenish blue.";
            case "topaz":
                return " yellow.";
            case "emarald":
            case "peridot":
                return "  green.";
            case "pearl":
                return " white, silver, pink, gold, cream.";
            case "ruby":
                return " shades of red including pink.";
            case "sapphire":
                return " blue.";
            case "opal":
                return " random bright color.";
            case "diamond":
            case "zircon":
                return " colorless.";
            default :
                return "";
                
        }
    }
}
