abstract class TV{
    Remote remoteType;
    TV(Remote r){
       remoteType = r;
    }
    public abstract void on();
    public abstract void off();
}

class SonyTV extends TV{
    Remote remote;
    public SonyTV(Remote r){
        super(r);
        remote = r;
    };
    public void on(){
        System.out.println("Sony TV ON: ");
        remote.on();
    };
    public void off(){
        System.out.println("Sony TV OFF: ");
        remote.off();
    }
}

interface Remote{
    abstract void on();
    abstract void off();
}

class NewRemote implements  Remote{
    public void on(){
       System.out.println("New Remote On");
    }
    public void off(){
        System.out.println("New Remote Off");
    }
}

class OldRemote implements  Remote{
    public void on(){
        System.out.println("Old Remote On");
    }
    public void off(){
        System.out.println("Old Remote Off");
    }
};

class Client {
    public static void main(String[] args){
        System.out.println("Sony TV with New remote");
        TV SonyTvNewRemote = new SonyTV(new NewRemote());
        SonyTvNewRemote.on();
        SonyTvNewRemote.off();
        System.out.println("Sony TV with old remote");
        TV SonyTvOldRemote = new SonyTV(new OldRemote());
        SonyTvOldRemote.on();
        SonyTvOldRemote.off();
        System.out.println("Inside Client");
    }
}

