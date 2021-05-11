package OODP_Proxy_Patterns;

public class User implements Privilages {

    Admin admin;

    String UserName;
    String Password;

    String adminpassword;

    @Override
    public void PlaySong(String File) {
        System.out.println("User Playing" + File);
    }

    @Override
    public void CreateDocument(String File) {
        System.out.println("User Create Document" + File);
    }

    @Override
    public void InstallSowftware(String File) {
        if (admin.Password.equals(adminpassword)) {
            System.out.println("Instaaled Sowtware");
        } else {
            System.out.println("Error");
        }
    }

}
