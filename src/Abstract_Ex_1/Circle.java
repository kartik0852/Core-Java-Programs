package Abstract_Ex_1;

public class Circle extends Shape{

	@Override
	//Here we use again this "void draw()" method using in a class Circle Because we declare this method in abstract class so we can access this method in any class using Parent- child relation   
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Creating Circle");
	}

}
