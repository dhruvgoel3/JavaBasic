//FROM HERE WE CAN CONCLUDE THAT JAVA IS NOT A PURE OBJECT ORIENTED LANGUAGE BECAUSE HERE WE ARE USING PRIMITIVES NOT OBJECTS


// For every data type wrappper classes are available
// So here we can see how to create the objects of the wrapper classes
public class WrapperClass {
    public static void main(String [] args)
    {

        Integer a = Integer.valueOf(10);
        Integer b = 10;
//        this is thr proper method to declare

        Byte c = 15;
        Byte d = Byte.valueOf("15");

        Byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short t = Short.valueOf("124");

        Float g = 12.3f;

        Float h = Float.valueOf("12.5");

        Double i = Double.valueOf(123.334);

        Character k = Character.valueOf('A');

        Boolean l = Boolean.valueOf("True");


        float x = h.floatValue();
        float y = h;
//        here by writing only h top one value is automatically calling so this is called autoumboxing






    }

}
