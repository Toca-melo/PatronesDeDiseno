public class App {
    public static void main(String[] args) throws Exception {
        User user = new User(false, false, null);

        System.out.println(user.getState().onActive());
        System.out.println(user.getState().onBuy());
        System.out.println(user.getState().onLock());
        System.out.println(user.getState().onActive());
        System.out.println(user.getState().onDisable());
        System.out.println(user.getState().onLock());
        System.out.println(user.getState().onBuy());
        System.out.println(user.getState().onActive());
            
    }
}
