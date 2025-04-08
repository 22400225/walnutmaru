import java.util.Scanner;

public class Rep03Replace3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 시간 입력 (HH:MM:SS): ");
        String time1 = scanner.nextLine();

        System.out.print("두 번째 시간 입력 (HH:MM:SS): ");
        String time2 = scanner.nextLine();

        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");

        int h1 = Integer.parseInt(parts1[0]);
        int m1 = Integer.parseInt(parts1[1]);
        int s1 = Integer.parseInt(parts1[2]);

        int h2 = Integer.parseInt(parts2[0]);
        int m2 = Integer.parseInt(parts2[1]);
        int s2 = Integer.parseInt(parts2[2]);

        if( ( h1 > 23 ) || (h2 > 23) || ( h1 < 0 ) || ( h2 < 0 )){

            System.out.println("시(hour)는 0~23 사이여야 합니다.");
        }

        else if( ( m1 > 59 ) || (m2 > 59) || ( m1 < 0 ) || ( m2 < 0 )){
            System.out.println("분(minute)은 0~59 사이여야 합니다.");
        }
        else if( ( s1 > 59 ) || (s2 > 59) || ( s1 < 0 ) || ( s2 < 0 )){
            System.out.println("초(second)는 0~59 사이여야 합니다.");
        }
        
        else{
        int totalsec1 = h1*3600 + m1*60 + s1;
        int totalsec2 = h2*3600 + m2*60 + s2;
        
        int gapsec = totalsec2 - totalsec1;

        if( gapsec < 0 ) {

            System.out.println("두 번째 시간이 첫 번째 시간보다 이전입니다.");

            scanner.close();
        }

        else { int h_gap = gapsec / 3600;
        
        int m_gap = ( gapsec % 3600 )/ 60; 

        int s_gap = gapsec % 60;

        System.out.printf("경과된 시간은 %02d시 %02d분 %02d초입니다.\n", h_gap, m_gap, s_gap);

        scanner.close();
    
        }
    }
    }



}