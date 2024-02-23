package enkapsilasi;

public class main {
    public static void main(String[] args) {
        
        User user = new User("aaa","bbb");
        
        user.setUsername("LOL");
        user.setPassword("Ulyyy");
        user.setStatus(true);
        user.setId(4);
        
        System.out.println("Username :"+user.getUsername());
        System.out.println("Password :"+user.getPassword());
        System.out.println("ID :"+user.getId());
        System.out.println("Status :"+user.isStatus());
    }
}
