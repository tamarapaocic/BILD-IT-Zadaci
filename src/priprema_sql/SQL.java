package priprema_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import metode.IntUserInput;

public class SQL {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "kialoptica";
	private static final String CONN_STRING = "jdbc:mysql://localhost/world?useSSL=false";
	
	public static void main(String[] args) throws SQLException {
		 Scanner input = new Scanner(System.in);
	     try{
	    		 Connection connection = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
	    		 Statement statement = connection.createStatement();
	    		 String query = "";
	    		 System.out.println("*** Welcome! ***\n");
	    		 System.out.println("Select one option:");
	    		 
	    		 System.out.println("1) List of all countries ");
	    		 System.out.println("2) List of all districts");
	    		 System.out.println("3) List of all cities");
	    		 System.out.println("4) List of all country languages");
	 			 System.out.println("5) Search for languages by country code");
	 			 System.out.println("6) Search for cities by country code");
	 			 System.out.println("7) List of countries by continent");
                 System.out.println("8) Top 10 countries by population");
                 System.out.println("9) Bottom 10 countries by population");
                 System.out.println("10) Top 25 languages that majority of population speaks in their country");
                 System.out.println("11) Search countries by population higher than n number");
                 System.out.println("12) Search countries by surface area higher than n number");
                 System.out.println("13) Search for the city by first letter(s) or entire name");
                 System.out.println("14) Most popular types of government in world");
                 System.out.println("15) List of countries and their details");
                 System.out.println("16) Search which language is spoken in one city");

	    		 int option = IntUserInput.getInt(input, "", 0, 20);

	    		 switch (option) {
	    		 
	    		 
	 			case 1: {
	 				query = "SELECT * from country;";
	 				// executes a query
	 				ResultSet result = statement.executeQuery(query);
	 				// prints in console
	 				while (result.next()) {
	 					System.out.println(result.getString("Name"));
	 				}
	 				break;
	 			}
	 			
	 			case 2: {
	 				query = "SELECT DISTINCT District FROM world.city;";
	 				ResultSet result = statement.executeQuery(query);
	 				while(result.next()){
	 					System.out.println(result.getString("District"));
	 				}
	 				break; 
	 				}
	 			
	 			case 3: {
	 				query = "SELECT * FROM world.city ORDER BY Name ASC";
	 				ResultSet result = statement.executeQuery(query);
	 				System.out.println("Name of all districts: \n");
	 				while(result.next()){
	 					System.out.print(result.getString("Name"));
	 					System.out.println();
	 				} break; 
	 				}
	 			
	 			case 4: {
	 				query = "SELECT Language FROM world.countrylanguage ORDER BY Language ASC;";
	 				ResultSet result = statement.executeQuery(query);
	 				while(result.next()){
	 					System.out.println("Language");
	 				} break; 
	 				}
	 			
	 			case 5: {
	 				//Search which languages are spoken in one specific country
	 				System.out.println("Enter country code by which you want to search languages: ");
	 				String countryCode = input.next();
	 				query = "SELECT Language FROM world.countrylanguage WHERE CountryCode = '" + countryCode + "';";
	 				ResultSet result = statement.executeQuery(query);
	 				if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				while(result.next()){
	 					System.out.println(result.getString("Language"));
	 				} break;
	 			}
	 			
	 			case 6: {
	 				System.out.println("Enter country code by which you want to search cities: ");
	 				String countryCode = input.next();
	 				query = "SELECT Name FROM world.city WHERE CountryCode = '" + countryCode + "';";
	 				ResultSet result = statement.executeQuery(query);
	 				if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				while(result.next()){
	 					System.out.println(result.getString("Name"));
	 				} break;
	 			}
	 			
	 			case 7: {
	 				System.out.println("List of countries by continent");
	 				query = "SELECT Continent,Name FROM world.country order by Continent asc";
	 				ResultSet result = statement.executeQuery(query);
	 				while(result.next()){
	 					System.out.printf("%-32s%-28s\n",result.getString("Continent"),result.getString("Name"));
	 				} break;
	 			}
	 			
	 			case 8: {
	 				System.out.println("Top 10 countries by population");
	 				query = "SELECT Population,Name FROM world.country ORDER BY Population DESC LIMIT 10;";
	 				ResultSet result = statement.executeQuery(query);
	 				while(result.next()){
	 					System.out.printf("%-22s%-28s\n",result.getString("Name"),result.getString("Population"));
	 				} break;
	 			}
	 			
	 			case 9: {
	 				System.out.println("Bottom 10 countries by population");
	 				query = "SELECT Population,Name FROM world.country ORDER BY Population ASC LIMIT 10;";
	 				ResultSet result = statement.executeQuery(query);
	 				while(result.next()){
	 					System.out.printf("%-45s%-28s\n",result.getString("Name"),result.getString("Population"));
	 				} break;
	 			}
	 			
	 			case 10: {
	 				query = "SELECT Language,Percentage,country.Name,IsOfficial FROM world.countrylanguage INNER JOIN world.country ON countrylanguage.CountryCode = country.Code ORDER BY Percentage DESC LIMIT 25;";
	 				ResultSet result = statement.executeQuery(query);
	 				System.out.printf("%-45s%-20s%-34s%-10s\n\n","Language","Percentage","Country","IsOfficial");
	 				while(result.next()){
	 					System.out.printf("%-45s%-20s%-34s%-10s\n",result.getString("Language"),result.getString("Percentage"),result.getString("country.Name"),result.getString("IsOfficial"));
	 				} break;
	 			}
	 			
	 			case 11: {
	 				System.out.println("Countries above n population");
	 				System.out.println("Enter the number:");
	 				int number = input.nextInt();
	 				query = "SELECT Population,Name FROM world.country WHERE Population >" + number + " ORDER BY Population;";
	 				ResultSet result = statement.executeQuery(query);
	 				if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				System.out.printf("%-45s%-28s\n","Country","Population");
	 				while(result.next()){
	 					System.out.printf("%-45s%-28s\n",result.getString("Name"),result.getString("Population"));
	 				} break;
	 			}
	 			
	 			case 12: {
	 				System.out.println("Countries above n surface area");
	 				System.out.println("Enter the number:");
	 				int number = input.nextInt();
	 				query = "SELECT SurfaceArea,Name,Population FROM world.country  WHERE SurfaceArea >" + number + " ORDER BY SurfaceArea;";
	 				ResultSet result = statement.executeQuery(query);
 					System.out.printf("%-45s%-28s%-25s\n","Name","SurfaceArea","Population");
 					if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				while(result.next()){
	 					System.out.printf("%-45s%-28s%-25s\n",result.getString("Name"),result.getString("SurfaceArea"),result.getString("Population"));
	 				} break;
	 			}
	 			
	 			case 13:{
	 				System.out.println("Enter first letters or entire name of the city:");
	 				String letters = input.next();
	 				query = "SELECT Name,District,Population FROM city WHERE Name LIKE '" + letters + "%" + "'";
	 				ResultSet result = statement.executeQuery(query);
 					System.out.printf("%-45s%-28s%-25s\n","Name","District","Population");
 					if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				while(result.next()){
	 					System.out.printf("%-45s%-28s%-25s\n",result.getString("Name"),result.getString("District"),result.getString("Population"));
	 				} break;
	 			}
	 			
	 			
	 			case 14: {
	 				query = "SELECT country.GovernmentForm,COUNT(*) as NumberOfCountries FROM world.country  group by GovernmentForm ORDER BY NumberOfCountries DESC;";
	 				ResultSet result = statement.executeQuery(query);	
	 				System.out.printf("%-38s%-20s\n","Government Form","Number of countries");
	 				while(result.next()){
	 					System.out.printf("%-38s%-20s\n",result.getString("GovernmentForm"),result.getString("NumberOfCountries"));
	 				} break;
	 			}
	 			
	 			
	 			case 15: {
	 				query = "SELECT Name,Continent,Region,IndepYear,Population,LifeExpectancy,countrylanguage.Language FROM world.countrylanguage INNER JOIN world.country ON countrylanguage.CountryCode = country.Code ORDER BY Name;";
	 				ResultSet result = statement.executeQuery(query);
 					System.out.printf("%-28s%-28s%-28s%-28s%-28s%-28s%-28s\n","Country","Continent","Region","Independecy Year","Population","Life Expectancy","Language");
	 				while(result.next()){
	 					System.out.printf("%-28s%-28s%-28s%-28s%-28s%-28s%-28s\n",result.getString("Name"),result.getString("Continent"),result.getString("Region"),result.getString("IndepYear"),result.getString("Population"),result.getString("LifeExpectancy"),result.getString("Language"));
	 				} break;
	 			}
	 			
	 			
	 			case 16: {
	 				System.out.println("Enter first letters or name of city");
	 				String letters = input.next();
	 				query = "SELECT city.Name,Language FROM world.countrylanguage INNER JOIN world.country on countrylanguage.CountryCode = country.Code INNER JOIN world.city ON country.Code = city.CountryCode  where city.Name LIKE '" + letters + "%" + "'";
	 				ResultSet result = statement.executeQuery(query);
	 				if (!result.next()) {
						System.out.println("Wrong input or query not found");
						return;
					}
	 				while(result.next()){
	 					System.out.printf("%-28s%-28s\n",result.getString("city.Name"),result.getString("Language"));
	 				} break;
	 			}
	 			
	    		 }
	     }catch (InputMismatchException e) {
				System.out.println("Wrong input, try again");
				main(args);
			} catch (SQLException ey) {
				System.out.println("Something went wrong, try again:");
				main(args);
			}
	    
		}
		}
	
