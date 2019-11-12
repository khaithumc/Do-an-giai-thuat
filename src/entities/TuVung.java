package entities;

public class TuVung {
	private String tuVung;
	private String loaiTu;
	private String phienAm;
	private String nghiaTu;

	public TuVung() {
	}

	public TuVung(String tuVung, String loaiTu, String phienAm, String nghiaTu) {
		this.tuVung = tuVung;
		this.loaiTu = loaiTu;
		this.phienAm = phienAm;
		this.nghiaTu = nghiaTu;
	}

	public String getTuVung() {
		return tuVung;
	}

	public void setTuVung(String tuVung) {
		this.tuVung = tuVung;
	}

	public String getLoaiTu() {
		return loaiTu;
	}

	public void setLoaiTu(String loaiTu) {
		this.loaiTu = loaiTu;
	}

	public String getPhienAm() {
		return phienAm;
	}

	public void setPhienAm(String phienAm) {
		this.phienAm = phienAm;
	}

	public String getNghiaTu() {
		return nghiaTu;
	}

	public void setNghiaTu(String nghiaTu) {
		this.nghiaTu = nghiaTu;
	}

	@Override
	public String toString() {
		return "TuVung [tuVung=" + tuVung + ", loaiTu=" + loaiTu + ", phienAm=" + phienAm + ", nghiaTu=" + nghiaTu
				+ "]";
	}

}
