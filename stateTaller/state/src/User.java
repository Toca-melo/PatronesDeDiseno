public class User {
    private boolean buying;
    private boolean enable;
    private State state;

    public User(boolean buying, boolean enable, State state){
        this.buying = buying;
        this.enable = enable;
        this.state = new ActiveState(this);
    }


    public boolean isBuying() {
        return buying;
    }
    public void setBuying(boolean buying) {
        this.buying = buying;
    }
    public boolean isEnable() {
        return enable;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void changeState(State state) {
        this.state = state;
    }
    public String startBuy() {
        return "star buying";
    }
    
    
}
