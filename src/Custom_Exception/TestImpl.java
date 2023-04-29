package Custom_Exception;

public class TestImpl implements TestA {
	
	Test ul[] = new Test[3];
	static int cnt = 0;
	
	@Override
	public Test addTest(Test t) throws TestException {
		// TODO Auto-generated method stub
		if(cnt<3) {
			if(t.id<0) {
				throw new TestException("Negative id is not allowed!!!");
			}
			ul[cnt]=t;
			return ul[cnt++];
		}
		else {
			System.out.println("Buffer is full!!!!");
			
		}
		return null;
	}

}
