class manusia
{
    String nama;
    int umur;
    String alamat;
    public manusia(String nama, int umur, String alamat)
    {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
}
class mahasiswa extends manusia
{
    int nim;
            public mahasiswa(String nama, int umur, String alamat, int nim)
            {
                super(nama, umur, alamat);
                this.nim = nim;

                System.out.println("nama saya :"+ nama +"\numur saya :"+ umur +"\nalamat saya :"+ alamat +"\nnim saya :"+ nim);
            }
}

public class demomanusia {
    public static void main(String[] args) {
        mahasiswa obj = new mahasiswa("rudi", 30, "malang", 189);
    }
}