package day_7;

public class SwitchCases {
    public static void main(String[] args) {
        int dayNumber=3;

        switch(dayNumber){
            case 1: if(dayNumber==1){
                System.out.println("Monday");
                break;
            }
            case 2: if(dayNumber==2){
                System.out.println("Tuesday");
                break;
            }
            case 3: if(dayNumber==3){
                System.out.println("Wednesday");
                break;
            }
            case 4: if(dayNumber==4){
                System.out.println("Thursday");
                break;
            }
            case 5: if(dayNumber==5){
                System.out.println("Friday");
                break;
            }
            default: System.out.println("Tuesday");
                break;
        }

        int dayNumber2=dayNumber+3;
        String dayName = switch(dayNumber2){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
        System.out.println(dayName);
    }
}
