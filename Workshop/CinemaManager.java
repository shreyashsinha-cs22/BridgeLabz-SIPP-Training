package com.movieschedulemanager;
import java.util.*;


public class CinemaManager {
    private List<String> movieTitles = new ArrayList<>();
    private List<String> showtimes = new ArrayList<>();

    // Adds a movie if the time format is valid
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showtimes.add(time);
        System.out.println("Added: " + title + " at " + time);
    }

    // Validates time format as HH:MM (24-hour)
    private boolean isValidTime(String sTime) throws InvalidTimeFormatException {
		try {
			String[] hr_min=sTime.split(":");
			
			if((Integer.parseInt(hr_min[0])>0 && Integer.parseInt(hr_min[0])<24) && (Integer.parseInt(hr_min[1])>=0 && Integer.parseInt(hr_min[1])<60)) {
				return true;
			}
			return false;
		}
		catch(Exception E) {
			throw new InvalidTimeFormatException("InvalidTimeFormat");
		}
	}
    // Searches movies by keyword in title
    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            String title = movieTitles.get(i);
            if (title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(String.format("Match %d: %s at %s", i, title, showtimes.get(i)));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching movies found for keyword: " + keyword);
            System.out.println("All Available mobies: ");
            displayAllMovies();
        }
    }

    // Displays all movies and showtimes
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies to display.");
        } else {
            for (int i = 0; i < movieTitles.size(); i++) {
                System.out.println(String.format("Movie %d: %s at %s", i + 1, movieTitles.get(i), showtimes.get(i)));
            }
        }
    }

    // Generates a printable report as an array
    public String[] generateReport() {
        String[] report = new String[movieTitles.size()];
        for (int i = 0; i < movieTitles.size(); i++) {
            report[i] = movieTitles.get(i) + " - " + showtimes.get(i);
        }
        return report;
    }

}

package com.movieschedulemanager;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

 package com.movieschedulemanager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        CinemaManager cm = new CinemaManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Movie\n2. Search Movie\n3. Display All\n4. Report\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter movie title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter showtime (HH:MM): ");
                        String time = sc.nextLine();
                        cm.addMovie(title, time);
                        break;
                    case 2:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        cm.searchMovie(keyword);
                        break;
                    case 3:
                        cm.displayAllMovies();
                        break;
                    case 4:
                        System.out.println("Movie Report:");
                        String[] report = cm.generateReport();
                        for (String line : report) {
                            System.out.println(line);
                        }
                        break;
                    case 5:
                        System.out.println("Exiting.");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InvalidTimeFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Attempted to access invalid index.");
            }
        }
    }
}