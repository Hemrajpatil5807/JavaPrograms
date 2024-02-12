 class Sample {
    public static void main(String [] args){
        String name = "Test";
        //Length Function
        System.out.println("Length Function="+name.length());
        //split
        String msg = "ssbt collage of engineering";
        String [] strArray=msg.split(" ");

        for (String s: strArray) {
            System.out.println(s);
        }
        //split function
        String citynames= "Jalgaon,Mumbai,Pune,Kalyan";
        System.out.println("\nBefore split "+citynames);
        String[] cityArray = citynames.split(",");
        System.out.println("\nAfter split = ");
        for (String s:cityArray) {
            System.out.println(s);
        }

        //compareTo function
        String s1="Java Programming";
        String s2="Java Programming";
        String s3="Java Pragramming1";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

        //replace
        System.out.println("\nReplace Method");
        String msg1="Happy Wednesday";
        System.out.println("Before replace = "+msg1);
        System.out.println("After replace = "+msg1.replace("Wednesday","Thursday"));

        //substring
        System.out.println("\nSubstring");
        String msg2=msg1.substring(0,5);
        System.out.println(msg2);

        //indexof
        System.out.println("\nIndexof ");
        System.out.println("Indexof w in msg1 "+msg1.indexOf("w"));

        //contain
        System.out.println("\nContain ");
        System.out.println("msg1 contain Happy "+msg1.contains("Happy"));

        //charAt
        System.out.println("CharaAt ");
        System.out.println("charAt index 4 = "+msg1.charAt(4));

        //trim
        System.out.println("\nTrim ");
        String msg4="Good Morning Everyone ";
        System.out.println("trim all spaces = "+msg4.trim());




    }
}
