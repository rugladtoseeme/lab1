package lab1;


/**
 * expanding array 
 */
public class Array {

	Integer size;
	Integer[] array;
	Integer usedSize;
	
	public Array()
	{
		size = 2;
		array = new Integer[size];
		usedSize = 0;
	}
	
	/**
	 * @return size of array
	 */
	public Integer getSize()
	{
		return size;
	}
	/**
	 * @returns actual size of array
	 */
	public Integer getUsedSize()
	{
		return usedSize;
	}
	/** 
	 * gets element from index position
	 * @param index 
	 * @returns element of array placed on index position 
	 */
	public Integer getElByIndex(int index) throws Exception
	{
		if (index > usedSize || index < 0) 
		{
			throw new Exception("Out of range");
		}
		else
		{
			return array[index];
		}
	}
	
	/**
	 * adds element to an array
	 * @param value that should be added to the end of array
	 */
	public void addElem(Integer elem)
	{
		array[usedSize] = elem;
		usedSize++;
		if (usedSize.equals(size)) array = reSize();
	}
	
	/**
	 * adds element to position in array
	 * @param position to where new element has to be placed
	 * @param element to add into an array
	 */
	public void addToPosition(Integer pos, Integer elem) throws Exception
	{
		if (pos > usedSize || pos < 0) 
		{
			throw new Exception("Out of range");
		}
		else
		{
			for (int i = usedSize; i > pos; i--)
			{
				array[i] = array[i-1];
			}
			array[pos] = elem;
			usedSize++;
			if (usedSize == size) array = reSize();
		}
	}
	/**
	 * deletes element from position in array
	 * @param position of element that has to be deleted
	 * @return element from the position
	 */
	public Integer DeleteFromPosition(int pos) throws Exception
	{
		if (pos > usedSize || pos < 0) 
		{
			throw new Exception("Out of range");
		}
		else
		{
			int elem = array[pos];
			for (int i = pos; i < usedSize; i++)
			{
				array[i] = array[i+1];
			}
			usedSize--;
			return elem;
		}
	}
	/**
	 * deletes last element of array
	 * @return last element of array
	 */
	public Integer Delete() throws Exception
	{
		if (usedSize.equals(0)) 
		{
			throw new Exception("array is empty");
		}
		else
		{
			int elem = array[usedSize-1];
			usedSize--;
			return elem;
		}
	}
	
	/**
	 * gets element from position in array (without deleting)
	 * @param position of element
	 * @return element from the position
	 */
	public Integer GetFromPosition(int pos) throws Exception
	{
		if (pos > usedSize || pos < 0) 
		{
			throw new Exception("Out of range");
		}
		else
		{
			Integer elem = array[pos];
			return elem;
		}
	}
	/**
	 * gets last element of array
	 * @return last element of array
	 */
	public Integer GetEnd() throws Exception
	{
		if (usedSize.equals(0)) 
		{
			throw new Exception("array is empty");
		}
		else
		{
			Integer elem = array[usedSize-1];
			return elem;
		}
	}
	
	private Integer[] reSize() 
	{
		Integer[] newArr = new Integer[size*3/2+1];
		for (int i = 0; i < size; i++) newArr[i] = array[i];
		size = size*3/2+1;
		return newArr;
	}
	
    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < usedSize; i++)
        {
            str.append(array[i].toString()).append(" ");
        }
        return str + "\nsize = " + size +", usedSize = " + usedSize;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        Array ar2 = (Array) obj;
        if(!usedSize.equals(ar2.usedSize))
        {
            return false;
        }
        for (int i = 0; i < usedSize; i++)
         if (!array[i].equals(ar2.array[i])) return false;
        return true;
    }

}
