/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collabhub;

/**
 *
 * @author Mark
 * still need to put in confirmation of valid inputs comparing to dates
 */
public class dateAndTime {
    private int startMin,endMin;
    private int startHour,endHour;
    private int day, month,year;

    public dateAndTime(int startMin, int endMin, int startHour, int endHour, int day, int month, int year) {
        setStartMin(startMin);
        setEndMin(endMin);
        setStartHour(startHour);
        setEndHour(endHour);
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        if(startMin>=0 && startMin<=59)
                this.startMin = startMin;
        System.out.println("Invalid input; defaulting to 0");
        this.startMin = 0;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        if(endMin>=0 && endMin<=59)
                this.endMin = endMin;
        System.out.println("Invalid input; defaulting to 0");
        this.endMin = 0;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        if(startHour>=0 && startHour<=23)
                this.startHour = startHour;
        System.out.println("Invalid input; defaulting to 0");
        this.startHour = 0;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        if(endHour>=0 && endHour<=23)
            if(startHour<endHour){
                this.endHour = endHour;}
        System.out.println("Invalid input; defaulting to 0");
        this.endHour = 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12){
            this.month = month;
        }
        System.out.println("Invalid input; defaulting to 1");
        this.month = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>2020){
        this.year = year;
        return;}
        System.out.println("Invalid input");
    }
    
    
}

//PROTOTYPE FOR CHECKING SCHEDULE
/*Scanner scan = new Scanner(System.in);
		boolean[] checkTime = new boolean[24];
		int timeslot = 0;
		int checker = 1;
		
		do{
		System.out.println("Enter number of timeslot:");
		System.out.println("(1) 12:00 - 1:00 AM"); //0
		System.out.println("(2) 1:00 - 2:00 AM"); //1
		System.out.println("(3) 2:00 - 3:00 AM"); //2
		System.out.println("(4) 3:00 - 4:00 AM"); //3
		System.out.println("(5) 4:00 - 5:00 AM"); //4
		System.out.println("(6) 5:00 - 6:00 AM"); //5
		System.out.println("(7) 6:00 - 7:00 AM"); //6
		System.out.println("(8) 7:00 - 8:00 AM"); //7
		System.out.println("(9) 8:00 - 9:00 AM"); //8
		System.out.println("(10) 9:00 - 10:00 AM"); //9
		System.out.println("(11) 10:00 - 11:00 AM"); //10
		System.out.println("(12) 11:00 - 12:00 PM"); //11
		System.out.println("(13) 12:00 - 1:00 PM"); //12
		System.out.println("(14) 1:00 - 2:00 PM"); //13
		System.out.println("(15) 2:00 - 3:00 PM"); //14
		System.out.println("(16) 3:00 - 4:00 PM"); //15
		System.out.println("(17) 4:00 - 5:00 PM"); //16
		System.out.println("(18) 5:00 - 6:00 PM"); //17
		System.out.println("(19) 6:00 - 7:00 PM"); //18
		System.out.println("(20) 7:00 - 8:00 PM"); //19
		System.out.println("(21) 8:00 - 9:00 PM"); //20
		System.out.println("(22) 9:00 - 10:00 PM"); //21
		System.out.println("(23) 10:00 - 11:00 PM"); //22
		System.out.println("(24) 11:00 - 12:00 PM"); //23
		System.out.print("\nEnter Number: ");
		
		timeslot = scan.nextInt() - 1;
		
		if(checkTime[timeslot] != true){
		    checkTime[timeslot] = true;
		    System.out.println("\nYour room is reserved!\n");
		    
		} else if(checkTime[timeslot] == true) {
		    System.out.println("\nTaken. Try again bitch!\n");
		}
		
		do{
		System.out.println("\n(1) Continue     (2) Exit\n");
		checker = scan.nextInt();
		}while(checker != 1 && checker != 2);
		
	
		}while(checker == 1);
	}
}*/