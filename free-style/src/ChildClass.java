package pl.wiktor.child;

import pl.wiktor.parent.ParentClass;

public class ChildClass extends ParentClass {

public void execProtectedFromPublic(){
    this.execProtected();
}


}