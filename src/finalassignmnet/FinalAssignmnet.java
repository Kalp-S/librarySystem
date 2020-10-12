/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignmnet;
import java.util.Scanner;
import java.util.ArrayList;

public class FinalAssignmnet {

    /**
     * @param args the command line arguments
     */
    //Objects that are hard coded into program
	
	
		//Arraylists

    public static void main(String[] args) {
        // TODO code application logic here
        
        	ArrayList<People> peopleList= new ArrayList <People>();	//list of all existing students
                ArrayList<Book> bookList= new ArrayList <Book>(); 
                ArrayList<Laptops> laptopList= new ArrayList <Laptops>();
       		
                Book book1= new Book ("The Sorcerer's Stone", "J.K.Rowling",1001,"Fantasy", 10.99, 3, false );
		Book book2= new Book ("The Chamber of Secrets", "J.K.Rowling",1002,"Fantasy", 10.99, 4,false );
		Book book3= new Book ("Sherlock Holmes", "Arthur Conan Doyle",1100,"Mystery", 8.99, 2, false);
		Book book4= new Book ("Fault in our Stars", "John Green",1200,"Romance", 15.99, 4, false);

		Student student1= new Student ("Iyvan", "Chandran",11111);
                Student student2 = new Student("Kalp", "Shah", 123456);
		Prof prof1= new Prof ("Aleeza", "Hashmi",500);
                
                
                
                
		Admin lib= new Admin (peopleList, bookList, laptopList);
                
                Laptops l1 = new Laptops (1, 500.00, 5);
                Laptops l2 = new Laptops (2,1000.00,4);
		
                lib.addHardLaptop(l1, l2);
                lib.addHardBook(book1, book2, book3, book4);
		lib.addHardPeople(student1,student2);
                System.out.println("Welcome to the library System");
                System.out.println("-----------------------------------");
                Scanner reader = new Scanner(System.in);
        System.out.println("do you want to loggin? type 1 for yes, any other key to shutdown the system");
        String x = reader.nextLine();
        if(x.equals("1"))
        {
            
            boolean d=true;
            while (d=true)
            {
             
                    System.out.println("List of people:");
                    for(int i = 0; i < lib.returnPeopleList().size(); i++) 
                    {
                    System.out.println(lib.returnPeopleList().get(i).getFirstN()+ " " + lib.returnPeopleList().get(i).getLastN() + "   " +lib.returnPeopleList().get(i).getId() );
                                        
                   }
                    System.out.println("*******************************************************************************");
                    
                    System.out.println("List of Books:");
                    for(int i = 0; i < lib.returnBookList().size(); i++) 
                    {
                    System.out.println(lib.returnBookList().get(i).getTitle()+ " " + lib.returnBookList().get(i).getAuthor() + "   " +lib.returnBookList().get(i).getISBN() + "   " +lib.returnBookList().get(i).getCategory() );
                    }
                    System.out.println("*******************************************************************************");
                    
                    System.out.println("List of Laptops:");
                    for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                    {
                    System.out.println(lib.returnLaptopList().get(i).getId()+ " " + lib.returnLaptopList().get(i).getCost()+" " + lib.returnLaptopList().get(i).getTotalLaptop());
                                      
                   }
                    System.out.println("Enter in ID"); 
                    System.out.println("For admin enter in 0");
                    int s = reader.nextInt();
                    
                    if(s!=0&&(lib.searchPerson(s)==false))
                    {
                        System.out.println("User doesnt exist"); 
                    }
                    else if((lib.searchPerson(s)==true))
                    {
                        System.out.println("Hello " + lib.getPerson(s).getFirstN() +" " + lib.getPerson(s).getLastN() ); 
                       System.out.println("Books Checked out : ");
                       for (int i=0;i< lib.getPerson(s).getBooksBorrowed().size(); i++ )
                       {
                           System.out.println(lib.getPerson(s).getBooksBorrowed().get(i).getTitle());
                       }
                        System.out.println("Fines : "+ lib.getPerson(s).getBalance());
                        System.out.println("Laptop Borrowed: "+ lib.getPerson(s).getlaptopCheckOut());
                       
                        
                            boolean k=true;
                            while (k==true )
                            {
                            System.out.println("Hello " + s + ", what do you want to do today?");
                            System.out.println("enter 1 to check out a book");
                            System.out.println("enter 2 to return a book");
                            System.out.println("enter 3 to check out a laptop");
                            System.out.println("enter 4 to return a laptop");
                            System.out.println("enter 5 to pay fines");
                            System.out.println("enter 6 to logout");
                            int a = reader.nextInt();
                            
                            if (a==1)
                            {
                             System.out.println("You want to check out a book"); 
                             for(int i = 0; i < lib.returnPeopleList().size(); i++) 
                             {
                                      System.out.println(lib.returnBookList().get(i).getTitle());
                                        
                             }
                             
                             System.out.println("Which Book do you want to borrow?"); 
                             String book = reader.nextLine();
                             
                             if(lib.searchBook(book)==true)
                             {
                                 lib.checkOutBook(lib.getPerson(s), book);
                                 System.out.println("you have checked out " + book); 
                             }
                             else
                             {
                                  System.out.println("this book does not exist " + book); 
                             }
                             
                            }
                            else if (a==2)
                            {
                             System.out.println("You want to return a book"); 
                             System.out.println("Which Book do you want to return?"); 
                             for(int i = 0; i < lib.returnBookList().size(); i++) 
                             {
                                      System.out.println(lib.returnBookList().get(i).getTitle());
                                      
                                        
                             }
                             String book = reader.nextLine();
                              if(lib.searchBook(book)==true)
                             {
                                 System.out.println("How long did you have the book for?"); 
                                 System.out.println("If the book is lost type lost"); 
                                 String duration = reader.nextLine();
                                 
                                 lib.returnBook(lib.getPerson(s), book ,duration);
                                 System.out.println("you have returned the book " + book); 
                             }
                             else
                             {
                                  System.out.println("this book does not exist " + s); 
                             }
                             
                            
                                
                            }
                            else if (a==3)
                            {
                               System.out.println("You want to check out a laptop");                                
                                if (lib.getPerson(s).getlaptopCheckOut()==true)
                                {
                                   System.out.println("You already have a laptop checked out");
                                }
                                
                                else 
                                {
                                    for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                             {
                                      System.out.println(lib.returnLaptopList().get(i).getId());
                                        
                             }
                                   System.out.println("Which laptop do you want to check out?"); 
                                   int id = reader.nextInt();
                                   
                                   if(lib.searchLaptop(id)==true)
                                   {
                                       lib.checkOutLaptop(lib.getPerson(s), id);
                                   }
                                   else
                                   {
                                       System.out.println("Laptop does not exist"); 
                                   }
                                                                    
                                   
                                }
                            }
                            else if (a==5)
                            {
                                System.out.println("You want to return a laptop");
                                
                              if(lib.getPerson(s).getlaptopCheckOut()==true)
                              {
                                 System.out.println("How long did you have the laptop for?"); 
                                 System.out.println("If the book is lost type lost"); 
                                 String duration = reader.nextLine();
                                 lib.returnLaptop(lib.getPerson(s),lib.getPerson(s).getLaptop(),duration);
                                 System.out.println("you have returned the Laptop"); 
                                 
                                  
                              }
                             
                             else
                             {
                                  System.out.println("You don't have a laptop borrowed"); 
                             }
                             
                               
                            }
                              else if (a==5)
                            {
                                System.out.println("You want to pay your fines");
                                System.out.println("Fines : "+ lib.getPerson(s).getBalance());
                                if (lib.getPerson(s).getBalance()==0)
                                {
                                    System.out.println("You don't have any fines");
                                }
                                else
                                {
                                    System.out.println("How much do you want to pay? ");
                                    int fines = reader.nextInt();
                                    if(fines>lib.getPerson(s).getBalance())
                                    {
                                       System.out.println("That is too much"); 
                                    }
                                    else
                                    {
                                        lib.deleteFines(lib.getPerson(s).getId(), fines);
                                        System.out.println("Your new balance is : " +lib.getPerson(s).getBalance()); 
                                    }
                                    
                                }
                                
                            }
                            else if (a==6)
                            {
                                System.out.println("logging out");
                                k=false;
                            }
                             else 
                            {
                                System.out.println("invalid key");
                            }
                        } 
                      } 
                    else if (s==0)
                    {
                        boolean k=true;
                            while (k==true )
                            {System.out.println("Hello Admin, what do you want to do today?");
                            System.out.println("enter 1 to add a Student");
                            System.out.println("enter 2 to add a Prof");
                            System.out.println("enter 3 to add a Book");
                            System.out.println("enter 4 to add a Laptop");
                            System.out.println("enter 5 to add Book copies");
                            System.out.println("enter 6 to add a Laptop copies");
                            System.out.println("enter 7 to delete a Person");
                            System.out.println("enter 8 to delete a Book");
                            System.out.println("enter 9 to delete a Laptop");                            
                            System.out.println("enter 10 to delete Book copies");
                            System.out.println("enter 11 to delete Laptop copies");
                            System.out.println("enter 12 to logout");

                            int a = reader.nextInt();
                            if (a==12)
                            {
                                System.out.println("logging out");
                                k=false;
                            }
                            else if (a==1)
                            {
                                System.out.println("You want to add a student");
                                System.out.println("Please Enter in the first name");
                                String fn = reader.nextLine();
                                System.out.println("Please Enter in the last name");
                                String ln = reader.nextLine();
                                System.out.println("Please Enter in the id name");
                                int id = reader.nextInt();
                                
                                lib.addStudent(fn, ln, id);
                                
                         

                            }
                             else if (a==2)
                            {
                                System.out.println("You want to add a Prof");
                                System.out.println("Please Enter in the first name");
                                String fn = reader.nextLine();
                                System.out.println("Please Enter in the last name");
                                String ln = reader.nextLine();
                                System.out.println("Please Enter in the id name");
                                int id = reader.nextInt();
                                
                                lib.addProf(fn, ln, id);
                                                   

                            }
                              else if (a==3)
                            {
                                System.out.println("You want to add a Book");
                                System.out.println("Please Enter in the title");
                                String title = reader.nextLine();
                                System.out.println("Please Enter in the Author");
                                String author = reader.nextLine();
                                System.out.println("Please Enter in the isbn");
                                int isbn = reader.nextInt();
                                System.out.println("Please Enter in the genre/category");
                                String genre = reader.nextLine();
                                System.out.println("Please Enter in the cost");
                                double cost = reader.nextDouble();
                                System.out.println("Please Enter in the amount of book copies");
                                int tc = reader.nextInt();
                                System.out.println("Please type 1 for prof only. If this book is for anyone type in any number.");
                                int po = reader.nextInt();
                                boolean profO=false; 
                                
                                if(po==1)
                                {
                                 profO=true;   
                                }
                                
                               lib.addNewBook(title, author, isbn, author, tc, cost, profO);
                                                   
                            }
                             else if (a==4)
                            {
                                System.out.println("You want to add a Laptop");
                                System.out.println("Please Enter in the id");
                                int id = reader.nextInt();
                                System.out.println("Please Enter in the cost");
                                double cost = reader.nextDouble();
                                System.out.println("Please Enter in the amount of laptops");
                                int copies = reader.nextInt();
                                
                               lib.addLaptop(id, cost, copies);
                                                  

                            }
                            
                             else if (a==5)
                            {
                                
                                System.out.println("You want to add more copies of a book");
                                System.out.println("List of Books:");
                                    for(int i = 0; i < lib.returnBookList().size(); i++) 
                                    {
                                    System.out.println(lib.returnBookList().get(i).getTitle()+ " " + lib.returnBookList().get(i).getAuthor() + "   " +lib.returnBookList().get(i).getISBN() + "   " +lib.returnBookList().get(i).getCategory() );
                                    }
                                System.out.println("Please Enter in the Title");
                                String title = reader.nextLine();
                                System.out.println("Please Enter in the amount of copies");
                                int copies = reader.nextInt();
                                
                                lib.addBookCopies(title, copies);
                                                                               

                            }
                             
                             else if (a==6)
                            {
                                System.out.println("You want to add a laptop copy");
                                System.out.println("List of Laptops:");
                                for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                                {
                                System.out.println(lib.returnLaptopList().get(i).getId()+ " " + lib.returnLaptopList().get(i).getCost()+" " + lib.returnLaptopList().get(i).getTotalLaptop());

                               }
                                System.out.println("Please Enter in the id");
                                int id = reader.nextInt();
                                System.out.println("Please Enter in the amount of laptops");
                                int copies = reader.nextInt();
                                
                               lib.addLaptopCopies(id, copies);
                                                  

                            }
                             else if (a==7)
                            {
                                System.out.println("You want to delete a person");
                                System.out.println("List of people:");
                                for(int i = 0; i < lib.returnPeopleList().size(); i++) 
                                {
                                System.out.println(lib.returnPeopleList().get(i).getFirstN()+ " " + lib.returnPeopleList().get(i).getLastN() + "   " +lib.returnPeopleList().get(i).getId() );

                               }
                                System.out.println("Please Enter in the id");
                                int id = reader.nextInt();
                                                             
                               lib.deletePerson(id);
                                                  

                            }
                            
                            else if (a==8)
                            {
                                System.out.println("You want to delete a Book");
                                 System.out.println("List of Books:");
                                    for(int i = 0; i < lib.returnBookList().size(); i++) 
                                    {
                                    System.out.println(lib.returnBookList().get(i).getTitle()+ " " + lib.returnBookList().get(i).getAuthor() + "   " +lib.returnBookList().get(i).getISBN() + "   " +lib.returnBookList().get(i).getCategory() );
                                    }
                                    System.out.println("Please enter in the book title");
                                    String title = reader.nextLine();
                                for(int i = 0; i < lib.returnBookList().size(); i++) 
                                    {
                                        if(lib.returnBookList().get(i).getTitle().equals(title))
                                        {
                                            lib.deleteTheBook(lib.returnBookList().get(i));
                                        }
                                    }
                             
                            }
                           
                            else if (a==9)
                            {
                             System.out.println("You want to delete a Laptop");
                                 System.out.println("List of Laptops:");
                                for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                                {
                                System.out.println(lib.returnLaptopList().get(i).getId()+ " " + lib.returnLaptopList().get(i).getCost());

                               }
                                    System.out.println("Please enter in the ID");
                                    int id = reader.nextInt();
                                for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                                    {
                                        if(lib.returnLaptopList().get(i).getId()==id)
                                        {
                                           lib.deleteLaptop(lib.returnLaptopList().get(i));
                                        }
                                    }
                            }
                            else if (a==10)
                            {
                             System.out.println("You want to delete a Book");
                                 System.out.println("List of Books:");
                                    for(int i = 0; i < lib.returnBookList().size(); i++) 
                                    {
                                    System.out.println(lib.returnBookList().get(i).getTitle()+ " " + lib.returnBookList().get(i).getAuthor() + "   " +lib.returnBookList().get(i).getISBN() + "   " +lib.returnBookList().get(i).getCategory() );
                                    }
                                    System.out.println("Please enter in the book title");
                                    String title = reader.nextLine();
                                    System.out.println("Please enter in how many copies you want to delete");
                                    int copies = reader.nextInt();
                                for(int i = 0; i < lib.returnBookList().size(); i++) 
                                    {
                                        if(lib.returnBookList().get(i).getTitle().equals(title))
                                        {
                                            lib.deleteBookCopies(title,copies);
                                        }
                                    }
                            }
                             else if (a==11)
                            {
                             System.out.println("You want to delete laptop copies");
                                 System.out.println("List of Laptops:");
                                for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                                {
                                System.out.println(lib.returnLaptopList().get(i).getId()+ " " + lib.returnLaptopList().get(i).getCost());

                               }
                                    System.out.println("Please enter in the ID");
                                    int id = reader.nextInt();
                                    System.out.println("Please enter in how many laptop copies you wish to delete");
                                    int copies = reader.nextInt();
                                for(int i = 0; i < lib.returnLaptopList().size(); i++) 
                                    {
                                        if(lib.returnLaptopList().get(i).getId()==id)
                                        {
                                           lib.deleteLaptopCopies(id,copies);
                                        }
                                    }
                            }
                             else if (a==12)
                            {
                                System.out.println("logging out");
                                k=false;
                            }
                           else 
                            {
                                System.out.println("invalid key");
                            }
                        } 
                    
                    }
                    
                         else
                            {
                                System.out.println("goodbye");
                            } 
                    }
                       
        }
        
    }
}

        
        
        
    
    

