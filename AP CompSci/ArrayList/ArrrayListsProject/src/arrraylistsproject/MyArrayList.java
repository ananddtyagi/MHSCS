/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrraylistsproject;

/**
 *
 * @author AnandTyagi
 */
public class MyArrayList {
    private Object [] list;
    private int numElements;       // number of students currently in the
									// list

    // Constructs the list, initially empty,
    // but can hold up to 100
    public MyArrayList ()
    {
    	list = new Object[100];
    	numElements = 0;
    }

    MyArrayList(int i) {
        
        list = new Object[i];
        numElements = 0;
    }


    // Adds t to the end of the list
    public void add (Object t)
    {
        numElements++;
        if(numElements < 100){
            list[numElements] = t;
        }
        
    }


    // Returns the number of active elements on the list
    public int size ()
    {
        return numElements;
    }


    // Returns the student in the i'th location (counting from 0)
    // Precondition: 0 <= i < size()
    public Object get (int i)
    {
        return list[i];
    }


    // Sets the i'th location in the list to t;
    // returns the previous i'th element.
    public Object set (int i, Object t)
    {
        Object x = list[i];
        list[i] = t;
        return x;
    }


    // Removes the i'th element, sliding all items beyond i up by one spot.
    // Returns the element removed
    public Object remove (int i)
    {
        list[i] = null;
        for(int x = i; x < list.length - 1; i++){
            list[x] = list[x + 1];
        }
        
        return list;
    }
}

