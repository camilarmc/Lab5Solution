package pkgCore;

public class WordFilter {
	
	private String strStartsWith;
	private String strEndsWith;
	private String strContains;
	private int iContainsIdx;
	private int iLength;
	
	
	public WordFilter(String strStartsWith, String strEndsWith, String strContains, int iContainsIdx, int iLength) {
		this.strStartsWith = strStartsWith;
		this.strEndsWith = strEndsWith;
		this.strContains = strContains;
		this.iContainsIdx = iContainsIdx;
		this.iLength = iLength;
	}


	public String getStrStartsWith() {
		return strStartsWith;
	}


	public void setStrStartsWith(String strStartsWith) {
		this.strStartsWith = strStartsWith;
	}


	public String getStrEndsWith() {
		return strEndsWith;
	}


	public void setStrEndsWith(String strEndsWith) {
		this.strEndsWith = strEndsWith;
	}


	public int getiContainsIdx() {
		return iContainsIdx;
	}


	public void setiContainsIdx(int iContainsIdx) {
		this.iContainsIdx = iContainsIdx;
	}


	public int getiLength() {
		return iLength;
	}


	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	
	
	
	
	
	

}
