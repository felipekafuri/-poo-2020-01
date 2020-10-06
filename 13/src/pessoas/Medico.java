package pessoas;

public class Medico {
	boolean isGraduated;
	
	public Medico(boolean isGraduated){
		this.isGraduated = isGraduated;
	}
	
	public void showGraduation() {
		System.out.println(this.isGraduated);
	}
}