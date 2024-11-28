  package Model;
  
  public class KTP {
    String nIK;
    String nama;
    String tempatLahir;
    String tanggalLahir;
    JenisKelamin jenisKelamin; //
    GolDarah golDarah; // 
    String alamat;
    String rT_RW;
    String kel_Desa;
    String kecamatan;
    Agama agama;//
    String statusPerkawinan;
    String pekerjaan;//
    Kewarganegaraan kewarganegaraan;//
    String foto;//
    String tandaTangan;
    String berlakuHingga;
    String kotaPembuatan;
    String tanggalPembuatan;

    public KTP(String nIK, String nama, String tempatLahir, String tanggalLahir, JenisKelamin jenisKelamin,
        GolDarah golDarah, String alamat, String rT_RW, String kel_Desa, String kecamatan, Agama agama,
        String statusPerkawinan, String pekerjaan, Kewarganegaraan kewarganegaraan, String foto, String tandaTangan,
        String berlakuHingga, String kotaPembuatan, String tanggalPembuatan) {
      this.nIK = nIK;
      this.nama = nama;
      this.tempatLahir = tempatLahir;
      this.tanggalLahir = tanggalLahir;
      this.jenisKelamin = jenisKelamin;
      this.golDarah = golDarah;
      this.alamat = alamat;
      this.rT_RW = rT_RW;
      this.kel_Desa = kel_Desa;
      this.kecamatan = kecamatan;
      this.agama = agama;
      this.statusPerkawinan = statusPerkawinan;
      this.pekerjaan = pekerjaan;
      this.kewarganegaraan = kewarganegaraan;
      this.foto = foto;
      this.tandaTangan = tandaTangan;
      this.berlakuHingga = berlakuHingga;
      this.kotaPembuatan = kotaPembuatan;
      this.tanggalPembuatan = tanggalPembuatan;
    }
    
    public String getnIK() {
      return nIK;
    }
    public void setnIK(String nIK) {
      this.nIK = nIK;
    }
    public String getNama() {
      return nama;
    }
    public void setNama(String nama) {
      this.nama = nama;
    }
    public String getTempatLahir() {
      return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
      this.tempatLahir = tempatLahir;
    }
    public String getTanggalLahir() {
      return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir) {
      this.tanggalLahir = tanggalLahir;
    }
    public JenisKelamin getJenisKelamin() {
      return jenisKelamin;
    }
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
      this.jenisKelamin = jenisKelamin;
    }
    public GolDarah getGolDarah() {
      return golDarah;
    }
    public void setGolDarah(GolDarah golDarah) {
      this.golDarah = golDarah;
    }
    public String getAlamat() {
      return alamat;
    }
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }
    public String getrT_RW() {
      return rT_RW;
    }
    public void setrT_RW(String rT_RW) {
      this.rT_RW = rT_RW;
    }
    public String getKel_Desa() {
      return kel_Desa;
    }
    public void setKel_Desa(String kel_Desa) {
      this.kel_Desa = kel_Desa;
    }
    public String getKecamatan() {
      return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
      this.kecamatan = kecamatan;
    }
    public Agama getAgama() {
      return agama;
    }
    public void setAgama(Agama agama) {
      this.agama = agama;
    }
    public String getStatusPerkawinan() {
      return statusPerkawinan;
    }
    public void setStatusPerkawinan(String statusPerkawinan) {
      this.statusPerkawinan = statusPerkawinan;
    }
    public String getPekerjaan() {
      return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
      this.pekerjaan = pekerjaan;
    }
    public Kewarganegaraan getKewarganegaraan() {
      return kewarganegaraan;
    }
    public void setKewarganegaraan(Kewarganegaraan kewarganegaraan) {
      this.kewarganegaraan = kewarganegaraan;
    }
    public String getFoto() {
      return foto;
    }
    public void setFoto(String foto) {
      this.foto = foto;
    }
    public String getTandaTangan() {
      return tandaTangan;
    }
    public void setTandaTangan(String tandaTangan) {
      this.tandaTangan = tandaTangan;
    }
    public String getBerlakuHingga() {
      return berlakuHingga;
    }
    public void setBerlakuHingga(String berlakuHingga) {
      this.berlakuHingga = berlakuHingga;
    }
    public String getKotaPembuatan() {
      return kotaPembuatan;
    }
    public void setKotaPembuatan(String kotaPembuatan) {
      this.kotaPembuatan = kotaPembuatan;
    }
    public String getTanggalPembuatan() {
      return tanggalPembuatan;
    }
    public void setTanggalPembuatan(String tanggalPembuatan) {
      this.tanggalPembuatan = tanggalPembuatan;
    }

  }
