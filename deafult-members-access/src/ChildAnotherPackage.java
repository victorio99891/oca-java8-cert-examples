package def.member.another;

import def.member.*;

public class ChildAnotherPackage extends Parent {

public void print(){

    // Won't compile - different package of superclass, where variable declared with default access
    // System.out.println(this.x);

}

}