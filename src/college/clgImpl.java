package college;

public class clgImpl implements clgMethod {
	
	clg a[]=new clg[3];
	static int cnt=0;

	@Override
	public clg add(clg c) throws ClgException {
		// TODO Auto-generated method stub
		if(cnt<3) {
			if(c.id<0) {
				throw new ClgException("Negative id is not allow please input correct id....");
			}
			a[cnt]=c;
			return a[cnt++];
		}
		else {
			System.out.println("Buffer is full....");
		}
		return null;
	}

}
