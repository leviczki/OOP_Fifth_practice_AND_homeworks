package hanglemez;

public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;
	
	public Hanglemez(String eloado, String cim, int hossz) {
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}
	
	public String getInfo() {
		return ""+this.eloado+": "+this.cim+", "+this.hossz+" perc";
	}
	
	public int hosszusag(Hanglemez x) {
		if(this.hossz > x.hossz)
			return 1;
		else if(this.hossz < x.hossz)
			return -1;
		else return 0;
	}
	
	public boolean eloadoEgyezes(String eloado) {
		if(this.eloado.equals(eloado))
			return true;
		else return false;
	}

	public String getEloado() {
		return eloado;
	}

	public String getCim() {
		return cim;
	}

	public int getHossz() {
		return hossz;
	}
}
