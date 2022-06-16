# box
Previously, you wrote a project for rectangles. This one is similar but can create a 3D object (box) as well as a 2D one (paper).  

Create a class named Box, with instance variables for length, width, and height. Create a constructor with no parameters that sets the instance variables to 1. Create an overloaded constructor that needs 2 integer parameters for a 2D object, which sets the length and width, and stores 0 for the height. Create an overloaded constructor that needs 3 integer parameters for a 3D object, which sets the length, width, and height of the object. You do NOT need to create “set” and “get” methods for the 3 instance variables, you’ll be using the constructors only and direct access to the instance variables.  

Create 3 different methods to calculate the area of a 2D object, the perimeter of a 2D object, and the volume of a 3D object. You don’t have to test the kind of object, just do the calculations and return the answer.  

Create a Boolean method that checks if the object is a cube – if all 3 measurements are the same, it is a cube. Create a Boolean method that checks if the object is a box – if all 3 measurements are greater than 0, it is a box. If it is not a box, it is a flat object, only 2D – one of the measurements is 0. Create a Boolean method that checks if the flat object is a square – length and width are the same.  

Create a display method that prints out information about the object. Use an IF-Else IF structure to determine the kind of object – cube, box, square, rectangle. Check first if it is a cube – if yes, also print out the volume. If it’s not a cube, next check if the object is a box – if yes, print out its measurements and volume. If it’s not a cube or box, check if the object is a flat square – if yes, print out its measurements, perimeter and area. If not a cube, box, or square, check if the object is a rectangle – if yes, print out the measurements, perimeter, and area. Note that each object will only display one of these results. If the object is a cube, print those results and exit the If-Else If structure. That’s why you are using an If-Else If structure, so there is only one block of code executed for each call to this method.  

Write a driver class that instantiates or creates 4 Box objects – a cube, a box, a flat square, and a flat rectangle. Print out the name you gave to an object, then display its information. Repeat for all of the objects. 

Notice how short it becomes when you use constructors instead of using a set method for every dimension of the objects
