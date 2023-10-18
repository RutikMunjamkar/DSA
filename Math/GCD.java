public static int findGcd(int x, int y)
	{
	    if(y == 0)
	    {
	        return x;
	    }
	    return findGcd(y, x % y);
	}
