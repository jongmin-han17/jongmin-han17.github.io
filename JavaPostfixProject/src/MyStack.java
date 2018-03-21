public class MyStack
{
    public static final int MAXSIZE=500;
  
    public MyStack()
    { 
        topLoc = -1;
        item = new double[MAXSIZE];
    }

    public double getTop()
    {
    	return item[topLoc]; 
    }

    public boolean emptyCheck()
    { 
    	return (topLoc==-1); 
    }
  
    public boolean fullCheck()
    { 
    	return (topLoc==MAXSIZE-1); 
    }
  
    public void push(double newVal)
    { 
    	topLoc++;
        item[topLoc] = newVal;
    }
  
    public void pop()
    { 
    	topLoc--; 
    }
    
    public double getBottomValue()
    {
    	return item[0]; 
    }
    
    public void stackStack(MyStack T)
    {
    	int i=0;
    	while (T.item[i] != '\0')
    	{
    		this.push(T.item[i]);
    		i++;
    	}
    }
    
    private int topLoc;
    private double[] item;
}