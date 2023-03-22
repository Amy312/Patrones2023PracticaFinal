package ejercicio4;

public class Usuario {
    private String password;
    private String name;
    private String code;
    private boolean par;

    public Usuario(String password, String name, String code) {
        this.password = password;
        this.name = name;
        this.code = code;
        par = (code.charAt(code.length() - 1) - '0') % 2 == 0;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public void showInfo(){
        System.out.println("-----> Usuario: " + name);
        System.out.println("\t\t- Código: " + code + "\n");
    }
}
