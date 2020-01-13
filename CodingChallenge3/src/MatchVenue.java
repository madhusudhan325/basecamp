import java.util.Scanner;

class Venue {
	int id;
	String name;
	int ticketPrice;
	String city;
	int crowdAttended;
	String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	Match[] matches;
	int crowdCapacity;

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getCrowdAttended() {
		return crowdAttended;
	}

	public void setCrowdAttended(int crowdAttended) {
		this.crowdAttended = crowdAttended;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Match[] getMatches() {
		return matches;
	}

	public void setMatches(Match[] matches) {
		this.matches = matches;
	}

	public int getCrowdCapacity() {
		return crowdCapacity;
	}

	public void setCrowdCapacity(int crowdCapacity) {
		this.crowdCapacity = crowdCapacity;
	}

	public Venue(int id, String name, int ticketPrice, String city, int crowdAttended, String date, Match[] matches,
			int crowdCapacity) {
		this.id = id;
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.city = city;
		this.crowdAttended = crowdAttended;
		this.matches = matches;
		this.crowdCapacity = crowdCapacity;
	}
}

class Match {
	int matchId;
	String matchName;
	String matchDate;
	String team1;
	String team2;

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public Match(int matchId, String matchName, String matchDate, String team1, String team2) {
		this.matchId = matchId;
		this.matchName = matchName;
		this.matchDate = matchDate;
		this.team1 = team1;
		this.team2 = team2;
	}

	public void findAllMatchesSameDate(String matchDate2) {
		// TODO Auto-generated method stub

	}

}

public class MatchVenue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of venues");
		int n = sc.nextInt();
		Venue v[] = new Venue[n];
		System.out.println("enter number of matches");
		int t = sc.nextInt();
		Match matches[] = new Match[t];
		for (int i = 0; i < n; i++) {
			System.out.println("enter venue id");
			int id = sc.nextInt();
			System.out.println("enter  venue name");
			String name = sc.next();
			System.out.println("enter ticket price");
			int ticketPrice = sc.nextInt();
			System.out.println("enter city name");
			String city = sc.next();
			System.out.println("enter crowdattended");
			int crowdAttended = sc.nextInt();
			System.out.println("enter venue date");
			String date = sc.next();
			System.out.println("enter crowd capacity");
			int crowdCapacity = sc.nextInt();
			System.out.println("enter match details");
			for (int j = 0; j < t; j++) {
				System.out.println("enter matchId");
				int matchId = sc.nextInt();
				System.out.println("enter matchName");
				String matchName = sc.next();
				System.out.println("enter match date");
				String matchDate = sc.next();
				System.out.println("enter team1 Name");
				String team1 = sc.next();
				System.out.println("enter team2 Name");
				String team2 = sc.next();
				matches[j] = new Match(matchId, matchName, matchDate, team1, team2);
				// matches[j].findAllMatchesSameDate(matchDate);
			}
			v[i] = new Venue(id, name, ticketPrice, city, crowdAttended, date, matches, crowdCapacity);
		}
		boolean y = true;
		while (y) {
			System.out.println(
					"1.Find all matches in a particular date\n2.Find the venue for a match of a particular team\n3.Display all the venues in order of their capacity\n4.Calculate total revenue for a particular city\n5.exit");
			System.out.println("enter your chioce");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				findAllMatchesSameDate(matches);
				break;
			case 2:
				findVenueForTeam(matches, v);
				break;
			case 3:
				venuesOrderCapacity(v);
				break;
			case 4:
				totalRevenue(v);
				break;
			case 5:
				System.out.println("exit from program");
				System.exit(0);
			}
		}
	}

	public static void totalRevenue(Venue[] v) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter city for which you want to calculate revenue");
		String city1 = s2.next();
		int totalRevenue = 0;
		for (int i = 0; i < v.length; i++) {
			if (city1.compareTo(v[i].city) == 0) {
				totalRevenue = v[i].ticketPrice * v[i].crowdAttended;
			}
		}
		System.out.println("total revenue is " + totalRevenue);
	}

	public static void venuesOrderCapacity(Venue[] v) {
		int temp = 0;
		for (int i = 0; i < v.length; i++) {
			for (int j = i + 1; j < v.length - 1; j++) {
				if (v[i].crowdCapacity > v[j].crowdCapacity) {
					temp = v[i].crowdCapacity;
					v[i].crowdCapacity = v[j].crowdCapacity;
					v[j].crowdCapacity = temp;
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getCrowdCapacity());
		}
	}

	public static void findVenueForTeam(Match[] matches, Venue[] v) {
		{
			Scanner e = new Scanner(System.in);
			System.out.println("enter team name");
			String team = e.next();
			for (int i = 0; i < v.length; i++) {
				for (int j = 0; j < matches.length; j++) {
					if (team.compareTo(matches[j].team1) == 0 || team.compareTo(matches[j].team2) == 0) {
						System.out.println(v[i].getName());
					}
				}
			}
		}
	}

	public static void findAllMatchesSameDate(Match[] matches) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter date to find matches on that date");
		String date1 = s.next();
		for (int i = 0; i < matches.length; i++) {
			if (date1.compareTo(matches[i].matchDate) == 0) {
				System.out.println(matches[i].getMatchDate() + " " + matches[i].getMatchName() + " "
						+ matches[i].getTeam1() + " " + matches[i].getTeam2());
			}
		}
	}

}
