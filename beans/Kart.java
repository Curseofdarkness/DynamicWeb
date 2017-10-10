package simpleWebApp.beans;

public class Kart {

	
	private String resim;
	private String isim;
	private String sinif;
	private String nadir;
	private int mana;
	
	public Kart()
	{}
	public Kart(String resim, String isim, String sinif, String nadir, int mana)
	{
		this.resim=resim;
		this.isim=isim;
		this.sinif=sinif;
		this.nadir=nadir;
		this.mana=mana;
	}
	
	public String Getresim()
	{
		return resim;
	}
	public String Getisim()
	{
		return isim;
	}
	public String Getsinif()
	{
		return sinif;
	}
	public String Getnadir()
	{
		return nadir;
	}
	public int Getmana()
	{
		return mana;
	}
	
	public void Setresim(String resim)
	{
		this.resim=resim;
	}
	
	public void Setisim(String isim)
	{	
		this.isim=isim;
	}
	
	public void Setsinif(String sinif)
	{
		this.sinif=sinif;
	}
	
	public void Setnadir(String nadir)
	{
		this.nadir=nadir;
	}
	
	public void Setmana(int mana)
	{
		this.mana=mana;
	}
	
	
	
}
