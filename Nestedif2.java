class Nestedif2 {
public static void main(String[]args) {
String address = "Kolkata,India";

if(address.endsWith("India")) {

if(address.contains("Kolkata")) {
System.out.println("your city is Kolkata");
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