public class Sktring {
    public static void main(String[] args){
        String name = "kuldeep";
        name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);
        name=name.trim();
        System.out.println(name);
        System.out.println(name.indexOf( "p"));
        
        System.out.println(name.indexOf("u", 0));
        int value =name.length();
        System.out.println(value);
    }
    
}
