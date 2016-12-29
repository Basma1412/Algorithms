
package algorithm.project;

class Location
{
    double x;
    double y;
    public Location(double x , double y )
    {
        this.x=x;
        this.y=y;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void  setX(double x)
    {
        this.x=x;
    }
    public void setY(double y)
    {
        this.y=y;
    }
}

class Message{
    
}

class Node{
    int id;
    Location location;
    int batteryPower;
    
    public Node(int id,Location location,int batteryPower)
    {
        this.id=id;
        this.location=location;
        this.batteryPower=batteryPower;
    }
     
    public Location getLocation()
    {
        return this.location;
    }
    public void  setLocation(Location loc)
    {
        this.location=loc;
    }
    
   public boolean inRange(Node mobile)
   {
       double locX = this.location.getX();
       double locY = this.location.getY();
       
       
       double locX2 = mobile.location.getX();
       double locY2 = mobile.location.getY();
       
       double distance ; 
       
       double param1=locX2-locX;
       double param2=locY2-locY;
       
       distance=Math.sqrt((Math.pow(param1, 2))+(Math.pow(param2, 2)));
       
       return distance<=20;
       
   }
   
    public void broadcast(Message msg)
   {
   }
   
   public void send(Message msg)
   {
       
   }
   
   public void receive(Message msg)
   {
       
   }
}


public class AlgorithmProject {

    public static void main(String[] args) {
    }
    
}
