package patterns.behavioral.mediator;

public class ConcreteMediator extends Mediator {

    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }


    @Override
    public void Send(Friend frd, String msg) {
        if (frd == friend1) {
            friend2.Notify(msg);
            boss.Notify(friend1.name + " send message to " + friend2.name);
        }
        if (frd == friend2) {
            friend1.Notify(msg);
            boss.Notify(friend2.name + " send message to " + friend1.name);
        }

        if (frd == boss) {
            friend1.Notify(msg);
            friend2.Notify(msg);
        }

    }
}
