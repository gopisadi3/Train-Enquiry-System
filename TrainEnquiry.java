//module 1

import java.io.*;
import java.util.*;
import project.user;

public class mainexecution
{

public static void main(String[] args) throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
int f=0;
ArrayList<user> a= new ArrayList<user>();
user u=null;
int g;
String pass;
String s;
try{
FileInputStreamfis=new FileInputStream("database.txt");
ObjectInputStreamoips = new ObjectInputStream(fis);
while( (u = (user)oips.readObject()) != null ){
a.add(u);}
fis.close();
oips.close();
}catch(Exception e){

}
System.out.println("-----------------------\nMenu\n1)Login\n2)create user\n3)update password\n4)display users\n5)exit\n-----------------------");
System.out.println("Enter user choice:");
int n = Integer.parseInt(dis.readLine());
while(true){
if(n==1)
{ f=0;
System.out.println("Enter user name");
String eu=dis.readLine();
for(user x:a)
{
if((x.usr_name).equals(eu)==true)
{ f=1;
System.out.println("Enter password:");
pass=dis.readLine();
if((x.pswrd).equals(pass)==true)
System.out.println("Login succesfull");
else
{System.out.println("Wrong password!loginunsuccessfull");
break;}
}
}
if(f==0)
System.out.println("Wrong username!loginunsuccessfull");

}
else if(n==2)
{
System.out.println("Enter a user name:");
String nu=dis.readLine();
System.out.println("password:");
String np=dis.readLine();
user ui=new user(nu,np);
a.add(ui);
}else if(n==3)
{
System.out.println("Enter username:");
s=dis.readLine();
f=0;
for(user x:a)
{
if((x.usr_name).equals(s)==true)
{ f=1;
System.out.println("Enter old password:");
pass=dis.readLine();

if((x.pswrd).equals(pass)==true)
{System.out.println("Enter New Password:");
pass=dis.readLine();
x.pswrd=pass;
}else
System.out.println("Wrong password");
break;
}
}
if(f==0)
System.out.println("Wrong user name\n");
}
else if(n==4){
System.out.println("------------------------------");
for (user x:a )
{ if(x==null)
{
System.out.println("No users registered");
break;
}
System.out.println("username:"+x.usr_name+"\t");
}
System.out.println("------------------------------");
}
else if(n==5)
{
FileOutputStreamfout=new FileOutputStream("Database.txt");
ObjectOutputStream oops=new ObjectOutputStream(fout);
for(user x:a)
{
oops.writeObject(x);
}
fout.close();
oops.close();
break;
}
System.out.println("Enter a user choice:");
n = Integer.parseInt(dis.readLine());
}
}

}




// MODULE 2:
import java.util.*;
import java.io.*;
class Locationo
{
  public static void main(String [] args) throws Exception
 {
   Scanner ob=new Scanner(System.in);
FileWriter f=new FileWriter("LOCATION.txt",true);
BufferedWriter b= new BufferedWriter(f); 

   int n=0;
  while(n!=5){
     System.out.println("\t\tMENU\n1.)ADD\n2.)DELETE\n3.)MODIFY\n4.)DISPLAY\n5.)EXIT");
System.out.println("ENTER YOUR CHOICE :-");
     n=ob.nextInt();
     if(n==1)
     {
System.out.println("ENTER TRAIN NAME");
      String a=ob.next();
System.out.println("ENTER TRAIN NUMBER");
      String b1=ob.next();
System.out.println("ENTER TRAIN LOCATION");
      String c=ob.next();
b.write("NAME :"+" "+a+"  "+"NUMBER :"+" "+b1+"  "+"LOCATION :"+" "+c);
b.newLine();

     }
    if(n==3)
    {

FileReader u=new FileReader("LOCATION.txt");
BufferedReader r=new BufferedReader(u);
      String temp,putData;
System.out.println("enter the location to be modified");
     String s1=ob.next();
System.out.println("enter the  modified location");
String s2=ob.next();
System.out.println("the modified location is"+s1.replace(s1,s2));
FileWriter f1=new FileWriter("LOCATION.txt",true);
BufferedWriter b1= new BufferedWriter(f1);

while( (temp=r.readLine()) != null ){
if(temp != null){ 
putData = temp.replaceAll(s1,s2);
                    b1.write(putData);
                }
            }



b1.close();
r.close();
      }
      if(n==4)
      {
BufferedReader in = new BufferedReader(new FileReader("LOCATION.txt"));
            String line;
while((line = in.readLine()) != null)
            {
System.out.println(line);
            }
in.close();
      }
    }
  }
}  













// Module:3 
import java.util.*;
import java.io.*;
class Train
{
  public static void main(String [] args) throws Exception
 {
   Scanner ob=new Scanner(System.in);
FileWriter f=new FileWriter("TRAIN.txt",true);
BufferedWriter b= new BufferedWriter(f); 
   int n=0;
  while(n!=5){
     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
     System.out.println("\t\t\t\tMENU\n\t\t1.)ADD\n\t\t2.)DELETE\n\t\t3.)MODIFY\n\t\t4.)DISPLAY\n\t\t5.)EXIT");
System.out.println("-----------------------------------------------------------------------------------------------------------------------");
System.out.println("ENTER YOUR CHOICE :-");
     n=ob.nextInt();
     if(n==1)
     {
System.out.println("-----------------------------------------------------------------------------------------------------------------------");
System.out.println("ENTER TRAIN NAME");
      String a=ob.next();
System.out.println("ENTER TRAIN NUMBER");
      String b1=ob.next();
System.out.println("ENTER TRAIN SOURCE");
      String c=ob.next();
System.out.println("ENTER TRAIN DESTINATION");
      String d=ob.next();
b.write("NAME :"+" "+a+"  "+"NUMBER :"+" "+b1+"  "+"SOURCE :"+" "+c+"  "+"DESTINATION :"+" "+d);
b.newLine();
b.close();
     }
    if(n==3)
    {
System.out.println("-----------------------------------------------------------------------------------------------------------------------");
System.out.println("enter key");
         String k=ob.next();
         //System.out.println("enter the  modified location");
         //String s2=ob.next();
         //FileWriterfw=new FileWriter("TRAIN.txt",true);
FileReader f1=new FileReader("TRAIN.txt");
BufferedReader bf=new BufferedReader(f1);
         //BufferedWriter b1= new BufferedWriter(fw);
         String temp;
         //String stemp;
         while((temp=bf.readLine())!=null)
         {
            String []t1=temp.split(" ");
for(String t:t1)
            {
               if(t.equals(k))
                  //stemp=temp.replaceAll(t,s2);
System.out.println(temp);
                   //b1.write(stemp);
             }
         }
      // b1.close();
    }
      if(n==4)
      {
System.out.println("-----------------------------------------------------------------------------------------------------------------------");
BufferedReader in = new BufferedReader(new FileReader("TRAIN.txt"));
            String line;
while((line = in.readLine()) != null)
            {
System.out.println(line);
            }
in.close();
      }
    }
  }
}  
