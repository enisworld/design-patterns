// Singleton design pattern
class Singleton
{
    private static Singleton obj;
 
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}
  
  
 /************************************************************************/ 
  /************************************************************************/
/************************************************************************/    
  ///Classical Java implementation of singleton
    public static Singleton getInstance1()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
  
  /************************************************************************/
 /************************************************************************/ 
  /************************************************************************/
  // Thread Synchronized Java implementation 
  // Only one thread can execute this at a time
    public static synchronized Singleton getInstance2()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
  
 /************************************************************************/
 /************************************************************************/
 /************************************************************************/
  // Double Checked Locking
  //Thread safe 
  
  public static Singleton getInstance3()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
  
  
  /************************************************************************/
 /************************************************************************/
 /************************************************************************/
  
  
}
