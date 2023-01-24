class Nestedif1 {
public static void main(String[]args) {
String address = "Kolkata, India";

if(address.endsWith("Nepal")) {

if(address.contains("Dunlop")) {
System.out.println("your city is Dunlop");
}

else if(address.contains("Newton")) {
System.out.println("your city is Newton");
}


else{
System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("You are not living in India");
}
}
}