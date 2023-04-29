	


	
															package a.Practice;
															interface ProgrammerRoutine{
																void repeat();
															}
															
															public class Desktop implements ProgrammerRoutine {
																public void eat() {
																	System.out.println("Eattt 🍔🍕🌮🍪🍩🍗🍟🧁🍖🌭🍿 .....");
																}
																public void sleep() {
																	System.out.println("Sleep 😪😪😪😪😴😴😴😴.....");
																}
																public void code() {
																	System.out.println("Coding --- </>.....");
																}
																@Override
																public void repeat() {
																	// TODO Auto-generated method stub
																	eat();
																	sleep();
																	code();
																	try {
																	throw new Exception("Exception raise!!!! Reapeat shedule not follwed ");
																}
																	catch(Exception e) {
																	System.out.println("Repeat this Shedule to\n"
																			+ "became a developer ⟳⟳⟳⟳⟳...........");
																}
																}
																
																public static void main(String[] args) {	
																	Desktop dsktp =new Desktop();
																	dsktp.repeat();
																}
															}
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															