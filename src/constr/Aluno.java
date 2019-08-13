package constr;

public class Aluno {
	public String name;
	public double s1;
	public double s2;
	public double s3;
	
	public double sumScore() {
		return s1 + s2 + s3;
	}
	
	public double verifyStatus() {
		if (sumScore() < 60.0){
			return 60.0 - sumScore(); 
		}
		else {
			return 0.0;
		}
	}

}
