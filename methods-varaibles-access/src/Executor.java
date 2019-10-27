package pl.wiktor.executor;
import pl.wiktor.addons.UtilImpl;
public class Executor {

private UtilImpl impl = new UtilImpl();

public void run(){

// Won't compile because fix() is a protected member of class Util -> it can be accessible only in class UtilImpl which extends the class Util
// this method cannot be treated as public member of UtilImpl class !!!!
// impl.fix();

}

}